package com.huibo.cache;

/**
 * ����
 * @author ������
 */
public class SuperExample {
	
	protected int x;
	protected int y;
	
	public SuperExample(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
}

/**
 * super�����˼��
 * @author ������
 */
class SuperExampleExtends extends SuperExample {
	
	@SuppressWarnings("unused")
	private int z;
	
	public SuperExampleExtends(int x, int y,int z) {
		super(x, y);
		this.z = z;
	}
}


