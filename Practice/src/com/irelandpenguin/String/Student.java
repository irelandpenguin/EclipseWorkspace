package com.irelandpenguin.String;

public class Student {
	//��Ա����
	private String name;
	private int age;
	
	public Student(){}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//get and set
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
	//��Ա����
	public void hello(String name){
		System.out.println("hello, "+name);
	}
	
	@Override
	public String toString(){
		return "name:"+name+", age:"+age;
	}
	
}