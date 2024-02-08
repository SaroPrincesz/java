package saro;

import java.util.Arrays;

public class missingArrayElement {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 10, 6, 12, 16, 14 };// {15, 25, 30, 10, 5, 20, 40}
		int n = 8, index = 0, temp = 0, dif = 0;
//Selection Sort	
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
//Print the Sorted Array
		System.out.println(Arrays.toString(arr));
//Find the difference in an one element to another
		if (arr[1] - arr[0] <= arr[2] - arr[1]) {
			dif = arr[1] - arr[0];
		} else {
			dif = arr[2] - arr[1];
		}
		System.out.println("dif: " + dif);
//Find the Missing element
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] != arr[i] + dif) {
				System.out.println("Missing Element: " + (arr[i] + dif));
				break;
			}
		}

	}

}
