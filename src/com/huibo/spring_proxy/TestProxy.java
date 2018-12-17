package com.huibo.spring_proxy;

import org.junit.Test;

public class TestProxy {
	
	@Test
	public void demo01() {
		UserService user = MyBeanFactory.createService();
		user.addUser();
		user.updateUser();
		user.deleteUser();
	}
}
