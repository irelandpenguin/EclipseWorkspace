package com.irelandpenguin_04;

public class String02 {

	public static void main(String[] args) {
		String s1 = "���";
		String s2 = "�й�";
		String s3 = "����й�";
		System.out.println(s3.equals("���" + "�й�"));// true
		System.out.println(s3 == "�й�" + "���");// false
		System.out.println(s3 =="���" + "�й�");// true
		System.out.println(s3.equals((s1 + s2)));// true
	}

}