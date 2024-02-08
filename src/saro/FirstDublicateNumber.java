package saro;

public class FirstDublicateNumber {

	public static String checkDublicateNumber(int[] arr, int arrayElement, int k, int count, int length) {
		if (k == length) {
			return "";
		}
		if (arrayElement == arr[k]) {
			return ("" + ++count);
		}
		return ("" + checkDublicateNumber(arr, arrayElement, k++, count, length));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		int count = 0;
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			str = checkDublicateNumber(arr, arr[i], 0, count, arr.length);
			System.out.println("i: " + i + "string: " + str);

		}

	}

}
