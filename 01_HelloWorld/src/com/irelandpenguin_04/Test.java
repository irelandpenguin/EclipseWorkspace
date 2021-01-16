package com.irelandpenguin_04;

public class Test {

	public static void main(String[] args) {
		Animal an = new Dog();
		an.setName("irelanddog");
		an.eat();
		an.sleep();

		an = new Cat("irelandcat");
		an.eat();
		an.sleep();

	}

}
