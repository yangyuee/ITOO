package ${base-package}.entity;


import com.dmsdbj.itoo.tool.Base.entity.BaseEntity;
#foreach ($field in ${bean.fields})
#if(${field}!="id" && ${field}!="operator" && ${field}!="isDelete" && ${field}!="remark" && ${field}!="createTime" && ${field}!="updateTime" && ${field.type}=="Date")
import java.util.Date;
#break 
#end
#end
/**
 * Created by ${author} on ${date}.
 */

public class ${bean.Uname}Entity extends BaseEntity {
 	
#foreach ($field in ${bean.fields})
#if(${field}!="id" && ${field}!="operator" && ${field}!="isDelete" && ${field}!="remark" && ${field}!="createTime" && ${field}!="updateTime")	
	//${field.alias}
	private ${field.type} ${field};
#end
#end

#foreach ($field in ${bean.fields})
#if(${field}!="id" && ${field}!="operator" && ${field}!="isDelete" && ${field}!="remark" && ${field}!="createTime" && ${field}!="updateTime")	
	/**
	 *
	 * @return ${field.type}
	 */
	public ${field.type} get${field.Uname}() {
		return ${field};
	}

	/**
	 * 
	 * @param ${field}
	 */
    public void set${field.Uname}(${field.type} ${field}) {
#if(${field.type}=="String")		
		this.${field} = (${field}== null ? null : ${field}.trim());
#else
		this.${field} = ${field};
#end
	}
#end
#end

}
