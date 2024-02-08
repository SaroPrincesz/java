package mission7;

public class p3StrToInt {

	public static void main(String[] args) {
		String str = "a1236.7";
		int num = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.println(-1);
				break;
			}
		}
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				num = num *10 + Integer.parseInt(""+str.charAt(i));
			}else if(str.charAt(i) == '.'){
				break;
			}
		}
		
		System.out.println("Num: " + num);
		
		
		
	}

}
