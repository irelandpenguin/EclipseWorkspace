	//3.  ���ĸ��ַ���"hello, string"��"test"��"baby"���ҳ�����ַ�������С�ַ�������ӡ����(ʹ��compareTo����)��
package com.irelandpenguin_06;

public class String07 {

	public static void main(String[] args) {
		String[] array = {"hello","string","test","baby"};
		String max = array[0],min = array[0];
		for (int i = 0;i<array.length;i++){
			String tmp = array[i];
			if(max.compareTo(tmp)<0){
				max = tmp;
			}
			if (min.compareTo(tmp)>0){
				min = tmp;
			}
		}
		System.out.println("max:"+max+",min: "+min);
	}

}