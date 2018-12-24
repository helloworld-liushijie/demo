package com.huibo.spring_jdbc;

import java.time.Clock;

public class Demo {
	
	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.millis());
	}
}
