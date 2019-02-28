package com.huibo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 具体操作
 * @author 刘世杰
 */
@Scope("singleton")
@Component("drive")
public class Drive {
	
	@Autowired
	@Qualifier("audi")
	private Car car;
	
	//打印车型
	void printCar() {
		car.type();
	}
}
