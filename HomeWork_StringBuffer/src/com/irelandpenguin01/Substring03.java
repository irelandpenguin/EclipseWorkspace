// ��һ�ɱ��ַ���"welcom to China, My Friends!"�������ַ���"China"�������ڴ�ӡ�����ڵ�λ��������
package com.irelandpenguin01;

public class Substring03 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("welcom to China, My Friends!");
		String target  = "China";
		int index = sb.indexOf(target);
		while(index != -1){
			System.out.println(index);
			index = sb.indexOf(target,index+5);
		}
	}	

}
