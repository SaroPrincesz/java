package mission9;

import java.util.Arrays;

public class p1VowelRev {

	public static boolean vowel(String s) {
		if(s.equals("a") || s.equals("e") || s.equals("i") ||
				s.equals("o") || s.equals("u") || 
				s.equals("A") || s.equals("E") || s.equals("I") ||
				s.equals("O") || s.equals("U") ) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "you can complete";
		String[] strArr = str.split("");
System.out.println(Arrays.toString(strArr));
		int start = 0;
		int end = strArr.length-1;
		String temp = "";
		while(start <= end) {
			if(!vowel(strArr[start])) {
				start++;
			}
			if(!vowel(strArr[end])) {
				end--;
			}
			if(vowel(strArr[start]) && vowel(strArr[end])) {
				temp = strArr[start];
				strArr[start] = strArr[end];
				strArr[end] = temp;
				start++;
				end--;
			}
		}
System.out.println(Arrays.toString(strArr));

	}

}
