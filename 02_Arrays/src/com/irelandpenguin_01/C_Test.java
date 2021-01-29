package com.irelandpenguin_01;

public class C_Test {

	public static void main(String[] args) {
		String s = "abbcbba";
		System.out.println(isSame3(s));
	}
	
	public static boolean isSame(String  s){
		char[] array = s.toCharArray();
		for (int i = 0;i<array.length/2;i++){
			if(array[i]!=array[array.length-1-i]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSame2(String s){
		for (int i = 0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSame3(String s){
//		return new StringBuffer(s).reverse().toString().equals(s);
		StringBuffer sb = new StringBuffer(s);
		String tmp = sb.reverse().toString();
		return tmp.equals(s);
	}
}
