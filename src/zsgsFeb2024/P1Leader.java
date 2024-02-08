package zsgsFeb2024;

public class P1Leader {

	public static void main(String[] args) {
//		int[] arr = { 16, 17, 4, 3, 5, 2 };
//		int[] arr = {1, 2, 3, 4, 0};
		int[] arr = {8, 1, 2, 2, 17, 1, 5, 5};
		
		int k = 0;
		System.out.println(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[k] <= arr[i]) {
				System.out.println(arr[i]);
			}
			k++;
		}
	}

}
