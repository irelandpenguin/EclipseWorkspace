package com.irelandpenguin_03.equals;

public class StudentTest {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 1;
		System.out.println(a==b);
		System.out.println(a==c);
		
		Student stu = new Student();
		Student stu2 = new Student();
		System.out.println(stu.equals(stu2));
		Student stu3 = stu;
		System.out.println(stu.equals(stu3));
		
		System.out.println(stu==stu2);
		System.out.println(stu==stu3);
	}
}
