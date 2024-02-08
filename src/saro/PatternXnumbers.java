package saro;

public class PatternXnumbers {

	public static void main(String[] args) {
	//User Input
		int n = 5;
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if( i==j || i+j == n-1) {
					if(j>n/2) 
						System.out.print(i+1);
					else if(j<=n/2) 
						System.out.print(n-i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		int m=n;
//		int k = n/2;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i==j && i<n/2) {
//					System.out.print(m--);
//				}else if(i==j && i>=n/2) {
//					System.out.print(m++);
//				}else if(i+j == n-1 && i<=n/2){
//					System.out.print(i+1);
//				}else if(i+j == n-1 && i > n/2){
//					System.out.print(k--);
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}

}
