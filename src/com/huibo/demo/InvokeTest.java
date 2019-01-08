package com.huibo.demo;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clz = Class.forName("com.huibo.demo.Child");
		Class superClass = clz.getSuperclass();
		Method[] methods = superClass.getDeclaredMethods();
		AccessibleObject.setAccessible(methods, true);//设置私有方法可访问
		for (Method method : methods) {
			System.out.println(method.getName());
			method.invoke(new Child());
		}
		
		String str1 = "hello";
		String str2 = "hello";
		char[] ch = {'h','e','l','l','o'};
		Object obj = "hello";
		/*System.out.println(str1.equals(str2));
		System.out.println(str1.equals(ch));
		System.out.println(str1.equals(obj));*/
		Integer i1 = 200;
		Integer i2 = 200;
		System.out.println(i1 == i2);
		String str3 = "hello";
		String str4 = "h"+new String("ello");
		System.out.println(str3==str4);
		Integer i3 = 100;
		Integer i4 = 100;
		System.out.println(i3 == i4);
	}
}

class Parent {
	Parent() {
		System.out.println("调用父类构造方法");
	}
	
	private static void staticParent() {
		System.out.println("调用父类静态方法");
	}
	
	private final void finalParent() {
		System.out.println("调用父类常态方法");
	}
	
	private void noneParent() {
		System.out.println("调用父类方法");
	}
}

class Child extends Parent {
	public void noneParent() {
		System.out.println("调用子类公有方法");
	}
}

