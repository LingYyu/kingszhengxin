package com.newtouch.fbf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrivingLicenseCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrivingLicenseCheckExample() {
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

        public Criteria andDrivingCarNoIsNull() {
            addCriterion("driving_car_no is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoIsNotNull() {
            addCriterion("driving_car_no is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoEqualTo(String value) {
            addCriterion("driving_car_no =", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoNotEqualTo(String value) {
            addCriterion("driving_car_no <>", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoGreaterThan(String value) {
            addCriterion("driving_car_no >", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_car_no >=", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoLessThan(String value) {
            addCriterion("driving_car_no <", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoLessThanOrEqualTo(String value) {
            addCriterion("driving_car_no <=", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoLike(String value) {
            addCriterion("driving_car_no like", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoNotLike(String value) {
            addCriterion("driving_car_no not like", value, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoIn(List<String> values) {
            addCriterion("driving_car_no in", values, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoNotIn(List<String> values) {
            addCriterion("driving_car_no not in", values, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoBetween(String value1, String value2) {
            addCriterion("driving_car_no between", value1, value2, "drivingCarNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarNoNotBetween(String value1, String value2) {
            addCriterion("driving_car_no not between", value1, value2, "drivingCarNo");
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

        public Criteria andDrivingCarStatusIsNull() {
            addCriterion("driving_car_status is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusIsNotNull() {
            addCriterion("driving_car_status is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusEqualTo(String value) {
            addCriterion("driving_car_status =", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusNotEqualTo(String value) {
            addCriterion("driving_car_status <>", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusGreaterThan(String value) {
            addCriterion("driving_car_status >", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusGreaterThanOrEqualTo(String value) {
            addCriterion("driving_car_status >=", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusLessThan(String value) {
            addCriterion("driving_car_status <", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusLessThanOrEqualTo(String value) {
            addCriterion("driving_car_status <=", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusLike(String value) {
            addCriterion("driving_car_status like", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusNotLike(String value) {
            addCriterion("driving_car_status not like", value, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusIn(List<String> values) {
            addCriterion("driving_car_status in", values, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusNotIn(List<String> values) {
            addCriterion("driving_car_status not in", values, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusBetween(String value1, String value2) {
            addCriterion("driving_car_status between", value1, value2, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarStatusNotBetween(String value1, String value2) {
            addCriterion("driving_car_status not between", value1, value2, "drivingCarStatus");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorIsNull() {
            addCriterion("driving_car_color is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorIsNotNull() {
            addCriterion("driving_car_color is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorEqualTo(String value) {
            addCriterion("driving_car_color =", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorNotEqualTo(String value) {
            addCriterion("driving_car_color <>", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorGreaterThan(String value) {
            addCriterion("driving_car_color >", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("driving_car_color >=", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorLessThan(String value) {
            addCriterion("driving_car_color <", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorLessThanOrEqualTo(String value) {
            addCriterion("driving_car_color <=", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorLike(String value) {
            addCriterion("driving_car_color like", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorNotLike(String value) {
            addCriterion("driving_car_color not like", value, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorIn(List<String> values) {
            addCriterion("driving_car_color in", values, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorNotIn(List<String> values) {
            addCriterion("driving_car_color not in", values, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorBetween(String value1, String value2) {
            addCriterion("driving_car_color between", value1, value2, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDrivingCarColorNotBetween(String value1, String value2) {
            addCriterion("driving_car_color not between", value1, value2, "drivingCarColor");
            return (Criteria) this;
        }

        public Criteria andDengineNoIsNull() {
            addCriterion("dengine_no is null");
            return (Criteria) this;
        }

        public Criteria andDengineNoIsNotNull() {
            addCriterion("dengine_no is not null");
            return (Criteria) this;
        }

        public Criteria andDengineNoEqualTo(String value) {
            addCriterion("dengine_no =", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoNotEqualTo(String value) {
            addCriterion("dengine_no <>", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoGreaterThan(String value) {
            addCriterion("dengine_no >", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoGreaterThanOrEqualTo(String value) {
            addCriterion("dengine_no >=", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoLessThan(String value) {
            addCriterion("dengine_no <", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoLessThanOrEqualTo(String value) {
            addCriterion("dengine_no <=", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoLike(String value) {
            addCriterion("dengine_no like", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoNotLike(String value) {
            addCriterion("dengine_no not like", value, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoIn(List<String> values) {
            addCriterion("dengine_no in", values, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoNotIn(List<String> values) {
            addCriterion("dengine_no not in", values, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoBetween(String value1, String value2) {
            addCriterion("dengine_no between", value1, value2, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andDengineNoNotBetween(String value1, String value2) {
            addCriterion("dengine_no not between", value1, value2, "dengineNo");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNull() {
            addCriterion("issue_date is null");
            return (Criteria) this;
        }

        public Criteria andIssueDateIsNotNull() {
            addCriterion("issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDateEqualTo(Date value) {
            addCriterion("issue_date =", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotEqualTo(Date value) {
            addCriterion("issue_date <>", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThan(Date value) {
            addCriterion("issue_date >", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_date >=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThan(Date value) {
            addCriterion("issue_date <", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateLessThanOrEqualTo(Date value) {
            addCriterion("issue_date <=", value, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateIn(List<Date> values) {
            addCriterion("issue_date in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotIn(List<Date> values) {
            addCriterion("issue_date not in", values, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateBetween(Date value1, Date value2) {
            addCriterion("issue_date between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andIssueDateNotBetween(Date value1, Date value2) {
            addCriterion("issue_date not between", value1, value2, "issueDate");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoIsNull() {
            addCriterion("dcar_frame_no is null");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoIsNotNull() {
            addCriterion("dcar_frame_no is not null");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoEqualTo(String value) {
            addCriterion("dcar_frame_no =", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoNotEqualTo(String value) {
            addCriterion("dcar_frame_no <>", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoGreaterThan(String value) {
            addCriterion("dcar_frame_no >", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoGreaterThanOrEqualTo(String value) {
            addCriterion("dcar_frame_no >=", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoLessThan(String value) {
            addCriterion("dcar_frame_no <", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoLessThanOrEqualTo(String value) {
            addCriterion("dcar_frame_no <=", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoLike(String value) {
            addCriterion("dcar_frame_no like", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoNotLike(String value) {
            addCriterion("dcar_frame_no not like", value, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoIn(List<String> values) {
            addCriterion("dcar_frame_no in", values, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoNotIn(List<String> values) {
            addCriterion("dcar_frame_no not in", values, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoBetween(String value1, String value2) {
            addCriterion("dcar_frame_no between", value1, value2, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDcarFrameNoNotBetween(String value1, String value2) {
            addCriterion("dcar_frame_no not between", value1, value2, "dcarFrameNo");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeIsNull() {
            addCriterion("driving_car_type is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeIsNotNull() {
            addCriterion("driving_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeEqualTo(String value) {
            addCriterion("driving_car_type =", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeNotEqualTo(String value) {
            addCriterion("driving_car_type <>", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeGreaterThan(String value) {
            addCriterion("driving_car_type >", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("driving_car_type >=", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeLessThan(String value) {
            addCriterion("driving_car_type <", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeLessThanOrEqualTo(String value) {
            addCriterion("driving_car_type <=", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeLike(String value) {
            addCriterion("driving_car_type like", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeNotLike(String value) {
            addCriterion("driving_car_type not like", value, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeIn(List<String> values) {
            addCriterion("driving_car_type in", values, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeNotIn(List<String> values) {
            addCriterion("driving_car_type not in", values, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeBetween(String value1, String value2) {
            addCriterion("driving_car_type between", value1, value2, "drivingCarType");
            return (Criteria) this;
        }

        public Criteria andDrivingCarTypeNotBetween(String value1, String value2) {
            addCriterion("driving_car_type not between", value1, value2, "drivingCarType");
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

        public Criteria andUsePropertyIsNull() {
            addCriterion("use_property is null");
            return (Criteria) this;
        }

        public Criteria andUsePropertyIsNotNull() {
            addCriterion("use_property is not null");
            return (Criteria) this;
        }

        public Criteria andUsePropertyEqualTo(String value) {
            addCriterion("use_property =", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyNotEqualTo(String value) {
            addCriterion("use_property <>", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyGreaterThan(String value) {
            addCriterion("use_property >", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyGreaterThanOrEqualTo(String value) {
            addCriterion("use_property >=", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyLessThan(String value) {
            addCriterion("use_property <", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyLessThanOrEqualTo(String value) {
            addCriterion("use_property <=", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyLike(String value) {
            addCriterion("use_property like", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyNotLike(String value) {
            addCriterion("use_property not like", value, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyIn(List<String> values) {
            addCriterion("use_property in", values, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyNotIn(List<String> values) {
            addCriterion("use_property not in", values, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyBetween(String value1, String value2) {
            addCriterion("use_property between", value1, value2, "useProperty");
            return (Criteria) this;
        }

        public Criteria andUsePropertyNotBetween(String value1, String value2) {
            addCriterion("use_property not between", value1, value2, "useProperty");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIsNull() {
            addCriterion("maturity_date is null");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIsNotNull() {
            addCriterion("maturity_date is not null");
            return (Criteria) this;
        }

        public Criteria andMaturityDateEqualTo(Date value) {
            addCriterion("maturity_date =", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotEqualTo(Date value) {
            addCriterion("maturity_date <>", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateGreaterThan(Date value) {
            addCriterion("maturity_date >", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateGreaterThanOrEqualTo(Date value) {
            addCriterion("maturity_date >=", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateLessThan(Date value) {
            addCriterion("maturity_date <", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateLessThanOrEqualTo(Date value) {
            addCriterion("maturity_date <=", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIn(List<Date> values) {
            addCriterion("maturity_date in", values, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotIn(List<Date> values) {
            addCriterion("maturity_date not in", values, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateBetween(Date value1, Date value2) {
            addCriterion("maturity_date between", value1, value2, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotBetween(Date value1, Date value2) {
            addCriterion("maturity_date not between", value1, value2, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateIsNull() {
            addCriterion("initial_regist_date is null");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateIsNotNull() {
            addCriterion("initial_regist_date is not null");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateEqualTo(Date value) {
            addCriterion("initial_regist_date =", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateNotEqualTo(Date value) {
            addCriterion("initial_regist_date <>", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateGreaterThan(Date value) {
            addCriterion("initial_regist_date >", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterion("initial_regist_date >=", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateLessThan(Date value) {
            addCriterion("initial_regist_date <", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateLessThanOrEqualTo(Date value) {
            addCriterion("initial_regist_date <=", value, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateIn(List<Date> values) {
            addCriterion("initial_regist_date in", values, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateNotIn(List<Date> values) {
            addCriterion("initial_regist_date not in", values, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateBetween(Date value1, Date value2) {
            addCriterion("initial_regist_date between", value1, value2, "initialRegistDate");
            return (Criteria) this;
        }

        public Criteria andInitialRegistDateNotBetween(Date value1, Date value2) {
            addCriterion("initial_regist_date not between", value1, value2, "initialRegistDate");
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