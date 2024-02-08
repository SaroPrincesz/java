package saro;

public class pattern {
	public static void main(String[] args) {
//	UserInput
		int n = 4;
		int m = n+1;
		
		
//	1 2 3
//	1 2
//	1
//	1 2
//	1 2 3
//		for(int i=0; i<n*2-1; i++) {
//			if(i<=n-1) --m; else ++m;
//				for(int j=1; j<=m; j++) {
//					System.out.print(j);
//				}
//			System.out.println();
//		}
		
//	   1
//	  12
//	 123
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i+1 ; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
