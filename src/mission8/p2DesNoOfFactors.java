package mission8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p2DesNoOfFactors {

	public static void main(String[] args) {
		int[] arr = {6, 8, 2, 11, 5, 1};
		int[] factorCount = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j=1; j<=arr[i]/2; j++) {
				if(arr[i]%j == 0) {
					list.add(j);
				}
			}
			list.add(arr[i]);
System.out.println(arr[i]  + ": " + list);
			factorCount[i] = list.size();
		}
System.out.println("Input: "+Arrays.toString(arr));
System.out.println("Count: "+Arrays.toString(factorCount));
		int temp =0, index = 0;
		for(int i=0; i<arr.length-1; i++) {
			index = i;
			for(int j= i+1; j<arr.length; j++) {
				if(factorCount[index] < factorCount[j]) {
					index = j;
				}
			}
			temp = factorCount[index];
			factorCount[index] = factorCount[i];
			factorCount[i] = temp;
			
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
//System.out.println("factor: "+Arrays.toString(factorCount));
System.out.println("Output: "+Arrays.toString(arr));
	}
	
}
