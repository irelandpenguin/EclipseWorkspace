/*package com.irelandpenguin_05;

public class String03 {

	public static void main(String[] args) {
		String s = "helloboy";
		String s2 = new String();
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			int[] bye = new int[]{(array[i]-31)};
			s2+=new String(bye);
		}
		System.out.println(s2);
	}

}
*/

package com.irelandpenguin_05;

class String03{
	public static void main(String[] args){
		String str = "helloboy";
		String result = "";
		for(int i = 0 ;i<str.length();i++){
			char tmp = (char)(str.charAt(i)-31);
			result+=tmp;
		}
		System.out.println(result);
	}
}