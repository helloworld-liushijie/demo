package com.huibo.cache;

/**
 * ���������
 * @author ������
 */
public abstract class AbstractTest {
	
	private int x = 1;
	
	private int y = 2;
	
	public void fun2() {
		System.out.println(x+y);
	}
	
	abstract void fun3();
}
