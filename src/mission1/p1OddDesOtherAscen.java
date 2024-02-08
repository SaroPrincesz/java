package mission1;

public class p1OddDesOtherAscen {
	public static void main(String[] args) {
		int[] arr = {13, 2, 4, 15, 12, 10, 5};
		int ele = 0;
		int index=0;
		for(int i=0; i<arr.length; i++) {
			index=i;
			ele = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(ele > arr[j]) {
					index = j;
				}
			}
			arr[i] = arr[index];
			arr[index] = ele;
		}
	}
}
