package com.newtouch.fbf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserModuleExample() {
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

        public Criteria andBusinessChooseIsNull() {
            addCriterion("business_choose is null");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseIsNotNull() {
            addCriterion("business_choose is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseEqualTo(Boolean value) {
            addCriterion("business_choose =", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseNotEqualTo(Boolean value) {
            addCriterion("business_choose <>", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseGreaterThan(Boolean value) {
            addCriterion("business_choose >", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("business_choose >=", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseLessThan(Boolean value) {
            addCriterion("business_choose <", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("business_choose <=", value, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseIn(List<Boolean> values) {
            addCriterion("business_choose in", values, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseNotIn(List<Boolean> values) {
            addCriterion("business_choose not in", values, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("business_choose between", value1, value2, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andBusinessChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("business_choose not between", value1, value2, "businessChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseIsNull() {
            addCriterion("loan_choose is null");
            return (Criteria) this;
        }

        public Criteria andLoanChooseIsNotNull() {
            addCriterion("loan_choose is not null");
            return (Criteria) this;
        }

        public Criteria andLoanChooseEqualTo(Boolean value) {
            addCriterion("loan_choose =", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseNotEqualTo(Boolean value) {
            addCriterion("loan_choose <>", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseGreaterThan(Boolean value) {
            addCriterion("loan_choose >", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("loan_choose >=", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseLessThan(Boolean value) {
            addCriterion("loan_choose <", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("loan_choose <=", value, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseIn(List<Boolean> values) {
            addCriterion("loan_choose in", values, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseNotIn(List<Boolean> values) {
            addCriterion("loan_choose not in", values, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("loan_choose between", value1, value2, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andLoanChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("loan_choose not between", value1, value2, "loanChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseIsNull() {
            addCriterion("driving_choose is null");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseIsNotNull() {
            addCriterion("driving_choose is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseEqualTo(Boolean value) {
            addCriterion("driving_choose =", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseNotEqualTo(Boolean value) {
            addCriterion("driving_choose <>", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseGreaterThan(Boolean value) {
            addCriterion("driving_choose >", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("driving_choose >=", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseLessThan(Boolean value) {
            addCriterion("driving_choose <", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("driving_choose <=", value, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseIn(List<Boolean> values) {
            addCriterion("driving_choose in", values, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseNotIn(List<Boolean> values) {
            addCriterion("driving_choose not in", values, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("driving_choose between", value1, value2, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andDrivingChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("driving_choose not between", value1, value2, "drivingChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseIsNull() {
            addCriterion("illegal_choose is null");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseIsNotNull() {
            addCriterion("illegal_choose is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseEqualTo(Boolean value) {
            addCriterion("illegal_choose =", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseNotEqualTo(Boolean value) {
            addCriterion("illegal_choose <>", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseGreaterThan(Boolean value) {
            addCriterion("illegal_choose >", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("illegal_choose >=", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseLessThan(Boolean value) {
            addCriterion("illegal_choose <", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("illegal_choose <=", value, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseIn(List<Boolean> values) {
            addCriterion("illegal_choose in", values, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseNotIn(List<Boolean> values) {
            addCriterion("illegal_choose not in", values, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("illegal_choose between", value1, value2, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andIllegalChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("illegal_choose not between", value1, value2, "illegalChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseIsNull() {
            addCriterion("fly_choose is null");
            return (Criteria) this;
        }

        public Criteria andFlyChooseIsNotNull() {
            addCriterion("fly_choose is not null");
            return (Criteria) this;
        }

        public Criteria andFlyChooseEqualTo(Boolean value) {
            addCriterion("fly_choose =", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseNotEqualTo(Boolean value) {
            addCriterion("fly_choose <>", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseGreaterThan(Boolean value) {
            addCriterion("fly_choose >", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fly_choose >=", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseLessThan(Boolean value) {
            addCriterion("fly_choose <", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("fly_choose <=", value, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseIn(List<Boolean> values) {
            addCriterion("fly_choose in", values, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseNotIn(List<Boolean> values) {
            addCriterion("fly_choose not in", values, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("fly_choose between", value1, value2, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andFlyChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fly_choose not between", value1, value2, "flyChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseIsNull() {
            addCriterion("internet_choose is null");
            return (Criteria) this;
        }

        public Criteria andInternetChooseIsNotNull() {
            addCriterion("internet_choose is not null");
            return (Criteria) this;
        }

        public Criteria andInternetChooseEqualTo(Boolean value) {
            addCriterion("internet_choose =", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseNotEqualTo(Boolean value) {
            addCriterion("internet_choose <>", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseGreaterThan(Boolean value) {
            addCriterion("internet_choose >", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("internet_choose >=", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseLessThan(Boolean value) {
            addCriterion("internet_choose <", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseLessThanOrEqualTo(Boolean value) {
            addCriterion("internet_choose <=", value, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseIn(List<Boolean> values) {
            addCriterion("internet_choose in", values, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseNotIn(List<Boolean> values) {
            addCriterion("internet_choose not in", values, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseBetween(Boolean value1, Boolean value2) {
            addCriterion("internet_choose between", value1, value2, "internetChoose");
            return (Criteria) this;
        }

        public Criteria andInternetChooseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("internet_choose not between", value1, value2, "internetChoose");
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

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
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