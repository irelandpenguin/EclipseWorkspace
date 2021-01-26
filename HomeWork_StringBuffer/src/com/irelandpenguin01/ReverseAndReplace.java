//1. 有一个可变字符串"today, we will study another string, this string is import for us, now begin the string!"，把含有"string"字符串替换成"STRING"，打印输出替换后的原字符串。
package com.irelandpenguin01;

public class ReverseAndReplace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		String target = "string";
		int index = sb.indexOf(target);
		while(index!=-1){
			sb.replace(index, index+6, "STRING");
			index = sb.indexOf(target,index+6);
		}
		System.out.println(sb);
	}

}

