package saro;
import java.util.Arrays;

public class mergingSortedArray {
	public static void main(String[] args) {
		int[] first = { 1, 3, 5 };
		int[] second = { 2, 4, 6 };
//Print the First Array
		System.out.print("First: ");for(int a: first) System.out.print(a + " "); System.out.println();
//Print the Second Array	   
		System.out.print("Second: ");for(int b: second) System.out.print(b + " "); System.out.println();
//	    int len = first.length+second.length;
//	    System.out.println("Length: "+len);
	    int[] arr = new int[first.length+second.length];
	    for(int i=0; i<first.length; i++) arr[i] = first[i];
	    for(int j=first.length; j<first.length+second.length; j++) arr[j] = second[j-first.length];
	    Arrays.sort(arr);
//Print the merged Array
	    System.out.print("Merged Array: ");for(int a: arr) System.out.print(a + " ");System.out.println();
	    int count=0;
	    for(int i=0; i<arr.length-1; i++){
	      if(arr[i]==arr[i+1]){
	        arr[i] = -1;
	      }
	      if(arr[i]==-1){
	        count++;
	      }
	    }
	    System.out.println("count: "+count);
	    int[] arr1 = new int[arr.length-count];
	    
	    int k=0;
	    for(int i=0; i<arr.length-1; i++){
	      if(!(arr[i]==arr[i+1])){
	        arr1[k]=arr[i];
	        k++;
	      }
	    }
	    System.out.print("Output Array: "); for(int a: arr1) System.out.print(a + " ");
	}
}
