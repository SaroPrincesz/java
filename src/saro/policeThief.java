package saro;

import java.util.Arrays;

public class policeThief {
	public static int howmanyPairs(char[] arr) {
		int count = 0, police = 0, n = arr.length - 1;
		while (police <= n) {
			if (arr[police] == 'P') {
				if (police == 0) {
					if (police + 2 <= n && arr[police + 2] == 'T') {
						arr[police + 2] = 'X';
						count++;
					} else if (arr[police + 1] == 'T') {
						arr[police + 1] = 'X';
						count++;
					}
				} else if (police - 2 >= 0 && arr[police - 2] == 'T') {
					arr[police - 2] = 'X';
					count++;
				} else if (police + 2 <= n && arr[police + 2] == 'T') {
					arr[police + 2] = 'X';
					count++;
				} else if (police - 1 >= 0 && arr[police - 1] == 'T') {
					arr[police - 1] = 'X';
					count++;
				} else if (police + 1 <= n && arr[police + 1] == 'T') {
					arr[police + 1] = 'X';
					count++;
				} else if (police == n) {
					if (arr[police - 1] == 'T') {
						arr[police - 1] = 'X';
						count++;
					} else if (police - 2 >= 0 && arr[police - 2] == 'T') {
						arr[police - 2] = 'X';
						count++;
					}
				}
			}

			police++;
		}
		return count;
	}

	public static void main(String[] args) {
//		char[] charArr = { 'P', 'T' };
//		char[] charArr = {'P', 'T', 'T'};
		char[] charArr = {'P', 'P', 'T', 'T'};
//		char[] charArr = {'P', 'T', 'P', 'P', 'T'};
//		char[] charArr = {'P', 'P', 'T', 'T', 'T', 'P'};

		System.out.println("Input Array: " + Arrays.toString(charArr));

		int count = howmanyPairs(charArr);
		System.out.println("Count: " + count);

		System.out.println("Output Array: " + Arrays.toString(charArr));

	}

}
