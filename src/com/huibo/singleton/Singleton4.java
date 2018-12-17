package com.huibo.singleton;

/**
 * ���ڲ�����غͳ�ʼ��ʱ���Ŵ���INSTANCEʵ��������
 * ��̬�ڲ��಻�������ⲿ��ļ��غͳ�ʼ������ʼ������Ҫ����ȥ���غͳ�ʼ��
 * ��Ϊ�����ڲ�����غͳ�ʼ��ʱ�����ģ�������̰߳�ȫ��
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
