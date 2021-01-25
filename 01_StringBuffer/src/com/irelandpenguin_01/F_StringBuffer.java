package com.irelandpenguin_01;

public class F_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello,world");
		System.out.println(sb.indexOf("hello"));//0
		System.out.println(sb.indexOf("world",2));//6
		System.out.println(sb.lastIndexOf("he"));//0
		
	}

}
