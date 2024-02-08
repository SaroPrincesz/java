package mission13;

public class subString {
	
//isSubstring Method
	public static boolean isSubstring(String str) {
		String[] strArr = str.split(" ");
		int start = 0;
		int secondStart = 0;

		while (secondStart < strArr[1].length()) {
			if(start == strArr[0].length()) break;
			if(strArr[0].charAt(start) == strArr[1].charAt(secondStart)) {
				start++;
				secondStart++;
			}else if(strArr[1].charAt(secondStart) == '*'){	
				secondStart++;						
			}else {
				start++;
			}
		}
		
		if(secondStart == strArr[1].length())
			return true;
		return false;
	}

//Main Method
	public static void main(String[] args) {
//		String str = "Spoon S*oo*";
//		String str = "Zoho *o*o";
		String str = "Subline line";
//		String str = "Spoon Sp*n";
//		String str = "Man n*";
		System.out.println(isSubstring(str));
	}

}
