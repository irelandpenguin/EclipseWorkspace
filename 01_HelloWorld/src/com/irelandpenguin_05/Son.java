package com.irelandpenguin_05;

public class Son implements Father {
	//成员变量
	private String name;
	//构造方法
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
	//成员方法
	@Override
	public void sing() {
		System.out.println(getName()+" sings");
	}

	@Override
	public void dance() {
		System.out.println(getName()+" dances");
	}

}
