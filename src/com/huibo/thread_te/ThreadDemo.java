package com.huibo.thread_te;

public class ThreadDemo {
	
	public static int i;
	static {
		i = 10;
	}
	
	{
		System.out.println("hello world");
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(a());
		long a = System.currentTimeMillis();
		Thread.sleep(1000);
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		System.out.println(i);
		
		Object obj = new ThreadDemo();
	}
	
	static int a() {
		return 1;
	}
}
