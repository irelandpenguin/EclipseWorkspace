package com.irelandpenguin_04;

public class Dog extends Animal {

	public Dog(){}
	public Dog(String name){
		super(name);
	}
	@Override
	public void sleep() {
		System.out.println(getName()+" sleeps");
	}

	@Override
	public void eat() {
		System.out.println(getName()+" eats");
	}

}