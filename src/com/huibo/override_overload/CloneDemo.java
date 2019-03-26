package com.huibo.override_overload;

/**
 * clone����
 * @author ������
 * TODO cloneable�ӿ�ֻ��һ���涨,clone��protected
 * ���û��ʵ��cloneable�ӿڵ���clone�������׳�CloneNotSupportedException�쳣
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
			//clone����ʵ��cloneable�ӿ�
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
