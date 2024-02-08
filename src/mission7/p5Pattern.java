package mission7;

public class p5Pattern {

	public static void main(String[] args) {
		int n=7;
		int Ascii = 65;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == n/2 || i == n/2) {
					if(j == n/2) {
						if(i==n/2 + 1) Ascii = 65 +i;
						System.out.print((char)Ascii++ + " ");
					}else {	
						if(i==n/2 && j==0) Ascii = 65;
						System.out.print((char)Ascii++ + " ");
 					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
