package com.irelandpenguin_03.mainshi;

public class A_Demo {

	public static void main(String[] args) {
		String s1 = new String("hello");//����2������ new String(); "helloworld";
		String s2 = "hello";//����1������ "helloworld";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
