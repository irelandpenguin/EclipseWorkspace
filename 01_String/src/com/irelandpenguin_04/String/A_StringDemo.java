package com.irelandpenguin_04.String;

public class A_StringDemo {

	public static void main(String[] args) {
		String s = "helloworld";
		String s2 = "hellowORld";
		
		System.out.println(s.equals(s2));//�����Ƿ���ͬ�����ִ�Сд;//false;
		
		System.out.println(s.equalsIgnoreCase(s2));//�����Ƿ���ͬ�������ִ�Сд;//true;
		
		System.out.println(s.contains("wor"));//���������ִ�С;//true;
		System.out.println(s2.contains("wOR"));//true;
		
		System.out.println(s.startsWith("hell"));//��ʼ;//true;
		System.out.println(s.startsWith("ell"));//false;
		
		System.out.println(s.endsWith("orld"));//��β;//true;
		System.out.println(s.endsWith("orl"));//false;
		
		String s3 = "";
		System.out.println(s3.isEmpty());//�Ƿ�Ϊ����Ϊ��//true;
		
		/*String s4 = null;
		System.out.println(s4.isEmpty());*/
		
	}

}
