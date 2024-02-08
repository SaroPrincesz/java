package mission9;

import java.util.Arrays;

public class p3Matrics {

	public static void main(String[] args) {
		int[][] arr = { {1, 0, 1},
						{1, 1, 0}, 
						{1, 1, 1}, 
						{1, 0, 1}  };
		int[] intArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				intArr[i] = intArr[i] * 10 + arr[i][j];
			}
		}
		System.out.println(Arrays.toString(intArr));
		
	}

}
