package com.irelandpenguin_02.toString;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("irelandpenguin",21);
		System.out.println(stu.hashCode());//打印虚拟地址
		System.out.println(stu.getClass().getName());//打印字节码对象的名称;
		System.out.println(stu.toString());//toString();Override
		System.out.println(stu.getClass().getName()+"@"+Integer.toHexString(stu.hashCode()));//打印十六进制虚拟地址;
	}

}
