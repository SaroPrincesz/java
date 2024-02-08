package mission7;

import java.util.Arrays;

public class p4LeftRotate {
	 public static void main(String[] args) {
		//Single Dimensional Array
		/* //User Input
		        int[] arr = {1, 2, 3, 4, 5};
		        int n=2;
		        for(int j=0; j<n; j++){
		            int temp = arr[arr.length-1];
		                for(int i=arr.length-1; i > 0; i--){
		                    arr[i] = arr[i-1];  
		                } 
		            arr[0] = temp;
		        }
		            
		        System.out.print("output: ");
		        for(int i: arr) System.out.print(i + " "); System.out.println();
		 */

		 //Multi Dimensional Array
		//User Input
//		        int[][] arr = { {1, 2, 3, 4},        
//		                        {5, 6, 7, 8},       
//		                        {9, 10, 11, 12},
//		                        {13, 14, 15, 16}};       
		        int[][] arr = { {1, 2, 3},
		        				{4, 5, 6},
		        				{7, 8, 9}};       
		//Print the input Array:
		   System.out.println("Input: ");
		       for(int i=0; i<arr.length; i++){
		        for(int j=0; j<arr[i].length; j++){
		            System.out.print(arr[i][j] + " ");
		        }
		        System.out.println();
		       }
		       
//		       System.out.println(Arrays.deepToString(arr));

		        int[][] Arr = new int[arr.length][arr[0].length];
		        int k=-1;
		        int l=0;
		        int n=3;

		        for(int m=0; m<n; m++){
		            k=-1; l=0;
		            for(int i=arr.length-1; i>=0; i--){
		                k++; l=0;
		                for(int j=0; j<arr[i].length; j++){
		                    if(m%2==0){
		                        Arr[k][l++] = arr[j][i];
		                    }else{
		                        arr[k][l++] = Arr[j][i];
		                    }
		                }
		            }
		        }

		//Print the Output Array:
		       System.out.println("Output: ");
		            if(n%2==0){
		                // System.out.println("Arr: ");
		                    for(int i=0; i<arr.length; i++){
		                        for(int j=0; j<arr[i].length; j++){
		                            System.out.print(arr[i][j] + " ");
		                        }
		                        System.out.println();
		                    }
		            }else{
		                    // System.out.println("arr: ");
		                    for(int i=0; i<Arr.length; i++){
		                        for(int j=0; j<Arr[i].length; j++){
		                            System.out.print(Arr[i][j] + " ");
		                        }
		                        System.out.println();
		                    }
		            }
		    }
}
