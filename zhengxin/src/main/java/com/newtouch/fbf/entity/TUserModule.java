package com.newtouch.fbf.entity;

import java.util.Date;

public class TUserModule {
    private String id;

    private String businessType;

    private Boolean businessChoose;

    private Boolean loanChoose;

    private Boolean drivingChoose;

    private Boolean illegalChoose;

    private Boolean flyChoose;

    private Boolean internetChoose;

    private String idCard;

    private String reportCode;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Boolean isActive;

    private String reportId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Boolean getBusinessChoose() {
        return businessChoose;
    }

    public void setBusinessChoose(Boolean businessChoose) {
        this.businessChoose = businessChoose;
    }

    public Boolean getLoanChoose() {
        return loanChoose;
    }

    public void setLoanChoose(Boolean loanChoose) {
        this.loanChoose = loanChoose;
    }

    public Boolean getDrivingChoose() {
        return drivingChoose;
    }

    public void setDrivingChoose(Boolean drivingChoose) {
        this.drivingChoose = drivingChoose;
    }

    public Boolean getIllegalChoose() {
        return illegalChoose;
    }

    public void setIllegalChoose(Boolean illegalChoose) {
        this.illegalChoose = illegalChoose;
    }

    public Boolean getFlyChoose() {
        return flyChoose;
    }

    public void setFlyChoose(Boolean flyChoose) {
        this.flyChoose = flyChoose;
    }

    public Boolean getInternetChoose() {
        return internetChoose;
    }

    public void setInternetChoose(Boolean internetChoose) {
        this.internetChoose = internetChoose;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

	@Override
	public String toString() {
		return "TUserModule [id=" + id + ", businessType=" + businessType + ", businessChoose=" + businessChoose
				+ ", loanChoose=" + loanChoose + ", drivingChoose=" + drivingChoose + ", illegalChoose=" + illegalChoose
				+ ", flyChoose=" + flyChoose + ", internetChoose=" + internetChoose + ", idCard=" + idCard
				+ ", reportCode=" + reportCode + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", createUser=" + createUser + ", updateUser=" + updateUser + ", isActive=" + isActive + ", reportId="
				+ reportId + "]";
	}
    
}