package com.irelandpenguin_06.String;

public class A_StringDemo {

	public static void main(String[] args) {
		String s = "hello,irelandpenguin";
		byte[] array = s.getBytes();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		char[] array2 = s.toCharArray();
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		String a = String.valueOf(array2);
		System.out.println(a);
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(12.24));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf('a'));
		
		String b = s.toLowerCase();
		String c = s.toUpperCase();
		System.out.println(b+","+c);
		
	}

}
