package com.huibo.java_base_demo;

import java.util.SortedMap;

/**
 * java���ô�����ֵ����
 * @author ������
 */
public class ReferenceValue {
	
	public static void main(String[] args) {
		int num = 10;
		ReferenceValue val = new ReferenceValue();
		System.out.println(num);//10
		val.change(num);
		System.out.println(num);//10 ֵ��δ�����ı�
	}
	
	/**
	 * ���뺯����ֵ�Ƕ������õĿ����������ݵ������õĵ�ֵַ�����Ի��ǰ�ֵ���ݡ�
	 * @param num
	 */
	void change(int num) {
		num = 50;
	}
}
