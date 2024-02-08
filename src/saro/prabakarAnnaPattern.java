package saro;

import java.util.Arrays;

public class prabakarAnnaPattern {

	public static void main(String[] args) {
		int n = 4;
		int num = 0;
		
		for(int i = n; i>0; i--) {
			num += i;
		}
		
//		System.out.println("Num: " + num);
		int[] arr = new int[num];
		
		for(int i = 0; i< num; i++) {
			arr[i] = (i+1);
		}
		int m = n + n-1 + n-2;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i <= j) {
					if(i==j) {
						System.out.print(i+1 + " ");
					}else if(j == n-1){
						System.out.print(n + (n-1) - i + " ");
					}else if(i == 0 && j > 0){
						System.out.print(m-- + " ");
					}else {
						System.out.print("*" + " ");
					}
				}else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
	}

}
