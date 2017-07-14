package com.newtouch.fbf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EducationInfoCheck {
    private String id;

    private String businessType;

    private String reportCode;

    private String idCard;

    private String college;

    private String collegeLevel;
    @DateTimeFormat(pattern="yyyy-MM")  
   	@JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    private Date startTime;

    private String major;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date graduationTime;

    private String graduationCon;

    private String degreeCategory;

    private String status;

    private String description;

    private Date memoryTime;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private String schoolNumber;

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getCollegeLevel() {
        return collegeLevel;
    }

    public void setCollegeLevel(String collegeLevel) {
        this.collegeLevel = collegeLevel == null ? null : collegeLevel.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationCon() {
        return graduationCon;
    }

    public void setGraduationCon(String graduationCon) {
        this.graduationCon = graduationCon == null ? null : graduationCon.trim();
    }

    public String getDegreeCategory() {
        return degreeCategory;
    }

    public void setDegreeCategory(String degreeCategory) {
        this.degreeCategory = degreeCategory == null ? null : degreeCategory.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber == null ? null : schoolNumber.trim();
    }

	@Override
	public String toString() {
		return "EducationInfoCheck [id=" + id + ", businessType=" + businessType + ", reportCode=" + reportCode
				+ ", idCard=" + idCard + ", college=" + college + ", collegeLevel=" + collegeLevel + ", startTime="
				+ startTime + ", major=" + major + ", graduationTime=" + graduationTime + ", graduationCon="
				+ graduationCon + ", degreeCategory=" + degreeCategory + ", status=" + status + ", description="
				+ description + ", memoryTime=" + memoryTime + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", createUser=" + createUser + ", updateUser=" + updateUser + ", isDelete=" + isDelete
				+ ", schoolNumber=" + schoolNumber + "]";
	}
    
}