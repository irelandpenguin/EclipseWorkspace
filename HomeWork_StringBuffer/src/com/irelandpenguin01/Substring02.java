//有一个字符数组{"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};找出数组中包含"oo"的数组元素，然后截取其"oo"后面的字符串，打印输出。
package com.irelandpenguin01;

public class Substring02 {

	public static void main(String[] args) {
		String[] array = new String[] { "hello", "world", "foodwater",
				"goodluck", "hello", "rootboy", "photo", "toomany", "well",
				"hold" };
		String target = "oo";
		for (int i = 0; i < array.length; i++) {
			String tmp = array[i];
			int index = tmp.indexOf(target);
			String result = "";
			if (index != -1) {
				result = tmp.substring(index, tmp.length() - 1);
				System.out.println(result);
			}

		}
	}

}
