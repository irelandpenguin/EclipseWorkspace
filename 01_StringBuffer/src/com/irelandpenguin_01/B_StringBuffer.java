package com.irelandpenguin_01;

public class B_StringBuffer {

	public static void main(String[] args) {
		//append
		//�����������������ӵ��ɱ��ַ��������ر�����
		StringBuffer sb = new StringBuffer("hello,world");
		sb.append("hello,world");
		sb.append(true);
		sb.append(23);
		sb.append(24.23);
		sb.append(3.14f);
		sb.append(12l);
		sb.append('a');
		System.out.println(sb);
		
		//��ʽ���
		sb.append("hello,world").append("hello,irelandpenguin");
		System.out.println(sb);
		
		char[] array= new char[] {'a','b','c','d','e'};
		sb.append(array);
		System.out.println(sb);
		sb.append(array,2,3);
		System.out.println(sb);
		
		
		//insert
		//�������������Ͳ��뵽ָ��λ��
		StringBuffer sb2 = new StringBuffer("helloworld");
		sb2.insert(sb2.length(), "\"hello,irelandpenguin\"");
		System.out.println(sb2);
		
		
		
	}

}