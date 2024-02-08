package saro;

import java.util.Arrays;

public class rotateArraySakthi {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int rotate =3;
		
		int[] array = new int[arr.length];
		int index = rotate>arr.length ? arr.length - rotate % arr.length:
									arr.length-rotate;
				
		for(int i=0; i<arr.length; i++) {
			if(index == arr.length) index=0;
			array[i] = arr[index++];
		}
		
		System.out.println(Arrays.toString(array));
		

	}

}
