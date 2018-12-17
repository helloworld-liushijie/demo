package com.huibo.spring_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 工厂类
 */
public class MyBeanFactory {
	
	public static UserService createService() {
		//return new UserServiceImpl();
		//1.目标类
		final UserService userService = new UserServiceImpl();
		
		//2.切面类
		MyAspect myAspect = new MyAspect();
		
		/**
		 * 代理类
		 * 		参数1 loader:类加载器,动态代理类运行时创建，任何类都需要类加载器动态加载到内存
		 * 			一般情况:	当前类.class.getClassLoader();
		 * 						目标类实例.getClass().getClassLoader();
		 * 		参数2 Class[] interfaces:代理类需要实现的所有接口
		 * 			方式1:		目标类实例.getClass().getInterfaces();//注意:只能获得自己的接口，不能获得父元素的接口
		 * 			方式2:		new Class[]{UserService.class}
		 * 			例如:jdbc驱动	--> DriverManage 获得接口connection
		 * 
		 * 		参数3 InvocationHandler :处理类,接口，必须进行实现类，常采用匿名内部类方式
		 * 			提供invoke方法,代理类的每一个方法执行时都将调用一次invoke()
		 * 				参数31：Object proxy:代理对象
		 * 				参数32：Method method:代理对象当前执行的方法的描述对象(反射)
		 * 					执行方法名：method.getName();
		 * 					执行方法: method.invoke(对象,实际参数);
		 * 				参数33：Object[] args:实际参数
		 */
		UserService proxyService = (UserService)Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), new Class[] {UserService.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//前执行
						myAspect.before();
						
						//执行目标类的方法
						Object obj = method.invoke(userService,args);
						
						//后执行
						myAspect.after();
						return obj;
					}
				});
		return proxyService;
	} 
}
