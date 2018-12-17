package com.huibo.singleton;

/**
 * 单例设计模式
 * 
 * 饿汉式：
 * 	直接创建实例对象，不管是否需要这个对象都会创建
 * 	1-- 构造器私有化
 * 	2-- 自行创建，并用静态变量保存
 * 	3-- 向外提供这个实例
 * 	4--	强调这是一个单例，使用final修饰
 */
public class SingletonDemo {
	
	public static final SingletonDemo INSTANCE = new SingletonDemo();
	private SingletonDemo() {
		
	}
}
