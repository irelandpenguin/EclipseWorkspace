package com.irelandpenguin_05.String;

public class A_StringDemo {
	public static void main(String[] args){
		String s = "helloworld,I'm irelandpenguin,it's please to see you.";
		
		System.out.println(s.length());//53
		System.out.println(s.charAt(2));//l
		System.out.println(s.indexOf("irelandpenguin"));//15
		System.out.println(s.indexOf("irelandpenguin",2));//15
		System.out.println(s.indexOf('d'));//9
		System.out.println(s.indexOf('d',2));//9
		System.out.println(s.lastIndexOf("see"));//45
		/*System.out.println(s.lastIndexOf("see",0));//-1
		System.out.println(s.lastIndexOf('t',2));//-1
		System.out.println(s.lastIndexOf('t'));//42
*/		System.out.println(s.substring(16,18));//rel
		System.out.println(s.substring(16));//relandpenguin,it's please to see you.
		
		/*String s2 = "hello,world.";
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			System.out.println(ch);
		}*/
	}
}
