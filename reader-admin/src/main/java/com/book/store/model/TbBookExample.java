package com.book.store.model;

import java.util.ArrayList;
import java.util.List;

public class TbBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNull() {
            addCriterion("pub_date is null");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNotNull() {
            addCriterion("pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubDateEqualTo(String value) {
            addCriterion("pub_date =", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotEqualTo(String value) {
            addCriterion("pub_date <>", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThan(String value) {
            addCriterion("pub_date >", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThanOrEqualTo(String value) {
            addCriterion("pub_date >=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThan(String value) {
            addCriterion("pub_date <", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThanOrEqualTo(String value) {
            addCriterion("pub_date <=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLike(String value) {
            addCriterion("pub_date like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotLike(String value) {
            addCriterion("pub_date not like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateIn(List<String> values) {
            addCriterion("pub_date in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotIn(List<String> values) {
            addCriterion("pub_date not in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateBetween(String value1, String value2) {
            addCriterion("pub_date between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotBetween(String value1, String value2) {
            addCriterion("pub_date not between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andOriginTitleIsNull() {
            addCriterion("origin_title is null");
            return (Criteria) this;
        }

        public Criteria andOriginTitleIsNotNull() {
            addCriterion("origin_title is not null");
            return (Criteria) this;
        }

        public Criteria andOriginTitleEqualTo(String value) {
            addCriterion("origin_title =", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleNotEqualTo(String value) {
            addCriterion("origin_title <>", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleGreaterThan(String value) {
            addCriterion("origin_title >", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleGreaterThanOrEqualTo(String value) {
            addCriterion("origin_title >=", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleLessThan(String value) {
            addCriterion("origin_title <", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleLessThanOrEqualTo(String value) {
            addCriterion("origin_title <=", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleLike(String value) {
            addCriterion("origin_title like", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleNotLike(String value) {
            addCriterion("origin_title not like", value, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleIn(List<String> values) {
            addCriterion("origin_title in", values, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleNotIn(List<String> values) {
            addCriterion("origin_title not in", values, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleBetween(String value1, String value2) {
            addCriterion("origin_title between", value1, value2, "originTitle");
            return (Criteria) this;
        }

        public Criteria andOriginTitleNotBetween(String value1, String value2) {
            addCriterion("origin_title not between", value1, value2, "originTitle");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andBindingIsNull() {
            addCriterion("binding is null");
            return (Criteria) this;
        }

        public Criteria andBindingIsNotNull() {
            addCriterion("binding is not null");
            return (Criteria) this;
        }

        public Criteria andBindingEqualTo(String value) {
            addCriterion("binding =", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotEqualTo(String value) {
            addCriterion("binding <>", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingGreaterThan(String value) {
            addCriterion("binding >", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingGreaterThanOrEqualTo(String value) {
            addCriterion("binding >=", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLessThan(String value) {
            addCriterion("binding <", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLessThanOrEqualTo(String value) {
            addCriterion("binding <=", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLike(String value) {
            addCriterion("binding like", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotLike(String value) {
            addCriterion("binding not like", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingIn(List<String> values) {
            addCriterion("binding in", values, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotIn(List<String> values) {
            addCriterion("binding not in", values, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingBetween(String value1, String value2) {
            addCriterion("binding between", value1, value2, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotBetween(String value1, String value2) {
            addCriterion("binding not between", value1, value2, "binding");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNull() {
            addCriterion("translator is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNotNull() {
            addCriterion("translator is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorEqualTo(String value) {
            addCriterion("translator =", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotEqualTo(String value) {
            addCriterion("translator <>", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThan(String value) {
            addCriterion("translator >", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThanOrEqualTo(String value) {
            addCriterion("translator >=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThan(String value) {
            addCriterion("translator <", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThanOrEqualTo(String value) {
            addCriterion("translator <=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLike(String value) {
            addCriterion("translator like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotLike(String value) {
            addCriterion("translator not like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorIn(List<String> values) {
            addCriterion("translator in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotIn(List<String> values) {
            addCriterion("translator not in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorBetween(String value1, String value2) {
            addCriterion("translator between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotBetween(String value1, String value2) {
            addCriterion("translator not between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("catalog like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("catalog not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andIsbn10IsNull() {
            addCriterion("isbn10 is null");
            return (Criteria) this;
        }

        public Criteria andIsbn10IsNotNull() {
            addCriterion("isbn10 is not null");
            return (Criteria) this;
        }

        public Criteria andIsbn10EqualTo(String value) {
            addCriterion("isbn10 =", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10NotEqualTo(String value) {
            addCriterion("isbn10 <>", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10GreaterThan(String value) {
            addCriterion("isbn10 >", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10GreaterThanOrEqualTo(String value) {
            addCriterion("isbn10 >=", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10LessThan(String value) {
            addCriterion("isbn10 <", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10LessThanOrEqualTo(String value) {
            addCriterion("isbn10 <=", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10Like(String value) {
            addCriterion("isbn10 like", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10NotLike(String value) {
            addCriterion("isbn10 not like", value, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10In(List<String> values) {
            addCriterion("isbn10 in", values, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10NotIn(List<String> values) {
            addCriterion("isbn10 not in", values, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10Between(String value1, String value2) {
            addCriterion("isbn10 between", value1, value2, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn10NotBetween(String value1, String value2) {
            addCriterion("isbn10 not between", value1, value2, "isbn10");
            return (Criteria) this;
        }

        public Criteria andIsbn13IsNull() {
            addCriterion("isbn13 is null");
            return (Criteria) this;
        }

        public Criteria andIsbn13IsNotNull() {
            addCriterion("isbn13 is not null");
            return (Criteria) this;
        }

        public Criteria andIsbn13EqualTo(String value) {
            addCriterion("isbn13 =", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotEqualTo(String value) {
            addCriterion("isbn13 <>", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13GreaterThan(String value) {
            addCriterion("isbn13 >", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13GreaterThanOrEqualTo(String value) {
            addCriterion("isbn13 >=", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13LessThan(String value) {
            addCriterion("isbn13 <", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13LessThanOrEqualTo(String value) {
            addCriterion("isbn13 <=", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13Like(String value) {
            addCriterion("isbn13 like", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotLike(String value) {
            addCriterion("isbn13 not like", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13In(List<String> values) {
            addCriterion("isbn13 in", values, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotIn(List<String> values) {
            addCriterion("isbn13 not in", values, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13Between(String value1, String value2) {
            addCriterion("isbn13 between", value1, value2, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotBetween(String value1, String value2) {
            addCriterion("isbn13 not between", value1, value2, "isbn13");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAltTitleIsNull() {
            addCriterion("alt_title is null");
            return (Criteria) this;
        }

        public Criteria andAltTitleIsNotNull() {
            addCriterion("alt_title is not null");
            return (Criteria) this;
        }

        public Criteria andAltTitleEqualTo(String value) {
            addCriterion("alt_title =", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleNotEqualTo(String value) {
            addCriterion("alt_title <>", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleGreaterThan(String value) {
            addCriterion("alt_title >", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleGreaterThanOrEqualTo(String value) {
            addCriterion("alt_title >=", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleLessThan(String value) {
            addCriterion("alt_title <", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleLessThanOrEqualTo(String value) {
            addCriterion("alt_title <=", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleLike(String value) {
            addCriterion("alt_title like", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleNotLike(String value) {
            addCriterion("alt_title not like", value, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleIn(List<String> values) {
            addCriterion("alt_title in", values, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleNotIn(List<String> values) {
            addCriterion("alt_title not in", values, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleBetween(String value1, String value2) {
            addCriterion("alt_title between", value1, value2, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAltTitleNotBetween(String value1, String value2) {
            addCriterion("alt_title not between", value1, value2, "altTitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroIsNull() {
            addCriterion("author_intro is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroIsNotNull() {
            addCriterion("author_intro is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroEqualTo(String value) {
            addCriterion("author_intro =", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroNotEqualTo(String value) {
            addCriterion("author_intro <>", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroGreaterThan(String value) {
            addCriterion("author_intro >", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroGreaterThanOrEqualTo(String value) {
            addCriterion("author_intro >=", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroLessThan(String value) {
            addCriterion("author_intro <", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroLessThanOrEqualTo(String value) {
            addCriterion("author_intro <=", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroLike(String value) {
            addCriterion("author_intro like", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroNotLike(String value) {
            addCriterion("author_intro not like", value, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroIn(List<String> values) {
            addCriterion("author_intro in", values, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroNotIn(List<String> values) {
            addCriterion("author_intro not in", values, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroBetween(String value1, String value2) {
            addCriterion("author_intro between", value1, value2, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroNotBetween(String value1, String value2) {
            addCriterion("author_intro not between", value1, value2, "authorIntro");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
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