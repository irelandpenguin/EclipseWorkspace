package com.irelandpenguin01;

import java.util.Scanner;

public class IntegerAndStringBuilder01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
	}
}
