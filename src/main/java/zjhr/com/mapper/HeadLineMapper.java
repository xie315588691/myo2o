package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.HeadLine;
import zjhr.com.pojo.HeadLineExample;

public interface HeadLineMapper {
    int countByExample(HeadLineExample example);

    int deleteByExample(HeadLineExample example);

    int deleteByPrimaryKey(String lineId);

    int insert(HeadLine record);

    int insertSelective(HeadLine record);

    List<HeadLine> selectByExample(HeadLineExample example);

    HeadLine selectByPrimaryKey(String lineId);

    int updateByPrimaryKeySelective(HeadLine record);

    int updateByPrimaryKey(HeadLine record);
}