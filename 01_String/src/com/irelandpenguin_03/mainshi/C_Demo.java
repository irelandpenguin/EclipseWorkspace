package com.irelandpenguin_03.mainshi;

public class C_Demo {
	public static void main(String[] args){
		String s = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s + s2);//字符串变量，先开辟内存，在拼接；地址不一样；//false
		System.out.println(s3.equals(s + s2));//true
		System.out.println(s3 == "hello"+"world");//常量，先拼接在常量区找是否有相同；若有，直接返回，若无，在创建；//true;
		System.out.println(s3.equals("hello"+"world"));//true
	}
}
