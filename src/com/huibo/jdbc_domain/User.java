package com.huibo.jdbc_domain;

public class User {
	
	/**
	 * ID
	 */
	private Integer Id;
	
	/**
	 * 姓名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String  password;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
