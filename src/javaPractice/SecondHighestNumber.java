package javaPractice;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int [] arr=new int[]{1,8,67,85,3,5};
		/*Arrays.sort(arr);
		System.out.println(arr[1]);*/
		
		
		int firstHighest=arr[0];
		
		int secondHighest=arr[0];
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length-2;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>firstHighest)
			{
				secondHighest=firstHighest;
				firstHighest=arr[i];	
			}
		}
		System.out.println(firstHighest);
		System.out.println(secondHighest);
		
	}

}
