package com.irelandpenguin_04;

public abstract class Animal {
	private String name;
	public Animal(){}
	public Animal(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public abstract void sleep();//sleep
	public abstract void eat();//eat
}
