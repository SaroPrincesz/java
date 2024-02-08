package saro;

public class AlphabetCount {

	public static String countCharacter(char ch, int count, String str) {
		int Ascii = ch;
		for(int i=0; i<count; i++) {
			if(Ascii == 65) {
				Ascii = 90;
			}else
			Ascii--;
		}
		str+= "" + (char)Ascii + ch + count;
		return str;
	}
	
	public static void main(String[] args) {
		String str = "DNNNNCCCBB";
System.out.println("Input: " + str);
		String string = "";
		int count = 1;
			
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				string = countCharacter(str.charAt(i), count, string);
				count = 1;
			}else {
				count++;
			}
			if(i == str.length()-2) {
				string  = countCharacter(str.charAt(i+1), count, string);
			}
		}
		
		
System.out.println("Output: " + string);
	}

}
