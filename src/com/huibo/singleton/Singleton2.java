package com.huibo.singleton;

public enum Singleton2 {
	INSTANCE;
	
	public static void main(String[] args) {
		Singleton2 s = Singleton2.INSTANCE;
		System.out.println(s);
	}
}
