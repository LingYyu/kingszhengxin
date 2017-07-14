package com.newtouch.fbf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TUserReport {
    private String id;

    private String businessType;

    private String name;

    private String idCard;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date publishTime;

    private String reportCode;

    private Integer mark;

    private String suggestion;

    private String loanPhase;

    private String productName;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8") 
    private Date checkTime;
    @DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")  
	@JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss",timezone = "GMT+8") 
    private Date createTime;
    @DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")  
	@JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss",timezone = "GMT+8") 
    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String submitter;
    @DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")  
	@JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss",timezone = "GMT+8") 
    private Date submitTime;

    private int age;

    private String mobile;

    private String sex;

    private String borrowType;

    private Boolean isActive;
    
   

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    public String getLoanPhase() {
        return loanPhase;
    }

    public void setLoanPhase(String loanPhase) {
        this.loanPhase = loanPhase == null ? null : loanPhase.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
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

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

	@Override
	public String toString() {
		return "TUserReport [id=" + id + ", businessType=" + businessType + ", name=" + name + ", idCard=" + idCard
				+ ", publishTime=" + publishTime + ", reportCode=" + reportCode + ", mark=" + mark + ", suggestion="
				+ suggestion + ", loanPhase=" + loanPhase + ", productName=" + productName + ", checkTime=" + checkTime
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", submitter=" + submitter + ", submitTime=" + submitTime + ", age="
				+ age + ", mobile=" + mobile + ", sex=" + sex + ", borrowType=" + borrowType + ", isActive=" + isActive
				+ "]";
	}


    
}