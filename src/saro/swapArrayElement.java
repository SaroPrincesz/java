package saro;

public class swapArrayElement {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 8, 0, 4, 7, 0, 1, 9, 5, 0, 0};
		int nonZero=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i]; 
				arr[i] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
		}
//		int index=0;
//		int i=0; 
//		while(index<arr.length) {
//			if(i==arr.length) {
//				arr[index++] = 0;
//			}else {
//				if(arr[i] != 0) {
//					arr[index++] = arr[i];
//					i++;
//				}
//			}
//		}
//		
//		for(int a: arr)System.out.print(a + " "); System.out.println();
	}
}
