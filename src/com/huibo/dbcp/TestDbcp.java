package com.huibo.dbcp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huibo.jdbc_domain.User;

public class TestDbcp {
	
	@Test
	public void demo() {
		User user = new User();
		user.setId(1);
		user.setUsername("ÍõÄáÂê");
		user.setPassword("231");
		String path = "com/huibo/dbcp/beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		UserDao userDao = (UserDao)context.getBean("userDaoId");
		userDao.update(user);
	}
}
