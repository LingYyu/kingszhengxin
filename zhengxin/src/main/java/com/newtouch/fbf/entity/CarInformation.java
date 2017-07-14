package com.newtouch.fbf.entity;

import java.util.Date;

public class CarInformation {
    private Integer id;

    private String typeNo;

    private String explicate;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo == null ? null : typeNo.trim();
    }

    public String getExplicate() {
        return explicate;
    }

    public void setExplicate(String explicate) {
        this.explicate = explicate == null ? null : explicate.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

	@Override
	public String toString() {
		return "CarInformation [id=" + id + ", typeNo=" + typeNo + ", explicate=" + explicate + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", createUser=" + createUser + ", updateUser="
				+ updateUser + "]";
	}
    
}