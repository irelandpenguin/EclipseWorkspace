// 有一可变字符串"welcom to China, My Friends!"，查找字符串"China"，若存在打印它所在的位置所引。
package com.irelandpenguin01;

public class Substring03 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("welcom to China, My Friends!");
		String target  = "China";
		int index = sb.indexOf(target);
		while(index != -1){
			System.out.println(index);
			index = sb.indexOf(target,index+5);
		}
	}	

}
