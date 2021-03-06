package com.irelandpenguin_02.toString;

public class Student extends Object {
	private String name;
	private int age;
	
	public Student(){
		super();
	}
	public Student(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	/*@Override
	public void hello(){
		System.out.println(getName()+"I am "+getAge()+", hello,world.");
	}*/
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
