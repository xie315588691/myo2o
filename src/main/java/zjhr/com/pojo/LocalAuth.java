package zjhr.com.pojo;

import java.util.Date;
//本地账户
public class LocalAuth {
    private String localAuthId;

    private String password;

    private Date createTime;

    private Date lastEditTime;

    private String userid;
    
    private PersonInfo personInfo;
    

    public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public String getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(String localAuthId) {
        this.localAuthId = localAuthId == null ? null : localAuthId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}