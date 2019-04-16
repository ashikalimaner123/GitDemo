package javaPractice;

public class FindMissingNumberArray {

	public static void main(String[] args) {
		
		int[] a=new int[]{2,3,4,6,7};
		int sum=0,sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		}
		
		System.out.println(sum);
		
		for(int i=2;i<8;i++)
		{
			sum1=sum1+i;
		}
		
		System.out.println(sum1-sum);
			

	}

}
