package com.huibo.io_util;

/**
 * person类
 * @author 刘世杰
 */
public class Person implements Comparable<Person> {
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 年龄
	 */
	private Integer age;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 性别
	 */
	private String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", sex=" + sex + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(age > o.getAge()) {
			return -1;
		} else if(age < o.getAge()) {
			return 1;
		}
		return 0;
	}

}
