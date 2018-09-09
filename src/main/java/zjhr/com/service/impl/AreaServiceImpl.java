package zjhr.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjhr.com.mapper.AreaMapper;
import zjhr.com.pojo.Area;
import zjhr.com.service.AreaService;
import zjhr.com.utils.IDUtils;
@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	 private AreaMapper areaMapper;

	@Override
	public void save(Area area) {
		area.setAreaId(IDUtils.genImageName());
		areaMapper.insert(area);

	}

	@Override
	public List<Area> findAllAreaName() {
		List<Area> list = areaMapper.selectByExample(null);
		return list;
	}

}
