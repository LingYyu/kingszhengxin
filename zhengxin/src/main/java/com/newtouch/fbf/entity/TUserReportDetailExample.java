package com.newtouch.fbf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserReportDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserReportDetailExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIsNull() {
            addCriterion("school_degree is null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIsNotNull() {
            addCriterion("school_degree is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeEqualTo(String value) {
            addCriterion("school_degree =", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeNotEqualTo(String value) {
            addCriterion("school_degree <>", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeGreaterThan(String value) {
            addCriterion("school_degree >", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("school_degree >=", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeLessThan(String value) {
            addCriterion("school_degree <", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeLessThanOrEqualTo(String value) {
            addCriterion("school_degree <=", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeLike(String value) {
            addCriterion("school_degree like", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeNotLike(String value) {
            addCriterion("school_degree not like", value, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIn(List<String> values) {
            addCriterion("school_degree in", values, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeNotIn(List<String> values) {
            addCriterion("school_degree not in", values, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeBetween(String value1, String value2) {
            addCriterion("school_degree between", value1, value2, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeNotBetween(String value1, String value2) {
            addCriterion("school_degree not between", value1, value2, "schoolDegree");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeIsNull() {
            addCriterion("school_startime is null");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeIsNotNull() {
            addCriterion("school_startime is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeEqualTo(Date value) {
            addCriterion("school_startime =", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeNotEqualTo(Date value) {
            addCriterion("school_startime <>", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeGreaterThan(Date value) {
            addCriterion("school_startime >", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("school_startime >=", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeLessThan(Date value) {
            addCriterion("school_startime <", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeLessThanOrEqualTo(Date value) {
            addCriterion("school_startime <=", value, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeIn(List<Date> values) {
            addCriterion("school_startime in", values, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeNotIn(List<Date> values) {
            addCriterion("school_startime not in", values, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeBetween(Date value1, Date value2) {
            addCriterion("school_startime between", value1, value2, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andSchoolStartimeNotBetween(Date value1, Date value2) {
            addCriterion("school_startime not between", value1, value2, "schoolStartime");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNull() {
            addCriterion("student_number is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("student_number is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(String value) {
            addCriterion("student_number =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(String value) {
            addCriterion("student_number <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(String value) {
            addCriterion("student_number >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("student_number >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(String value) {
            addCriterion("student_number <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(String value) {
            addCriterion("student_number <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLike(String value) {
            addCriterion("student_number like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotLike(String value) {
            addCriterion("student_number not like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<String> values) {
            addCriterion("student_number in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<String> values) {
            addCriterion("student_number not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(String value1, String value2) {
            addCriterion("student_number between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(String value1, String value2) {
            addCriterion("student_number not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberIsNull() {
            addCriterion("illegal_car_number is null");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberIsNotNull() {
            addCriterion("illegal_car_number is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberEqualTo(String value) {
            addCriterion("illegal_car_number =", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberNotEqualTo(String value) {
            addCriterion("illegal_car_number <>", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberGreaterThan(String value) {
            addCriterion("illegal_car_number >", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("illegal_car_number >=", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberLessThan(String value) {
            addCriterion("illegal_car_number <", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberLessThanOrEqualTo(String value) {
            addCriterion("illegal_car_number <=", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberLike(String value) {
            addCriterion("illegal_car_number like", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberNotLike(String value) {
            addCriterion("illegal_car_number not like", value, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberIn(List<String> values) {
            addCriterion("illegal_car_number in", values, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberNotIn(List<String> values) {
            addCriterion("illegal_car_number not in", values, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberBetween(String value1, String value2) {
            addCriterion("illegal_car_number between", value1, value2, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarNumberNotBetween(String value1, String value2) {
            addCriterion("illegal_car_number not between", value1, value2, "illegalCarNumber");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeIsNull() {
            addCriterion("illegal_car_type is null");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeIsNotNull() {
            addCriterion("illegal_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeEqualTo(String value) {
            addCriterion("illegal_car_type =", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeNotEqualTo(String value) {
            addCriterion("illegal_car_type <>", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeGreaterThan(String value) {
            addCriterion("illegal_car_type >", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("illegal_car_type >=", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeLessThan(String value) {
            addCriterion("illegal_car_type <", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeLessThanOrEqualTo(String value) {
            addCriterion("illegal_car_type <=", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeLike(String value) {
            addCriterion("illegal_car_type like", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeNotLike(String value) {
            addCriterion("illegal_car_type not like", value, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeIn(List<String> values) {
            addCriterion("illegal_car_type in", values, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeNotIn(List<String> values) {
            addCriterion("illegal_car_type not in", values, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeBetween(String value1, String value2) {
            addCriterion("illegal_car_type between", value1, value2, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andIllegalCarTypeNotBetween(String value1, String value2) {
            addCriterion("illegal_car_type not between", value1, value2, "illegalCarType");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNull() {
            addCriterion("frame_number is null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNotNull() {
            addCriterion("frame_number is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberEqualTo(String value) {
            addCriterion("frame_number =", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotEqualTo(String value) {
            addCriterion("frame_number <>", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThan(String value) {
            addCriterion("frame_number >", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThanOrEqualTo(String value) {
            addCriterion("frame_number >=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThan(String value) {
            addCriterion("frame_number <", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThanOrEqualTo(String value) {
            addCriterion("frame_number <=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLike(String value) {
            addCriterion("frame_number like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotLike(String value) {
            addCriterion("frame_number not like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIn(List<String> values) {
            addCriterion("frame_number in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotIn(List<String> values) {
            addCriterion("frame_number not in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberBetween(String value1, String value2) {
            addCriterion("frame_number between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotBetween(String value1, String value2) {
            addCriterion("frame_number not between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberIsNull() {
            addCriterion("taobao_number is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberIsNotNull() {
            addCriterion("taobao_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberEqualTo(String value) {
            addCriterion("taobao_number =", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberNotEqualTo(String value) {
            addCriterion("taobao_number <>", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberGreaterThan(String value) {
            addCriterion("taobao_number >", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_number >=", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberLessThan(String value) {
            addCriterion("taobao_number <", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberLessThanOrEqualTo(String value) {
            addCriterion("taobao_number <=", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberLike(String value) {
            addCriterion("taobao_number like", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberNotLike(String value) {
            addCriterion("taobao_number not like", value, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberIn(List<String> values) {
            addCriterion("taobao_number in", values, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberNotIn(List<String> values) {
            addCriterion("taobao_number not in", values, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberBetween(String value1, String value2) {
            addCriterion("taobao_number between", value1, value2, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoNumberNotBetween(String value1, String value2) {
            addCriterion("taobao_number not between", value1, value2, "taobaoNumber");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdIsNull() {
            addCriterion("taobao_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdIsNotNull() {
            addCriterion("taobao_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdEqualTo(String value) {
            addCriterion("taobao_pwd =", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdNotEqualTo(String value) {
            addCriterion("taobao_pwd <>", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdGreaterThan(String value) {
            addCriterion("taobao_pwd >", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_pwd >=", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdLessThan(String value) {
            addCriterion("taobao_pwd <", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdLessThanOrEqualTo(String value) {
            addCriterion("taobao_pwd <=", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdLike(String value) {
            addCriterion("taobao_pwd like", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdNotLike(String value) {
            addCriterion("taobao_pwd not like", value, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdIn(List<String> values) {
            addCriterion("taobao_pwd in", values, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdNotIn(List<String> values) {
            addCriterion("taobao_pwd not in", values, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdBetween(String value1, String value2) {
            addCriterion("taobao_pwd between", value1, value2, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andTaobaoPwdNotBetween(String value1, String value2) {
            addCriterion("taobao_pwd not between", value1, value2, "taobaoPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberIsNull() {
            addCriterion("jingdong_number is null");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberIsNotNull() {
            addCriterion("jingdong_number is not null");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberEqualTo(String value) {
            addCriterion("jingdong_number =", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberNotEqualTo(String value) {
            addCriterion("jingdong_number <>", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberGreaterThan(String value) {
            addCriterion("jingdong_number >", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberGreaterThanOrEqualTo(String value) {
            addCriterion("jingdong_number >=", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberLessThan(String value) {
            addCriterion("jingdong_number <", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberLessThanOrEqualTo(String value) {
            addCriterion("jingdong_number <=", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberLike(String value) {
            addCriterion("jingdong_number like", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberNotLike(String value) {
            addCriterion("jingdong_number not like", value, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberIn(List<String> values) {
            addCriterion("jingdong_number in", values, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberNotIn(List<String> values) {
            addCriterion("jingdong_number not in", values, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberBetween(String value1, String value2) {
            addCriterion("jingdong_number between", value1, value2, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongNumberNotBetween(String value1, String value2) {
            addCriterion("jingdong_number not between", value1, value2, "jingdongNumber");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdIsNull() {
            addCriterion("jingdong_pwd is null");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdIsNotNull() {
            addCriterion("jingdong_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdEqualTo(String value) {
            addCriterion("jingdong_pwd =", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdNotEqualTo(String value) {
            addCriterion("jingdong_pwd <>", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdGreaterThan(String value) {
            addCriterion("jingdong_pwd >", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdGreaterThanOrEqualTo(String value) {
            addCriterion("jingdong_pwd >=", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdLessThan(String value) {
            addCriterion("jingdong_pwd <", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdLessThanOrEqualTo(String value) {
            addCriterion("jingdong_pwd <=", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdLike(String value) {
            addCriterion("jingdong_pwd like", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdNotLike(String value) {
            addCriterion("jingdong_pwd not like", value, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdIn(List<String> values) {
            addCriterion("jingdong_pwd in", values, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdNotIn(List<String> values) {
            addCriterion("jingdong_pwd not in", values, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdBetween(String value1, String value2) {
            addCriterion("jingdong_pwd between", value1, value2, "jingdongPwd");
            return (Criteria) this;
        }

        public Criteria andJingdongPwdNotBetween(String value1, String value2) {
            addCriterion("jingdong_pwd not between", value1, value2, "jingdongPwd");
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