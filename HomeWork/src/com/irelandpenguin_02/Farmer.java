package com.irelandpenguin_02;
/**
 * 
 * @author irelandpenguin
 *@version v1.1
 */
public class Farmer {
	//��Ա����

	private String name;
	private int age;
	private String address;
	//����
	public Farmer(){}
	public Farmer(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	//get and set
	/**
	 * get name
	 * @return ����
	 * 
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * set name
	 * @param name �ַ�����������
	 *
	 */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * get age
	 * @return ��������
	 */
	public int getAge(){
		return this.age;
	}
	/**
	 * set age
	 * @param age int����  ����
	 */
	public void setAge(int age){
		this.age=age;
	}
	/**
	 * get address
	 * @return ���ص�ַ
	 */
	public String getAddress(){
		return this.address;
	} 
	/**
	 * set address
	 * @param address string���͵�ַ
	 */
	public void setAddress(String address){
		this.address=address;
	}
	//������д
	/**
	 * toString()��д
	 * @return ���ض������ֺ͵�ַ��
	 */
	public String toString(){
		return "name:"+name+" age:"+age+" address:"+address;
	}
	/**
	 * equals()��д��
	 * @return ����true��false;
	 */
	public boolean equals(Object obj){
		Farmer f = (Farmer)obj;
		return (f.name.equals(this.name)&&f.age == this.age);
	}
}
