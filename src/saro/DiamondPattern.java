package saro;

import java.util.Arrays;

public class DiamondPattern {
//	public static int k=1;
//	
//	
//	DiamondPattern(){
//		int k=12;
//	}
//	
//	static int flare() {
//		k=11;
//		return k;
//	}

//	public static int rec(int n) {
//		if(n>6) {
//			return 1;
//		}
//		return n*rec(n+1);
//	}
	
	
	public static void main(String[] args) {
		
		
		char ch = "s";
		System.out.println(ch);
		
		
//		String str = "saro";
//		String[] strArr = str.split("");
//		System.out.println(Arrays.toString(strArr));
//		char[] charArr = new char[strArr.length];
//		for(int i=0; i<strArr.length; i++) {
//			charArr[i] = (char)strArr[i];
//		}
//		System.out.println(Arrays.toString(charArr));
		
		
//		float f = 2.0f;
//		System.out.println(4%-3);
//		
//		
//		switch(f) {
//		case 1.0f: 
//			System.out.println(1.0);
//			break;
//		case 2.0f:
//			System.out.println(2.0);
//			break;
//		default:
//			System.out.println("default");
//		}
		
		
//		flare();
//		new DiamondPattern();
//		System.out.println(k);
		
//		int a = 60;
//		
//		System.out.println(a>>2);
////		a+= 55+ ++a;   //66    a = 5+55+6
//		System.out.println(a);
		
//		a += 55+ a++;    //65   a = 5+55+5;
//		System.out.println(a);
		
//		int val1=9,val2=3;
//		if((val2=1)==val1)
//		{
//			System.out.println(val2++);
//			System.out.println(++val2);
//		}
//		else
//			System.out.println(val2);
		
		
//		int p=20;
//		int q=30;
//		int x = (p--) + (q++) +(p--) + (++q);
//		int y = (q++) + (--p) + (q--) + (p++);
//		System.out.println(x);
//		System.out.println(p);
//		System.out.println(y);
//		System.out.println(q);
	//User Input
//		int n = 5;  //Only enter odd numbers

		/*    *
		 	 ***
		 	*****
		 	 ***
		 	  *        */
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i <= n / 2 && i + j >= n / 2 && j - i <= n / 2) {
//					System.out.print("*");
//				} else if (i > n / 2 && i - j <= n / 2 && i + j <= ((n-1)+(n/2))) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		/*     *
		 	  * *
		 	 * * *
		 	  * *
		 	   *        */
//		for (int i = 0; i < n * 2; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i <= n - 1 && i + j >= n - 1) {
//					System.out.print("* ");
//				} else if (i > n - 1 && i - j <= n) {
//					System.out.print("* ");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

	}

}
