package com.huibo.spring_aop_proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation me) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Ç°");
		Object obj = me.proceed();
		System.out.println("ºó");
		return obj;
	}
	
}
