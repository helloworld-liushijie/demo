package com.huibo.airth;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串计数算法
 * @author 刘世杰
 */
public class Count {
	public static void main(String[] args) {
		String str = "hello,world";
		Map<String,Object> map = new HashMap<>();
		for (int i = 0; i < str.length()-1; i++) {
			int count = 0;
			if((str.charAt(i) <= 90 && str.charAt(i) >= 65) || (str.charAt(i) <= 122 && str.charAt(i) >= 97)) {
				for (int j = 0; j < str.length()-1; j++) {
					if(str.charAt(i) == str.charAt(j)) {
						count++;
					} 
				}
				map.put(str.charAt(i)+"出现次数:", count);
			}
		}
		System.out.println(map);
	}
}
