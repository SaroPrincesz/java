package mission6;

public class p2EvilNumber {

	public static void main(String[] args) {
		int n = 23;
		int count = 0;
		int remainder = 0;
		while(n != 0) {
			remainder = n%2;
			if(remainder == 1) count++;
			n /= 2;
		}
		if(count%2==0) {
			System.out.println("Evil Number");
		}else {
			System.out.println("Odious Number");
		}
	}

}
