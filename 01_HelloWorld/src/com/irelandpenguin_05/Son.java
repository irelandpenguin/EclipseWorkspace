package com.irelandpenguin_05;

public class Son implements Father {
	//��Ա����
	private String name;
	//���췽��
	public Son(String name){
		this.name=name;
	}
	//get and set
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	//��Ա����
	@Override
	public void sing() {
		System.out.println(getName()+" sings");
	}

	@Override
	public void dance() {
		System.out.println(getName()+" dances");
	}

}
