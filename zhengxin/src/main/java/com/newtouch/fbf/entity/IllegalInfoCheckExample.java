package com.newtouch.fbf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IllegalInfoCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IllegalInfoCheckExample() {
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

        public Criteria andReportCodeIsNull() {
            addCriterion("report_code is null");
            return (Criteria) this;
        }

        public Criteria andReportCodeIsNotNull() {
            addCriterion("report_code is not null");
            return (Criteria) this;
        }

        public Criteria andReportCodeEqualTo(String value) {
            addCriterion("report_code =", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotEqualTo(String value) {
            addCriterion("report_code <>", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThan(String value) {
            addCriterion("report_code >", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("report_code >=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThan(String value) {
            addCriterion("report_code <", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThanOrEqualTo(String value) {
            addCriterion("report_code <=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLike(String value) {
            addCriterion("report_code like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotLike(String value) {
            addCriterion("report_code not like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeIn(List<String> values) {
            addCriterion("report_code in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotIn(List<String> values) {
            addCriterion("report_code not in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeBetween(String value1, String value2) {
            addCriterion("report_code between", value1, value2, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotBetween(String value1, String value2) {
            addCriterion("report_code not between", value1, value2, "reportCode");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameIsNull() {
            addCriterion("driving_car_name is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameIsNotNull() {
            addCriterion("driving_car_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameEqualTo(String value) {
            addCriterion("driving_car_name =", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameNotEqualTo(String value) {
            addCriterion("driving_car_name <>", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameGreaterThan(String value) {
            addCriterion("driving_car_name >", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("driving_car_name >=", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameLessThan(String value) {
            addCriterion("driving_car_name <", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameLessThanOrEqualTo(String value) {
            addCriterion("driving_car_name <=", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameLike(String value) {
            addCriterion("driving_car_name like", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameNotLike(String value) {
            addCriterion("driving_car_name not like", value, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameIn(List<String> values) {
            addCriterion("driving_car_name in", values, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameNotIn(List<String> values) {
            addCriterion("driving_car_name not in", values, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameBetween(String value1, String value2) {
            addCriterion("driving_car_name between", value1, value2, "drivingCarName");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNameNotBetween(String value1, String value2) {
            addCriterion("driving_car_name not between", value1, value2, "drivingCarName");
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

        public Criteria andViolationTimeIsNull() {
            addCriterion("violation_time is null");
            return (Criteria) this;
        }

        public Criteria andViolationTimeIsNotNull() {
            addCriterion("violation_time is not null");
            return (Criteria) this;
        }

        public Criteria andViolationTimeEqualTo(Date value) {
            addCriterion("violation_time =", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeNotEqualTo(Date value) {
            addCriterion("violation_time <>", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeGreaterThan(Date value) {
            addCriterion("violation_time >", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("violation_time >=", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeLessThan(Date value) {
            addCriterion("violation_time <", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeLessThanOrEqualTo(Date value) {
            addCriterion("violation_time <=", value, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeIn(List<Date> values) {
            addCriterion("violation_time in", values, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeNotIn(List<Date> values) {
            addCriterion("violation_time not in", values, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeBetween(Date value1, Date value2) {
            addCriterion("violation_time between", value1, value2, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationTimeNotBetween(Date value1, Date value2) {
            addCriterion("violation_time not between", value1, value2, "violationTime");
            return (Criteria) this;
        }

        public Criteria andViolationReasonIsNull() {
            addCriterion("violation_reason is null");
            return (Criteria) this;
        }

        public Criteria andViolationReasonIsNotNull() {
            addCriterion("violation_reason is not null");
            return (Criteria) this;
        }

        public Criteria andViolationReasonEqualTo(String value) {
            addCriterion("violation_reason =", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonNotEqualTo(String value) {
            addCriterion("violation_reason <>", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonGreaterThan(String value) {
            addCriterion("violation_reason >", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("violation_reason >=", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonLessThan(String value) {
            addCriterion("violation_reason <", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonLessThanOrEqualTo(String value) {
            addCriterion("violation_reason <=", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonLike(String value) {
            addCriterion("violation_reason like", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonNotLike(String value) {
            addCriterion("violation_reason not like", value, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonIn(List<String> values) {
            addCriterion("violation_reason in", values, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonNotIn(List<String> values) {
            addCriterion("violation_reason not in", values, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonBetween(String value1, String value2) {
            addCriterion("violation_reason between", value1, value2, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationReasonNotBetween(String value1, String value2) {
            addCriterion("violation_reason not between", value1, value2, "violationReason");
            return (Criteria) this;
        }

        public Criteria andViolationBillsIsNull() {
            addCriterion("violation_bills is null");
            return (Criteria) this;
        }

        public Criteria andViolationBillsIsNotNull() {
            addCriterion("violation_bills is not null");
            return (Criteria) this;
        }

        public Criteria andViolationBillsEqualTo(BigDecimal value) {
            addCriterion("violation_bills =", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsNotEqualTo(BigDecimal value) {
            addCriterion("violation_bills <>", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsGreaterThan(BigDecimal value) {
            addCriterion("violation_bills >", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("violation_bills >=", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsLessThan(BigDecimal value) {
            addCriterion("violation_bills <", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("violation_bills <=", value, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsIn(List<BigDecimal> values) {
            addCriterion("violation_bills in", values, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsNotIn(List<BigDecimal> values) {
            addCriterion("violation_bills not in", values, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("violation_bills between", value1, value2, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationBillsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("violation_bills not between", value1, value2, "violationBills");
            return (Criteria) this;
        }

        public Criteria andViolationAddressIsNull() {
            addCriterion("violation_address is null");
            return (Criteria) this;
        }

        public Criteria andViolationAddressIsNotNull() {
            addCriterion("violation_address is not null");
            return (Criteria) this;
        }

        public Criteria andViolationAddressEqualTo(String value) {
            addCriterion("violation_address =", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressNotEqualTo(String value) {
            addCriterion("violation_address <>", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressGreaterThan(String value) {
            addCriterion("violation_address >", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("violation_address >=", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressLessThan(String value) {
            addCriterion("violation_address <", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressLessThanOrEqualTo(String value) {
            addCriterion("violation_address <=", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressLike(String value) {
            addCriterion("violation_address like", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressNotLike(String value) {
            addCriterion("violation_address not like", value, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressIn(List<String> values) {
            addCriterion("violation_address in", values, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressNotIn(List<String> values) {
            addCriterion("violation_address not in", values, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressBetween(String value1, String value2) {
            addCriterion("violation_address between", value1, value2, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationAddressNotBetween(String value1, String value2) {
            addCriterion("violation_address not between", value1, value2, "violationAddress");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceIsNull() {
            addCriterion("violation_place is null");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceIsNotNull() {
            addCriterion("violation_place is not null");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceEqualTo(String value) {
            addCriterion("violation_place =", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceNotEqualTo(String value) {
            addCriterion("violation_place <>", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceGreaterThan(String value) {
            addCriterion("violation_place >", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("violation_place >=", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceLessThan(String value) {
            addCriterion("violation_place <", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceLessThanOrEqualTo(String value) {
            addCriterion("violation_place <=", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceLike(String value) {
            addCriterion("violation_place like", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceNotLike(String value) {
            addCriterion("violation_place not like", value, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceIn(List<String> values) {
            addCriterion("violation_place in", values, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceNotIn(List<String> values) {
            addCriterion("violation_place not in", values, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceBetween(String value1, String value2) {
            addCriterion("violation_place between", value1, value2, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andViolationPlaceNotBetween(String value1, String value2) {
            addCriterion("violation_place not between", value1, value2, "violationPlace");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionIsNull() {
            addCriterion("illegal_deduction is null");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionIsNotNull() {
            addCriterion("illegal_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionEqualTo(String value) {
            addCriterion("illegal_deduction =", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionNotEqualTo(String value) {
            addCriterion("illegal_deduction <>", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionGreaterThan(String value) {
            addCriterion("illegal_deduction >", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionGreaterThanOrEqualTo(String value) {
            addCriterion("illegal_deduction >=", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionLessThan(String value) {
            addCriterion("illegal_deduction <", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionLessThanOrEqualTo(String value) {
            addCriterion("illegal_deduction <=", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionLike(String value) {
            addCriterion("illegal_deduction like", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionNotLike(String value) {
            addCriterion("illegal_deduction not like", value, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionIn(List<String> values) {
            addCriterion("illegal_deduction in", values, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionNotIn(List<String> values) {
            addCriterion("illegal_deduction not in", values, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionBetween(String value1, String value2) {
            addCriterion("illegal_deduction between", value1, value2, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andIllegalDeductionNotBetween(String value1, String value2) {
            addCriterion("illegal_deduction not between", value1, value2, "illegalDeduction");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchIsNull() {
            addCriterion("executive_branch is null");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchIsNotNull() {
            addCriterion("executive_branch is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchEqualTo(String value) {
            addCriterion("executive_branch =", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchNotEqualTo(String value) {
            addCriterion("executive_branch <>", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchGreaterThan(String value) {
            addCriterion("executive_branch >", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchGreaterThanOrEqualTo(String value) {
            addCriterion("executive_branch >=", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchLessThan(String value) {
            addCriterion("executive_branch <", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchLessThanOrEqualTo(String value) {
            addCriterion("executive_branch <=", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchLike(String value) {
            addCriterion("executive_branch like", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchNotLike(String value) {
            addCriterion("executive_branch not like", value, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchIn(List<String> values) {
            addCriterion("executive_branch in", values, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchNotIn(List<String> values) {
            addCriterion("executive_branch not in", values, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchBetween(String value1, String value2) {
            addCriterion("executive_branch between", value1, value2, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andExecutiveBranchNotBetween(String value1, String value2) {
            addCriterion("executive_branch not between", value1, value2, "executiveBranch");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIsNull() {
            addCriterion("memory_time is null");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIsNotNull() {
            addCriterion("memory_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeEqualTo(Date value) {
            addCriterion("memory_time =", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotEqualTo(Date value) {
            addCriterion("memory_time <>", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeGreaterThan(Date value) {
            addCriterion("memory_time >", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("memory_time >=", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeLessThan(Date value) {
            addCriterion("memory_time <", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeLessThanOrEqualTo(Date value) {
            addCriterion("memory_time <=", value, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeIn(List<Date> values) {
            addCriterion("memory_time in", values, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotIn(List<Date> values) {
            addCriterion("memory_time not in", values, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeBetween(Date value1, Date value2) {
            addCriterion("memory_time between", value1, value2, "memoryTime");
            return (Criteria) this;
        }

        public Criteria andMemoryTimeNotBetween(Date value1, Date value2) {
            addCriterion("memory_time not between", value1, value2, "memoryTime");
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