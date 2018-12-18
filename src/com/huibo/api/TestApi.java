package com.huibo.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	
	public static void main(String[] args) {
		
		//�������ӳ�(����Դ) dbcp
		BasicDataSource dataSource = new BasicDataSource();
		
		//����4��
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		
		//����ģ��
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.setDataSource(dataSource);
	}
}
