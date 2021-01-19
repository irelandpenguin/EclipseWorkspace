package com.irelandpenguin_02.String;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		System.out.println(s1.length());

		byte[] byte_ = {65,66,67, 68, 69 };
		String s2 = new String(byte_);
		System.out.println(s2);
		System.out.println(s2.length());

		String s3 = new String(byte_, 2, 2);
		System.out.println(s3);
		System.out.println(s3.length());

		char[] char_ = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(char_);
		System.out.println(s4);
		System.out.println(s4.length());

		String s5 = new String(char_, 2, 2);
		System.out.println(s5);
		System.out.println(s5.length());
	}
}
