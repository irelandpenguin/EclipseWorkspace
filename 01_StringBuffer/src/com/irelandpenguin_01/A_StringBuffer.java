package com.irelandpenguin_01;

public class A_StringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.toString());//System.out.println(s);
		
		StringBuffer sb2 = new StringBuffer("hello,world");
		System.out.println(sb2.toString());
		System.out.println(sb2.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb3 = new StringBuffer(30);
		System.out.println(sb3.toString());
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		
		
	}

}
