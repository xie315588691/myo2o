package zjhr.com.pojo;

import java.util.Date;
//微信账户
public class WechatAuth {
	
    private String wechatAuthId;

    private String openId;

    private Date createTime;

    private String userid;
    
    private PersonInfo personInfo;
    
    

    public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public String getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(String wechatAuthId) {
        this.wechatAuthId = wechatAuthId == null ? null : wechatAuthId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}