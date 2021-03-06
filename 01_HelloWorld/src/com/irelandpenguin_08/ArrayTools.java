package com.irelandpenguin_08;

/**
 * 为数组服务提供工具
 * 
 * @author irelandpenguin
 * @version 1.0
 */
public class ArrayTools {
	private ArrayTools() {
	}

	/**
	 * 遍历数组
	 * 
	 * @param array
	 *            整形数组;
	 */
	public static void show(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int max = array[i];
			System.out.println(max);
		}
	}

	/**
	 * 返回最大数
	 * 
	 * @param array
	 *            整形数组
	 * @return 返回最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (max < j) {
				max = j;
			}
		}
		return max;
	}

	/**
	 * 查找索引
	 * 
	 * @param array
	 *            整型數組
	 * @param value
	 *            整形數
	 * @return 返回索引，找不到返回-1;
	 */
	public static int findIndex(int[] array, int value) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}
