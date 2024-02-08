package mission13;

public class pattern {

	public static void main(String[] args) {
	//UserInput
		int n=7;
		
		byte[] arr = {1, 0};
		int index = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(index == arr.length) {
					index = 0;
				}
				System.out.print(arr[index++]);
			}
			System.out.println();
		}
		
	}

}
