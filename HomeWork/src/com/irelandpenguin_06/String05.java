	//1. 有一个字符串"today, we will study another string, this string is import for us, now begin the string!"，
	//把含有"string"字符串替换成"STRING"，打印输出替换后的新英文。
package com.irelandpenguin_06;

public class String05 {

	public static void main(String[] args) {
		String s = "today, we will study another string, this string is import for us, now begin the string!";
		String target = "string";
		String[] array = s.split(" ");
		String result = new String();
		for (int i = 0;i<array.length;i++){
			String tmp = array[i];
			int index = tmp.indexOf(target);
			if (index!=-1){
				tmp=tmp.toUpperCase();
			}
			result+=tmp+" ";
		}
		System.out.println(result);
	}

}
