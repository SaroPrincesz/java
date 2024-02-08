package zsgsFeb2024;

import java.util.Arrays;

public class p2NoOfOccurances {

	public static int count(int a, int k) {
		int count = 0;
		int rev = 0;
		while (a != 0) {
			rev = a % 10;
			if (rev == k) {
				count++;
			}
			a = a / 10;
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 33, 4332, 1333, 3, 330 };
		System.out.println(Arrays.toString(arr));
		int k = 3;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (count(arr[i], k) > count(arr[j], k)) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else if(count(arr[i], k) == count(arr[j], k)) {
					
				}
			}
		}

//		char k = '3';
//		int[] occurArr = new int[arr.length];
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			String str = String.valueOf(arr[i]);
//			count = 0;
//			for (int j = 0; j < str.length(); j++) {
//				if (str.charAt(j) == k) {
//					count++;
//				}
//			}
//			occurArr[i] = count;
//		}
//		System.out.println(Arrays.toString(occurArr));
//		int index = 0;
//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			index = i;
//			for (int j = i; j < arr.length; j++) {
//				if (occurArr[index] > occurArr[j]) {
//					index = j;
//				}
//			}
//			temp = arr[index];
//			arr[index] = arr[i];
//			arr[i] = temp;
//			temp = occurArr[index];
//			occurArr[index] = occurArr[i];
//			occurArr[i] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (occurArr[i] == occurArr[j]) {
//					if (arr[i] > arr[j]) {
//						temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				} else {
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

	}

}
