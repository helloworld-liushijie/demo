package com.huibo.cache;

import java.io.PrintStream;

/**
 * 内部类访问示例
 * @author 刘世杰
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
