package zjhr.com.dto;

import java.util.List;

import zjhr.com.enums.ShopStateEnum;
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
	
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Shop> getShopList() {
		return shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	public ShopExecution() {
		super();
	}
	//店铺操作失败的时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum){
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		
	}
	
	//店铺操作成功的时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum,Shop shop){
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shop = shop;
	}
	
	
	//店铺操作成功的时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList){
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shopList = shopList;
	}
	
	
	

}
