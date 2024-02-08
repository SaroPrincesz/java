package mission6;

public class p3CountRevPowInteger {

	public static void main(String[] args) {
		
		int number = 2345;
		int base = 5;
		int exp = 3;
		int temp = number;
		int count = 0;
		int reverseInteger = 0;
		int remainder = 0;
		
		while(temp != 0) {
			remainder = temp%10;
			reverseInteger = reverseInteger * 10 + remainder;
			count++;
			temp /= 10;
		}
		System.out.println("Count: " + count);
		count = 0;
		temp = 1;
		while(count < exp) {
			temp = temp * base;
			count++;
		}
		System.out.println("Reverse Integer: " + reverseInteger);
		System.out.println("Power: " + temp);
		
	}

}
