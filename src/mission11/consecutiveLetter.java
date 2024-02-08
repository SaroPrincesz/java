package mission11;

import java.util.Arrays;

public class consecutiveLetter {

	public static void main(String[] args) {
//		String str = "geeksforgeeks";
		String str = "geegsforgeeeks";
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		int k = 3;
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (charArr[i] != ' ' && charArr[i + 1] != ' '
					&& charArr[i] == charArr[i + 1]) { 
				count++;
				System.out.println(charArr[i] + " " + charArr[i+1] + " " + count);
			}
			if (count == k - 1) {
				charArr[i] = ' ';
				charArr[i + 1] = ' ';
				count = 0;
				if((i-1) >= 0 && (i+2) <= charArr.length-1) {
					if(charArr[i-1] != ' ' && charArr[i+2] != ' ' &&
							charArr[i-1] == charArr[i+2]) {
						count++;
						System.out.println(charArr[i] + " " + charArr[i+1] + " " + count);
					}
					if(count == k-1) {
						charArr[i-1] = ' ';
						charArr[i+2] = ' ';
						count = 0;
					}
				}
			}
		}

		System.out.println(Arrays.toString(charArr));

	}

}
