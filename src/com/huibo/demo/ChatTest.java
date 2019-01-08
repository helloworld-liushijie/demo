package com.huibo.demo;

public class ChatTest {
	
	public static void main(String[] args) {
		/*char ch = 'X';
		ch++;
		System.out.println(ch);*///Y
		
		
		/*int x = 10;
		if(x == 10) {
			int y = 20;
			x = y*2;
		}
		System.out.println(x);*/
		
		/*byte b;
		int i = 257;
		b = (byte)i;
		System.out.println(b);
		
		byte c = 50;
		c = (byte) (2*c);*/
		
		int a = 1; 
		int b = 2; 
		int c; 
		int d; 
		c = ++b; 
		d = a++; 
		c++;
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
		System.out.println("c = " + c); 
		System.out.println("d = " + d);
		
		if(a == 0) 
			System.out.println(1);
		else 
			System.out.println(0);
		
		String str;
		str = (a != b) ? "true" : "false";
		System.out.println(str);
	}
}
