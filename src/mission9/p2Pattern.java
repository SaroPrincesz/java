package mission9;

public class p2Pattern {

	public static void main(String[] args) {
		String str = "program";
		String string = str.substring(str.length()/2, str.length()) + 
						str.substring(0, str.length()/2); 
		System.out.println("String: " + string);
		
		for(int i=0; i<string.length(); i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(string.substring(j,j+1));
			}
			System.out.println();
		}
		
	}

}
