package ${base-package}.facade.test;

import org.junit.Test;
import testUtil.commonFacade;
import ${base-package}.entity.${bean.Uname}Entity;


public class test${bean.Uname}Facade extends commonFacade {

    /**
     * 分页查询测试-@author
     */
    @Test
    public  void findById(){

        ${bean.Uname}Entity ${bean}Entity = ${bean}Facade.findById("0044fbbe28c254673bc37a");
        if (${bean}Entity!=null){
            System.out.println("测试创建时间"+${bean}Entity.getCreateTime());
        }else {
            System.out.println("你测试的ID库中不存在");
        }
    }


}
