package mission6;

public class p4Array {

	public static void main(String[] args) {
		int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			count = 0;
			for(int j=0; j<a.length; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count > a.length/2) {
				System.out.println(a[i]);
				break;
			}
		}
		
		System.out.println("No Majority Element");
	}

}
