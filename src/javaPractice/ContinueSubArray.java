package javaPractice;

public class ContinueSubArray {

	public static void main(String[] args) {
	int a[]=new int[]{1,3,78,67,4};
	int b[]=new int[a.length];
	int sum=0;
	int number=5;
	
	for(int i=0;i<a.length;i++)
	{
		sum=0;
		for(int j=i;j<a.length;j++)
		{
			sum=a[i]+a[j];
			if(sum==number)
			{
				System.out.println("arrays are"+i+ "&&"+j);
			}
		}
	}
	
	

	}

}
