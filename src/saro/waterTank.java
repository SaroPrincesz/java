//Trapping Rain Water

package saro;

public class waterTank {

	 public static int waterCapacity(int[] arr, int start, int end) {
			int distance = end - start - 1;
			int howmany = 0;
			for (int i = start + 1; i < end; i++)
				howmany += arr[i];
			int small = arr[start] < arr[end] ? arr[start] : arr[end] ;
			int water = small * distance - howmany;
//		System.out.println("water: " + water);
//			distance = 0;
//			howmany = 0;
		return water;
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 0, 1, 0, 3, 1, 0, 2, 4 };
//		 int[] arr = { 4, 3, 5, 0, 7, 2, 5, 4, 3, 0, 1};
		 int[] arr = {3, 5, 0, 4, 5, 4, 8, 4, 7, 1, 3, 1, 0};
		 
		int	temp = 0;
		int start = 0;
		int end = start+1;
		int h20 =0;
		int index = 0;
		
		while (start < end && end < arr.length) {
			if (arr[start] <= arr[end]) {
				h20 += waterCapacity(arr, start, end);
				start = end;
				end = start + 1;
			} else {
				if (end == arr.length-1) {       
					index = end;
					temp = arr[index];
					for(int i=index; i>start; i--) {
						if(temp < arr[i]) {
							temp = arr[i];
							end = i;
						}
					}
					h20 += waterCapacity(arr, start, end);
					start = (end);
					end = start+1;
				}else {
					end++;
				}		
			}
		}		
		System.out.println("Final water: " + h20);	
	}
}














//Raji
//int leftMax=arr[0];
//Stack<Integer>stack=new Stack<>();
//
//stack.push(arr[arr.length-1]);
//
//for(int i=arr.length-2;i>=2;i--)
//{
//	int temp=Math.max(stack.peek(), arr[i]);
//	stack.push(temp);
//}
//
//int totalWater=0;
//
//for(int i=1;i<arr.length-1;i++)
//{
//	int mimimum=Math.min(leftMax, stack.peek());
//	int temp=mimimum-arr[i];
//	stack.pop();
//	totalWater+=Math.max(0, temp);
//	leftMax=Math.max(leftMax, arr[i]);
//}
//System.out.println(totalWater);

	//Array method using RAJII
//		int leftMax=arr[0];
//		int arr1[]=new int[arr.length-1];
//		arr1[0]=(arr[arr.length-1]);
//		int k=1;
//		for(int i=arr.length-2;i>=2;i--)
//		{
//			int temp=Math.max(arr1[k-1], arr[i]);
//			//stack.push(temp);
//			arr1[k++]=temp;
//			//arr1[0]=arr[i];
//		}
//
//		int totalWater=0;
//		int k1=1;
//		for(int i=1;i<arr.length-1;i++)
//		{
//			int mimimum=Math.min(leftMax, arr1[arr1.length-i]);
//			int temp=mimimum-arr1[i];
//			//k1++;
//			totalWater+=Math.max(0, temp);
//			leftMax=Math.max(leftMax, arr1[i]);
//		}
//		System.out.println(totalWater);
