package com.irelandpenguin_02;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Boolean result = isSame(s);
		System.out.println(result);
	}
	public static Boolean isSame(String s){
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
