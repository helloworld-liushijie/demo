package com.huibo.java_base_demo;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SortedMap≤‚ ‘
 * @author ¡ı ¿Ω‹
 */
public class SortedMap_Demo {
	
	public static void main(String[] args) {
		SortedMap<String, Object> map = new TreeMap<>();
		map.put("1", "java");
		map.put("2", "html");
		map.put("3", "spring");
		map.put("5", "jquery");
		map.put("4", "jsp");
		//{1=java, 2=html, 3=spring, 4=jsp, 5=jquery}
		System.out.println(map);
	}
}
