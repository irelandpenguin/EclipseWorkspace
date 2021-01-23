package com.irelandpenguin_05;

public class String01 {

	public static void main(String[] args) {
		String s = "https://www.innerios.com";
		char[] array = {'i','n','o','y'};
		for (int i = 0; i < array.length; i++) {
//			System.out.println(s.indexOf(array[i]));
			char ch = array[i];
			int index = -1;
			for (int k = 0; k<s.length();k++){
				char tmp  = s.charAt(k);
				if(tmp==ch){
					index = k;
					System.out.println(index);
				}
			}
			if(index==-1){
				System.out.println(index);
			}
		}
	}

}
