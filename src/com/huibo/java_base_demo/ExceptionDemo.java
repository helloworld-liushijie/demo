package com.huibo.java_base_demo;

/**
 * �쳣����--�Զ����쳣
 * @author ������
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			throw new Defined_Exception("�Զ����쳣�׳�");
		} catch (Defined_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/**
 * �쳣����
 * @author ������
 */
@SuppressWarnings("serial")
class Defined_Exception extends Exception{
	
	public Defined_Exception(String msg) {
		super(msg);
	}
}