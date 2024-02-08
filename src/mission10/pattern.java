package mission10;

import java.util.Arrays;

public class pattern {
//Using Array
	public static int[] findBinary(int[] arr, int n, int num) {
		int m = arr.length-1;
		while (num != 0) {
			arr[m--] = num % 2;
			num /= 2;
		}
		return arr;
	}
	
	
//Using String
//	public static String findBinary(int n, int i) {
//		String str = "";
//		if(i==0) {
//			for(int j=0; j<n; j++) {
//				str += "0";
//			}
//			return str;
//		}
//		while(i!=0) {
//			str += i%2;
//			i /= 2;
//		}
//		
//		String revStr = "";
//		int index = str.length()-1;
//		for(int j=1;j<=n; j++) {
//			if(j <= n-str.length()) {
//				revStr += "0"; 
//			}else {
//				revStr += str.charAt(index--);
//			}
//		}
//		
//		return revStr;
//	}

	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[n];

		for (int i = 0; i < Math.pow(2, n); i++) {
		//Using Array
			System.out.println(Arrays.toString(findBinary(arr, n, i)));
			for(int j=0; j<n; j++) {
				arr[j] = 0;
			}
		//Using String
//			System.out.println(findBinary(n, i));
		}

	}

}
