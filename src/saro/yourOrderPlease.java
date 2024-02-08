package saro;

public class yourOrderPlease {
	public static  void main(String[]args) {
//	User Input
		String str = "raj3a I1 saraswa4thi 2am";  //4of Fo1r pe6ople g3ood th5e the2
		System.out.println("User Input: " + str);
//	convert string to string array
		String[] strArr = str.split(" ");
		int[] arr = new int[strArr.length];
//	print the string array
//		for(String i: strArr) System.out.print(i + " "); System.out.println();
		
//	declare the value into the int array
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length(); j++) {
				if(Character.isDigit(strArr[i].charAt(j))) {
					arr[i] = Integer.valueOf(String.valueOf(strArr[i].charAt(j)));
				}
			}
		}
//		print the int array
//			for(int i: arr) System.out.print(i + " "); System.out.println();
	
		int a=0; 
		String temp = "";
		int tempInt=0;
//	Swap the string array
		for(int i=0; i<arr.length;i++) {
			a =  arr[i];
			for(int j=i+1; j<arr.length;j++) {
				if(a > arr[j]) {
					a = arr[j];
					temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
					tempInt = arr[i];arr[i] = arr[j]; arr[j] = tempInt;
				}
			}
		}
		String outStr = String.join(" ", strArr);
		System.out.println("Output: " + outStr);
	}
}
