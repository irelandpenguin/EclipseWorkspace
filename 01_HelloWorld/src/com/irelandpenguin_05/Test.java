package com.irelandpenguin_05;

public class Test {

	public static void main(String[] args) {
		Father f = new Son("irelandpenguin");
		f.sing();
		f.dance();
		Son son = (Son) f;
		son.sing();
		son.dance();
		System.out.println("my name is "+son.getName());
		
		f = new Daugther("irelandpenguin2");
		f.sing();
		f.dance();
		Daugther daugther = (Daugther) f;
		daugther.sing();
		daugther.dance();
		System.out.println("my name is "+daugther.getName()); 
	}

}
