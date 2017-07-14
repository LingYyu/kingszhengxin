package com.newtouch.fbf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LegalPersonCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LegalPersonCheckExample() {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("registered_capital like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("registered_capital not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIsNull() {
            addCriterion("operating_period is null");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIsNotNull() {
            addCriterion("operating_period is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodEqualTo(String value) {
            addCriterion("operating_period =", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotEqualTo(String value) {
            addCriterion("operating_period <>", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodGreaterThan(String value) {
            addCriterion("operating_period >", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("operating_period >=", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLessThan(String value) {
            addCriterion("operating_period <", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLessThanOrEqualTo(String value) {
            addCriterion("operating_period <=", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLike(String value) {
            addCriterion("operating_period like", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotLike(String value) {
            addCriterion("operating_period not like", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIn(List<String> values) {
            addCriterion("operating_period in", values, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotIn(List<String> values) {
            addCriterion("operating_period not in", values, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodBetween(String value1, String value2) {
            addCriterion("operating_period between", value1, value2, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotBetween(String value1, String value2) {
            addCriterion("operating_period not between", value1, value2, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNull() {
            addCriterion("business_status is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNotNull() {
            addCriterion("business_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusEqualTo(String value) {
            addCriterion("business_status =", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotEqualTo(String value) {
            addCriterion("business_status <>", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThan(String value) {
            addCriterion("business_status >", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("business_status >=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThan(String value) {
            addCriterion("business_status <", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThanOrEqualTo(String value) {
            addCriterion("business_status <=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLike(String value) {
            addCriterion("business_status like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotLike(String value) {
            addCriterion("business_status not like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIn(List<String> values) {
            addCriterion("business_status in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotIn(List<String> values) {
            addCriterion("business_status not in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusBetween(String value1, String value2) {
            addCriterion("business_status between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotBetween(String value1, String value2) {
            addCriterion("business_status not between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoIsNull() {
            addCriterion("shareholders_info is null");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoIsNotNull() {
            addCriterion("shareholders_info is not null");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoEqualTo(String value) {
            addCriterion("shareholders_info =", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoNotEqualTo(String value) {
            addCriterion("shareholders_info <>", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoGreaterThan(String value) {
            addCriterion("shareholders_info >", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoGreaterThanOrEqualTo(String value) {
            addCriterion("shareholders_info >=", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoLessThan(String value) {
            addCriterion("shareholders_info <", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoLessThanOrEqualTo(String value) {
            addCriterion("shareholders_info <=", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoLike(String value) {
            addCriterion("shareholders_info like", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoNotLike(String value) {
            addCriterion("shareholders_info not like", value, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoIn(List<String> values) {
            addCriterion("shareholders_info in", values, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoNotIn(List<String> values) {
            addCriterion("shareholders_info not in", values, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoBetween(String value1, String value2) {
            addCriterion("shareholders_info between", value1, value2, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andShareholdersInfoNotBetween(String value1, String value2) {
            addCriterion("shareholders_info not between", value1, value2, "shareholdersInfo");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionIsNull() {
            addCriterion("enterprise_position is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionIsNotNull() {
            addCriterion("enterprise_position is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionEqualTo(String value) {
            addCriterion("enterprise_position =", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionNotEqualTo(String value) {
            addCriterion("enterprise_position <>", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionGreaterThan(String value) {
            addCriterion("enterprise_position >", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_position >=", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionLessThan(String value) {
            addCriterion("enterprise_position <", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionLessThanOrEqualTo(String value) {
            addCriterion("enterprise_position <=", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionLike(String value) {
            addCriterion("enterprise_position like", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionNotLike(String value) {
            addCriterion("enterprise_position not like", value, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionIn(List<String> values) {
            addCriterion("enterprise_position in", values, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionNotIn(List<String> values) {
            addCriterion("enterprise_position not in", values, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionBetween(String value1, String value2) {
            addCriterion("enterprise_position between", value1, value2, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterprisePositionNotBetween(String value1, String value2) {
            addCriterion("enterprise_position not between", value1, value2, "enterprisePosition");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyIsNull() {
            addCriterion("enterprise_dishonesty is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyIsNotNull() {
            addCriterion("enterprise_dishonesty is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyEqualTo(String value) {
            addCriterion("enterprise_dishonesty =", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyNotEqualTo(String value) {
            addCriterion("enterprise_dishonesty <>", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyGreaterThan(String value) {
            addCriterion("enterprise_dishonesty >", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_dishonesty >=", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyLessThan(String value) {
            addCriterion("enterprise_dishonesty <", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyLessThanOrEqualTo(String value) {
            addCriterion("enterprise_dishonesty <=", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyLike(String value) {
            addCriterion("enterprise_dishonesty like", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyNotLike(String value) {
            addCriterion("enterprise_dishonesty not like", value, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyIn(List<String> values) {
            addCriterion("enterprise_dishonesty in", values, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyNotIn(List<String> values) {
            addCriterion("enterprise_dishonesty not in", values, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyBetween(String value1, String value2) {
            addCriterion("enterprise_dishonesty between", value1, value2, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDishonestyNotBetween(String value1, String value2) {
            addCriterion("enterprise_dishonesty not between", value1, value2, "enterpriseDishonesty");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIsNull() {
            addCriterion("executed_name is null");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIsNotNull() {
            addCriterion("executed_name is not null");
            return (Criteria) this;
        }

        public Criteria andExecutedNameEqualTo(String value) {
            addCriterion("executed_name =", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotEqualTo(String value) {
            addCriterion("executed_name <>", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameGreaterThan(String value) {
            addCriterion("executed_name >", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameGreaterThanOrEqualTo(String value) {
            addCriterion("executed_name >=", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLessThan(String value) {
            addCriterion("executed_name <", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLessThanOrEqualTo(String value) {
            addCriterion("executed_name <=", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLike(String value) {
            addCriterion("executed_name like", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotLike(String value) {
            addCriterion("executed_name not like", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIn(List<String> values) {
            addCriterion("executed_name in", values, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotIn(List<String> values) {
            addCriterion("executed_name not in", values, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameBetween(String value1, String value2) {
            addCriterion("executed_name between", value1, value2, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotBetween(String value1, String value2) {
            addCriterion("executed_name not between", value1, value2, "executedName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andFilingTimeIsNull() {
            addCriterion("filing_time is null");
            return (Criteria) this;
        }

        public Criteria andFilingTimeIsNotNull() {
            addCriterion("filing_time is not null");
            return (Criteria) this;
        }

        public Criteria andFilingTimeEqualTo(Date value) {
            addCriterion("filing_time =", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotEqualTo(Date value) {
            addCriterion("filing_time <>", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeGreaterThan(Date value) {
            addCriterion("filing_time >", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("filing_time >=", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeLessThan(Date value) {
            addCriterion("filing_time <", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeLessThanOrEqualTo(Date value) {
            addCriterion("filing_time <=", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeIn(List<Date> values) {
            addCriterion("filing_time in", values, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotIn(List<Date> values) {
            addCriterion("filing_time not in", values, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeBetween(Date value1, Date value2) {
            addCriterion("filing_time between", value1, value2, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotBetween(Date value1, Date value2) {
            addCriterion("filing_time not between", value1, value2, "filingTime");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionIsNull() {
            addCriterion("court_execution is null");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionIsNotNull() {
            addCriterion("court_execution is not null");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionEqualTo(String value) {
            addCriterion("court_execution =", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionNotEqualTo(String value) {
            addCriterion("court_execution <>", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionGreaterThan(String value) {
            addCriterion("court_execution >", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionGreaterThanOrEqualTo(String value) {
            addCriterion("court_execution >=", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionLessThan(String value) {
            addCriterion("court_execution <", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionLessThanOrEqualTo(String value) {
            addCriterion("court_execution <=", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionLike(String value) {
            addCriterion("court_execution like", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionNotLike(String value) {
            addCriterion("court_execution not like", value, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionIn(List<String> values) {
            addCriterion("court_execution in", values, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionNotIn(List<String> values) {
            addCriterion("court_execution not in", values, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionBetween(String value1, String value2) {
            addCriterion("court_execution between", value1, value2, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andCourtExecutionNotBetween(String value1, String value2) {
            addCriterion("court_execution not between", value1, value2, "courtExecution");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNull() {
            addCriterion("opening_date is null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNotNull() {
            addCriterion("opening_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateEqualTo(String value) {
            addCriterion("opening_date =", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotEqualTo(String value) {
            addCriterion("opening_date <>", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThan(String value) {
            addCriterion("opening_date >", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThanOrEqualTo(String value) {
            addCriterion("opening_date >=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThan(String value) {
            addCriterion("opening_date <", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThanOrEqualTo(String value) {
            addCriterion("opening_date <=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLike(String value) {
            addCriterion("opening_date like", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotLike(String value) {
            addCriterion("opening_date not like", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIn(List<String> values) {
            addCriterion("opening_date in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotIn(List<String> values) {
            addCriterion("opening_date not in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateBetween(String value1, String value2) {
            addCriterion("opening_date between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotBetween(String value1, String value2) {
            addCriterion("opening_date not between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityIsNull() {
            addCriterion("regist_authority is null");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityIsNotNull() {
            addCriterion("regist_authority is not null");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityEqualTo(String value) {
            addCriterion("regist_authority =", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityNotEqualTo(String value) {
            addCriterion("regist_authority <>", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityGreaterThan(String value) {
            addCriterion("regist_authority >", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("regist_authority >=", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityLessThan(String value) {
            addCriterion("regist_authority <", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityLessThanOrEqualTo(String value) {
            addCriterion("regist_authority <=", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityLike(String value) {
            addCriterion("regist_authority like", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityNotLike(String value) {
            addCriterion("regist_authority not like", value, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityIn(List<String> values) {
            addCriterion("regist_authority in", values, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityNotIn(List<String> values) {
            addCriterion("regist_authority not in", values, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityBetween(String value1, String value2) {
            addCriterion("regist_authority between", value1, value2, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAuthorityNotBetween(String value1, String value2) {
            addCriterion("regist_authority not between", value1, value2, "registAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistAddressIsNull() {
            addCriterion("regist_address is null");
            return (Criteria) this;
        }

        public Criteria andRegistAddressIsNotNull() {
            addCriterion("regist_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegistAddressEqualTo(String value) {
            addCriterion("regist_address =", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressNotEqualTo(String value) {
            addCriterion("regist_address <>", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressGreaterThan(String value) {
            addCriterion("regist_address >", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressGreaterThanOrEqualTo(String value) {
            addCriterion("regist_address >=", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressLessThan(String value) {
            addCriterion("regist_address <", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressLessThanOrEqualTo(String value) {
            addCriterion("regist_address <=", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressLike(String value) {
            addCriterion("regist_address like", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressNotLike(String value) {
            addCriterion("regist_address not like", value, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressIn(List<String> values) {
            addCriterion("regist_address in", values, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressNotIn(List<String> values) {
            addCriterion("regist_address not in", values, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressBetween(String value1, String value2) {
            addCriterion("regist_address between", value1, value2, "registAddress");
            return (Criteria) this;
        }

        public Criteria andRegistAddressNotBetween(String value1, String value2) {
            addCriterion("regist_address not between", value1, value2, "registAddress");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeIsNull() {
            addCriterion("dishonesty_type is null");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeIsNotNull() {
            addCriterion("dishonesty_type is not null");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeEqualTo(String value) {
            addCriterion("dishonesty_type =", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeNotEqualTo(String value) {
            addCriterion("dishonesty_type <>", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeGreaterThan(String value) {
            addCriterion("dishonesty_type >", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dishonesty_type >=", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeLessThan(String value) {
            addCriterion("dishonesty_type <", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeLessThanOrEqualTo(String value) {
            addCriterion("dishonesty_type <=", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeLike(String value) {
            addCriterion("dishonesty_type like", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeNotLike(String value) {
            addCriterion("dishonesty_type not like", value, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeIn(List<String> values) {
            addCriterion("dishonesty_type in", values, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeNotIn(List<String> values) {
            addCriterion("dishonesty_type not in", values, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeBetween(String value1, String value2) {
            addCriterion("dishonesty_type between", value1, value2, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyTypeNotBetween(String value1, String value2) {
            addCriterion("dishonesty_type not between", value1, value2, "dishonestyType");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeIsNull() {
            addCriterion("dishonesty_age is null");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeIsNotNull() {
            addCriterion("dishonesty_age is not null");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeEqualTo(Integer value) {
            addCriterion("dishonesty_age =", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeNotEqualTo(Integer value) {
            addCriterion("dishonesty_age <>", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeGreaterThan(Integer value) {
            addCriterion("dishonesty_age >", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishonesty_age >=", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeLessThan(Integer value) {
            addCriterion("dishonesty_age <", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeLessThanOrEqualTo(Integer value) {
            addCriterion("dishonesty_age <=", value, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeIn(List<Integer> values) {
            addCriterion("dishonesty_age in", values, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeNotIn(List<Integer> values) {
            addCriterion("dishonesty_age not in", values, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeBetween(Integer value1, Integer value2) {
            addCriterion("dishonesty_age between", value1, value2, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andDishonestyAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("dishonesty_age not between", value1, value2, "dishonestyAge");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIsNull() {
            addCriterion("idcard_address is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIsNotNull() {
            addCriterion("idcard_address is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressEqualTo(String value) {
            addCriterion("idcard_address =", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotEqualTo(String value) {
            addCriterion("idcard_address <>", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressGreaterThan(String value) {
            addCriterion("idcard_address >", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_address >=", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLessThan(String value) {
            addCriterion("idcard_address <", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLessThanOrEqualTo(String value) {
            addCriterion("idcard_address <=", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLike(String value) {
            addCriterion("idcard_address like", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotLike(String value) {
            addCriterion("idcard_address not like", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIn(List<String> values) {
            addCriterion("idcard_address in", values, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotIn(List<String> values) {
            addCriterion("idcard_address not in", values, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressBetween(String value1, String value2) {
            addCriterion("idcard_address between", value1, value2, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotBetween(String value1, String value2) {
            addCriterion("idcard_address not between", value1, value2, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("case_status =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("case_status <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("case_status >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_status >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("case_status <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("case_status <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("case_status like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("case_status not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("case_status in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("case_status not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("case_status between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("case_status not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectIsNull() {
            addCriterion("executive_subject is null");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectIsNotNull() {
            addCriterion("executive_subject is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectEqualTo(String value) {
            addCriterion("executive_subject =", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectNotEqualTo(String value) {
            addCriterion("executive_subject <>", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectGreaterThan(String value) {
            addCriterion("executive_subject >", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("executive_subject >=", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectLessThan(String value) {
            addCriterion("executive_subject <", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectLessThanOrEqualTo(String value) {
            addCriterion("executive_subject <=", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectLike(String value) {
            addCriterion("executive_subject like", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectNotLike(String value) {
            addCriterion("executive_subject not like", value, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectIn(List<String> values) {
            addCriterion("executive_subject in", values, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectNotIn(List<String> values) {
            addCriterion("executive_subject not in", values, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectBetween(String value1, String value2) {
            addCriterion("executive_subject between", value1, value2, "executiveSubject");
            return (Criteria) this;
        }

        public Criteria andExecutiveSubjectNotBetween(String value1, String value2) {
            addCriterion("executive_subject not between", value1, value2, "executiveSubject");
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