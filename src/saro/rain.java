package saro;

public class rain {
	
	public static void main(String[] args) {
	int a[]= {3,5,0,4,5,4,8,4,7,1,3,1,0};
	//int a[]= {0,1,0,2,1,0,1,3,2,1,2,1};
	//	int a[] = {3,5,0,4,5,4,8,4,7,1,3,1,0};
		int value=0;
		int count=0;
		int num=0;
		for(int i=0;i<a.length;i+=count)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				//System.out.println(num++);
				if(a[i]<=a[j])
				{
					System.out.println("i value"+i);
					System.out.println("j value"+j);
					if(i+1==j)				
						count++;
					for(int k=i+1;k<j;k++)
					{
						value+=a[i]-a[k];
					}
					break;
				}
				else
					count++;
			}
		}
		System.out.println(value);

	}

}
