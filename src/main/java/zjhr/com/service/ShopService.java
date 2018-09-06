package zjhr.com.service;

import java.io.File;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import zjhr.com.dto.ShopExecution;
import zjhr.com.pojo.Shop;

public interface ShopService {
	
	void save(Shop shop);
	ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);

}
