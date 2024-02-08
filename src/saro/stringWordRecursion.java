package saro;

import java.util.ArrayList;
import java.util.List;

public class stringWordRecursion {
	static String stringReverse(List<String> list) {
		if(list.size()==1) {
			return list.get(0);
		}
		return list.remove(list.size()-1)+ " " + stringReverse(list);
	}
	
	public static void main(String[] args) {
	//UserInput
		String str = "One Two Three Four Five Six";
		System.out.println("Input: " + str);
		List<String> list = new ArrayList<String>();
		int k=0, space=0;
		for(int i=0; i<str.length(); i++) {
			if((int)str.charAt(i) == 32) {
				space=i;
				list.add(str.substring(k, i));
				k = i+1;
			}
		}
		list.add(str.substring(space+1, str.length()));
		
		String string = stringReverse(list);
	//Output
		System.out.println("Output: " + string);
	}
}
