//2. ���ҿɱ��ַ���"today, we will study another string, this string is import for us, now begin the string!"�а�����"string", ������ǵ�����λ�á�
package com.irelandpenguin01;

public class Substring04 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		String target = "string";
		int index = sb.indexOf(target);
		while(index!=-1){
			System.out.println(index);
			index = sb.indexOf(target,index+6);
		}
	}
}