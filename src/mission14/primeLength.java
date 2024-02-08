package mission14;

import java.util.Arrays;

public class primeLength {

	public static void main(String[] args) {
//User Input
		String str = "this is a java programming language";
		System.out.println("Input: " + str);
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = strArr[i].length();
		}

		int count = 0;
		for (int i = 0; i < intArr.length; i++) {
			count = 0;
			for (int j = 1; j <= intArr[i] / 2; j++) {
				if (intArr[i] % j == 0) {
					count++;
				}
			}
			count++;
			if (count == 2) {
				System.out.println(strArr[i]);
			}
		}
	}

}
