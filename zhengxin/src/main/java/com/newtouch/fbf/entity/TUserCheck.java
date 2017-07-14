package com.newtouch.fbf.entity;

public class TUserCheck {
    private String idCard;

    private String userName;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

	@Override
	public String toString() {
		return "TUserCheck [idCard=" + idCard + ", userName=" + userName + "]";
	}
    
}