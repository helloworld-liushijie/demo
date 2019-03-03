package com.huibo.resource_3_3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * «–√Ê
 * @author ¡ı ¿Ω‹
 */
@Aspect
//@Component
public class AspectCut {
	
	@Pointcut("execution(public * com.huibo.resource_3_3.Zoo..toString(..))")
	public void pointcutName() {};
	
	@Before("pointcutName()")
	public void syso() {
		System.out.println("«–»Î");
	}
}
