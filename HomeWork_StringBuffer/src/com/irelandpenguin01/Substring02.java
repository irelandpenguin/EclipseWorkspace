//��һ���ַ�����{"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};�ҳ������а���"oo"������Ԫ�أ�Ȼ���ȡ��"oo"������ַ�������ӡ�����
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
