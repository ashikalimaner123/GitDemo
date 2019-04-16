package javaPractice;

import java.util.Arrays;

public class ShiftingOfZerosToRightSide {

	public static void main(String[] args) {
		int[] arr=new int[]{1,0,3,0,0,5,0,9,0};
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>arr.length/2;j--)
			{
				if(arr[i]==0)
				{
					if(arr[j]!=0)
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
