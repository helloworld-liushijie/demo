package com.huibo.cache;

/**
 * java值传递demo
 * @author 刘世杰
 */
public class PassByValue {
	
	public static void main(String[] args) {
		Dog dog = new Dog("A");
		System.out.println(dog.getObjectAddress());//com.huibo.cache.Dog@7852e922
		System.out.println(dog.getName());//A
		func(dog);
		System.out.println(dog.getObjectAddress());//com.huibo.cache.Dog@7852e922
		System.out.println(dog.getName());//A
	}
	
	/**
	 * 进行值传递的修改,不会影响原值
	 * 通过方法操作,会改变,因为操作的是对象引用指向的内容
	 * @param dog
	 */
	public static void func(Dog dog) {
		System.out.println(dog.getObjectAddress());//com.huibo.cache.Dog@7852e922
		System.out.println(dog.getName());//A
		dog = new Dog("B");
		System.out.println(dog.getObjectAddress());//com.huibo.cache.Dog@4e25154f
		System.out.println(dog.getName());//B
	}
}

class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	String getObjectAddress() {
		return super.toString();
	}
}
