package com.irelandpenguin_01;

public class D_StringBuffer {

	public static void main(String[] args) {
		//replace();reverse();
		StringBuffer sb = new StringBuffer("helloworld");
		sb.replace(0, sb.length(), "hello,irelandpenguin");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		//setCharAt();
		sb.setCharAt(0, 'H');
		System.out.println(sb); 
		
	}

}
