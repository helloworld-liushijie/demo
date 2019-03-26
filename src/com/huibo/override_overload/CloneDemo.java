package com.huibo.override_overload;

/**
 * clone测试
 * @author 刘世杰
 * TODO cloneable接口只是一个规定,clone是protected
 * 如果没有实现cloneable接口调用clone方法会抛出CloneNotSupportedException异常
 */
public class CloneDemo implements Cloneable{
	
	private int a = 10;
	private int b = 10;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (CloneDemo)super.clone();
	}
	
	public static void main(String[] args) {
		CloneDemo t = new CloneDemo();
		try {
			//clone必须实现cloneable接口
			Object o = t.clone();
			System.out.println(o.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+a+":"+b;
	}
}
