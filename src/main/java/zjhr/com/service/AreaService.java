package zjhr.com.service;

import java.util.List;

import zjhr.com.pojo.Area;

public interface AreaService {
	void save(Area area);
	List<Area> findAllAreaName();

}
