package zjhr.com.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import zjhr.com.dto.ShopExecution;
import zjhr.com.enums.ShopStateEnum;
import zjhr.com.pojo.Shop;
import zjhr.com.service.ShopService;
import zjhr.com.utils.JsonUtils;

@Controller
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("/shopOperation.action")
	public String myIndex(){
		return "shop/shopOperation";
	}
	
	@RequestMapping("/shopRegister.action")
	public String myIndex(Shop shop,String checkCode,HttpServletRequest request,MultipartFile shopFile){
		String key = (String) request.getSession().getAttribute("key");
		if( StringUtils.isNotBlank(checkCode) && checkCode.equals(key)){
			CommonsMultipartFile shopImgFile =  (CommonsMultipartFile) shopFile;
			shopService.addShop(shop, shopImgFile);
			return "shop/shopOperation";
		}else{
			return null;
		}
	}

}
