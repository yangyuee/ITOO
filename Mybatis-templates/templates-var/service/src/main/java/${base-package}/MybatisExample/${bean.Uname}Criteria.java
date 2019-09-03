package ${base-package}.MybatisExample;

import com.dmsdbj.itoo.tool.Base.ExampleTool.Criterion;
import com.dmsdbj.itoo.tool.Base.ExampleTool.GeneratedCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
#foreach ($field in ${bean.fields})
#if(${field}!="id" && ${field}!="operator" && ${field}!="isDelete" && ${field}!="remark" && ${field}!="createTime" && ${field}!="updateTime" && ${field.type}=="Date")
import java.util.Date;
#break 
#end
#end

/**
 * 
 * 作者:张晗-十一期
 * 版本号:V1.3
 * 功能:string like条件增加了对LONGTEXT和TEXT的判断
 * 日期:2017年7月10日
 * 
 */
public  class ${bean.Uname}Criteria extends GeneratedCriteria<${bean.Uname}Criteria> implements Serializable{

    protected ${bean.Uname}Criteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }


#foreach ($field in ${bean.fields})
#if(${field}!="id" && ${field}!="operator" && ${field}!="isDelete" && ${field}!="remark" && ${field}!="createTime" && ${field}!="updateTime")  
    public ${bean.Uname}Criteria and${field.Uname}IsNull() {
        addCriterion("${field.column} is null");
        return (${bean.Uname}Criteria) this;
    }

    public ${bean.Uname}Criteria and${field.Uname}IsNotNull() {
        addCriterion("${field.column} is not null");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}EqualTo(String value) {
#end            
        addCriterion("${field.column} =", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}NotEqualTo(String value) {
#end            
        addCriterion("${field.column} <>", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }    
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}GreaterThan(String value) {
#end        
        addCriterion("${field.column} >", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }    
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}GreaterThanOrEqualTo(String value) {
#end        
        addCriterion("${field.column} >=", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }    
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}LessThan(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}LessThan(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}LessThan(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}LessThan(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}LessThan(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}LessThan(String value) {
#end             
        addCriterion("${field.column} <", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }     
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(Integer value) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(Date value) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(Byte value) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(Long value) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(Double value) {
#else
    public ${bean.Uname}Criteria and${field.Uname}LessThanOrEqualTo(String value) {
#end        
        addCriterion("${field.column} <=", value, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}In(List<Integer> values) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}In(List<Date> values) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}In(List<Byte> values) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}In(List<Long> values) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}In(List<Double> values) {
#else
    public ${bean.Uname}Criteria and${field.Uname}In(List<String> values) {
#end         
        addCriterion("${field.column} in", values, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<Integer> values) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<Date> values) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<Byte> values) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<Long> values) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<Double> values) {
#else
    public ${bean.Uname}Criteria and${field.Uname}NotIn(List<String> values) {
#end        
        addCriterion("${field.column} not in", values, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}Between(Integer value1, Integer value2) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}Between(Date value1, Date value2) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}Between(Byte value1, Byte value2) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}Between(Long value1, Long value2) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}Between(Double value1, Double value2) {
#else
    public ${bean.Uname}Criteria and${field.Uname}Between(String value1, String value2) {
#end        
        addCriterion("${field.column} between", value1, value2, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="INT")
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(Integer value1, Integer value2) {
#elseif(${field.AUcolumnType}=="DATE" || ${field.AUcolumnType}=="DATETIME")
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(Date value1, Date value2) {
#elseif(${field.AUcolumnType}=="TINYINT")
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(Byte value1, Byte value2) {
#elseif(${field.AUcolumnType}=="DECIMAL")
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(Long value1, Long value2) {
#elseif(${field.AUcolumnType}=="DOUBLE")
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(Double value1, Double value2) {
#else
    public ${bean.Uname}Criteria and${field.Uname}NotBetween(String value1, String value2) {
#end        
        addCriterion("${field.column} not between", value1, value2, "${field}");
        return (${bean.Uname}Criteria) this;
    }
#if(${field.AUcolumnType}=="VARCHAR" || ${field.AUcolumnType}=="LONGTEXT" || ${field.AUcolumnType}=="TEXT")
        public ${bean.Uname}Criteria and${field.Uname}Like(String value) {
            addCriterion("${field.column} like", value, "${field}");
            return (${bean.Uname}Criteria) this;
        }

        public ${bean.Uname}Criteria and${field.Uname}NotLike(String value) {
            addCriterion("${field.column} not like", value, "${field}");
            return (${bean.Uname}Criteria) this;
        }
#end     
#end
#end      
}

