package com.huibo.airth;

/**
 * �׳��㷨
 * @author ������
 */
public class Factorial {
	public static void main(String[] args) {
		System.out.println(count(5));
	}
	static int count(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * count(num-1);
		}
	}
}
