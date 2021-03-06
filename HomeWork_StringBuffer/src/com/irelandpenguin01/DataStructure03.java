package com.irelandpenguin01;

public class DataStructure03 {

	public static void main(String[] args) {
		int[] array = new int[] { 29, 36, 57, 112, 314, 421, 630, 841, 1090,
				5200 };
		int[] targets = new int[] { 57, 630, 1090, 555 };
		for (int i = 0; i < targets.length; i++) {
			System.out.println(binSearch(array, targets[i]));
		}

	}

	public static int binSearch(int[] array, int value) {
		int max = array.length - 1, min = 0;
		while (min <= max) {
			int mid = (max + min) / 2;
			if (array[mid] == value) {
				return mid;
			}
			if (array[mid] > value) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}
}
