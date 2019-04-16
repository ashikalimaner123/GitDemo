package javaPractice;

public class SecondLargestWithoutSwappingNSorrting {

	public static void main(String[] args) {
		int arr[]=new int[]{2,4,6,7,8,9};
		int largestElement=0,secondLargest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largestElement)
			{
				largestElement=arr[i];
			}
		}
		
		int[] brr=arr;
		
		for(int j=0;j<brr.length;j++)
		{
			brr[j]=largestElement-brr[j];
		}
		secondLargest=brr[0];
		
		for(int k=0;k<brr.length;k++)
		{
			if(brr[k]<secondLargest && brr[k]!=0){
				secondLargest=brr[k];
			}
		}
		
		System.out.println(largestElement-secondLargest);
		
		

	}

}
