package com.huibo.single;

/**
 * ����ģʽ
 * @author ������
 */
public class Singleton {
	
	//����ʽ
	/*private static Singleton singleton = null;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	//����ʽ
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
}
