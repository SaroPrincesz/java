package saro;

public class alterCharacter {

	public static void main(String[] args) {
		String str1= "raja";
		String str2 = "saraswathi";
		String str3 = "";
		int len = str1.length() < str2.length() ?
				str2.length() : str1.length();
		
		int s1=str1.length();
		int s2=str2.length();
		
			
			int index=0; 
			for(int i=0; i<len; i++) {
				index = s1 < s2 ? s1 : s2;
				if(index > i) {
						str3 += str1.charAt(i) + "" + str2.charAt(i);
				}else{
					if(s1<s2) {
						str3 += str2.charAt(i);
					}else {
						str3 += str1.charAt(i);
					}
				}
			}
			System.out.println("output: " + str3);
	}

}
