package mission14;

import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = 0, temp = 0;
		System.out.println("UserInput: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[index] < arr[j]) {
					index = j;
				}
			}
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Output: " + Arrays.toString(arr));
		
		
	}

}
