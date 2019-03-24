package com.huibo.cache;

public class InnerTest {
	
	public static void main(String[] args) {
		/*int val = new AccessWithInnerClassExample().getValue();
		System.out.println(val);*/
		/**
		 * 抽象类测试
		 */
		AbstractTest a1 = new AbstractTest() {
			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				super.fun2();
			}

			@Override
			void fun3() {
				// TODO Auto-generated method stub
				
			}
		};
		a1.fun2();
		
		/**
		 * 接口测试
		 */
		new A1().fun1();
		new A1().fun2(InterfaceTest.i);
	}
}

class A1 implements InterfaceTest {

	@Override
	public void fun2(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}