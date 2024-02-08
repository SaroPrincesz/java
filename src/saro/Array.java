package saro;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 1, 4, 0, 0, 6, 1, 7, 9, 0 };
		
//System.out.println("Array Length: " + arr.length);
//System.out.println(Arrays.toString(arr));
		
		int index = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
//		if(arr[i] == 0) {
//			index = i;
//		}else {			
//			System.out.println("Index: " + index);
//			if(arr[i-1] == 0 && arr[i] != 0) {
//				arr[index] = arr[i];				
//			}
//		}
		System.out.println("i: " + i);
System.out.println("         Before swap Index: " + index);
System.out.println("         (condition)arr[" + i + "](" + arr[i] + ") != 0:   " + (arr[i] != 0));
			if (arr[i] != 0) {
				temp = arr[index];
				System.out.println("         temp: " + temp);
				arr[index++] = arr[i];
				System.out.println("         arr[" + (index-1) + "]: " + arr[index-1]);
				arr[i] = temp;
				System.out.println("         arr[" + i + "]: " + arr[i]);
			}
System.out.println("         " + Arrays.toString(arr));
System.out.println("         After swap Index: " + index);
System.out.println("-----------------------------------------------");
		}

		// Swap method
//		int start = 0;
//		int last = arr.length-1;
//		int temp = 0;
//		while(start <= last) {
//			if(arr[start] == 0 && arr[last] != 0) {
//				temp = arr[start];
//				arr[start] = arr[last];
//				arr[last] = temp;
//			}else if(arr[last] == 0) {
//				last--;
//			}else if(arr[start] != 0) {
//				start++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

	}

}
