package zjhr.com.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import zjhr.com.dto.ShopExecution;
import zjhr.com.pojo.Shop;

public interface ShopService {
	
	ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);

}
