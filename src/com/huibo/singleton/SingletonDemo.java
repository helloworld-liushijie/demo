package com.huibo.singleton;

/**
 * �������ģʽ
 * 
 * ����ʽ��
 * 	ֱ�Ӵ���ʵ�����󣬲����Ƿ���Ҫ������󶼻ᴴ��
 * 	1-- ������˽�л�
 * 	2-- ���д��������þ�̬��������
 * 	3-- �����ṩ���ʵ��
 * 	4--	ǿ������һ��������ʹ��final����
 */
public class SingletonDemo {
	
	public static final SingletonDemo INSTANCE = new SingletonDemo();
	private SingletonDemo() {
		
	}
}
