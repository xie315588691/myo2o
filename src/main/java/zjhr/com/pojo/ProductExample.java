package zjhr.com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andImgAddrIsNull() {
            addCriterion("img_addr is null");
            return (Criteria) this;
        }

        public Criteria andImgAddrIsNotNull() {
            addCriterion("img_addr is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddrEqualTo(String value) {
            addCriterion("img_addr =", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotEqualTo(String value) {
            addCriterion("img_addr <>", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrGreaterThan(String value) {
            addCriterion("img_addr >", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrGreaterThanOrEqualTo(String value) {
            addCriterion("img_addr >=", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLessThan(String value) {
            addCriterion("img_addr <", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLessThanOrEqualTo(String value) {
            addCriterion("img_addr <=", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrLike(String value) {
            addCriterion("img_addr like", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotLike(String value) {
            addCriterion("img_addr not like", value, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrIn(List<String> values) {
            addCriterion("img_addr in", values, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotIn(List<String> values) {
            addCriterion("img_addr not in", values, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrBetween(String value1, String value2) {
            addCriterion("img_addr between", value1, value2, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andImgAddrNotBetween(String value1, String value2) {
            addCriterion("img_addr not between", value1, value2, "imgAddr");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNull() {
            addCriterion("normal_price is null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNotNull() {
            addCriterion("normal_price is not null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceEqualTo(String value) {
            addCriterion("normal_price =", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotEqualTo(String value) {
            addCriterion("normal_price <>", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThan(String value) {
            addCriterion("normal_price >", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("normal_price >=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThan(String value) {
            addCriterion("normal_price <", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThanOrEqualTo(String value) {
            addCriterion("normal_price <=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLike(String value) {
            addCriterion("normal_price like", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotLike(String value) {
            addCriterion("normal_price not like", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIn(List<String> values) {
            addCriterion("normal_price in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotIn(List<String> values) {
            addCriterion("normal_price not in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceBetween(String value1, String value2) {
            addCriterion("normal_price between", value1, value2, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotBetween(String value1, String value2) {
            addCriterion("normal_price not between", value1, value2, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualTo(String value) {
            addCriterion("promotion_price =", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualTo(String value) {
            addCriterion("promotion_price <>", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThan(String value) {
            addCriterion("promotion_price >", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_price >=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThan(String value) {
            addCriterion("promotion_price <", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualTo(String value) {
            addCriterion("promotion_price <=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLike(String value) {
            addCriterion("promotion_price like", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotLike(String value) {
            addCriterion("promotion_price not like", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIn(List<String> values) {
            addCriterion("promotion_price in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotIn(List<String> values) {
            addCriterion("promotion_price not in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceBetween(String value1, String value2) {
            addCriterion("promotion_price between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotBetween(String value1, String value2) {
            addCriterion("promotion_price not between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNull() {
            addCriterion("last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time =", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time <>", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_edit_time >", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time >=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThan(Date value) {
            addCriterionForJDBCDate("last_edit_time <", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time <=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIn(List<Date> values) {
            addCriterionForJDBCDate("last_edit_time in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_edit_time not in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_edit_time between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_edit_time not between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNull() {
            addCriterion("enable_status is null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNotNull() {
            addCriterion("enable_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusEqualTo(Integer value) {
            addCriterion("enable_status =", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotEqualTo(Integer value) {
            addCriterion("enable_status <>", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThan(Integer value) {
            addCriterion("enable_status >", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_status >=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThan(Integer value) {
            addCriterion("enable_status <", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThanOrEqualTo(Integer value) {
            addCriterion("enable_status <=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIn(List<Integer> values) {
            addCriterion("enable_status in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotIn(List<Integer> values) {
            addCriterion("enable_status not in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusBetween(Integer value1, Integer value2) {
            addCriterion("enable_status between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_status not between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(String value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(String value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(String value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(String value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLike(String value) {
            addCriterion("product_category_id like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotLike(String value) {
            addCriterion("product_category_id not like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<String> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<String> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(String value1, String value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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