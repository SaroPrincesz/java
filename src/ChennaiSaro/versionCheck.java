package ChennaiSaro;

public class versionCheck {

	public static String addLength(String str, int n) {
		for(int i=0; i<n; i++) {
			str += "0";
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String version1 = "1.01";
		System.out.println("version1: " + version1);
		String version2 = "1.1";
		System.out.println("version2: " + version2);

//		int length = version1.length() < version2.length() ? version2.length() : version1.length();
		int addedLength = 0;
		if(version1.length() < version2.length()) {
			addedLength = version2.length() - version1.length();
			version1 = addLength(version1, addedLength);
		}else {
			addedLength = version1.length() - version2.length();
			version2 = addLength(version2, addedLength);
		}	
		
		
		System.out.println("version1: " + version1);
		System.out.println("version2: " + version2);

		
		
		
		
	}

}
