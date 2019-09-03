package ${base-package}.service.impl;

import com.dmsdbj.itoo.tool.Base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ${base-package}.MybatisExample.${bean.Uname}Example;
import com.dmsdbj.itoo.tool.Base.service.impl.BaseServiceImpl;
import ${base-package}.dao.${bean.Uname}Dao;
import ${base-package}.service.${bean.Uname}Service;
import ${base-package}.entity.${bean.Uname}Entity;

/**
 * Created by ${author} on ${date}.
 */
@Service("${bean}Service")
public class ${bean.Uname}ServiceImpl extends BaseServiceImpl<${bean.Uname}Entity, ${bean.Uname}Example> implements ${bean.Uname}Service {


    //注入${bean}Dao
	@Autowired
    private ${bean.Uname}Dao ${bean}Dao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<${bean.Uname}Entity, ${bean.Uname}Example>
     */
    @Override
    public  BaseDao<${bean.Uname}Entity, ${bean.Uname}Example> getRealDao(){
        return this.${bean}Dao;
    }
}
