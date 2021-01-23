/*package com.irelandpenguin_06;

public class String02 {

	public static void main(String[] args) {
		char[] array = {'i','A','P','l','B','o','J','Q','v','e','S','y','Y','i','d','Z','a'};
		String s = new String();
		for (int i = 0; i<array.length;i++){
			if(array[i]>'a'&&array[i]<'z'){
				s+=array[i];
			}
		}
		System.out.println(s);
	}

}
*/
	//2. 有一个字符数组{'i','A','P','l','B','o','J','Q','v','e','S','y','Y','i','d','Z','a'}; 
	//把数组中元素为小写字母的组装成一个字符串，并打印输出。
package com.irelandpenguin_06;

class String02{
	public static void main(String[] args){
		char[] array =  {'i','A','P','l','B','o','J','Q','v','e','S','y','Y','i','d','Z','a'};
		String result ="";
		for(int i =0 ; i<array.length;i++){
			char c = array[i];
			if (c>'a'&&c<'z'){
				result+=c;
			}
		}
		System.out.println(result);
	}
}