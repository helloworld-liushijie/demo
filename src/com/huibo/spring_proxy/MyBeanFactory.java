package com.huibo.spring_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ������
 */
public class MyBeanFactory {
	
	public static UserService createService() {
		//return new UserServiceImpl();
		//1.Ŀ����
		final UserService userService = new UserServiceImpl();
		
		//2.������
		MyAspect myAspect = new MyAspect();
		
		/**
		 * ������
		 * 		����1 loader:�������,��̬����������ʱ�������κ��඼��Ҫ���������̬���ص��ڴ�
		 * 			һ�����:	��ǰ��.class.getClassLoader();
		 * 						Ŀ����ʵ��.getClass().getClassLoader();
		 * 		����2 Class[] interfaces:��������Ҫʵ�ֵ����нӿ�
		 * 			��ʽ1:		Ŀ����ʵ��.getClass().getInterfaces();//ע��:ֻ�ܻ���Լ��Ľӿڣ����ܻ�ø�Ԫ�صĽӿ�
		 * 			��ʽ2:		new Class[]{UserService.class}
		 * 			����:jdbc����	--> DriverManage ��ýӿ�connection
		 * 
		 * 		����3 InvocationHandler :������,�ӿڣ��������ʵ���࣬�����������ڲ��෽ʽ
		 * 			�ṩinvoke����,�������ÿһ������ִ��ʱ��������һ��invoke()
		 * 				����31��Object proxy:�������
		 * 				����32��Method method:�������ǰִ�еķ�������������(����)
		 * 					ִ�з�������method.getName();
		 * 					ִ�з���: method.invoke(����,ʵ�ʲ���);
		 * 				����33��Object[] args:ʵ�ʲ���
		 */
		UserService proxyService = (UserService)Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), new Class[] {UserService.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//ǰִ��
						myAspect.before();
						
						//ִ��Ŀ����ķ���
						Object obj = method.invoke(userService,args);
						
						//��ִ��
						myAspect.after();
						return obj;
					}
				});
		return proxyService;
	} 
}
