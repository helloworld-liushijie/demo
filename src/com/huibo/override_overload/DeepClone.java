package com.huibo.override_overload;

/**
 * 深度拷贝
 * 拷贝对象和原始对象的引用类型引用不同对象
 * @author 刘世杰
 */
public class DeepClone implements Cloneable{
	
	private int[] arr;
	
	public DeepClone() {
		arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public void set(int index,int value) {
		arr[index] = value;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	@Override
	protected DeepClone clone() throws CloneNotSupportedException {
		DeepClone result = (DeepClone) super.clone();
		result.arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result.arr[i] = arr[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		DeepClone c1 = new DeepClone();
		DeepClone c2 = null;
		try {
			c2 = c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		c1.set(1, 20);
		System.out.println(c2.get(1));//1
	}
}

