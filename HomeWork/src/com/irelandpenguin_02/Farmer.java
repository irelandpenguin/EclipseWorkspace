package com.irelandpenguin_02;
/**
 * 
 * @author irelandpenguin
 *@version v1.1
 */
public class Farmer {
	//成员变量

	private String name;
	private int age;
	private String address;
	//构造
	public Farmer(){}
	public Farmer(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	//get and set
	/**
	 * get name
	 * @return 名字
	 * 
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * set name
	 * @param name 字符串类型名字
	 *
	 */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * get age
	 * @return 返回名字
	 */
	public int getAge(){
		return this.age;
	}
	/**
	 * set age
	 * @param age int类型  年龄
	 */
	public void setAge(int age){
		this.age=age;
	}
	/**
	 * get address
	 * @return 返回地址
	 */
	public String getAddress(){
		return this.address;
	} 
	/**
	 * set address
	 * @param address string类型地址
	 */
	public void setAddress(String address){
		this.address=address;
	}
	//方法重写
	/**
	 * toString()重写
	 * @return 返回对象名字和地址；
	 */
	public String toString(){
		return "name:"+name+" age:"+age+" address:"+address;
	}
	/**
	 * equals()重写；
	 * @return 返回true或false;
	 */
	public boolean equals(Object obj){
		Farmer f = (Farmer)obj;
		return (f.name.equals(this.name)&&f.age == this.age);
	}
}
