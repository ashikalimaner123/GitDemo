package javaPractice;

public class ArrayRotate {
	
	public static int[] arrayRotateByOne(int arr[],int n)
	{
		int k,j=0;
		int brr[]=arr;
		for(int i=0;i<n;i++)
		{
			k=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=k;
		}
		
		
		return arr;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
		
		arr=ArrayRotate.arrayRotateByOne(arr, 2);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
