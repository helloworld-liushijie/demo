package com.huibo.spring_proxy;

/**
 * ������
 */
public class MyAspect {
	
	public void before() {
		System.out.println("brfore");
	}
	
	public void after() {
		System.out.println("after");
	}
}
