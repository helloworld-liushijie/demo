package com.huibo.resource_3_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *  ®◊”
 * @author ¡ı ¿Ω‹
 */
@Component("lion")
public class Lion {
	private String lionName = "lionKing";
	@Value("${age}")
	private int age;
	@Value("${name}")
	private String name;
	
	@Override
	public String toString() {
		return "lionName:"+lionName+".properties"+name+":"+age;
	}
}
