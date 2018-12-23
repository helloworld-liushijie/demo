package com.huibo.dbcp;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.huibo.jdbc_domain.User;

public class UserDao extends JdbcDaoSupport{
	
	public void update(User user) {
		String sql = "update stu set id = ?,username = ?,password = ? where id = 1";
		Object[] args = {user.getId(),user.getUsername(),user.getPassword()};
		this.getJdbcTemplate().update(sql,args); 
	}
	
	/**
	 * ²éÑ¯ËùÓÐ
	 */
	public List<User> findAll() {
		return this.getJdbcTemplate().query("select * from stu", BeanPropertyRowMapper.newInstance(User.class));
	}

	public User getById(int i) {
		return (User) this.getJdbcTemplate().queryForObject("select * from stu where id = ?", BeanPropertyRowMapper.newInstance(User.class) , i);
	}
}
