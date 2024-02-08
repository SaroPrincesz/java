package saro;

import java.util.Arrays;

public class policeTheifSuku {
	public static void main(String[] args) {
//		char arr[]= {'T','T','P','P','T','T','P','T','T','P','P','T','P'};
//		char arr[]= {'T', 'T', 'T'};		
//		char arr[]= {'P', 'T'};
//		char arr[]= {'T', 'P', 'P'};
//		char arr[]= {'T', 'P', 'P', 'T'};
//		char arr[]= {'P', 'P', 'T', 'T'};
		char arr[] = { 'P', 'P', 'P', 'T', 'T', 'T' };
		int count = 0, police = 0, n = arr.length - 1;
		while (police <= n) {
			if (arr[police] == 'P') {
				if (police == 0) {
					if (police + 2 <= n && arr[police + 2] == 'T') {
						arr[police + 2] = 'X';
						count++;
					} else if (police + 1 <= n && arr[police + 1] == 'T') {
						arr[police + 1] = 'X';
						count++;
					}
				} else if (police - 2 >= 0 && arr[police - 2] == 'T') {
					arr[police - 2] = 'X';
					count++;
				} else if (police + 2 <= n && arr[police + 2] == 'T') {
					arr[police + 2] = 'X';
					count++;
				} else if (police - 1 >= 0 && arr[police - 1] == 'T') {
					arr[police - 1] = 'X';
					count++;
				} else if (police + 1 <= n && arr[police + 1] == 'T') {
					arr[police + 1] = 'X';
					count++;
				} else if (police == n) {
					if(police - 2 >= 0 && arr[police - 2] == 'T') {
						arr[police - 2] = 'X';
						count++;
					}else if (police - 1 >= 0 && arr[police - 1] == 'T') {
						arr[police - 1] = 'X';
						count++;
					} 
				}
			}

			police++;
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
	}

}

//package saro;
//
//import java.util.Arrays;
//
//public class policeTheifSuku {
//	public static void main(String[] args) {
//		char arr[]= {'T','T','P','P','T','T','P','T','T','P','P','T','P'};
//		
////		char arr[]= {'P', 'P', 'P', 'T', 'T', 'T'};
//		
//		int count=0, police=0, n=arr.length-1;
//		
//		while(police <= n) {
//			
//			if(arr[police]=='P') {
//				if(police==0)
//				{
//					if(arr[police+1]=='T')
//					{
//						arr[police+1]='X';
//						count++;
//					}else if(police+2<=n && arr[police+2]=='T') {
//						arr[police+2]='X';
//						count++;
//					}
//				}else if(arr[police-1]=='T' && police+1<=n && arr[police+1]=='T') {
//					arr[police-1]='X';
//					count++;
//				}else if(arr[police-1]=='T' && police+1<=n && arr[police+1]=='P') {
//					if(police-2>0 && arr[police-2]=='T') {
//						arr[police-2]='X';
//						count++;	
//					}
//					else if(police+2<=n && arr[police+2]=='T') {
//						arr[police+2]='X';
//						count++;	
//					}
//				}else if(arr[police-1]=='P' && police-2>0 && arr[police-2]=='T') {
//					arr[police-2]='X';
//					count++;
//				}else if(arr[police-1]=='P' && police-2>0 && arr[police-2]=='P') {
//					if(police+1<=n && arr[police+1]=='T') {
//						count++;
//						arr[police+1]='X';
//					}else if(police+2<=n && arr[police+2]=='T') {
//						count++;
//						arr[police+2]='X';
//					}
//				}
//				else if(police==n) {
//					if(arr[police-1]=='T')
//					{
//						arr[police-1]='X';
//						count++;
//					}else if(police-2>0 && arr[police-2]=='T') {
//						arr[police-2]='X';
//						count++;
//					}
//				}		
//			}
//			police++;
//		}
//		System.out.println(count);
//		System.out.println(Arrays.toString(arr));
//	}
//
//}
