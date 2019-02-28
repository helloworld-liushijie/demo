package com.huibo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * �������
 * @author ������
 */
@Scope("singleton")
@Component("drive")
public class Drive {
	
	@Autowired
	@Qualifier("audi")
	private Car car;
	
	//��ӡ����
	void printCar() {
		car.type();
	}
}
