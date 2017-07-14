package com.newtouch.fbf.entity;

import java.util.Date;

public class TUserReportDetail {
    private String id;

    private String businessType;

    private String name;

    private String idCard;

    private String reportCode;

    private String bankCard;

    private String schoolDegree;

    private Date schoolStartime;

    private String college;

    private String studentNumber;

    private String carNumber;

    private String carType;

    private String illegalCarNumber;

    private String illegalCarType;

    private String frameNumber;

    private String engineNumber;

    private String taobaoNumber;

    private String taobaoPwd;

    private String jingdongNumber;

    private String jingdongPwd;

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

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getSchoolDegree() {
        return schoolDegree;
    }

    public void setSchoolDegree(String schoolDegree) {
        this.schoolDegree = schoolDegree == null ? null : schoolDegree.trim();
    }

    public Date getSchoolStartime() {
        return schoolStartime;
    }

    public void setSchoolStartime(Date schoolStartime) {
        this.schoolStartime = schoolStartime;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getIllegalCarNumber() {
        return illegalCarNumber;
    }

    public void setIllegalCarNumber(String illegalCarNumber) {
        this.illegalCarNumber = illegalCarNumber == null ? null : illegalCarNumber.trim();
    }

    public String getIllegalCarType() {
        return illegalCarType;
    }

    public void setIllegalCarType(String illegalCarType) {
        this.illegalCarType = illegalCarType == null ? null : illegalCarType.trim();
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber == null ? null : frameNumber.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getTaobaoNumber() {
        return taobaoNumber;
    }

    public void setTaobaoNumber(String taobaoNumber) {
        this.taobaoNumber = taobaoNumber == null ? null : taobaoNumber.trim();
    }

    public String getTaobaoPwd() {
        return taobaoPwd;
    }

    public void setTaobaoPwd(String taobaoPwd) {
        this.taobaoPwd = taobaoPwd == null ? null : taobaoPwd.trim();
    }

    public String getJingdongNumber() {
        return jingdongNumber;
    }

    public void setJingdongNumber(String jingdongNumber) {
        this.jingdongNumber = jingdongNumber == null ? null : jingdongNumber.trim();
    }

    public String getJingdongPwd() {
        return jingdongPwd;
    }

    public void setJingdongPwd(String jingdongPwd) {
        this.jingdongPwd = jingdongPwd == null ? null : jingdongPwd.trim();
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
		return "TUserReportDetail [id=" + id + ", businessType=" + businessType + ", name=" + name + ", idCard="
				+ idCard + ", reportCode=" + reportCode + ", bankCard=" + bankCard + ", schoolDegree=" + schoolDegree
				+ ", schoolStartime=" + schoolStartime + ", college=" + college + ", studentNumber=" + studentNumber
				+ ", carNumber=" + carNumber + ", carType=" + carType + ", illegalCarNumber=" + illegalCarNumber
				+ ", illegalCarType=" + illegalCarType + ", frameNumber=" + frameNumber + ", engineNumber="
				+ engineNumber + ", taobaoNumber=" + taobaoNumber + ", taobaoPwd=" + taobaoPwd + ", jingdongNumber="
				+ jingdongNumber + ", jingdongPwd=" + jingdongPwd + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", createUser=" + createUser + ", updateUser=" + updateUser + ", isActive=" + isActive
				+ ", reportId=" + reportId + "]";
	}
    
}