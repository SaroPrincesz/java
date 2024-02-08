package mission4;

public class p2StringLetterCount {

	public static void main(String[] args) {
	
		String str = "aaaabbbcccdde";  // length = 10
		String outStr = "";
		int Ascii = 0;
		int nextAscii = 0;
		
		for(int i=0; i<str.length()-1; i++) 
		{
			if(str.charAt(i) != str.charAt(i+1)) 
			{
				outStr += String.valueOf(str.charAt(i)) + (++Ascii);
				Ascii = 0;
			}else {
				Ascii++;
			}
		}
		outStr += String.valueOf(str.charAt(str.length()-1)) + ++Ascii;
		
		System.out.println("Output: " + outStr);
		
	}

}
