package mission6;

public class p1StringSwap {

	public static void main(String[] args) {
		String str = "Saro";
		String s = "";
		
		for(int i=0; i<str.length(); i+=2) {
			if(i != str.length()-1) {
				s += str.charAt(i+1) + "" + str.charAt(i);
				
			}else {
				s += str.charAt(i);
			}
		}
		System.out.println("String: " + s);
	}

}
