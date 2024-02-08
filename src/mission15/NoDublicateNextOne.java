package mission15;

import java.util.ArrayList;

public class NoDublicateNextOne {

	public static void main(String[] args) {
		String str = "javac2a232";
		System.out.println("Input: " + str);
		ArrayList<Character> listStr = new ArrayList<Character>();
		
		for(int i=0; i<str.length(); i++) {
			listStr.add(str.charAt(i));
		}
				
//		System.out.println("List: " + listStr);
		
		char temp = ' ';
		int count = 0;
		for(int i=0; i<listStr.size(); i++) {
			temp = listStr.get(i);
			count = 0;
			for(int j=0; j<listStr.size(); j++) {
				if(temp == listStr.get(j)) {
					count++;
					if(count == 2) {
						System.out.println(temp+ "  " + j);
						listStr.set(j, ++temp);
//						System.out.println("list: " + listStr);
						break;
					}
				}
			}
		}
		System.out.println("Output: " + listStr);
	}

}
