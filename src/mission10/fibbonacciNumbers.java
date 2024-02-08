package mission10;

import java.util.Arrays;

public class fibbonacciNumbers {

	public static boolean fibbonacciFind(int a) {
		int InitialFibbonacci = 0;
		int SecondFibbonacci = 1;
		int fibbonacci = 0;
		if (a == InitialFibbonacci || a == SecondFibbonacci) {
			return true;
		}
		while (fibbonacci <= a) {
			if (fibbonacci == a)
				return true;
			fibbonacci = InitialFibbonacci + SecondFibbonacci;
			InitialFibbonacci = SecondFibbonacci;
			SecondFibbonacci = fibbonacci;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {2, 10, 4, 8 };
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (fibbonacciFind(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}

}
