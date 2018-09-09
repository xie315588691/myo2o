package zjhr.com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zjhr.com.pojo.Area;
import zjhr.com.service.AreaService;
import zjhr.com.utils.JsonUtils;
@Controller
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping("/test.action")
	public String save() {
		return "ok";
	}
	@RequestMapping("/getAreaName.action")
	@ResponseBody
	public String findAllAreaName(){
		List<Area> list = areaService.findAllAreaName();
		return JsonUtils.objectToJson(list);
	}

}
