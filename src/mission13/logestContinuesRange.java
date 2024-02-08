package mission13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class logestContinuesRange {

	public static void main(String[] args) {
//		int[] arr = { 1, 3, 10, 7, 9, 11, 2, 4, 12, 6, 13 };
		int[] arr = {1, 3, 10, 7, 9, 2, 4, 6};
		System.out.println("User Input: " + Arrays.toString(arr));

		List<Integer> list = new ArrayList<Integer>();
//Sorted Integer Array
		int index = 0;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		index = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				if (count == 0)
					list.add(index);
				count++;
			} else {
				list.add(count);
				count = 0;
				index = i + 1;
			}
		}
		list.add(count);
		System.out.println("List: " + list);

		index = list.get(0);
		count = list.get(1);
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 != 0) {
				if (count < list.get(i)) {
					count = list.get(i);
					index = list.get(i - 1);
				}
			}
		}
		for (int i = count; i > -1; i--) {
			System.out.print(arr[index++] + " ");
		}
	}

}
