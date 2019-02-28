package com.huibo.autowired;

import org.springframework.stereotype.Component;

@Component("audi")
public class AudiCar implements Car {

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("audi");
	}

}
