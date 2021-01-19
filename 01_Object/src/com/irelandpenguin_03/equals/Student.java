package com.irelandpenguin_03.equals;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//equals重写;比较两个类的成员变量是否相同;
	/*@Override
	public boolean equals(Object obj){
		Student s = (Student) obj;
		return (s.age == this.age && s.name.equals(this.name));
	}*/
	
	
	
}
