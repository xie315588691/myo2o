package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.Area;
import zjhr.com.pojo.AreaExample;

public interface AreaMapper {
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(String areaId);

    int updateByPrimaryKey(Area record);
}