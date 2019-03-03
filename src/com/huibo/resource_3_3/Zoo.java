package com.huibo.resource_3_3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 动物园
 * @author 刘世杰
 */
//如果component没有设置id,默认类名首字母小写
@Component
@Scope("prototype")
public class Zoo {
	
	/*@Autowired
	@Qualifier("tiger")*/
	@Resource(name="tiger")
	private Tiger tiger;
	
	@Autowired
	@Qualifier("lion")
	private Lion lion;
	
	public Tiger getTiger() {
		return tiger;
	}
	
	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}
	
	public Lion getLion() {
		return lion;
	}
	
	public void setLion(Lion lion) {
		this.lion = lion;
	}
	
	@Override
	public String toString() {
		return tiger+"\n"+lion;
	}
}
