package com.irelandpenguin_07;

public class Student {
	private String name;
	private int age;
	private char sex;

	/*
	 * public Student(){} public Student(String name,int age,char sex){
	 * this.name=name; this.age=age; this.sex=sex; }
	 */
	public Student() {
		super();

	}

	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
