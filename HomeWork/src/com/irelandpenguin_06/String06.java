	//2. ��һ���ַ���"i love java, beging to learning java needs a persisting hert!"��ȥ�����Ϊ"ing"�ĵ��ʺ�ꡣ���ӡ�������Ӣ�ġ�
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