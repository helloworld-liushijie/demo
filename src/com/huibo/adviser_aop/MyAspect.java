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
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	
	//@AfterReturning(value="myPointCut()",returning="ret")
	public String myAfterReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知:"+joinPoint.getSignature().getDeclaringTypeName()+",-->"+ret);
		return "hello World";
	}
	
	//@Around(value="myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("前");
		Object obj = joinPoint.proceed();
		System.out.println("后");
		return obj;
	}
	
	//@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("异常抛出:"+e.getMessage());
	}
	
	@After(value="myPointCut()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("后置通知");
	}
	
	@Pointcut("execution(* com.huibo.adviser_aop.*Impl.*(..))")
	private void myPointCut() {
		
	}
}
