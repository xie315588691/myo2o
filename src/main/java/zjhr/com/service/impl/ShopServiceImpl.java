package zjhr.com.service.impl;

import java.io.File;
import java.util.Date;

import org.apache.poi.ss.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import zjhr.com.dto.ShopExecution;
import zjhr.com.enums.ShopStateEnum;
import zjhr.com.exceptions.ShopOperationException;
import zjhr.com.mapper.ShopMapper;
import zjhr.com.pojo.Shop;
import zjhr.com.service.ShopService;
import zjhr.com.utils.IDUtils;
import zjhr.com.utils.ImgUtils;
import zjhr.com.utils.PathUtils;
@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopMapper ShopMapper;

	@Override
	public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
		if(shop ==null){
			return new ShopExecution(ShopStateEnum.NULL_SHOP_INFO);
		}else{
			try{
				shop.setShopId(IDUtils.genImageName());
				shop.setEnableStatus(0);
				shop.setCreateTime(new Date());
				shop.setLastEditTime(new Date());
				addShopImg(shop, shopImg);
				ShopMapper.insert(shop);
			}catch(Exception e){
				throw new ShopOperationException("addSho error:"+e.getMessage());
				
			}
			
			return new ShopExecution(ShopStateEnum.CHECK, shop);
		}
	}
	
	private void addShopImg(Shop shop,CommonsMultipartFile shopImg){
		//获取shop图片目录的相对值路径
		String dest = PathUtils.getShopImagePath(shop.getShopId());
		String shopImgAddr = ImgUtils.generateThmbnail(shopImg, dest);
		shop.setShopImg(shopImgAddr);
	}

}
