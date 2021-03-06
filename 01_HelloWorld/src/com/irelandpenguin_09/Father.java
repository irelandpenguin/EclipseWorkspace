package com.irelandpenguin_09;

/**
 * 父类
 * 
 * @author irelandpenguin
 * @version v1.1
 */
public abstract class Father {
	// 成员变量
	private String name;

	// 构造方法
	/**
	 * 带参构造
	 * 
	 * @param name
	 *            姓名
	 */
	public Father(String name) {
		this.name = name;
	}

	// 抽象方法
	/**
	 * 抽象方法-学习
	 */
	public abstract void study();// 学习

	/**
	 * 抽象方法-玩
	 */
	public abstract void play();// 玩

	// 成员方法
	/**
	 * 设置姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 返回姓名
	 */
	public String getName() {
		return this.name;
	}
}
