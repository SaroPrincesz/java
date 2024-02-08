package ChennaiSaro;

import java.util.Arrays;

public class oddDescEvenAsen {

	public static void main(String[] args) {
//		int[] arr = { 1, 4, 5, 8, 3, 2, 7, 6 };
		int[] arr = { 3, 4, 5, 1, 2};

		System.out.println("Input: " + Arrays.toString(arr));
		
		int temp = 0;
		char character1 = ' ';
		char character2 = ' ';
		
		for (int i = 0; i < arr.length; i++) {
			character1 = arr[i] % 2 == 0 ? 'e' : 'o';
			for (int j = 0; j < arr.length; j++) {
				character2 = arr[j]%2 == 0 ? 'e' :'o';
				
				temp = arr[i];
				if (character1 == character2) {
					if (character1 == 'e') {
						if (temp < arr[j]) {
							arr[i] = arr[j];
							arr[j] = temp;
							temp = arr[j];
						}
					} else {
						if (temp > arr[j]) {
							arr[i] = arr[j];
							arr[j] = temp;
							temp = arr[j];
						}
					}
				}
			}
		}

		System.out.println("Output: " + Arrays.toString(arr));

	}

}
