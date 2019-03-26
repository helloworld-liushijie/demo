package com.huibo.override_overload;

/**
 * «≥øΩ±¥
 * @author ¡ı ¿Ω‹
 */
public class ShallowClone implements Cloneable {
	
	private int[] arr;
	
	public ShallowClone() {
		arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public void set(int index,int val) {
		arr[index] = val;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	@Override
	protected ShallowClone clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ShallowClone)super.clone();
	}
	
	public static void main(String[] args) {
		ShallowClone c1 = new ShallowClone();
		ShallowClone c2 = null;
		try {
			c2 = c1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c1.set(1, 10);
		System.out.println(c2.get(1));
	}
}
