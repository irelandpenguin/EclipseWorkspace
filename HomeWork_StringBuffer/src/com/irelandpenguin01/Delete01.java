//1.  ��һ���ɱ��ַ���"i love java, beging to learning java needs a persisting hert!"��ȥ�����Ϊ"ing"�ĵ��ʺ�ꡣ���ӡ�����д���ԭ�ɱ��ַ�����
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