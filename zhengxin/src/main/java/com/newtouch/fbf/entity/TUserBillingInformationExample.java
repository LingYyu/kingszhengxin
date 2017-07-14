package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserBillingInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserBillingInformationExample() {
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

        public Criteria andBusinessInformationIsNull() {
            addCriterion("Business_information is null");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationIsNotNull() {
            addCriterion("Business_information is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationEqualTo(String value) {
            addCriterion("Business_information =", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationNotEqualTo(String value) {
            addCriterion("Business_information <>", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationGreaterThan(String value) {
            addCriterion("Business_information >", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationGreaterThanOrEqualTo(String value) {
            addCriterion("Business_information >=", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationLessThan(String value) {
            addCriterion("Business_information <", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationLessThanOrEqualTo(String value) {
            addCriterion("Business_information <=", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationLike(String value) {
            addCriterion("Business_information like", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationNotLike(String value) {
            addCriterion("Business_information not like", value, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationIn(List<String> values) {
            addCriterion("Business_information in", values, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationNotIn(List<String> values) {
            addCriterion("Business_information not in", values, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationBetween(String value1, String value2) {
            addCriterion("Business_information between", value1, value2, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessInformationNotBetween(String value1, String value2) {
            addCriterion("Business_information not between", value1, value2, "businessInformation");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("Business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("Business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("Business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("Business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("Business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("Business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("Business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("Business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("Business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("Business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("Business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("Business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("Business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBillingStardateIsNull() {
            addCriterion("billing_stardate is null");
            return (Criteria) this;
        }

        public Criteria andBillingStardateIsNotNull() {
            addCriterion("billing_stardate is not null");
            return (Criteria) this;
        }

        public Criteria andBillingStardateEqualTo(String value) {
            addCriterion("billing_stardate =", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateNotEqualTo(String value) {
            addCriterion("billing_stardate <>", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateGreaterThan(String value) {
            addCriterion("billing_stardate >", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateGreaterThanOrEqualTo(String value) {
            addCriterion("billing_stardate >=", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateLessThan(String value) {
            addCriterion("billing_stardate <", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateLessThanOrEqualTo(String value) {
            addCriterion("billing_stardate <=", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateLike(String value) {
            addCriterion("billing_stardate like", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateNotLike(String value) {
            addCriterion("billing_stardate not like", value, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateIn(List<String> values) {
            addCriterion("billing_stardate in", values, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateNotIn(List<String> values) {
            addCriterion("billing_stardate not in", values, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateBetween(String value1, String value2) {
            addCriterion("billing_stardate between", value1, value2, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingStardateNotBetween(String value1, String value2) {
            addCriterion("billing_stardate not between", value1, value2, "billingStardate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateIsNull() {
            addCriterion("billing_enddate is null");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateIsNotNull() {
            addCriterion("billing_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateEqualTo(String value) {
            addCriterion("billing_enddate =", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateNotEqualTo(String value) {
            addCriterion("billing_enddate <>", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateGreaterThan(String value) {
            addCriterion("billing_enddate >", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("billing_enddate >=", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateLessThan(String value) {
            addCriterion("billing_enddate <", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateLessThanOrEqualTo(String value) {
            addCriterion("billing_enddate <=", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateLike(String value) {
            addCriterion("billing_enddate like", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateNotLike(String value) {
            addCriterion("billing_enddate not like", value, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateIn(List<String> values) {
            addCriterion("billing_enddate in", values, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateNotIn(List<String> values) {
            addCriterion("billing_enddate not in", values, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateBetween(String value1, String value2) {
            addCriterion("billing_enddate between", value1, value2, "billingEnddate");
            return (Criteria) this;
        }

        public Criteria andBillingEnddateNotBetween(String value1, String value2) {
            addCriterion("billing_enddate not between", value1, value2, "billingEnddate");
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

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Boolean value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Boolean value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Boolean value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Boolean value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Boolean> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Boolean> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("recharge is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("recharge is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(BigDecimal value) {
            addCriterion("recharge =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(BigDecimal value) {
            addCriterion("recharge <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(BigDecimal value) {
            addCriterion("recharge >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(BigDecimal value) {
            addCriterion("recharge <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<BigDecimal> values) {
            addCriterion("recharge in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<BigDecimal> values) {
            addCriterion("recharge not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge not between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesIsNull() {
            addCriterion("driving_times is null");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesIsNotNull() {
            addCriterion("driving_times is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesEqualTo(Integer value) {
            addCriterion("driving_times =", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesNotEqualTo(Integer value) {
            addCriterion("driving_times <>", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesGreaterThan(Integer value) {
            addCriterion("driving_times >", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("driving_times >=", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesLessThan(Integer value) {
            addCriterion("driving_times <", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesLessThanOrEqualTo(Integer value) {
            addCriterion("driving_times <=", value, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesIn(List<Integer> values) {
            addCriterion("driving_times in", values, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesNotIn(List<Integer> values) {
            addCriterion("driving_times not in", values, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesBetween(Integer value1, Integer value2) {
            addCriterion("driving_times between", value1, value2, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("driving_times not between", value1, value2, "drivingTimes");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceIsNull() {
            addCriterion("driving_price is null");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceIsNotNull() {
            addCriterion("driving_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceEqualTo(Integer value) {
            addCriterion("driving_price =", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceNotEqualTo(Integer value) {
            addCriterion("driving_price <>", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceGreaterThan(Integer value) {
            addCriterion("driving_price >", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("driving_price >=", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceLessThan(Integer value) {
            addCriterion("driving_price <", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("driving_price <=", value, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceIn(List<Integer> values) {
            addCriterion("driving_price in", values, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceNotIn(List<Integer> values) {
            addCriterion("driving_price not in", values, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceBetween(Integer value1, Integer value2) {
            addCriterion("driving_price between", value1, value2, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andDrivingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("driving_price not between", value1, value2, "drivingPrice");
            return (Criteria) this;
        }

        public Criteria andCarTimesIsNull() {
            addCriterion("car_times is null");
            return (Criteria) this;
        }

        public Criteria andCarTimesIsNotNull() {
            addCriterion("car_times is not null");
            return (Criteria) this;
        }

        public Criteria andCarTimesEqualTo(Integer value) {
            addCriterion("car_times =", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesNotEqualTo(Integer value) {
            addCriterion("car_times <>", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesGreaterThan(Integer value) {
            addCriterion("car_times >", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_times >=", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesLessThan(Integer value) {
            addCriterion("car_times <", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesLessThanOrEqualTo(Integer value) {
            addCriterion("car_times <=", value, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesIn(List<Integer> values) {
            addCriterion("car_times in", values, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesNotIn(List<Integer> values) {
            addCriterion("car_times not in", values, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesBetween(Integer value1, Integer value2) {
            addCriterion("car_times between", value1, value2, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("car_times not between", value1, value2, "carTimes");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("car_price is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("car_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(Integer value) {
            addCriterion("car_price =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(Integer value) {
            addCriterion("car_price <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(Integer value) {
            addCriterion("car_price >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_price >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(Integer value) {
            addCriterion("car_price <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(Integer value) {
            addCriterion("car_price <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<Integer> values) {
            addCriterion("car_price in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<Integer> values) {
            addCriterion("car_price not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(Integer value1, Integer value2) {
            addCriterion("car_price between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("car_price not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andFlyTimesIsNull() {
            addCriterion("fly_times is null");
            return (Criteria) this;
        }

        public Criteria andFlyTimesIsNotNull() {
            addCriterion("fly_times is not null");
            return (Criteria) this;
        }

        public Criteria andFlyTimesEqualTo(Integer value) {
            addCriterion("fly_times =", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesNotEqualTo(Integer value) {
            addCriterion("fly_times <>", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesGreaterThan(Integer value) {
            addCriterion("fly_times >", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("fly_times >=", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesLessThan(Integer value) {
            addCriterion("fly_times <", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesLessThanOrEqualTo(Integer value) {
            addCriterion("fly_times <=", value, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesIn(List<Integer> values) {
            addCriterion("fly_times in", values, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesNotIn(List<Integer> values) {
            addCriterion("fly_times not in", values, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesBetween(Integer value1, Integer value2) {
            addCriterion("fly_times between", value1, value2, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("fly_times not between", value1, value2, "flyTimes");
            return (Criteria) this;
        }

        public Criteria andFlyPriceIsNull() {
            addCriterion("fly_price is null");
            return (Criteria) this;
        }

        public Criteria andFlyPriceIsNotNull() {
            addCriterion("fly_price is not null");
            return (Criteria) this;
        }

        public Criteria andFlyPriceEqualTo(Integer value) {
            addCriterion("fly_price =", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceNotEqualTo(Integer value) {
            addCriterion("fly_price <>", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceGreaterThan(Integer value) {
            addCriterion("fly_price >", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fly_price >=", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceLessThan(Integer value) {
            addCriterion("fly_price <", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("fly_price <=", value, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceIn(List<Integer> values) {
            addCriterion("fly_price in", values, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceNotIn(List<Integer> values) {
            addCriterion("fly_price not in", values, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceBetween(Integer value1, Integer value2) {
            addCriterion("fly_price between", value1, value2, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andFlyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("fly_price not between", value1, value2, "flyPrice");
            return (Criteria) this;
        }

        public Criteria andEduTimesIsNull() {
            addCriterion("edu_times is null");
            return (Criteria) this;
        }

        public Criteria andEduTimesIsNotNull() {
            addCriterion("edu_times is not null");
            return (Criteria) this;
        }

        public Criteria andEduTimesEqualTo(Integer value) {
            addCriterion("edu_times =", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesNotEqualTo(Integer value) {
            addCriterion("edu_times <>", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesGreaterThan(Integer value) {
            addCriterion("edu_times >", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_times >=", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesLessThan(Integer value) {
            addCriterion("edu_times <", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesLessThanOrEqualTo(Integer value) {
            addCriterion("edu_times <=", value, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesIn(List<Integer> values) {
            addCriterion("edu_times in", values, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesNotIn(List<Integer> values) {
            addCriterion("edu_times not in", values, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesBetween(Integer value1, Integer value2) {
            addCriterion("edu_times between", value1, value2, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_times not between", value1, value2, "eduTimes");
            return (Criteria) this;
        }

        public Criteria andEduPriceIsNull() {
            addCriterion("edu_price is null");
            return (Criteria) this;
        }

        public Criteria andEduPriceIsNotNull() {
            addCriterion("edu_price is not null");
            return (Criteria) this;
        }

        public Criteria andEduPriceEqualTo(Integer value) {
            addCriterion("edu_price =", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceNotEqualTo(Integer value) {
            addCriterion("edu_price <>", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceGreaterThan(Integer value) {
            addCriterion("edu_price >", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_price >=", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceLessThan(Integer value) {
            addCriterion("edu_price <", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceLessThanOrEqualTo(Integer value) {
            addCriterion("edu_price <=", value, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceIn(List<Integer> values) {
            addCriterion("edu_price in", values, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceNotIn(List<Integer> values) {
            addCriterion("edu_price not in", values, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceBetween(Integer value1, Integer value2) {
            addCriterion("edu_price between", value1, value2, "eduPrice");
            return (Criteria) this;
        }

        public Criteria andEduPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_price not between", value1, value2, "eduPrice");
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