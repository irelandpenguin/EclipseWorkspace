package com.irelandpenguin_03;

public class Person {
	// ��Ա����
	private String name;
	private int age;

	// ���췽��
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// get and set
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	// ��Ա����
	public void show() {
		System.out.println(this.name + "---" + this.age);
	}

}