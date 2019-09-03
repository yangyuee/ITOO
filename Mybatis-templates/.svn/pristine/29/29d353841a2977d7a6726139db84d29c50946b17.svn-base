package ${base-package}.MybatisExample;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * 
 * 作者:张晗-十一期
 * 版本号:V1.0
 * 功能:产生条件查询类
 * 日期:2017年7月4日
 * 
 */
public class ${bean.Uname}Example implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<${bean.Uname}Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * 构造函数
     */
    public ${bean.Uname}Example() {
        oredCriteria = new ArrayList<${bean.Uname}Criteria>();
    }

    /**
     *以某字段升序或降序排序---比如：orderByClause=字段名 ASC  表示升序
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *获得升序降序排序条件
     * @return String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *去除重复，boolean型，true为选择不重复的记录
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @return List<${bean.Uname}Criteria>
     */
    public List<${bean.Uname}Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @param criteria
     */
    public void or(${bean.Uname}Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @return ${bean.Uname}Criteria
     */
    public ${bean.Uname}Criteria or() {
        ${bean.Uname}Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @return ${bean.Uname}Criteria
     */
    public ${bean.Uname}Criteria createCriteria() {
        ${bean.Uname}Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @return ${bean.Uname}Criteria
     */
    protected ${bean.Uname}Criteria createCriteriaInternal() {
        ${bean.Uname}Criteria criteria = new ${bean.Uname}Criteria();
        return criteria;
    }

    /**
     * 清空查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     *
     * @return Integer
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     *
     * @return Integer
     */
    public Integer getOffset() {
        return offset;
    }


}