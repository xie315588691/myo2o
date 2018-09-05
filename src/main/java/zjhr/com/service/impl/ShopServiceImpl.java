package zjhr.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjhr.com.mapper.ShopMapper;
import zjhr.com.pojo.Shop;
import zjhr.com.service.ShopService;
import zjhr.com.utils.IDUtils;
@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopMapper ShopMapper;

	@Override
	public void save(Shop shop) {
		shop.setShopId(IDUtils.genImageName());
		ShopMapper.insert(shop);

	}

}
