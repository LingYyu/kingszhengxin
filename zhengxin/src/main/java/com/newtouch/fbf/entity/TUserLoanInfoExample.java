package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserLoanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserLoanInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNull() {
            addCriterion("borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNotNull() {
            addCriterion("borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateEqualTo(Date value) {
            addCriterion("borrow_date =", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotEqualTo(Date value) {
            addCriterion("borrow_date <>", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThan(Date value) {
            addCriterion("borrow_date >", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("borrow_date >=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThan(Date value) {
            addCriterion("borrow_date <", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThanOrEqualTo(Date value) {
            addCriterion("borrow_date <=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIn(List<Date> values) {
            addCriterion("borrow_date in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotIn(List<Date> values) {
            addCriterion("borrow_date not in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateBetween(Date value1, Date value2) {
            addCriterion("borrow_date between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotBetween(Date value1, Date value2) {
            addCriterion("borrow_date not between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoIsNull() {
            addCriterion("borrow_contractno is null");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoIsNotNull() {
            addCriterion("borrow_contractno is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoEqualTo(String value) {
            addCriterion("borrow_contractno =", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoNotEqualTo(String value) {
            addCriterion("borrow_contractno <>", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoGreaterThan(String value) {
            addCriterion("borrow_contractno >", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_contractno >=", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoLessThan(String value) {
            addCriterion("borrow_contractno <", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoLessThanOrEqualTo(String value) {
            addCriterion("borrow_contractno <=", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoLike(String value) {
            addCriterion("borrow_contractno like", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoNotLike(String value) {
            addCriterion("borrow_contractno not like", value, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoIn(List<String> values) {
            addCriterion("borrow_contractno in", values, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoNotIn(List<String> values) {
            addCriterion("borrow_contractno not in", values, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoBetween(String value1, String value2) {
            addCriterion("borrow_contractno between", value1, value2, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andBorrowContractnoNotBetween(String value1, String value2) {
            addCriterion("borrow_contractno not between", value1, value2, "borrowContractno");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(String value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(String value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(String value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(String value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(String value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLike(String value) {
            addCriterion("borrow_type like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotLike(String value) {
            addCriterion("borrow_type not like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<String> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<String> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(String value1, String value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(String value1, String value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIsNull() {
            addCriterion("borrow_status is null");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIsNotNull() {
            addCriterion("borrow_status is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusEqualTo(Boolean value) {
            addCriterion("borrow_status =", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotEqualTo(Boolean value) {
            addCriterion("borrow_status <>", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusGreaterThan(Boolean value) {
            addCriterion("borrow_status >", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("borrow_status >=", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusLessThan(Boolean value) {
            addCriterion("borrow_status <", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("borrow_status <=", value, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusIn(List<Boolean> values) {
            addCriterion("borrow_status in", values, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotIn(List<Boolean> values) {
            addCriterion("borrow_status not in", values, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow_status between", value1, value2, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andBorrowStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("borrow_status not between", value1, value2, "borrowStatus");
            return (Criteria) this;
        }

        public Criteria andContactlessIsNull() {
            addCriterion("contactless is null");
            return (Criteria) this;
        }

        public Criteria andContactlessIsNotNull() {
            addCriterion("contactless is not null");
            return (Criteria) this;
        }

        public Criteria andContactlessEqualTo(Boolean value) {
            addCriterion("contactless =", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessNotEqualTo(Boolean value) {
            addCriterion("contactless <>", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessGreaterThan(Boolean value) {
            addCriterion("contactless >", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("contactless >=", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessLessThan(Boolean value) {
            addCriterion("contactless <", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessLessThanOrEqualTo(Boolean value) {
            addCriterion("contactless <=", value, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessIn(List<Boolean> values) {
            addCriterion("contactless in", values, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessNotIn(List<Boolean> values) {
            addCriterion("contactless not in", values, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessBetween(Boolean value1, Boolean value2) {
            addCriterion("contactless between", value1, value2, "contactless");
            return (Criteria) this;
        }

        public Criteria andContactlessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("contactless not between", value1, value2, "contactless");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainIsNull() {
            addCriterion("instalment_again is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainIsNotNull() {
            addCriterion("instalment_again is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainEqualTo(Boolean value) {
            addCriterion("instalment_again =", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainNotEqualTo(Boolean value) {
            addCriterion("instalment_again <>", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainGreaterThan(Boolean value) {
            addCriterion("instalment_again >", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainGreaterThanOrEqualTo(Boolean value) {
            addCriterion("instalment_again >=", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainLessThan(Boolean value) {
            addCriterion("instalment_again <", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainLessThanOrEqualTo(Boolean value) {
            addCriterion("instalment_again <=", value, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainIn(List<Boolean> values) {
            addCriterion("instalment_again in", values, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainNotIn(List<Boolean> values) {
            addCriterion("instalment_again not in", values, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainBetween(Boolean value1, Boolean value2) {
            addCriterion("instalment_again between", value1, value2, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAgainNotBetween(Boolean value1, Boolean value2) {
            addCriterion("instalment_again not between", value1, value2, "instalmentAgain");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountIsNull() {
            addCriterion("instalment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountIsNotNull() {
            addCriterion("instalment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountEqualTo(BigDecimal value) {
            addCriterion("instalment_amount =", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountNotEqualTo(BigDecimal value) {
            addCriterion("instalment_amount <>", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountGreaterThan(BigDecimal value) {
            addCriterion("instalment_amount >", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("instalment_amount >=", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountLessThan(BigDecimal value) {
            addCriterion("instalment_amount <", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("instalment_amount <=", value, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountIn(List<BigDecimal> values) {
            addCriterion("instalment_amount in", values, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountNotIn(List<BigDecimal> values) {
            addCriterion("instalment_amount not in", values, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instalment_amount between", value1, value2, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andInstalmentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instalment_amount not between", value1, value2, "instalmentAmount");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayIsNull() {
            addCriterion("monthly_repay is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayIsNotNull() {
            addCriterion("monthly_repay is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayEqualTo(BigDecimal value) {
            addCriterion("monthly_repay =", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayNotEqualTo(BigDecimal value) {
            addCriterion("monthly_repay <>", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayGreaterThan(BigDecimal value) {
            addCriterion("monthly_repay >", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_repay >=", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayLessThan(BigDecimal value) {
            addCriterion("monthly_repay <", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_repay <=", value, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayIn(List<BigDecimal> values) {
            addCriterion("monthly_repay in", values, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayNotIn(List<BigDecimal> values) {
            addCriterion("monthly_repay not in", values, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_repay between", value1, value2, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_repay not between", value1, value2, "monthlyRepay");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectIsNull() {
            addCriterion("primary_reject is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectIsNotNull() {
            addCriterion("primary_reject is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectEqualTo(Boolean value) {
            addCriterion("primary_reject =", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectNotEqualTo(Boolean value) {
            addCriterion("primary_reject <>", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectGreaterThan(Boolean value) {
            addCriterion("primary_reject >", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("primary_reject >=", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectLessThan(Boolean value) {
            addCriterion("primary_reject <", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectLessThanOrEqualTo(Boolean value) {
            addCriterion("primary_reject <=", value, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectIn(List<Boolean> values) {
            addCriterion("primary_reject in", values, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectNotIn(List<Boolean> values) {
            addCriterion("primary_reject not in", values, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectBetween(Boolean value1, Boolean value2) {
            addCriterion("primary_reject between", value1, value2, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andPrimaryRejectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("primary_reject not between", value1, value2, "primaryReject");
            return (Criteria) this;
        }

        public Criteria andChectIsNull() {
            addCriterion("chect is null");
            return (Criteria) this;
        }

        public Criteria andChectIsNotNull() {
            addCriterion("chect is not null");
            return (Criteria) this;
        }

        public Criteria andChectEqualTo(Boolean value) {
            addCriterion("chect =", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectNotEqualTo(Boolean value) {
            addCriterion("chect <>", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectGreaterThan(Boolean value) {
            addCriterion("chect >", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("chect >=", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectLessThan(Boolean value) {
            addCriterion("chect <", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectLessThanOrEqualTo(Boolean value) {
            addCriterion("chect <=", value, "chect");
            return (Criteria) this;
        }

        public Criteria andChectIn(List<Boolean> values) {
            addCriterion("chect in", values, "chect");
            return (Criteria) this;
        }

        public Criteria andChectNotIn(List<Boolean> values) {
            addCriterion("chect not in", values, "chect");
            return (Criteria) this;
        }

        public Criteria andChectBetween(Boolean value1, Boolean value2) {
            addCriterion("chect between", value1, value2, "chect");
            return (Criteria) this;
        }

        public Criteria andChectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chect not between", value1, value2, "chect");
            return (Criteria) this;
        }

        public Criteria andRejectTimeIsNull() {
            addCriterion("reject_time is null");
            return (Criteria) this;
        }

        public Criteria andRejectTimeIsNotNull() {
            addCriterion("reject_time is not null");
            return (Criteria) this;
        }

        public Criteria andRejectTimeEqualTo(Date value) {
            addCriterion("reject_time =", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeNotEqualTo(Date value) {
            addCriterion("reject_time <>", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeGreaterThan(Date value) {
            addCriterion("reject_time >", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reject_time >=", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeLessThan(Date value) {
            addCriterion("reject_time <", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeLessThanOrEqualTo(Date value) {
            addCriterion("reject_time <=", value, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeIn(List<Date> values) {
            addCriterion("reject_time in", values, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeNotIn(List<Date> values) {
            addCriterion("reject_time not in", values, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeBetween(Date value1, Date value2) {
            addCriterion("reject_time between", value1, value2, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectTimeNotBetween(Date value1, Date value2) {
            addCriterion("reject_time not between", value1, value2, "rejectTime");
            return (Criteria) this;
        }

        public Criteria andRejectAmountIsNull() {
            addCriterion("reject_amount is null");
            return (Criteria) this;
        }

        public Criteria andRejectAmountIsNotNull() {
            addCriterion("reject_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRejectAmountEqualTo(BigDecimal value) {
            addCriterion("reject_amount =", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountNotEqualTo(BigDecimal value) {
            addCriterion("reject_amount <>", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountGreaterThan(BigDecimal value) {
            addCriterion("reject_amount >", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reject_amount >=", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountLessThan(BigDecimal value) {
            addCriterion("reject_amount <", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reject_amount <=", value, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountIn(List<BigDecimal> values) {
            addCriterion("reject_amount in", values, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountNotIn(List<BigDecimal> values) {
            addCriterion("reject_amount not in", values, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reject_amount between", value1, value2, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andRejectAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reject_amount not between", value1, value2, "rejectAmount");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("extension is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("extension is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(Boolean value) {
            addCriterion("extension =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(Boolean value) {
            addCriterion("extension <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(Boolean value) {
            addCriterion("extension >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("extension >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(Boolean value) {
            addCriterion("extension <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(Boolean value) {
            addCriterion("extension <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<Boolean> values) {
            addCriterion("extension in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<Boolean> values) {
            addCriterion("extension not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(Boolean value1, Boolean value2) {
            addCriterion("extension between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("extension not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtIsNull() {
            addCriterion("capital_debt is null");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtIsNotNull() {
            addCriterion("capital_debt is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtEqualTo(Boolean value) {
            addCriterion("capital_debt =", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtNotEqualTo(Boolean value) {
            addCriterion("capital_debt <>", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtGreaterThan(Boolean value) {
            addCriterion("capital_debt >", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtGreaterThanOrEqualTo(Boolean value) {
            addCriterion("capital_debt >=", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtLessThan(Boolean value) {
            addCriterion("capital_debt <", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtLessThanOrEqualTo(Boolean value) {
            addCriterion("capital_debt <=", value, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtIn(List<Boolean> values) {
            addCriterion("capital_debt in", values, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtNotIn(List<Boolean> values) {
            addCriterion("capital_debt not in", values, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtBetween(Boolean value1, Boolean value2) {
            addCriterion("capital_debt between", value1, value2, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andCapitalDebtNotBetween(Boolean value1, Boolean value2) {
            addCriterion("capital_debt not between", value1, value2, "capitalDebt");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearIsNull() {
            addCriterion("longterm_arrear is null");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearIsNotNull() {
            addCriterion("longterm_arrear is not null");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearEqualTo(Integer value) {
            addCriterion("longterm_arrear =", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearNotEqualTo(Integer value) {
            addCriterion("longterm_arrear <>", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearGreaterThan(Integer value) {
            addCriterion("longterm_arrear >", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearGreaterThanOrEqualTo(Integer value) {
            addCriterion("longterm_arrear >=", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearLessThan(Integer value) {
            addCriterion("longterm_arrear <", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearLessThanOrEqualTo(Integer value) {
            addCriterion("longterm_arrear <=", value, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearIn(List<Integer> values) {
            addCriterion("longterm_arrear in", values, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearNotIn(List<Integer> values) {
            addCriterion("longterm_arrear not in", values, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearBetween(Integer value1, Integer value2) {
            addCriterion("longterm_arrear between", value1, value2, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andLongtermArrearNotBetween(Integer value1, Integer value2) {
            addCriterion("longterm_arrear not between", value1, value2, "longtermArrear");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayIsNull() {
            addCriterion("guarantee_repay is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayIsNotNull() {
            addCriterion("guarantee_repay is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayEqualTo(Integer value) {
            addCriterion("guarantee_repay =", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayNotEqualTo(Integer value) {
            addCriterion("guarantee_repay <>", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayGreaterThan(Integer value) {
            addCriterion("guarantee_repay >", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("guarantee_repay >=", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayLessThan(Integer value) {
            addCriterion("guarantee_repay <", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayLessThanOrEqualTo(Integer value) {
            addCriterion("guarantee_repay <=", value, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayIn(List<Integer> values) {
            addCriterion("guarantee_repay in", values, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayNotIn(List<Integer> values) {
            addCriterion("guarantee_repay not in", values, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_repay between", value1, value2, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andGuaranteeRepayNotBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_repay not between", value1, value2, "guaranteeRepay");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNull() {
            addCriterion("overdue is null");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNotNull() {
            addCriterion("overdue is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueEqualTo(Integer value) {
            addCriterion("overdue =", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotEqualTo(Integer value) {
            addCriterion("overdue <>", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThan(Integer value) {
            addCriterion("overdue >", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue >=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThan(Integer value) {
            addCriterion("overdue <", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThanOrEqualTo(Integer value) {
            addCriterion("overdue <=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueIn(List<Integer> values) {
            addCriterion("overdue in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotIn(List<Integer> values) {
            addCriterion("overdue not in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueBetween(Integer value1, Integer value2) {
            addCriterion("overdue between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue not between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(String value) {
            addCriterion("overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(String value) {
            addCriterion("overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(String value) {
            addCriterion("overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(String value) {
            addCriterion("overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(String value) {
            addCriterion("overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLike(String value) {
            addCriterion("overdue_days like", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotLike(String value) {
            addCriterion("overdue_days not like", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<String> values) {
            addCriterion("overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<String> values) {
            addCriterion("overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(String value1, String value2) {
            addCriterion("overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(String value1, String value2) {
            addCriterion("overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOtherInfosIsNull() {
            addCriterion("other_infos is null");
            return (Criteria) this;
        }

        public Criteria andOtherInfosIsNotNull() {
            addCriterion("other_infos is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInfosEqualTo(String value) {
            addCriterion("other_infos =", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosNotEqualTo(String value) {
            addCriterion("other_infos <>", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosGreaterThan(String value) {
            addCriterion("other_infos >", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosGreaterThanOrEqualTo(String value) {
            addCriterion("other_infos >=", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosLessThan(String value) {
            addCriterion("other_infos <", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosLessThanOrEqualTo(String value) {
            addCriterion("other_infos <=", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosLike(String value) {
            addCriterion("other_infos like", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosNotLike(String value) {
            addCriterion("other_infos not like", value, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosIn(List<String> values) {
            addCriterion("other_infos in", values, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosNotIn(List<String> values) {
            addCriterion("other_infos not in", values, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosBetween(String value1, String value2) {
            addCriterion("other_infos between", value1, value2, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andOtherInfosNotBetween(String value1, String value2) {
            addCriterion("other_infos not between", value1, value2, "otherInfos");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNull() {
            addCriterion("submitter is null");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNotNull() {
            addCriterion("submitter is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitterEqualTo(String value) {
            addCriterion("submitter =", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotEqualTo(String value) {
            addCriterion("submitter <>", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThan(String value) {
            addCriterion("submitter >", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThanOrEqualTo(String value) {
            addCriterion("submitter >=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThan(String value) {
            addCriterion("submitter <", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThanOrEqualTo(String value) {
            addCriterion("submitter <=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLike(String value) {
            addCriterion("submitter like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotLike(String value) {
            addCriterion("submitter not like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterIn(List<String> values) {
            addCriterion("submitter in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotIn(List<String> values) {
            addCriterion("submitter not in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterBetween(String value1, String value2) {
            addCriterion("submitter between", value1, value2, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotBetween(String value1, String value2) {
            addCriterion("submitter not between", value1, value2, "submitter");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}