package com.irelandpenguin_02.toString;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("irelandpenguin",21);
		System.out.println(stu.hashCode());//��ӡ�����ַ
		System.out.println(stu.getClass().getName());//��ӡ�ֽ�����������;
		System.out.println(stu.toString());//toString();Override
		System.out.println(stu.getClass().getName()+"@"+Integer.toHexString(stu.hashCode()));//��ӡʮ�����������ַ;
	}

}