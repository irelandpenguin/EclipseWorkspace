/*package com.irelandpenguin_06;

public class String04 {

	public static void main(String[] args) {
		String s = "Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday";
		int index = 0;
		int bookMark = 0;
		String s2 = new String();
		int pace = 0;
		for (int i = 0 ;i<s.length();i++){
			index = s.indexOf("day");
			pace = s.length()-index;
			if(pace>s.length()){
				continue;
			}else if(pace>0 && pace<s.length()){
				s2+=s.substring(bookMark,i);
			}
			bookMark = i+3;
		}
	}

}*/
	//4. 把一段英文"Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday"，
	//编写代码把包含"day"的单词全部删除，打印输出改写后的新英文。


package com.irelandpenguin_06;

class String04{
	public static void main(String[] args){
		String s = "Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday";
		String target = "day";
		String[] array = s.split(" ");
		String result = new String();
		for (int i = 0;i<array.length;i++){
			String tmp = array[i];
			int index = tmp.indexOf(target);
			if (index!=-1){
				continue;
			}
			result+=tmp+" ";
		}
		System.out.println(result);
	}
}