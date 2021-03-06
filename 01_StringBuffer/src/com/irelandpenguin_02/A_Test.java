package com.irelandpenguin_02;

public class A_Test {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6};
		String s = arrayToString(array);
		String s2 = arrayToString2(array);
		System.out.println(s);
		System.out.println(s2);
	}

	public static String arrayToString(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length-1) {
				result += array[i] + "]";
			} else {
				result += array[i] + ", ";
			}
		}
		return result;
	}

	
	
	public static String arrayToString2(int[] array) {
		StringBuffer result = new StringBuffer("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length-1) {
				result.append(array[i]).append("]");
			} else {
				result.append(array[i]).append(", ");
			}
		}
		return result.toString();
	}

}
