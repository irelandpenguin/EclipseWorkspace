/*package com.irelandpenguin_06;

public class String03 {

	public static void main(String[] args) {
		String s ="Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday";
		int index = 0;
		int bookMark = 0;
		String s2 = new String();
		for(int i = 0;i<s.length();i++){
			index = s.indexOf("day");
			int pace=s.length()-index;
			if(pace>s.length()){
				System.out.println("not match");
			}else if(pace<s.length()&&pace>0){
				s2+=s.substring(bookMark,i)+"day".toUpperCase();
			}
			bookMark = index;
		}
		System.out.println(s2);
	}

}*/

	//3. 把一段英文"Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday"，
	//编写代码把包含"day"的单词全部改成大写(比如："Today"包含"day", 要把"Today"改成"TODAY")，打印输出改写后的新英文。
package com.irelandpenguin_06;

class String03{
	public static void main(String[] args){
		String s = "Today is Friday!  This is the last weekday!  tomorrow is saturday!  after saturday is sunday";
		String target = "day";
		String[] array = s.split(" ");
		String result = new String();
		for (int i = 0;i<array.length;i++){
			String tmp = array[i];
			int index = tmp.indexOf(target);
			if (index!=-1){
				result += tmp.substring(0,1).toUpperCase()+tmp.substring(1).toLowerCase()+" ";
			}else{
				result+=tmp+" ";
			}
		}
		System.out.println(result);
	}
}
