package com.huibo.adviser_aop;

import org.springframework.stereotype.Service;

@Service("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public String modifyUser() {
		// TODO Auto-generated method stub
		System.out.println("modify");
		//int i = 1/0;
		return "hello world";
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

}
