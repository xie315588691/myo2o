package zjhr.com.service;

import java.util.List;

import zjhr.com.pojo.ShopCategory;

public interface ShopCategoryService {
	
	void save(ShopCategory shopCategory);
	
	List<ShopCategory> findAll();

}
