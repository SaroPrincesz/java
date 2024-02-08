package chennaiArunachalam;

public class palindrome {
	
	public static boolean stringPalindrome(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-(i+1))) {
				return false;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "amma";
		boolean bool = stringPalindrome(str);
		System.out.println("output: " + bool);
		
	}

}
