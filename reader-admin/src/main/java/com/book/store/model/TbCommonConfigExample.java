package com.book.store.model;

import java.util.ArrayList;
import java.util.List;

public class TbCommonConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCommonConfigExample() {
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

        public Criteria andCommonConfigIdIsNull() {
            addCriterion("common_config_id is null");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdIsNotNull() {
            addCriterion("common_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdEqualTo(String value) {
            addCriterion("common_config_id =", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdNotEqualTo(String value) {
            addCriterion("common_config_id <>", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdGreaterThan(String value) {
            addCriterion("common_config_id >", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("common_config_id >=", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdLessThan(String value) {
            addCriterion("common_config_id <", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdLessThanOrEqualTo(String value) {
            addCriterion("common_config_id <=", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdLike(String value) {
            addCriterion("common_config_id like", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdNotLike(String value) {
            addCriterion("common_config_id not like", value, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdIn(List<String> values) {
            addCriterion("common_config_id in", values, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdNotIn(List<String> values) {
            addCriterion("common_config_id not in", values, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdBetween(String value1, String value2) {
            addCriterion("common_config_id between", value1, value2, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andCommonConfigIdNotBetween(String value1, String value2) {
            addCriterion("common_config_id not between", value1, value2, "commonConfigId");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("config_name is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("config_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("config_name =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("config_name <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("config_name >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("config_name >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("config_name <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("config_name <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("config_name like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("config_name not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("config_name in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("config_name not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("config_name between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("config_name not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andCommonKeyIsNull() {
            addCriterion("common_key is null");
            return (Criteria) this;
        }

        public Criteria andCommonKeyIsNotNull() {
            addCriterion("common_key is not null");
            return (Criteria) this;
        }

        public Criteria andCommonKeyEqualTo(String value) {
            addCriterion("common_key =", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyNotEqualTo(String value) {
            addCriterion("common_key <>", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyGreaterThan(String value) {
            addCriterion("common_key >", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyGreaterThanOrEqualTo(String value) {
            addCriterion("common_key >=", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyLessThan(String value) {
            addCriterion("common_key <", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyLessThanOrEqualTo(String value) {
            addCriterion("common_key <=", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyLike(String value) {
            addCriterion("common_key like", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyNotLike(String value) {
            addCriterion("common_key not like", value, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyIn(List<String> values) {
            addCriterion("common_key in", values, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyNotIn(List<String> values) {
            addCriterion("common_key not in", values, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyBetween(String value1, String value2) {
            addCriterion("common_key between", value1, value2, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonKeyNotBetween(String value1, String value2) {
            addCriterion("common_key not between", value1, value2, "commonKey");
            return (Criteria) this;
        }

        public Criteria andCommonValueIsNull() {
            addCriterion("common_value is null");
            return (Criteria) this;
        }

        public Criteria andCommonValueIsNotNull() {
            addCriterion("common_value is not null");
            return (Criteria) this;
        }

        public Criteria andCommonValueEqualTo(String value) {
            addCriterion("common_value =", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueNotEqualTo(String value) {
            addCriterion("common_value <>", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueGreaterThan(String value) {
            addCriterion("common_value >", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueGreaterThanOrEqualTo(String value) {
            addCriterion("common_value >=", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueLessThan(String value) {
            addCriterion("common_value <", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueLessThanOrEqualTo(String value) {
            addCriterion("common_value <=", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueLike(String value) {
            addCriterion("common_value like", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueNotLike(String value) {
            addCriterion("common_value not like", value, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueIn(List<String> values) {
            addCriterion("common_value in", values, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueNotIn(List<String> values) {
            addCriterion("common_value not in", values, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueBetween(String value1, String value2) {
            addCriterion("common_value between", value1, value2, "commonValue");
            return (Criteria) this;
        }

        public Criteria andCommonValueNotBetween(String value1, String value2) {
            addCriterion("common_value not between", value1, value2, "commonValue");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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