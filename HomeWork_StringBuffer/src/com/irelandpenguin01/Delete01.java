//1.  有一个可变字符串"i love java, beging to learning java needs a persisting hert!"，去掉后辍为"ing"的单词后辍，打印输出改写后的原可变字符串。
package com.irelandpenguin01;

public class Delete01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("i love java, beging to learning java needs a persisting hert!");
		String target = "ing";
		int index = sb.indexOf(target);
		while(index!=-1){
			sb.delete(index, index+3);
			index = sb.indexOf(target,index);
		}
		System.out.println(sb);
	}

}
