package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LoanInfoCheck {
    private String id;

    private String businessType;

    private String reportCode;

    private String name;

    private String idCard;

    private String otherLoans;

    private Date loanDate;

    private String usingLoan;

    private String mobile;

    private String loanType;

    private BigDecimal loanAmount;

    private String loanDeadline;

    private String address;

    private String loanBlacklist;

    private Date memoryTime;

    private Date createTime;

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

    public String getOtherLoans() {
        return otherLoans;
    }

    public void setOtherLoans(String otherLoans) {
        this.otherLoans = otherLoans == null ? null : otherLoans.trim();
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getUsingLoan() {
        return usingLoan;
    }

    public void setUsingLoan(String usingLoan) {
        this.usingLoan = usingLoan == null ? null : usingLoan.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanDeadline() {
        return loanDeadline;
    }

    public void setLoanDeadline(String loanDeadline) {
        this.loanDeadline = loanDeadline == null ? null : loanDeadline.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLoanBlacklist() {
        return loanBlacklist;
    }

    public void setLoanBlacklist(String loanBlacklist) {
        this.loanBlacklist = loanBlacklist == null ? null : loanBlacklist.trim();
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
		return "LoanInfoCheck [id=" + id + ", businessType=" + businessType + ", reportCode=" + reportCode + ", name="
				+ name + ", idCard=" + idCard + ", otherLoans=" + otherLoans + ", loanDate=" + loanDate + ", usingLoan="
				+ usingLoan + ", mobile=" + mobile + ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ ", loanDeadline=" + loanDeadline + ", address=" + address + ", loanBlacklist=" + loanBlacklist
				+ ", memoryTime=" + memoryTime + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", createUser=" + createUser + ", updateUser=" + updateUser + ", isDelete=" + isDelete + "]";
	}
    
}