package com.newtouch.fbf.entity;

import java.util.Date;

public class FlightInfoCheck {
    private String id;

    private String businessType;

    private String reportCode;

    private String flightName;

    private String flightCard;

    private String firstClass;

    private String flightTimes;

    private String finallyArrived;

    private String yearFightTimes;

    private String economyClass;

    private String frequentReachCity;

    private String averageFare;

    private String totalFlight;

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

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName == null ? null : flightName.trim();
    }

    public String getFlightCard() {
        return flightCard;
    }

    public void setFlightCard(String flightCard) {
        this.flightCard = flightCard == null ? null : flightCard.trim();
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass == null ? null : firstClass.trim();
    }

    public String getFlightTimes() {
        return flightTimes;
    }

    public void setFlightTimes(String flightTimes) {
        this.flightTimes = flightTimes == null ? null : flightTimes.trim();
    }

    public String getFinallyArrived() {
        return finallyArrived;
    }

    public void setFinallyArrived(String finallyArrived) {
        this.finallyArrived = finallyArrived == null ? null : finallyArrived.trim();
    }

    public String getYearFightTimes() {
        return yearFightTimes;
    }

    public void setYearFightTimes(String yearFightTimes) {
        this.yearFightTimes = yearFightTimes == null ? null : yearFightTimes.trim();
    }

    public String getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(String economyClass) {
        this.economyClass = economyClass == null ? null : economyClass.trim();
    }

    public String getFrequentReachCity() {
        return frequentReachCity;
    }

    public void setFrequentReachCity(String frequentReachCity) {
        this.frequentReachCity = frequentReachCity == null ? null : frequentReachCity.trim();
    }

    public String getAverageFare() {
        return averageFare;
    }

    public void setAverageFare(String averageFare) {
        this.averageFare = averageFare == null ? null : averageFare.trim();
    }

    public String getTotalFlight() {
        return totalFlight;
    }

    public void setTotalFlight(String totalFlight) {
        this.totalFlight = totalFlight == null ? null : totalFlight.trim();
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
		return "FlightInfoCheck [id=" + id + ", businessType=" + businessType + ", reportCode=" + reportCode
				+ ", flightName=" + flightName + ", flightCard=" + flightCard + ", firstClass=" + firstClass
				+ ", flightTimes=" + flightTimes + ", finallyArrived=" + finallyArrived + ", yearFightTimes="
				+ yearFightTimes + ", economyClass=" + economyClass + ", frequentReachCity=" + frequentReachCity
				+ ", averageFare=" + averageFare + ", totalFlight=" + totalFlight + ", memoryTime=" + memoryTime
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", isDelete=" + isDelete + "]";
	}
    
}