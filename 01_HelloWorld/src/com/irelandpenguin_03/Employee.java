package com.irelandpenguin_03;

public class Employee extends Person {
	//成员变量
	private int number;
	//构造方法
	public Employee(){}	
	public Employee(String name,int age,int number){
			super(name,age);
			this.number=number;
	}
	
	//get and set
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}
	
	//成员方法
	public void show(){
//		super.show();
//		System.out.println(number);
		
		System.out.println(getName()+"---"+getAge()+"---"+getNumber());
	}
	
	
}
