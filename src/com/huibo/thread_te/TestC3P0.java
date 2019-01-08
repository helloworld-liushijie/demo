package com.huibo.thread_te;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huibo.transfer.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/huibo/transfer/service/applicationContext.xml")//类路径需要classpath:
public class TestC3P0 {
	
	@Autowired
	private AccountService accountService;
	
	@Test
	public void demo() {
//		String path = "com/huibo/transfer/service/applicationContext.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
//		AccountService accountService = (AccountService)applicationContext.getBean("accountService");
		accountService.transfer("rose", "jack", 100);
	}
}
