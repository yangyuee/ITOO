package ${base-package}.facade.impl;

import ${base-package}.entity.${bean.Uname}Entity;
import ${base-package}.facade.${bean.Uname}Facade;
import ${base-package}.service.${bean.Uname}Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ${author} on ${date}.
 */
@Component("${bean}Facade")
@Service
public class ${bean.Uname}FacadeImpl implements ${bean.Uname}Facade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(${bean.Uname}FacadeImpl.class);

    @Autowired
    ${bean.Uname}Service ${bean}Service;

    /**
     * 根据id查询${bean.Uname}
     * @param id
     * @return ${bean.Uname}Entity
     */
    @Override
    public ${bean.Uname}Entity findById(String id) {
        return ${bean}Service.findById(id);
    }
    
}
