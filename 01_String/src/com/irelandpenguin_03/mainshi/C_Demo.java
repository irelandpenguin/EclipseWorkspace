package com.irelandpenguin_03.mainshi;

public class C_Demo {
	public static void main(String[] args){
		String s = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s + s2);//�ַ����������ȿ����ڴ棬��ƴ�ӣ���ַ��һ����//false
		System.out.println(s3.equals(s + s2));//true
		System.out.println(s3 == "hello"+"world");//��������ƴ���ڳ��������Ƿ�����ͬ�����У�ֱ�ӷ��أ����ޣ��ڴ�����//true;
		System.out.println(s3.equals("hello"+"world"));//true
	}
}