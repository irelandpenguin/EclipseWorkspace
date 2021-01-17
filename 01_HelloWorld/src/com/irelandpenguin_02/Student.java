package com.irelandpenguin_02;

public class Student {
	private String name;
	private int age;
	private char sex;
	
	public Student() {
		super();
	}
	public Student(String name, int age, char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setSex(char sex){
		this.sex=sex;
	}
	public char getSex(){
		return this.sex;
	}
	
	public void show(){
		System.out.println(name+"---"+age+"---"+sex);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("irelandpenguin");
		stu.setAge(25);
		stu.setSex('m');
		
		System.out.println(stu.getName()+"---"+stu.getAge()+"---"+stu.getSex());
		
		System.out.println("-----");
		
		Student stu2 = new Student("irelandpenguin"	,25,'m');
		stu2.show();
	}

}