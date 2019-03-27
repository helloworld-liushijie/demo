package com.huibo.override_overload;

/**
 * 拷贝构造函数,替换clone
 * @author 刘世杰
 */
public class CloneConstructor {
	
	private int[] arr;
	
	public CloneConstructor() {
		arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public CloneConstructor(CloneConstructor origin) {
		arr = new int[origin.arr.length];
		for (int i = 0; i < origin.arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public void set(int index,int value) {
		arr[index] = value;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public static void main(String[] args) {
		CloneConstructor c1 = new CloneConstructor();
		c1.set(1, 10);
		CloneConstructor c2 = new CloneConstructor(c1);
		System.out.println(c2.get(2));
	}
}
