package com.irelandpenguin_09;

/**
 * ����
 * 
 * @author irelandpenguin
 * @version v1.1
 */
public abstract class Father {
	// ��Ա����
	private String name;

	// ���췽��
	/**
	 * ���ι���
	 * 
	 * @param name
	 *            ����
	 */
	public Father(String name) {
		this.name = name;
	}

	// ���󷽷�
	/**
	 * ���󷽷�-ѧϰ
	 */
	public abstract void study();// ѧϰ

	/**
	 * ���󷽷�-��
	 */
	public abstract void play();// ��

	// ��Ա����
	/**
	 * ��������
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��������
	 */
	public String getName() {
		return this.name;
	}
}