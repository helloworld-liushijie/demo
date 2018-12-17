package com.huibo.singleton;

import java.io.IOException;
import java.util.Properties;

/**
 * 静态代码块形式单例
 */
public class Singleton1 {
	
	public static final Singleton1 INSTANCE;
	private String info;
	
	static {
		try {
			Properties pro = new Properties();
			pro.load(Singleton1.class.getClassLoader().getResourceAsStream("singleton.properties"));
			INSTANCE = new Singleton1(pro.getProperty("info"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private Singleton1(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Singleton1 [info=" + info + "]";
	}

	public static void main(String[] args) {
		Singleton1 s = Singleton1.INSTANCE;
		System.out.println(s);
	}
}
