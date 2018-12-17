package com.huibo.a_spring_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	
	@Test
	public void demo() {
		String path = "com/huibo/a_spring_aop/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		UserService service = (UserService)applicationContext.getBean("userServiceId");
		service.add();
		service.insert();
		service.modify();
	}
}
