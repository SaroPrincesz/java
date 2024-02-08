package mission5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p2Array {

	public static void main(String[] args) {
		//int[] arr = {3, 3, 4, 5, 5, 6, 7, 7, 7};
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		
		for(int index = 0; index < list.size()-1; index++) {
//			if(arr[index] == arr[index+1]) {
//				arr[index] = 0;
//			}
			if(list.get(index) == list.get(index+1)) {
				list.add(index, 0);
			}
		}
		System.out.println(list);
		
//		System.out.println(Arrays.toString(arr));Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//			if(i<=strUnique.length()) {
//				arr[i] = 
//			}
//		}
	}

}
