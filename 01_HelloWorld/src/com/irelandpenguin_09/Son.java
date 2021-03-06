package com.irelandpenguin_09;

/**
 * 子类
 * 
 * @author irelandpenguin
 * @version v1.1
 */
public class Son extends Father implements SingAndDance {
	/**
	 * 构造方法
	 * 
	 * @param name
	 *            姓名
	 */
	public Son(String name) {
		super(name);
	}

	/**
	 * 唱歌
	 */
	@Override
	public void sing() {
		System.out.println(getName() + " sings");
	}

	/**
	 * 跳舞
	 */
	@Override
	public void dance() {
		System.out.println(getName() + " dances");
	}

	/**
	 * 学习
	 */
	@Override
	public void study() {
		System.out.println(getName() + " studies");
	}

	/**
	 * 玩
	 */
	@Override
	public void play() {
		System.out.println(getName() + " plays");
	}

}
