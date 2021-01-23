package com.irelandpenguin_05;

public class String03_01 {

	public static void main(String[] args) {
		String s = "helloboy";
		String result = new String();
		for (int i = 0;i<s.length();i++){
			char tmp = s.charAt(i);
			result += (char)(tmp-31);
		}
		System.out.println(result);
	}

}
