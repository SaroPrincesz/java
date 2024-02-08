package mission3;

import java.util.ArrayList;
import java.util.List;

public class nonRepeatSubString {
	public static void main(String[] args) {
		String string = "ababcabbcde";
		List<String> list = new ArrayList<String>();
		list.add(string);
		String str = "";
		int Ascii = 0;
		int last = 0;
		int len = list.size() <= 1 ? 1 : list.size();
		for(int j=1; j<=len; j++) {
			str = list.get(j-1);
			Ascii = str.charAt(0);
			int first = 0;
			for(int i=1; i<str.length(); i++) {
				if(Ascii == (int)str.charAt(i)) {
					list.add(str.substring(first, i));
					first = i;
				}
			}
			list.add(str.substring(first, str.length()));
			list.remove(list.get(j-1));
		}
		
		
		System.out.println("List: " + list);
	}
}
