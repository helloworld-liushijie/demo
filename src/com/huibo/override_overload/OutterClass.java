package com.huibo.override_overload;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 外部类
 * @author 刘世杰
 */
public class OutterClass {
	
	int x = 0;
	
	class InnerClass {
		int a = 10;
	}
	
	static class StaticInnerClass {
		int b = 20;
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		InnerClass in = new OutterClass().new InnerClass();
		System.out.println(in.a);
		//静态内部类不需要外部类实现,非静态内部类依赖于外部类实例
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		System.out.println(staticInnerClass.b);
		Class<?> c = Class.forName("com.huibo.override_overload.RelfectTest");
		System.out.println(c.isInstance(new RelfectTest()));//true
		try {
			RelfectTest a = (RelfectTest)c.newInstance();
			System.out.println(a.a);//200
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		Class<?> c1 = String.class;
		try {
			String str = (String)c1.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Class<?> stringInstance = String.class;
		Constructor constructor = stringInstance.getConstructor(String.class);
		String str = (String)constructor.newInstance("string 构造器");
		System.out.println(str);
		
		Method[] m =  stringInstance.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		Class<?> c2 = RelfectTest.class;
		Object obj = c2.newInstance();
		Method method = c2.getMethod("add", Integer.class,String.class);
		System.out.println(method);
		
		Field[] f = stringInstance.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		Object res = method.invoke(obj,10,"aa");
		System.out.println(res);
		
		new OutterClass().testArray();
	}
	
	public void testArray() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clz = Class.forName("java.lang.String");
		Object array = Array.newInstance(clz,10);
		Array.set(array, 0, "jack");
		Array.set(array, 1, "tom");
		Array.set(array, 2, "mary");
		System.out.println(Array.get(array, 0));
	}
}

class RelfectTest {
	int a = 200;
	public Integer add(Integer i,String str) {
		return 10;
	}
}