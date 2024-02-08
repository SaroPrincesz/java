package mission8;

import java.util.Arrays;

public class p1RemoveUnbalancedParentheses {

	public static void main(String[] args) {
		String str = "(a))))"; //"(ab)))))" , "((ab)((bc))"
		int start = 0;
		int end = start+1;
		String[] strArr = str.split("");
		///.System.out.println(Arrays.toString(strArr));
		
		while(end < strArr.length) {
			if(strArr[start].equals("(")) {
					while(end < strArr.length && !strArr[end].equals(")")) {
						end++;
					}
					strArr[start] = "$";
					if(end < strArr.length) {
						strArr[end] = "#";
					}else {
						strArr[start] = "(";
					}
			}
			start++;
			if(end == strArr.length-1|| start >= strArr.length-1) break;
			System.out.println("Start: " + start);
			System.out.println("End: " + end);
		}
		
		System.out.println(Arrays.toString(strArr));
		String string = "";
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].equals("$")) {
				string += "(";
			}else if(strArr[i].equals("#")) {
				string += ")";
			}else if(strArr[i].equals("(") || strArr[i].equals(")")){
				string += "";
			}else {
				string += strArr[i];
			}
		}
		System.out.println(Arrays.toString(strArr));
		System.out.println("Output: " + string);
	}

}
