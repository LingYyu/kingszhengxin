package com.newtouch.fbf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightInfoCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightInfoCheckExample() {
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

        public Criteria andFlightNameIsNull() {
            addCriterion("flight_name is null");
            return (Criteria) this;
        }

        public Criteria andFlightNameIsNotNull() {
            addCriterion("flight_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlightNameEqualTo(String value) {
            addCriterion("flight_name =", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameNotEqualTo(String value) {
            addCriterion("flight_name <>", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameGreaterThan(String value) {
            addCriterion("flight_name >", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameGreaterThanOrEqualTo(String value) {
            addCriterion("flight_name >=", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameLessThan(String value) {
            addCriterion("flight_name <", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameLessThanOrEqualTo(String value) {
            addCriterion("flight_name <=", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameLike(String value) {
            addCriterion("flight_name like", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameNotLike(String value) {
            addCriterion("flight_name not like", value, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameIn(List<String> values) {
            addCriterion("flight_name in", values, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameNotIn(List<String> values) {
            addCriterion("flight_name not in", values, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameBetween(String value1, String value2) {
            addCriterion("flight_name between", value1, value2, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightNameNotBetween(String value1, String value2) {
            addCriterion("flight_name not between", value1, value2, "flightName");
            return (Criteria) this;
        }

        public Criteria andFlightCardIsNull() {
            addCriterion("flight_card is null");
            return (Criteria) this;
        }

        public Criteria andFlightCardIsNotNull() {
            addCriterion("flight_card is not null");
            return (Criteria) this;
        }

        public Criteria andFlightCardEqualTo(String value) {
            addCriterion("flight_card =", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardNotEqualTo(String value) {
            addCriterion("flight_card <>", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardGreaterThan(String value) {
            addCriterion("flight_card >", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardGreaterThanOrEqualTo(String value) {
            addCriterion("flight_card >=", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardLessThan(String value) {
            addCriterion("flight_card <", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardLessThanOrEqualTo(String value) {
            addCriterion("flight_card <=", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardLike(String value) {
            addCriterion("flight_card like", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardNotLike(String value) {
            addCriterion("flight_card not like", value, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardIn(List<String> values) {
            addCriterion("flight_card in", values, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardNotIn(List<String> values) {
            addCriterion("flight_card not in", values, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardBetween(String value1, String value2) {
            addCriterion("flight_card between", value1, value2, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFlightCardNotBetween(String value1, String value2) {
            addCriterion("flight_card not between", value1, value2, "flightCard");
            return (Criteria) this;
        }

        public Criteria andFirstClassIsNull() {
            addCriterion("first_class is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassIsNotNull() {
            addCriterion("first_class is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassEqualTo(String value) {
            addCriterion("first_class =", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassNotEqualTo(String value) {
            addCriterion("first_class <>", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassGreaterThan(String value) {
            addCriterion("first_class >", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassGreaterThanOrEqualTo(String value) {
            addCriterion("first_class >=", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassLessThan(String value) {
            addCriterion("first_class <", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassLessThanOrEqualTo(String value) {
            addCriterion("first_class <=", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassLike(String value) {
            addCriterion("first_class like", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassNotLike(String value) {
            addCriterion("first_class not like", value, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassIn(List<String> values) {
            addCriterion("first_class in", values, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassNotIn(List<String> values) {
            addCriterion("first_class not in", values, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassBetween(String value1, String value2) {
            addCriterion("first_class between", value1, value2, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFirstClassNotBetween(String value1, String value2) {
            addCriterion("first_class not between", value1, value2, "firstClass");
            return (Criteria) this;
        }

        public Criteria andFlightTimesIsNull() {
            addCriterion("flight_times is null");
            return (Criteria) this;
        }

        public Criteria andFlightTimesIsNotNull() {
            addCriterion("flight_times is not null");
            return (Criteria) this;
        }

        public Criteria andFlightTimesEqualTo(String value) {
            addCriterion("flight_times =", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesNotEqualTo(String value) {
            addCriterion("flight_times <>", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesGreaterThan(String value) {
            addCriterion("flight_times >", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesGreaterThanOrEqualTo(String value) {
            addCriterion("flight_times >=", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesLessThan(String value) {
            addCriterion("flight_times <", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesLessThanOrEqualTo(String value) {
            addCriterion("flight_times <=", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesLike(String value) {
            addCriterion("flight_times like", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesNotLike(String value) {
            addCriterion("flight_times not like", value, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesIn(List<String> values) {
            addCriterion("flight_times in", values, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesNotIn(List<String> values) {
            addCriterion("flight_times not in", values, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesBetween(String value1, String value2) {
            addCriterion("flight_times between", value1, value2, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFlightTimesNotBetween(String value1, String value2) {
            addCriterion("flight_times not between", value1, value2, "flightTimes");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedIsNull() {
            addCriterion("finally_arrived is null");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedIsNotNull() {
            addCriterion("finally_arrived is not null");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedEqualTo(String value) {
            addCriterion("finally_arrived =", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedNotEqualTo(String value) {
            addCriterion("finally_arrived <>", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedGreaterThan(String value) {
            addCriterion("finally_arrived >", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedGreaterThanOrEqualTo(String value) {
            addCriterion("finally_arrived >=", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedLessThan(String value) {
            addCriterion("finally_arrived <", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedLessThanOrEqualTo(String value) {
            addCriterion("finally_arrived <=", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedLike(String value) {
            addCriterion("finally_arrived like", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedNotLike(String value) {
            addCriterion("finally_arrived not like", value, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedIn(List<String> values) {
            addCriterion("finally_arrived in", values, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedNotIn(List<String> values) {
            addCriterion("finally_arrived not in", values, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedBetween(String value1, String value2) {
            addCriterion("finally_arrived between", value1, value2, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andFinallyArrivedNotBetween(String value1, String value2) {
            addCriterion("finally_arrived not between", value1, value2, "finallyArrived");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesIsNull() {
            addCriterion("year_fight_times is null");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesIsNotNull() {
            addCriterion("year_fight_times is not null");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesEqualTo(String value) {
            addCriterion("year_fight_times =", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesNotEqualTo(String value) {
            addCriterion("year_fight_times <>", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesGreaterThan(String value) {
            addCriterion("year_fight_times >", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesGreaterThanOrEqualTo(String value) {
            addCriterion("year_fight_times >=", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesLessThan(String value) {
            addCriterion("year_fight_times <", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesLessThanOrEqualTo(String value) {
            addCriterion("year_fight_times <=", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesLike(String value) {
            addCriterion("year_fight_times like", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesNotLike(String value) {
            addCriterion("year_fight_times not like", value, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesIn(List<String> values) {
            addCriterion("year_fight_times in", values, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesNotIn(List<String> values) {
            addCriterion("year_fight_times not in", values, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesBetween(String value1, String value2) {
            addCriterion("year_fight_times between", value1, value2, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andYearFightTimesNotBetween(String value1, String value2) {
            addCriterion("year_fight_times not between", value1, value2, "yearFightTimes");
            return (Criteria) this;
        }

        public Criteria andEconomyClassIsNull() {
            addCriterion("economy_class is null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassIsNotNull() {
            addCriterion("economy_class is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassEqualTo(String value) {
            addCriterion("economy_class =", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassNotEqualTo(String value) {
            addCriterion("economy_class <>", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassGreaterThan(String value) {
            addCriterion("economy_class >", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassGreaterThanOrEqualTo(String value) {
            addCriterion("economy_class >=", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassLessThan(String value) {
            addCriterion("economy_class <", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassLessThanOrEqualTo(String value) {
            addCriterion("economy_class <=", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassLike(String value) {
            addCriterion("economy_class like", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassNotLike(String value) {
            addCriterion("economy_class not like", value, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassIn(List<String> values) {
            addCriterion("economy_class in", values, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassNotIn(List<String> values) {
            addCriterion("economy_class not in", values, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassBetween(String value1, String value2) {
            addCriterion("economy_class between", value1, value2, "economyClass");
            return (Criteria) this;
        }

        public Criteria andEconomyClassNotBetween(String value1, String value2) {
            addCriterion("economy_class not between", value1, value2, "economyClass");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityIsNull() {
            addCriterion("frequent_reach_city is null");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityIsNotNull() {
            addCriterion("frequent_reach_city is not null");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityEqualTo(String value) {
            addCriterion("frequent_reach_city =", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityNotEqualTo(String value) {
            addCriterion("frequent_reach_city <>", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityGreaterThan(String value) {
            addCriterion("frequent_reach_city >", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityGreaterThanOrEqualTo(String value) {
            addCriterion("frequent_reach_city >=", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityLessThan(String value) {
            addCriterion("frequent_reach_city <", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityLessThanOrEqualTo(String value) {
            addCriterion("frequent_reach_city <=", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityLike(String value) {
            addCriterion("frequent_reach_city like", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityNotLike(String value) {
            addCriterion("frequent_reach_city not like", value, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityIn(List<String> values) {
            addCriterion("frequent_reach_city in", values, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityNotIn(List<String> values) {
            addCriterion("frequent_reach_city not in", values, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityBetween(String value1, String value2) {
            addCriterion("frequent_reach_city between", value1, value2, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andFrequentReachCityNotBetween(String value1, String value2) {
            addCriterion("frequent_reach_city not between", value1, value2, "frequentReachCity");
            return (Criteria) this;
        }

        public Criteria andAverageFareIsNull() {
            addCriterion("average_fare is null");
            return (Criteria) this;
        }

        public Criteria andAverageFareIsNotNull() {
            addCriterion("average_fare is not null");
            return (Criteria) this;
        }

        public Criteria andAverageFareEqualTo(String value) {
            addCriterion("average_fare =", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareNotEqualTo(String value) {
            addCriterion("average_fare <>", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareGreaterThan(String value) {
            addCriterion("average_fare >", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareGreaterThanOrEqualTo(String value) {
            addCriterion("average_fare >=", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareLessThan(String value) {
            addCriterion("average_fare <", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareLessThanOrEqualTo(String value) {
            addCriterion("average_fare <=", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareLike(String value) {
            addCriterion("average_fare like", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareNotLike(String value) {
            addCriterion("average_fare not like", value, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareIn(List<String> values) {
            addCriterion("average_fare in", values, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareNotIn(List<String> values) {
            addCriterion("average_fare not in", values, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareBetween(String value1, String value2) {
            addCriterion("average_fare between", value1, value2, "averageFare");
            return (Criteria) this;
        }

        public Criteria andAverageFareNotBetween(String value1, String value2) {
            addCriterion("average_fare not between", value1, value2, "averageFare");
            return (Criteria) this;
        }

        public Criteria andTotalFlightIsNull() {
            addCriterion("total_flight is null");
            return (Criteria) this;
        }

        public Criteria andTotalFlightIsNotNull() {
            addCriterion("total_flight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFlightEqualTo(String value) {
            addCriterion("total_flight =", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightNotEqualTo(String value) {
            addCriterion("total_flight <>", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightGreaterThan(String value) {
            addCriterion("total_flight >", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightGreaterThanOrEqualTo(String value) {
            addCriterion("total_flight >=", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightLessThan(String value) {
            addCriterion("total_flight <", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightLessThanOrEqualTo(String value) {
            addCriterion("total_flight <=", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightLike(String value) {
            addCriterion("total_flight like", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightNotLike(String value) {
            addCriterion("total_flight not like", value, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightIn(List<String> values) {
            addCriterion("total_flight in", values, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightNotIn(List<String> values) {
            addCriterion("total_flight not in", values, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightBetween(String value1, String value2) {
            addCriterion("total_flight between", value1, value2, "totalFlight");
            return (Criteria) this;
        }

        public Criteria andTotalFlightNotBetween(String value1, String value2) {
            addCriterion("total_flight not between", value1, value2, "totalFlight");
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