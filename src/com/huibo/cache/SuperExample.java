package com.huibo.cache;

/**
 * 父类
 * @author 刘世杰
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
 * super的设计思想
 * @author 刘世杰
 */
class SuperExampleExtends extends SuperExample {
	
	@SuppressWarnings("unused")
	private int z;
	
	public SuperExampleExtends(int x, int y,int z) {
		super(x, y);
		this.z = z;
	}
}


