package saro;

import java.util.*;

public class zohoPattern {
	public static void main(String args[]) {
		int r = 5;
		String str = "kalimuthuchandrakala";
		int len = str.length();
		int c = 0;
		
		while(true) {
			if(len >0) {
				len = len-r;
				c++;
			}else break;
			if(len >0) {
				len = len - (r-2);
				c += r-2;
			}
		}
		
		System.out.println("c: " + c);
		System.out.println("r: " + r);
		char[][] charArr = new char[r][c];
		
		
		int i=0;
		int index = 0;
		
//		for(int j=0; j<c; j++) {
//			for(;;) {
//				if(i==0 && )
//			}
//		}
		
//		while (true) {
//			if (len > 0) {
//				len = len - r;
//		 		c++;
//			} else
//				break;
//			if (len > 0) {
//				len = len - (r - 2);
//				c++;
//			} else
//				break;
//		}
//
//		int i = 0;
//		int index = 0;
//		char[][] charArr = new char[r][c];
//
//		for (int j = 0; j < c; j++) {
//			for (;;) {
//				if (i == 0 && j % 2 != 0 || i == r - 1 && j % 2 != 0) {
//					charArr[i][j] = ' ';
//				} else {
//					if (index < str.length()) {
//						charArr[i][j] = str.charAt(index++);
//					} else
//						charArr[i][j] = ' ';
//				}
//				if (j % 2 == 0) {
//					if (i == (r - 1))
//						break;
//					else
//						i++;
//				} else {
//					if (i == 0)
//						break;
//					else
//						i--;
//				}
//			}
//		}
//
////		System.out.println(Arrays.deepToString(charArr));
//
//		for (int k = 0; k < charArr.length; k++) {
//			for (int j = 0; j < charArr[i].length; j++) {
//				System.out.print(charArr[k][j]);
//			}
//			System.out.println();
//		}

//		int r = 4;
//		String str = "zohoishiringsaro";
//		int c = 0;
//		int count = 0;
//		while (count < str.length()) {
//			count += r + r - 2;
//			if (count <= str.length())
//				c += 1 + r - 2;
//			else
//				c++;
//		}
//
//		int k = 0;
//		System.out.println(c);
//		char arr[][] = new char[r][c];
//		for (int i = 0; i < c; i++) {
//			for (int j = 0; j < r; j++) {
//				if (i % (r - 1) == 0 && k < str.length())
//					arr[j][i] = str.charAt(k++);
//				else if ((i + j) % (r - 1) == 0 && k < str.length())
//					arr[j][i] = str.charAt(k++);
//			}
//		}
//		System.out.println(Arrays.deepToString(arr));
//
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}

	}
}