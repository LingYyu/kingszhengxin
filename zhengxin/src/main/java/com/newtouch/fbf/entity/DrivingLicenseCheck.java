package com.newtouch.fbf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DrivingLicenseCheck {
    private String id;

    private String businessType;

    private String reportCode;

    private String drivingCarNo;

    private String drivingCarName;

    private String drivingCarStatus;

    private String drivingCarColor;

    private String dengineNo;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date issueDate;

    private String dcarFrameNo;

    private String drivingCarType;

    private String idCard;

    private String useProperty;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date maturityDate;

    private String address;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
   	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date initialRegistDate;
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

    public String getDrivingCarNo() {
        return drivingCarNo;
    }

    public void setDrivingCarNo(String drivingCarNo) {
        this.drivingCarNo = drivingCarNo == null ? null : drivingCarNo.trim();
    }

    public String getDrivingCarName() {
        return drivingCarName;
    }

    public void setDrivingCarName(String drivingCarName) {
        this.drivingCarName = drivingCarName == null ? null : drivingCarName.trim();
    }

    public String getDrivingCarStatus() {
        return drivingCarStatus;
    }

    public void setDrivingCarStatus(String drivingCarStatus) {
        this.drivingCarStatus = drivingCarStatus == null ? null : drivingCarStatus.trim();
    }

    public String getDrivingCarColor() {
        return drivingCarColor;
    }

    public void setDrivingCarColor(String drivingCarColor) {
        this.drivingCarColor = drivingCarColor == null ? null : drivingCarColor.trim();
    }

    public String getDengineNo() {
        return dengineNo;
    }

    public void setDengineNo(String dengineNo) {
        this.dengineNo = dengineNo == null ? null : dengineNo.trim();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getDcarFrameNo() {
        return dcarFrameNo;
    }

    public void setDcarFrameNo(String dcarFrameNo) {
        this.dcarFrameNo = dcarFrameNo == null ? null : dcarFrameNo.trim();
    }

    public String getDrivingCarType() {
        return drivingCarType;
    }

    public void setDrivingCarType(String drivingCarType) {
        this.drivingCarType = drivingCarType == null ? null : drivingCarType.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getUseProperty() {
        return useProperty;
    }

    public void setUseProperty(String useProperty) {
        this.useProperty = useProperty == null ? null : useProperty.trim();
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getInitialRegistDate() {
        return initialRegistDate;
    }

    public void setInitialRegistDate(Date initialRegistDate) {
        this.initialRegistDate = initialRegistDate;
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
		return "DrivingLicenseCheck [id=" + id + ", businessType=" + businessType + ", reportCode=" + reportCode
				+ ", drivingCarNo=" + drivingCarNo + ", drivingCarName=" + drivingCarName + ", drivingCarStatus="
				+ drivingCarStatus + ", drivingCarColor=" + drivingCarColor + ", dengineNo=" + dengineNo
				+ ", issueDate=" + issueDate + ", dcarFrameNo=" + dcarFrameNo + ", drivingCarType=" + drivingCarType
				+ ", idCard=" + idCard + ", useProperty=" + useProperty + ", maturityDate=" + maturityDate
				+ ", address=" + address + ", initialRegistDate=" + initialRegistDate + ", memoryTime=" + memoryTime
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", isDelete=" + isDelete + "]";
	}
    
}