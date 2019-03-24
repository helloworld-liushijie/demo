package com.huibo.cache;

/**
 * javaֵ����demo
 * @author ������
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
	 * ����ֵ���ݵ��޸�,����Ӱ��ԭֵ
	 * ͨ����������,��ı�,��Ϊ�������Ƕ�������ָ�������
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
