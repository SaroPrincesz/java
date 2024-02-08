package mission12;

import java.util.Arrays;

public class inversionCount {

	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1 }; //{5, 4, 3, 2, 1}, {2, 3, 4, 5, 6}, {2, 4, 1, 3, 5};
		
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}

		}
		System.out.println("count: " + count);
	}

}
