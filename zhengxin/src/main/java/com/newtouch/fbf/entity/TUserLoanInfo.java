package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TUserLoanInfo {
    private String id;

    private String businessType;

    private String idCard;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date borrowDate;

    private String borrowContractno;

    private Integer period;

    private BigDecimal amount;

    private String phone;

    private String purpose;

    private String borrowType;

    private String contactAddress;

    private Boolean borrowStatus;

    private Boolean contactless;

    private Boolean instalmentAgain;

    private BigDecimal instalmentAmount;

    private BigDecimal monthlyRepay;

    private BigDecimal salary;

    private String companyAddress;

    private String companyType;

    private Boolean primaryReject;

    private Boolean chect;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date rejectTime;

    private BigDecimal rejectAmount;

    private Boolean extension;

    private Boolean capitalDebt;

    private Integer longtermArrear;

    private Integer guaranteeRepay;

    private Integer overdue;

    private String overdueDays;

    private String otherInfos;

    private String remark;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isDelete;

    private String submitter;

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBorrowContractno() {
        return borrowContractno;
    }

    public void setBorrowContractno(String borrowContractno) {
        this.borrowContractno = borrowContractno == null ? null : borrowContractno.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public Boolean getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(Boolean borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public Boolean getContactless() {
        return contactless;
    }

    public void setContactless(Boolean contactless) {
        this.contactless = contactless;
    }

    public Boolean getInstalmentAgain() {
        return instalmentAgain;
    }

    public void setInstalmentAgain(Boolean instalmentAgain) {
        this.instalmentAgain = instalmentAgain;
    }

    public BigDecimal getInstalmentAmount() {
        return instalmentAmount;
    }

    public void setInstalmentAmount(BigDecimal instalmentAmount) {
        this.instalmentAmount = instalmentAmount;
    }

    public BigDecimal getMonthlyRepay() {
        return monthlyRepay;
    }

    public void setMonthlyRepay(BigDecimal monthlyRepay) {
        this.monthlyRepay = monthlyRepay;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public Boolean getPrimaryReject() {
        return primaryReject;
    }

    public void setPrimaryReject(Boolean primaryReject) {
        this.primaryReject = primaryReject;
    }

    public Boolean getChect() {
        return chect;
    }

    public void setChect(Boolean chect) {
        this.chect = chect;
    }

    public Date getRejectTime() {
        return rejectTime;
    }

    public void setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
    }

    public BigDecimal getRejectAmount() {
        return rejectAmount;
    }

    public void setRejectAmount(BigDecimal rejectAmount) {
        this.rejectAmount = rejectAmount;
    }

    public Boolean getExtension() {
        return extension;
    }

    public void setExtension(Boolean extension) {
        this.extension = extension;
    }

    public Boolean getCapitalDebt() {
        return capitalDebt;
    }

    public void setCapitalDebt(Boolean capitalDebt) {
        this.capitalDebt = capitalDebt;
    }

    public Integer getLongtermArrear() {
        return longtermArrear;
    }

    public void setLongtermArrear(Integer longtermArrear) {
        this.longtermArrear = longtermArrear;
    }

    public Integer getGuaranteeRepay() {
        return guaranteeRepay;
    }

    public void setGuaranteeRepay(Integer guaranteeRepay) {
        this.guaranteeRepay = guaranteeRepay;
    }

    public Integer getOverdue() {
        return overdue;
    }

    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    public String getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays == null ? null : overdueDays.trim();
    }

    public String getOtherInfos() {
        return otherInfos;
    }

    public void setOtherInfos(String otherInfos) {
        this.otherInfos = otherInfos == null ? null : otherInfos.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

	@Override
	public String toString() {
		return "TUserLoanInfo [id=" + id + ", businessType=" + businessType + ", idCard=" + idCard + ", borrowDate="
				+ borrowDate + ", borrowContractno=" + borrowContractno + ", period=" + period + ", amount=" + amount
				+ ", phone=" + phone + ", purpose=" + purpose + ", borrowType=" + borrowType + ", contactAddress="
				+ contactAddress + ", borrowStatus=" + borrowStatus + ", contactless=" + contactless
				+ ", instalmentAgain=" + instalmentAgain + ", instalmentAmount=" + instalmentAmount + ", monthlyRepay="
				+ monthlyRepay + ", salary=" + salary + ", companyAddress=" + companyAddress + ", companyType="
				+ companyType + ", primaryReject=" + primaryReject + ", chect=" + chect + ", rejectTime=" + rejectTime
				+ ", rejectAmount=" + rejectAmount + ", extension=" + extension + ", capitalDebt=" + capitalDebt
				+ ", longtermArrear=" + longtermArrear + ", guaranteeRepay=" + guaranteeRepay + ", overdue=" + overdue
				+ ", overdueDays=" + overdueDays + ", otherInfos=" + otherInfos + ", remark=" + remark + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", createUser=" + createUser + ", updateUser="
				+ updateUser + ", isDelete=" + isDelete + ", submitter=" + submitter + "]";
	}
    
}