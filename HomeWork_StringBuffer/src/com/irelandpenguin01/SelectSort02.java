package com.irelandpenguin01;

public class SelectSort02 {

	public static void main(String[] args) {
		char[] array = { 'X', 'P', 'T', 'B', 'O', 'C', 'Q', 'A', 'U', 'L' };
		selectSort(array);
		pprint(array);

	}

	public static void selectSort(char[] array) {
		for (int i = 0; i < array.length; i++) {// ָ����һ�������е�Ԫ��
			for (int j = i + 1; j < array.length; j++) {// ָ���������е���һ��Ԫ��
				if (array[j] > array[i]) {
					char tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
	}

	public static void pprint(char[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.println(array[i] + "]");
			}
		}
	}
}