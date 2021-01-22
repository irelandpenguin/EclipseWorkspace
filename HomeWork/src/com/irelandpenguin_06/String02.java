package com.irelandpenguin_06;

public class String02 {

	public static void main(String[] args) {
		char[] array = {'i','A','P','l','B','o','J','Q','v','e','S','y','Y','i','d','Z','a'};
		String s = new String();
		for (int i = 0; i<array.length;i++){
			if(array[i]>'a'&&array[i]<'z'){
				s+=array[i];
			}
		}
		System.out.println(s);
	}

}
