package testUtil;

import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
#foreach($bean in $beans)
import ${base-package}.facade.${bean.Uname}Facade;
#end

public class commonFacade {
	public BeanFactory factory;
#foreach($bean in $beans)
    public ${bean.Uname}Facade ${bean}Facade;
#end	
	

	@Before
	public void setUp() {
		factory = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
#foreach($bean in $beans)		
		${bean}Facade = (${bean.Uname}Facade) factory.getBean("${bean}Facade");
#end			
	}
}
