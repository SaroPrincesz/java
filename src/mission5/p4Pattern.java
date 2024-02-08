package mission5;

public class p4Pattern {

	public static void main(String[] args) {
		int n=4;
		for(int i=0; i<n*2-1; i++) {
			for(int j=0; j<n*2-1; j++) {
				if(i==j || i+j==n*2-2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
