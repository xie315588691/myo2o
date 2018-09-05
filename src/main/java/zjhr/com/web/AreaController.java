package zjhr.com.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zjhr.com.pojo.Area;
import zjhr.com.service.AreaService;
@Controller
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping("/test.action")
	public String save() {
		Area area = new Area();
		area.setAreaName("西边");
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		area.setPriority(2);
		areaService.save(area);
		return "ok";
	}

}
