package com.irelandpenguin_05;

class String04{
	public static void main(String[] args){
		String s = "today, we will study another string, this string is import for us, now begin the string!";
		String target = "string";
		int index = s.indexOf(target);
		while (index !=-1){
			System.out.println(index);
			index = s.indexOf(target,index+6);
		}
	}
}