package com.huibo.java_base_demo;

/**
 * 异常测试--自定义异常
 * @author 刘世杰
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			throw new Defined_Exception("自定义异常抛出");
		} catch (Defined_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/**
 * 异常定义
 * @author 刘世杰
 */
@SuppressWarnings("serial")
class Defined_Exception extends Exception{
	
	public Defined_Exception(String msg) {
		super(msg);
	}
}