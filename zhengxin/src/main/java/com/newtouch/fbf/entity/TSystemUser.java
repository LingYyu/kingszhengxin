package com.newtouch.fbf.entity;

public class TSystemUser {
    private String id;

    private String loginName;

    private String loginPassword;

    private String businessType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

	@Override
	public String toString() {
		return "TSystemUser [id=" + id + ", loginName=" + loginName + ", loginPassword=" + loginPassword
				+ ", businessType=" + businessType + "]";
	}
    
}