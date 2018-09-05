package zjhr.com.dto;

import java.util.List;

import zjhr.com.pojo.Shop;

public class ShopExecution {
	//结果状态
	private Integer state;
	
	//状态标识
	private String stateInfo;
	
	//店铺的数量
	private Integer count;
	//操作shop(增删改店铺的时候使用)
	private Shop shop;
	//shop列表(查询店铺列表的时候使用)
	private List<Shop> shopList;
	
	public ShopExecution() {
		super();
	}
	
	
	

}
