package com.huibo.jdbc_domain;

public class User {
	
	/**
	 * ID
	 */
	private Integer Id;
	
	/**
	 * �û���
	 */
	private String username;
	
	/**
	 * ����
	 */
	private String  password;
	
	public User() {
		super();
	}

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

	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
}
