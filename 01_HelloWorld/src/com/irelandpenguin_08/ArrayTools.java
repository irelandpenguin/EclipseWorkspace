package com.irelandpenguin_08;

/**
 * Ϊ��������ṩ����
 * 
 * @author irelandpenguin
 * @version 1.0
 */
public class ArrayTools {
	private ArrayTools() {
	}

	/**
	 * ��������
	 * 
	 * @param array
	 *            ��������;
	 */
	public static void show(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int max = array[i];
			System.out.println(max);
		}
	}

	/**
	 * ���������
	 * 
	 * @param array
	 *            ��������
	 * @return �������ֵ
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
	 * ��������
	 * 
	 * @param array
	 *            ���͔��M
	 * @param value
	 *            ���Δ�
	 * @return �����������Ҳ�������-1;
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