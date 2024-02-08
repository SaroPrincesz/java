package mission3;

import java.util.Arrays;

public class p3LeftRotateSingleDimentionArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Input: " + Arrays.toString(arr));
		int temp = 0;
		int n = 2;
		for(int i= 1; i<=n; i++) {
			temp = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
				arr[j]= arr[j-1];
			}
			arr[0] = temp;
		}
		System.out.println("Input: " + Arrays.toString(arr));
	}

}
