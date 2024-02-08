package mission14;

public class pattern {

	public static void main(String[] args) {
//User Input
		int n = 5;
		int odd = 1;
		int even = 2;
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.println(0 + " ");
				}else if(i<j) {
					System.out.print(even +"  ");
					even += 2;
				}else {
					System.out.print(odd+"  ");
					odd += 2;
				}
			}
			System.out.println();
		}

	}

}
