package com.irelandpenguin_05;

public class String01 {

	public static void main(String[] args) {
		String s = "https://www.innerios.com";
		char[] array = {'i','n','o','y'};
		for (int i = 0; i < array.length; i++) {
			System.out.println(s.indexOf(array[i]));
		}
	}

}
