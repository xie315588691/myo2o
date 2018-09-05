package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.LocalAuth;
import zjhr.com.pojo.LocalAuthExample;

public interface LocalAuthMapper {
    int countByExample(LocalAuthExample example);

    int deleteByExample(LocalAuthExample example);

    int deleteByPrimaryKey(String localAuthId);

    int insert(LocalAuth record);

    int insertSelective(LocalAuth record);

    List<LocalAuth> selectByExample(LocalAuthExample example);

    LocalAuth selectByPrimaryKey(String localAuthId);

    int updateByPrimaryKeySelective(LocalAuth record);

    int updateByPrimaryKey(LocalAuth record);
}