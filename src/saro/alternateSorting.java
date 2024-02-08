package saro;

import java.util.Arrays;

public class alternateSorting {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 9, 2, 1, 5, 3, 7, 6 };
		System.out.println(Arrays.toString(arr));
		int max = 0;
		int min = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			max = i;
			min = i;
			for(int j=i; j<arr.length; j++) {
				if(i%2==0) {
					if(arr[max] < arr[j]) {
						max = j;
					}
				}else {
					if(arr[min] > arr[j]) {
						min = j;
					}
				}
			}
			temp = arr[i];
			if(i%2==0) {
				arr[i] = arr[max];
				arr[max] = temp;
			}else {
				arr[i] = arr[min];
				arr[min] = temp;
			}
//			if (i % 2 == 0) {
//				max = i;
//				for (int j = i; j < arr.length; j++) {
//					if (arr[max] < arr[j]) {
//						max = j;
//					}
//				}
//				temp = arr[i];
//				arr[i] = arr[max];
//				arr[max] = temp;
//			} else {
//				min = i;
//				for (int j = i; j < arr.length; j++) {
//					if (arr[min] > arr[j]) {
//						min = j;
//					}
//				}
//				temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
//			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
