//���ַ�������"helloboy"���м��ܣ�Ҫ��ʹ�ÿɱ��ַ������������ַ������ܺ��������"IFMMPCPZ"����ӡ��������ġ�(˼·�������ַ���ASCII���֪��Сд��ĸ���д��ĸ��ֵ��Ϊ32���� 'h'-32�����ַ�'H')
package com.irelandpenguin01;

public class Append01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("helloboy");
		for (int i = 0; i<sb.length();i++){
			char tmp = (char)(sb.charAt(i)-31);
			sb.setCharAt(i, tmp);
		}
		System.out.println(sb);
	}
}