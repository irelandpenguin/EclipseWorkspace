//1. 把可变字符串"thank you very much, my friends!"截取"very much, my"，截取成功后把字符串"dear students!"拼接其后并打印输出
package com.irelandpenguin01;

public class Substring01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("thank you very much, my friends!");
		String s = "dear students";
		String s2 = sb.substring(sb.indexOf("very"), sb.indexOf("my") + 2);// indexof索引”very"和"my",my索引+2才可以截取到my字符串；
		String result = s2 + " " + s;
		System.out.println(result);
	}

}
