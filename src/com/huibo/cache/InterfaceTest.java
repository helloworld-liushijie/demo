package com.huibo.cache;

/**
 * �ӿڲ���
 * @author ������
 */
public interface InterfaceTest {

	int i = 2233;
	
	default void fun1() {
		System.out.println(i);
	}
	
	void fun2(int i);
}
