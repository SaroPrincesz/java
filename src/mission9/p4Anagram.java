package mission9;

import java.util.Arrays;

public class p4Anagram {

	public static void main(String[] args) {
		String[] str = {"catch", "got", "tiger", "mat", "eat", "pat", "tea"};
		String word = "ate";
		int count=0;
		
		for(int i=0; i<str.length; i++) {
			count = 0;
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<str[i].length(); k++) {
					if(word.charAt(j) == str[i].charAt(k)) {
						count++;
					}
				}
			}
			if(count  == word.length()) {
				System.out.println(str[i]);
			}
		}
		System.out.println(Arrays.toString(str));
		
		
		
	}

}
