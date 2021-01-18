package irelandpenguin;

import com.irelandpenguin_08.ArrayTools;
import com.irelandpenguin_09.Son;

public class Test {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,10};
		ArrayTools.show(array);
		System.out.println("---");
		
		int index=ArrayTools.findIndex(array, 2);
		System.out.println(index);
		index=ArrayTools.findIndex(array, 11);
		System.out.println(index);
		System.out.println("---");
		
		int max=ArrayTools.max(array);
		System.out.println(max);
		System.out.println("---");
		
		//使用jar包方法;
		Son son = new Son("irelandpenguin");
		son.study();
		son.dance();
		son.play();
		son.sing();
		
		
		
	}

}
