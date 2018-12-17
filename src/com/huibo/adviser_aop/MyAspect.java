package com.huibo.adviser_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	//@Before(value = "execution(* com.huibo.adviser_aop.*Impl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ"+joinPoint.getSignature().getName());
	}
	
	//@AfterReturning(value="myPointCut()",returning="ret")
	public String myAfterReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("����֪ͨ:"+joinPoint.getSignature().getDeclaringTypeName()+",-->"+ret);
		return "hello World";
	}
	
	//@Around(value="myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("ǰ");
		Object obj = joinPoint.proceed();
		System.out.println("��");
		return obj;
	}
	
	//@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�쳣�׳�:"+e.getMessage());
	}
	
	@After(value="myPointCut()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("����֪ͨ");
	}
	
	@Pointcut("execution(* com.huibo.adviser_aop.*Impl.*(..))")
	private void myPointCut() {
		
	}
}
