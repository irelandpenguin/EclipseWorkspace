//1. ��һ���ɱ��ַ���"today, we will study another string, this string is import for us, now begin the string!"���Ѻ���"string"�ַ����滻��"STRING"����ӡ����滻���ԭ�ַ�����
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

