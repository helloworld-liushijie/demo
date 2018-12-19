package com.huibo.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	
	public static void main(String[] args) {
		
		//配置连接池(数据源) dbcp
		BasicDataSource dataSource = new BasicDataSource();
		
		//基本4项
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		
		//创建模板
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.setDataSource(dataSource);
		
		//通过api操作
		template.update("insert into stu(id,username,password) values(?,?,?);",3,"jack","123");
	}
}
