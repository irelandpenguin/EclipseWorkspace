package com.irelandpenguin_06;
/**
 * һ�����м̳����нӿ�ʵ�ֵ���
 * @author irelandpenguin
 *
 */
public class Test {

	public static void main(String[] args) {
		Father f = new Son("irelandpenguin");
		f.setName("irelandpenguin2");
		System.out.println(f.getName());
		f.study();
		f.play();
		Son son = (Son) f;
		son.sing();
		son.dance();
		
	}
}