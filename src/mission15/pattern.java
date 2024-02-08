package mission15;

public class pattern {

	public static void main(String[] args) {
//User Input
		int n = 5;
		int Ascii = 65;
		
		for(int i=0; i<n; i++) {
			Ascii = 65;
			for(int j=0; j<n*2-1; j++) {
				if(i+j >= n-1 && j-i < n) {
					if(j < n-1) {
						System.out.print((char)Ascii++);
					}else {
						System.out.print((char)Ascii--);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
