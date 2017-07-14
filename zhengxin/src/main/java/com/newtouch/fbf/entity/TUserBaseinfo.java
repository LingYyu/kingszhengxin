package com.newtouch.fbf.entity;

import java.util.Date;

public class TUserBaseinfo {
    private String id;

    private String userName;

    private String idCard;

    private String telephone;

    private String companyAddress;

    private String companyPhone;

    private String userEmail;

    private String cardPicUrl1;

    private String cardPicUrl2;

    private String personPicUrl;

    private String companyName;

    private String position;

    private String homeAddress;

    private String addressInfoUrl;

    private String jobInfoUrl;

    private String financeInfoUrl;

    private String businessType;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getCardPicUrl1() {
        return cardPicUrl1;
    }

    public void setCardPicUrl1(String cardPicUrl1) {
        this.cardPicUrl1 = cardPicUrl1 == null ? null : cardPicUrl1.trim();
    }

    public String getCardPicUrl2() {
        return cardPicUrl2;
    }

    public void setCardPicUrl2(String cardPicUrl2) {
        this.cardPicUrl2 = cardPicUrl2 == null ? null : cardPicUrl2.trim();
    }

    public String getPersonPicUrl() {
        return personPicUrl;
    }

    public void setPersonPicUrl(String personPicUrl) {
        this.personPicUrl = personPicUrl == null ? null : personPicUrl.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getAddressInfoUrl() {
        return addressInfoUrl;
    }

    public void setAddressInfoUrl(String addressInfoUrl) {
        this.addressInfoUrl = addressInfoUrl == null ? null : addressInfoUrl.trim();
    }

    public String getJobInfoUrl() {
        return jobInfoUrl;
    }

    public void setJobInfoUrl(String jobInfoUrl) {
        this.jobInfoUrl = jobInfoUrl == null ? null : jobInfoUrl.trim();
    }

    public String getFinanceInfoUrl() {
        return financeInfoUrl;
    }

    public void setFinanceInfoUrl(String financeInfoUrl) {
        this.financeInfoUrl = financeInfoUrl == null ? null : financeInfoUrl.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

	@Override
	public String toString() {
		return "TUserBaseinfo [id=" + id + ", userName=" + userName + ", idCard=" + idCard + ", telephone=" + telephone
				+ ", companyAddress=" + companyAddress + ", companyPhone=" + companyPhone + ", userEmail=" + userEmail
				+ ", cardPicUrl1=" + cardPicUrl1 + ", cardPicUrl2=" + cardPicUrl2 + ", personPicUrl=" + personPicUrl
				+ ", companyName=" + companyName + ", position=" + position + ", homeAddress=" + homeAddress
				+ ", addressInfoUrl=" + addressInfoUrl + ", jobInfoUrl=" + jobInfoUrl + ", financeInfoUrl="
				+ financeInfoUrl + ", businessType=" + businessType + ", createTime=" + createTime + ", createUser="
				+ createUser + ", updateTime=" + updateTime + ", updateUser=" + updateUser + "]";
	}
    
}