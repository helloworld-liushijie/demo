package com.huibo.cache;

import java.io.PrintStream;

/**
 * �ڲ������ʾ��
 * @author ������
 */
public class AccessWithInnerClassExample {
	
	private InnerClass innerClass;
	
	private class InnerClass {
		int i = 10;
	}
	
	public AccessWithInnerClassExample() {
		innerClass = new InnerClass();
	}
	
	public int getValue() {
		return innerClass.i;
	}
}
