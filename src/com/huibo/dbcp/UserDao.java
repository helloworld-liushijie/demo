package com.huibo.dbcp;

import org.springframework.jdbc.core.JdbcTemplate;

import com.huibo.jdbc_domain.User;

public class UserDao {
	
	//jdbcÄ£°åspring×¢Èë
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void update(User user) {
		String sql = "update stu set id = ?,username = ?,password = ? where id = 1";
		Object[] args = {user.getId(),user.getUsername(),user.getPassword()};
		jdbcTemplate.update(sql,args);
		
	}
}
