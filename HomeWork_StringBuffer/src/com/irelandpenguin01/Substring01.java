//1. �ѿɱ��ַ���"thank you very much, my friends!"��ȡ"very much, my"����ȡ�ɹ�����ַ���"dear students!"ƴ����󲢴�ӡ���
package com.irelandpenguin01;

public class Substring01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("thank you very much, my friends!");
		String s = "dear students";
		String s2 = sb.substring(sb.indexOf("very"), sb.indexOf("my") + 2);// indexof������very"��"my",my����+2�ſ��Խ�ȡ��my�ַ�����
		String result = s2 + " " + s;
		System.out.println(result);
	}

}