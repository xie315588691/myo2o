package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.PersonInfo;
import zjhr.com.pojo.PersonInfoExample;

public interface PersonInfoMapper {
    int countByExample(PersonInfoExample example);

    int deleteByExample(PersonInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(PersonInfo record);

    int insertSelective(PersonInfo record);

    List<PersonInfo> selectByExample(PersonInfoExample example);

    PersonInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(PersonInfo record);

    int updateByPrimaryKey(PersonInfo record);
}