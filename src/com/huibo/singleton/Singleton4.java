package com.huibo.singleton;

/**
 * 在内部类加载和初始化时，才创建INSTANCE实例化对象
 * 静态内部类不会随着外部类的加载和初始化而初始化，它要单独去加载和初始化
 * 因为是在内部类加载和初始化时创建的，因此是线程安全的
 */
public class Singleton4 {
	
	private Singleton4() {
		System.out.println("hello world");
	}
	
	private static class Inner {
		private static final Singleton4 INSTANCE = new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return Inner.INSTANCE;
	}
	
	public static void main(String[] args) {
		Singleton4.getInstance();
	}
}
