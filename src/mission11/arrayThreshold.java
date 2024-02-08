package mission11;

public class arrayThreshold {

	public static int findTheCount(int arrayElement, int threshold) {
		int count = 0;

		if (arrayElement % threshold != 0)
			count++;
		count += arrayElement / threshold;
		System.out.print("ArrayElement: " + arrayElement);
		System.out.println("   Count: " + count);
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 10, 13, 6, 2 };
		int threshold = 3;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count += findTheCount(arr[i], threshold);
		}

		System.out.println("Count: " + count);
	}

}
