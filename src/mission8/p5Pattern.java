package mission8;

public class p5Pattern {

	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		int p = 0;
		int m = 0;

		for (int i = 0; i < n * 2; i++) {

			for (int j = 0; j < n * 2; j++) {
//				p = i < n ? i : (i - k) ;
				if(i<n) {
					p = i;
				}else {
					p = i-k;
				}
				if(j<n) {
					m = j;
				}else {
					m = j-k;
					k+=2;
				}
////	System.out.print("p: " + p);
//				m = j < n ? j : (j - k);
//	System.out.print("m: " + m);

				if (p == 0 || m == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}
	}

}
