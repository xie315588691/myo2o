package zjhr.com.enums;

public enum ShopStateEnum {
	CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),PASS(2,"通过认证"),INNER_ERROR(-1001,"内部系统错误"),
	NULL_SHOPID(-1002, "ShopId为空"), NULL_SHOP_INFO(-1003, "传入了空的信息");
	private Integer state;
	private String stateInfo;
	private ShopStateEnum(Integer state,String stateInfo){
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	
	public static ShopStateEnum stateOf(Integer index) {
		for (ShopStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}


	public Integer getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	
	
}
