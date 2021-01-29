package com.irelandpenguin.String;

public class A_Bubble {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,98,5};
		bubbleSearch(array);
		pprint(array);
	}
	
	public static void bubbleSearch(int[] array){
		for (int i = 1; i<array.length; i++){
			for (int j = 0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	
	public static void pprint(int[] array){
		System.out.print("[");
		for (int i  = 0; i<array.length;i++){
			if(i!=array.length-1){
				System.out.print(array[i]+", ");
			}else{
				System.out.println(array[i]+"]");
			}
		}
	}

}
