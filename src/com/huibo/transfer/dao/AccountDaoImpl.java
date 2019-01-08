package com.huibo.transfer.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	
	
	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update transfer set money = money + ? where username = ?", money,inner);
	}

	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update transfer set money = money - ? where username  = ?",money,outer);
	}

}
