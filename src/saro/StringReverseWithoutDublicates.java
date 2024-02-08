package saro;

public class StringReverseWithoutDublicates {
	
	public static String  containsOf(String ans, char i, int n) {
		if(n == ans.length()) {
			return "";
		}else if(ans.charAt(n) == i) {
			return ""+ans.charAt(n);
		}
		return "" + containsOf(ans, i, ++n);
	}

	public static void main(String[] args) {
		String str = "geeks for Geeks";
		String ans = "";
		boolean bool = false;
		int n = 0;
		
		for(int i=str.length()-1; i>=0; i--) {
			n = 0;
			bool = containsOf(ans, str.charAt(i), n).length() == 0 ? true: false;
			if(str.charAt(i) != ' ' && bool){
				ans += str.charAt(i);
			}
		}
		System.out.println("Output: " + ans);
	}

}
