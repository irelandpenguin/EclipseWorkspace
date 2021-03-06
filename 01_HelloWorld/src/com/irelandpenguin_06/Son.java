package com.irelandpenguin_06;

public class Son extends Father implements SingAndDance {

	public Son(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(getName() + " sings");
	}

	@Override
	public void dance() {
		System.out.println(getName() + " dances");
	}

	@Override
	public void study() {
		System.out.println(getName() + " studies");
	}

	@Override
	public void play() {
		System.out.println(getName() + " plays");
	}

}
