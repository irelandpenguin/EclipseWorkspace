package com.irelandpenguin_04.String;

public class A_StringDemo {

	public static void main(String[] args) {
		String s = "helloworld";
		String s2 = "hellowORld";
		
		System.out.println(s.equals(s2));//内容是否相同，区分大小写;//false;
		
		System.out.println(s.equalsIgnoreCase(s2));//内容是否相同，不区分大小写;//true;
		
		System.out.println(s.contains("wor"));//包含，区分大小;//true;
		System.out.println(s2.contains("wOR"));//true;
		
		System.out.println(s.startsWith("hell"));//开始;//true;
		System.out.println(s.startsWith("ell"));//false;
		
		System.out.println(s.endsWith("orld"));//结尾;//true;
		System.out.println(s.endsWith("orl"));//false;
		
		String s3 = "";
		System.out.println(s3.isEmpty());//是否为内容为空//true;
		
		/*String s4 = null;
		System.out.println(s4.isEmpty());*/
		
	}

}
