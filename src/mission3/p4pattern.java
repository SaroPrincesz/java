package mission3;

public class p4pattern {

	public static void main(String[] args) {

		
		int n = 4;
		int count = 0;
//		int k = 1;
		
		for(int i=0; i<n*2-1; i++) {
			count = 0;
//			k = 1;
			for(int j=0; j<n; j++) {
				count++;
				if(i<n && count <= i || i>=n && count <= (n*2-2)-i) {
					System.out.print(" ");
				}else {
					System.out.print((j+1) + " ");
				}
			}
			System.out.println();
		}
		
		
	//	Keerthi akka
//		for(int i=1; i<=n*2-1; i++) {
//			for (int j = 1; j <= n ; j++) {
//				if(i<=j || i+j>=n*2 && i != n)
//					System.out.print(j + " ");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

	}

}
