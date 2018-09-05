package zjhr.com.mapper;

import java.util.List;
import zjhr.com.pojo.ShopCategory;
import zjhr.com.pojo.ShopCategoryExample;

public interface ShopCategoryMapper {
    int countByExample(ShopCategoryExample example);

    int deleteByExample(ShopCategoryExample example);

    int deleteByPrimaryKey(String shopCategoryId);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    List<ShopCategory> selectByExample(ShopCategoryExample example);

    ShopCategory selectByPrimaryKey(String shopCategoryId);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}