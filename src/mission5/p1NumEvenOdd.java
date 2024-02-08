package mission5;

public class p1NumEvenOdd {

	public static void main(String[] args) {
		int n= 9;
		int count = 0;
		
		while(n!=1) {
			count++;
			if(n%2==0) {
				n /= 2;
			}else {
				n++;
//				n--;
			}
		}
		System.out.println("Count: " + count);
	}

}
