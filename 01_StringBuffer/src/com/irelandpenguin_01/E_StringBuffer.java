package com.irelandpenguin_01;

public class E_StringBuffer {

	public static void main(String[] args) {
		//substring 不返回本身；
		StringBuffer sb = new StringBuffer("hello,world");
		System.out.println(sb.substring(0,5));
		System.out.println(sb.substring(6));
		
	}	

}
