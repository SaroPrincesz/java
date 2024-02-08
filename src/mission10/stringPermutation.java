package mission10;

public class stringPermutation {

	public static void findAllPermutation(String str, String temp) {
		if(str.length() == 0) {
			 System.out.println(temp + " ");
			 return;
		}else {
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				String subStr = str.substring(0, i) + str.substring(i+1);
				findAllPermutation(subStr, (temp+ch));
			}
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		findAllPermutation(str, "");
	}

}




//package mission10;
//
//public class stringPermutation {
//
//	public static String findAllPermutation(String originalStr, String string, String first, String str) {
////		System.out.println("Original String : " + originalStr);
//		System.out.println(string);
////		System.out.println("first Char : " + first);
////		System.out.println("subString : " + str);
//
//		String s = "";
//	
//		if(str.length() == 2) {
//			s = first + ("" + str.charAt(1)+str.charAt(0));
//			if(s.length() == originalStr.length()) 
//				System.out.println(s);
//			else
//			return str;
//		}
//		return ""; // + findAllPermutation(originalstr, str);
//	}
//
//	public static void main(String[] args) {
//		String str = "catsn";
//		String[] strArr = str.split("");
//		String subString = "";
//
//		if (strArr.length == 0) {
//			System.out.println(" ");
//		} else if (strArr.length == 1) {
//			System.out.println(str);
//		} else if (strArr.length == 2) {
//			System.out.println(str + "  " + ("" + str.charAt(1) + str.charAt(0)));
//		} else
//			for (int i = 0; i < strArr.length; i++) {
//				subString = ((strArr[i]) + (str.substring(0, i) + str.substring(i + 1)));
//
//				System.out.print(findAllPermutation(str, subString, strArr[i], 
//						(str.substring(0, i) + str.substring(i + 1))));
//			}
//
//	}
//
//}
