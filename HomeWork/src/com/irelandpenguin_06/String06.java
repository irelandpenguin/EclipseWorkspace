	//2. 有一个字符串"i love java, beging to learning java needs a persisting hert!"，去掉后辍为"ing"的单词后辍，打印输出最新英文。
package com.irelandpenguin_06;

public class String06 {

	public static void main(String[] args) {
		String s = "i love java, beging to learning java needs a persisting hert!";
		String target = "ing";
		String[] array = s.split(" ");
		String result =new String();
		for(int i = 0 ; i<array.length;i++){
			String tmp = array[i];
			int index = tmp.indexOf(target);
			if (index!=-1){
				tmp = tmp.substring(0,index);
			}
			result+=tmp+" ";
		}
		System.out.println(result);
	}

}
