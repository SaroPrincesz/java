package mission2;

import java.util.Arrays;

public class p1StringReverse {
	public static void main(String[] args) {
	//UserInput
		String str = "house no: 123@ cbe";
		String outStr = "";
		
		System.out.println("String: " + str);
		int index = str.length()-1;
		while(index != 0) {
			if(Character.isAlphabetic(str.charAt(index)) || Character.isDigit(str.charAt(index))){
				outStr += str.charAt(index);
				index--;
			}else {
				
			}
		}
		System.out.println("Str: " + outStr);
		
		
		
		
		
	//Convert to Character Array
//		char[] charArr = str.toCharArray();
//	//Print the Character Array for own use
//		//System.out.println(Arrays.toString(charArr));
//		
//		for(int i=0, k=charArr.length-1; i<=k; ) {
//			if((Character.isAlphabetic(charArr[i])|| Character.isDigit(charArr[i])) && 
//					( Character.isAlphabetic(charArr[k]) || Character.isDigit(charArr[k]))) {
//				char temp = charArr[i];
//				charArr[i] = charArr[k];
//				charArr[k] = temp;
//				i++; k--;
//			}else {
//				if(!Character.isAlphabetic(charArr[i]) && !Character.isDigit(charArr[i])) i++; else k--;
//			}
//		}
//		String string = new String(charArr);
//		System.out.println("Output: " + string);
	}
}
