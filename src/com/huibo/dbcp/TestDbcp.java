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
		user.setPassword("998");
		String path = "com/huibo/dbcp/beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		UserDao userDao = (UserDao)context.getBean("userDaoId");
		/*List<User> users = userDao.findAll();
		for (User us : users) {
			System.out.println(us);
		}*/
		//userDao.update(user);
		User userMap = userDao.getById(3);
		System.out.println(userMap);
	}
}
