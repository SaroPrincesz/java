package mission11;

public class pattern {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("n: " + n + "    n/2: " + n / 2);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n / 2 || i + j == 3 * n / 2) {
					System.out.print("*");
				} else if (i - j == n / 2 || j - i == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
