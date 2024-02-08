package mission12;

public class pattern {
	public static void main(String[] args) {
//User Input
		int n = 3;
//Array
		int len = n * (n + 1);
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		int start = 0;
		int end = arr.length;
		int count = 0;
		int a = arr.length;
		String str ="";
		
		int num = n;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n * 2; j++) {
				if (j < i || i + j >= n * 2) {
					System.out.print("  ");
				} else if (j < n) {
					str = i+j >= n*2-1 ? " " : "*";
					System.out.print(arr[start++] + str);						
				} else {
					if (count == 0) {
						end = a - num--;
						a = end;
					}
					count++;
					str = i+j >= n*2-1 ? " " : "*";
					System.out.print(arr[end++] + str);
				}
			}
			System.out.println();
		}
	}
}
