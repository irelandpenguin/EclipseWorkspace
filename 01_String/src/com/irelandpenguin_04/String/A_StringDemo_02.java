package com.irelandpenguin_04.String;

public class A_StringDemo_02 {
	public static void main(String[] args){
		String s = "helloworld";
		String s2 = "hellWorld";

		s.equals(s2);
		s.equalsIgnoreCase(s2);
		s.contains("hello");
		s.startsWith("hello");
		s.endsWith("world");
		s.isEmpty();
		
	}
}
