package mission10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Insert0AfterConsecutive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Number of Bits: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter the " + (i + 1) + "Element");
//			arr[i] = sc.nextInt();
//		}
		int[] arr = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};

		System.out.println("consecutive K: ");		
		int k = sc.nextInt();
		System.out.println("Array: " + Arrays.toString(arr));
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
				list.add(arr[i]);
				if (count == k) {
					list.add(i-1, 0);;
					count = 0;
				}
			} else {
				if (count == k) {
					list.add(i-1,0);
					count = 0;
				}
				list.add(arr[i]);
			}
			System.out.println("list: " + list);
		}
System.out.println("List: " +  list);
	}

}
