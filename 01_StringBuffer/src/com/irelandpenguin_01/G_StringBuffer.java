package com.irelandpenguin_01;

public class G_StringBuffer {
	public static void main(String[] args) {
		// String->StringBuffer
		// StringBuffer();
		StringBuffer sb = new StringBuffer("hello,world");// "hello,world"
		// append();
		sb.append("hello,irelandpenguin");// "hello,worldhello,irelandpenguin"

		// StringBuffer->String
		// String();
		String s = new String(sb);
		System.out.println(s);// "hello,worldhello,irelandpenguin"
		// toString();
		s = sb.toString();
		System.out.println(s);// "hello,worldhello,irelandpenguin"

		s = String.valueOf(sb);
		System.out.println(s);// "hello,worldhello,irelandpenguin"

	}
}
