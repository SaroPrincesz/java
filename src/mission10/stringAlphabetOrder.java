package mission10;

public class stringAlphabetOrder {

	public static void main(String[] args) {
		String str = "rajasaraswathikalimuthu";

		char[] charArr = str.toCharArray();
		int index = 0;

		for (int i = 0; i < charArr.length - 1; i++) {
			index = i;
			for (int j = i; j < charArr.length; j++) {
				if (charArr[index] > charArr[j]) {
					index = j;
				}
			}
			char temp = charArr[i];
			charArr[i] = charArr[index];
			charArr[index] = temp;
		}
		System.out.println(new String(charArr));
	}

}
