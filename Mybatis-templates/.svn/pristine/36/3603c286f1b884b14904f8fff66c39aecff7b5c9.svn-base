package ${base-package}.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ${base-package}.entity.${bean.Uname}Entity;
import ${base-package}.facade.${bean.Uname}Facade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dmsdbj.itoo.tool.tojson.JacksonJsonUntil;


/**
 * Created by ${author} on ${date}.
 */

@RequestMapping("/${bean}")
@Controller
public class ${bean.Uname}Controller {

    //定义打印日志相关
    private static final Logger logger = LoggerFactory.getLogger(${bean.Uname}Controller.class);

    @Reference
    ${bean.Uname}Facade ${bean}Facade;

    /**
     * 首页导向页 ${author} 
     *
     * @return
     */
    @RequestMapping(value = {"/index"})
    public String index() {
        return "${bean}";
    }

    /**
     * 查找测试-${author}-{date}
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = {"/findById/id/{id}"}, method = RequestMethod.POST)
    public void findById(HttpServletRequest request, HttpServletResponse response,@PathVariable String id) {
        ${bean.Uname}Entity ${bean}Entity = ${bean}Facade.findById(id);
        if (${bean}Entity != null) {
            System.out.println("班级id——>" + ${bean}Entity.getId());
        }

        JacksonJsonUntil jackson = new JacksonJsonUntil();
        try {
        jackson.beanToJson(response, ${bean}Entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}    
