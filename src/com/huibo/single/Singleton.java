package com.huibo.single;

/**
 * 单例模式
 * @author 刘世杰
 */
public class Singleton {
	
	//懒汉式
	/*private static Singleton singleton = null;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	//饿汉式
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
}
