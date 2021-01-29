package com.irelandpenguin.String;

public class Test1 {

	public static void main(String[] args) {
		String s = "abbbdbbba";
		System.out.println(reverseString(s));
	}

	public static boolean reverseString(String s) {
		// return new StringBuffer(s).reverse().toString().equals(s);
		
		StringBuffer sb = new StringBuffer(s);
		boolean result = sb.reverse().toString().equals(s);
		return result;

	}

}
