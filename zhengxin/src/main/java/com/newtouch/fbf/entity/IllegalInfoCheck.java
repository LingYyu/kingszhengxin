package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class IllegalInfoCheck {
    private String id;

    private String businessType;

    private String reportCode;

    private String drivingCarName;

    private String idCard;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date violationTime;

    private String violationReason;

    private BigDecimal violationBills;

    private String violationAddress;

    private String violationPlace;

    private String illegalDeduction;

    private String mobile;

    private String executiveBranch;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date memoryTime;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date updateTime;
    
    private String createUser;

    private String updateUser;

    private String isDelete;

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

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
    }

    public String getDrivingCarName() {
        return drivingCarName;
    }

    public void setDrivingCarName(String drivingCarName) {
        this.drivingCarName = drivingCarName == null ? null : drivingCarName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getViolationTime() {
        return violationTime;
    }

    public void setViolationTime(Date violationTime) {
        this.violationTime = violationTime;
    }

    public String getViolationReason() {
        return violationReason;
    }

    public void setViolationReason(String violationReason) {
        this.violationReason = violationReason == null ? null : violationReason.trim();
    }

    public BigDecimal getViolationBills() {
        return violationBills;
    }

    public void setViolationBills(BigDecimal violationBills) {
        this.violationBills = violationBills;
    }

    public String getViolationAddress() {
        return violationAddress;
    }

    public void setViolationAddress(String violationAddress) {
        this.violationAddress = violationAddress == null ? null : violationAddress.trim();
    }

    public String getViolationPlace() {
        return violationPlace;
    }

    public void setViolationPlace(String violationPlace) {
        this.violationPlace = violationPlace == null ? null : violationPlace.trim();
    }

    public String getIllegalDeduction() {
        return illegalDeduction;
    }

    public void setIllegalDeduction(String illegalDeduction) {
        this.illegalDeduction = illegalDeduction == null ? null : illegalDeduction.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getExecutiveBranch() {
        return executiveBranch;
    }

    public void setExecutiveBranch(String executiveBranch) {
        this.executiveBranch = executiveBranch == null ? null : executiveBranch.trim();
    }

    public Date getMemoryTime() {
        return memoryTime;
    }

    public void setMemoryTime(Date memoryTime) {
        this.memoryTime = memoryTime;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

	@Override
	public String toString() {
		return "IllegalInfoCheck [id=" + id + ", businessType=" + businessType + ", reportCode=" + reportCode
				+ ", drivingCarName=" + drivingCarName + ", idCard=" + idCard + ", violationTime=" + violationTime
				+ ", violationReason=" + violationReason + ", violationBills=" + violationBills + ", violationAddress="
				+ violationAddress + ", violationPlace=" + violationPlace + ", illegalDeduction=" + illegalDeduction
				+ ", mobile=" + mobile + ", executiveBranch=" + executiveBranch + ", memoryTime=" + memoryTime
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", isDelete=" + isDelete + "]";
	}
    
}