package com.irelandpenguin_05;

public class Daugther implements Father {
	private String name;
	
	public Daugther(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public void sing() {
		System.out.println(getName()+" sings");
	}

	@Override
	public void dance() {
		System.out.println(getName()+" dances");
	}

}
