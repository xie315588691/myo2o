package zjhr.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjhr.com.mapper.ShopCategoryMapper;
import zjhr.com.pojo.ShopCategory;
import zjhr.com.pojo.ShopCategoryExample;
import zjhr.com.pojo.ShopCategoryExample.Criteria;
import zjhr.com.service.ShopCategoryService;
import zjhr.com.utils.IDUtils;
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
	@Autowired
	private ShopCategoryMapper shopCategoryMapper;

	@Override
	public void save(ShopCategory shopCategory) {
		shopCategory.setShopCategoryId(IDUtils.genImageName());
		shopCategoryMapper.insert(shopCategory);
	}

	@Override
	public List<ShopCategory> findAll() {
		ShopCategoryExample example = new ShopCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdIsNull();
		List<ShopCategory> list = shopCategoryMapper.selectByExample(example);
		return list;
	}

}
