package zjhr.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjhr.com.mapper.PersonInfoMapper;
import zjhr.com.pojo.PersonInfo;
import zjhr.com.service.PersonInfoService;
import zjhr.com.utils.IDUtils;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {
	
	@Autowired
	private PersonInfoMapper personInfoMapper;

	@Override
	public void save(PersonInfo personInfo) {
		personInfo.setUserId(IDUtils.genImageName());
		personInfoMapper.insert(personInfo);
	}

}
