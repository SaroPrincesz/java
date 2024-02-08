package ChennaiSaro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class groupofAnagram {

	public static void main(String[] args) {
		String[] strArr = {"eat", "top", "ate", "bat", "pot", "tea"};
	
		List<List> list = new ArrayList<>();
		int count = 0;
		
		loop1:
		for(int i=0; i<strArr.length; i++) {
			System.out.println(Arrays.toString(strArr));
			if(strArr[i] == null) i++;
			List<String> strList = new ArrayList<String>();
			loop2:
			for(int j=0; j<strArr.length; j++) {
				if(strArr[j] == null) j++;
				if(strArr[i] == null) i++;
				count = 0;
				loop3:
				for(int k=0; k<strArr[i].length(); k++) {
					loop4:
					for(int l=0; l<strArr[j].length(); l++) {
						if(strArr[j] == null) {
							j++;
							continue loop2;
						}
						if(strArr[i].charAt(k) == strArr[j].charAt(l)) { //strArr[i] != null && strArr[j] != null &&
							count++;
							strArr[j] = null;
						}
					}
					strArr[i] = null;
				}
//				System.out.println("strarr: " + strArr);
				if(count == strArr[j].length()) {
					strList.add(strArr[j]);
				}
			}
			Collections.sort(strList);
			list.add(strList);
		}
		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if(list.get(i) == list.get(j)) list.remove(j);
			}
		}
		
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;i++) {
				if(list.get(j).size()>list.get(j+1).size()) {
					List<String> l = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, l);
				}
			}
			
		}
		System.out.println("list: " + list);
	}

}



//package ChennaiSaro;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class groupofAnagram {
//
//	public static void main(String[] args) {
//		String[] strArr = {"eat", "top", "ate", "bat", "pot", "tea"};
//	
//		List<List> list = new ArrayList<>();
//		int count = 0;
//		
//		for(int i=0; i<strArr.length; i++) {
//			List<String> strList = new ArrayList<String>();
//			for(int j=0; j<strArr.length; j++) {
//				count = 0;
//				for(int k=0; k<strArr[i].length(); k++) {
//					for(int l=0; l<strArr[j].length(); l++) {
//						if(strArr[i].charAt(k) == strArr[j].charAt(l)) { //strArr[i] != null && strArr[j] != null &&
//							count++;
////							strArr[j] = null;
//						}
//					}
////					strArr[i] = null;
//				}
////				System.out.println("strarr: " + strArr);
//				if(count == strArr[j].length()) {
//					strList.add(strArr[j]);
//				}
//			}
//			Collections.sort(strList);
//			list.add(strList);
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			for(int j=0; j<list.size(); j++) {
//				if(list.get(i) == list.get(j)) list.remove(j);
//			}
//		}
//		
//		for(int i=0;i<list.size()-1;i++) {
//			for(int j=0;j<list.size()-i-1;i++) {
//				if(list.get(j).size()>list.get(j+1).size()) {
//					List<String> l = list.get(j);
//					list.set(j, list.get(j+1));
//					list.set(j+1, l);
//				}
//			}
//			
//		}
//		System.out.println("list: " + list);
//	}
//
//}



