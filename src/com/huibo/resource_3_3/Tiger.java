package com.huibo.resource_3_3;

import org.springframework.stereotype.Component;

/**
 * �ϻ�
 * @author ������
 */
@Component
public class Tiger {
	private String tigerName = "tigerKing";
	
	@Override
	public String toString() {
		return "tigerName:"+tigerName;
	}
}
