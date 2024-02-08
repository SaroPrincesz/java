package saro;

public class AlphabetNumber {

	public static String print(char ch, int n, String s) {
		for (int i = 0; i < n; i++) {
			s += ("" + ch);
		}
		return s;
	}

	public static void main(String[] args) {
		String str = "ad1bn000004c03";
System.out.println("Input: " + str);
		char ch = ' ';
		int num = 0;
		String s = "";

		for (int i = 0; i < str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
				s = print(ch, num, s);
				ch = ' ';
				num = 0;
			} else if (Character.isAlphabetic(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
				ch = str.charAt(i);
				num = Integer.valueOf("" + str.charAt(i + 1));
			} else if (Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
				ch = str.charAt(i + 1);
			} else if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
				num = num * 10 + Integer.valueOf("" + str.charAt(i + 1));
			}
			
			if(i == str.length() - 2) {
				s = print(ch, num, s);
			}
		}

System.out.println("Output: " + s);
	}

}
