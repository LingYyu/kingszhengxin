package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TUserBillingInformation {
    private String id;

    private String businessInformation;

    private String businessType;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
	@JsonFormat(pattern="yyyy/MM/dd/",timezone = "GMT+8")  
    private Date billingStardate;
    @DateTimeFormat(pattern="yyyy/MM/dd")  
	@JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")  
    private Date billingEnddate;

    private BigDecimal amount;

    private Boolean paymentStatus;

    private BigDecimal balance;

    private BigDecimal recharge;

    private BigDecimal money;

    private Integer drivingTimes;

    private Integer drivingPrice;

    private Integer carTimes;

    private Integer carPrice;

    private Integer flyTimes;

    private Integer flyPrice;

    private Integer eduTimes;

    private Integer eduPrice;
    @DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")  
	@JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss",timezone = "GMT+8")  
    private Date createTime;
    @DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")  
	@JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss",timezone = "GMT+8")  
    private Date updateTime;

    private String createUser;

    private String updateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessInformation() {
        return businessInformation;
    }

    public void setBusinessInformation(String businessInformation) {
        this.businessInformation = businessInformation == null ? null : businessInformation.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Date getBillingStardate() {
        return billingStardate;
    }

    public void setBillingStardate(Date billingStardate) {
        this.billingStardate = billingStardate;
    }

    public Date getBillingEnddate() {
        return billingEnddate;
    }

    public void setBillingEnddate(Date billingEnddate) {
        this.billingEnddate = billingEnddate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getRecharge() {
        return recharge;
    }

    public void setRecharge(BigDecimal recharge) {
        this.recharge = recharge;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getDrivingTimes() {
        return drivingTimes;
    }

    public void setDrivingTimes(Integer drivingTimes) {
        this.drivingTimes = drivingTimes;
    }

    public Integer getDrivingPrice() {
        return drivingPrice;
    }

    public void setDrivingPrice(Integer drivingPrice) {
        this.drivingPrice = drivingPrice;
    }

    public Integer getCarTimes() {
        return carTimes;
    }

    public void setCarTimes(Integer carTimes) {
        this.carTimes = carTimes;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }

    public Integer getFlyTimes() {
        return flyTimes;
    }

    public void setFlyTimes(Integer flyTimes) {
        this.flyTimes = flyTimes;
    }

    public Integer getFlyPrice() {
        return flyPrice;
    }

    public void setFlyPrice(Integer flyPrice) {
        this.flyPrice = flyPrice;
    }

    public Integer getEduTimes() {
        return eduTimes;
    }

    public void setEduTimes(Integer eduTimes) {
        this.eduTimes = eduTimes;
    }

    public Integer getEduPrice() {
        return eduPrice;
    }

    public void setEduPrice(Integer eduPrice) {
        this.eduPrice = eduPrice;
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

	@Override
	public String toString() {
		return "TUserBillingInformation [id=" + id + ", businessInformation=" + businessInformation + ", businessType="
				+ businessType + ", billingStardate=" + billingStardate + ", billingEnddate=" + billingEnddate
				+ ", amount=" + amount + ", paymentStatus=" + paymentStatus + ", balance=" + balance + ", recharge="
				+ recharge + ", money=" + money + ", drivingTimes=" + drivingTimes + ", drivingPrice=" + drivingPrice
				+ ", carTimes=" + carTimes + ", carPrice=" + carPrice + ", flyTimes=" + flyTimes + ", flyPrice="
				+ flyPrice + ", eduTimes=" + eduTimes + ", eduPrice=" + eduPrice + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", createUser=" + createUser + ", updateUser=" + updateUser + "]";
	}
    
    
}