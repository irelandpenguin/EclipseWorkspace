//2. 定义一个可变字符串"today, we will study another string, this string is import for us, now begin the string!"，在逗号后面插入字符串"msn"，打印输出插入后的英文。
package com.irelandpenguin01;

public class Append02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		String target = ",";
		int index = sb.indexOf(target);
		while (index != -1){
			sb.insert(index+1, "msn");
			index = sb.indexOf(target,index+1);
		}
		System.out.println(sb);
	}
}
