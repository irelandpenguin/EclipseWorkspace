package com.irelandpenguin_02;

public class A_BinarySearch {//夹逼法 最小值->[]<-最大值;

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3 };
		int target = 1;
		System.out.println(binarySearch(array, target));
		target = 3;
		System.out.println(binarySearch(array, target));
		target = 10;
		System.out.println(binarySearch(array, target));
	}

	public static int binarySearch(int[] array, int target) {
		int max = array.length - 1, min = 0;
		while (min <= max) {
			int mid = (max+min)/2;
			if (target == array[mid]) {
				return mid;
			}else if(array[mid]>target){
				max = mid -1;
			}else{
				min= mid+1;
			}
		}
		return -1;
	}

}
