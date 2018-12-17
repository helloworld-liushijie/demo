package com.huibo.singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 饿汉式单例模式
 */
public class Singleton3 {
	
	private static Singleton3 instance;
	
	/**
	 * 构造器私有化
	 */
	private Singleton3() {
		
	}
	
	public static Singleton3 getInstance() {
		if(instance == null) {
			synchronized (Singleton3.class) {
				if(instance == null) {
					try {
						/**
						 * 会导致线程阻塞
						 */
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * 单线程测试
		 */
		/*Singleton3 s1 = Singleton3.getInstance();
		Singleton3 s2 = Singleton3.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);*/
		
		/**
		 * 多线程测试
		 */
		Callable<Singleton3> c = new Callable<Singleton3>() {
			@Override
			public Singleton3 call() throws Exception {
				return Singleton3.getInstance();
			}
		};
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton3> f1 = es.submit(c);
		Future<Singleton3> f2 = es.submit(c);
		
		Singleton3 s1;
		Singleton3 s2;
		
		s1 = f1.get();
		s2 = f2.get();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
		
		es.shutdown();
	}
}
