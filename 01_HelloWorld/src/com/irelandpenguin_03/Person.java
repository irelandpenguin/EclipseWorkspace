package com.irelandpenguin_03;

public class Person {
	// 成员变量
	private String name;
	private int age;

	// 构造方法
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// get and set
	public void setName(String name) {
		this.age = age;
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

	// 成员方法
	public void show() {
		System.out.println(this.name + "---" + this.age);
	}

}
