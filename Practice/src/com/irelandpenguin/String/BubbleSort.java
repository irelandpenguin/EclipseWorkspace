package com.irelandpenguin.String;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 46, 24, 23, 10, 12 };
		bubbleSort(array);
		pprint(array);
	}

	public static void bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length -i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	public static void pprint(int[] array) {
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
