package com.irelandpenguin_09;

/**
 * ����
 * 
 * @author irelandpenguin
 * @version v1.1
 */
public class Son extends Father implements SingAndDance {
	/**
	 * ���췽��
	 * 
	 * @param name
	 *            ����
	 */
	public Son(String name) {
		super(name);
	}

	/**
	 * ����
	 */
	@Override
	public void sing() {
		System.out.println(getName() + " sings");
	}

	/**
	 * ����
	 */
	@Override
	public void dance() {
		System.out.println(getName() + " dances");
	}

	/**
	 * ѧϰ
	 */
	@Override
	public void study() {
		System.out.println(getName() + " studies");
	}

	/**
	 * ��
	 */
	@Override
	public void play() {
		System.out.println(getName() + " plays");
	}

}