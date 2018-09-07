package zjhr.com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
	@RequestMapping("/shopOperation.action")
	public String myIndex(){
		
		return "shop/shopOperation";
	}

}
