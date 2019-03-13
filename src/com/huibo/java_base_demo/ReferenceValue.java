package com.huibo.java_base_demo;

import java.util.SortedMap;

/**
 * java引用传递与值传递
 * @author 刘世杰
 */
public class ReferenceValue {
	
	public static void main(String[] args) {
		int num = 10;
		ReferenceValue val = new ReferenceValue();
		System.out.println(num);//10
		val.change(num);
		System.out.println(num);//10 值并未发生改变
	}
	
	/**
	 * 传入函数的值是对象引用的拷贝，即传递的是引用的地址值，所以还是按值传递。
	 * @param num
	 */
	void change(int num) {
		num = 50;
	}
}
