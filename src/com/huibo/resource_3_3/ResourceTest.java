package com.huibo.resource_3_3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceTest {
	
	@SuppressWarnings("resource")
	@Test
	public void Test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/huibo/resource_3_3/applicationContext.xml");
		Zoo zoo1 = (Zoo)context.getBean("zoo");
		Zoo zoo2 = (Zoo)context.getBean("zoo");
		System.out.println(zoo1.toString());
		System.out.println(zoo1 == zoo2);
	}
}
