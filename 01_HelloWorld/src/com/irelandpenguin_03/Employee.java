package com.irelandpenguin_03;

public class Employee extends Person {
	//��Ա����
	private int number;
	//���췽��
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
	
	//��Ա����
	public void show(){
//		super.show();
//		System.out.println(number);
		
		System.out.println(getName()+"---"+getAge()+"---"+getNumber());
	}
	
	
}