package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.WechatAuth;
import zjhr.com.pojo.WechatAuthExample;

public interface WechatAuthMapper {
    int countByExample(WechatAuthExample example);

    int deleteByExample(WechatAuthExample example);

    int deleteByPrimaryKey(String wechatAuthId);

    int insert(WechatAuth record);

    int insertSelective(WechatAuth record);

    List<WechatAuth> selectByExample(WechatAuthExample example);

    WechatAuth selectByPrimaryKey(String wechatAuthId);

    int updateByPrimaryKeySelective(WechatAuth record);

    int updateByPrimaryKey(WechatAuth record);
}