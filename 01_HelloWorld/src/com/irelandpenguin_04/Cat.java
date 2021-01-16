package com.irelandpenguin_04;

public class Cat extends Animal {

	public Cat(){}
	public Cat(String name){
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
