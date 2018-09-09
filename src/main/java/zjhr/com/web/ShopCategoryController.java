package zjhr.com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zjhr.com.pojo.ShopCategory;
import zjhr.com.service.ShopCategoryService;
import zjhr.com.utils.JsonUtils;

@Controller
public class ShopCategoryController {
	
	@Autowired
	private ShopCategoryService shopCategoryService;
	
	@RequestMapping("/getShopCategoryName.action")
	@ResponseBody
	public String findShopCategoryName(){
		List<ShopCategory> list = shopCategoryService.findAll();
		return JsonUtils.objectToJson(list);
	}

}
