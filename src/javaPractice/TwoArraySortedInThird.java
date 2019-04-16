package javaPractice;

import java.util.Arrays;

public class TwoArraySortedInThird {

	public static void main(String[] args) {
		int a[]=new int[]{20,45,1,34,8,15};
		int b[]=new int[]{6,0,98,135,3};
		int temp=0;
		int c[]=new int[a.length+b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]>b[j])
				{
					temp=b[j];
					b[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		
		
		Arrays.sort(b);
		
		

	}

}



enum ashik
{
	Red(1),blue(2);
	
	int k;
	private ashik(int k)
	{ 
		this.k=k;
		System.out.println("Hi I am in new year");
	}
	
	
	public static void main(String[] args) {
		ashik i=ashik.Red;
		for(ashik k:i.values())
		{
			System.out.println(k);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





