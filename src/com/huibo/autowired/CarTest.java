package com.huibo.autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

public class CarTest {
	
	@SuppressWarnings("resource")
	@Test
	public void TestCar() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/huibo/autowired/applicationContext.xml");
		Drive drive = (Drive)context.getBean("drive");
		drive.printCar();
	}
}
