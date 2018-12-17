package com.huibo.adviser_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	
	@Test
	public void demo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/huibo/adviser_aop/bean.xml");
		UserService user = (UserService)applicationContext.getBean("userServiceId");
		user.addUser();
		user.modifyUser();
		user.deleteUser();
	}
}
