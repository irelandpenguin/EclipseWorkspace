	//3.  有四个字符串"hello, string"，"test"，"baby"，找出最大字符串与最小字符串并打印出来(使用compareTo方法)。
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
