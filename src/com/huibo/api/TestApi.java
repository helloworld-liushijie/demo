package com.huibo.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	
	public static void main(String[] args) {
		
		//�������ӳ�(����Դ) dbcp
		BasicDataSource dataSource = new BasicDataSource();
		
		//����4��
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		
		//����ģ��
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.setDataSource(dataSource);
		
		//ͨ��api����
		template.update("insert into stu(id,username,password) values(?,?,?);",3,"jack","123");
	}
}
