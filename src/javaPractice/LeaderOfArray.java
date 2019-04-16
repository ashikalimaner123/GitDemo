package javaPractice;

public class LeaderOfArray {

	public static void main(String[] args) {
		int[] arr=new int[]{30, 30, 4, 3, 25, 40}; 
		int temp=0;
		 temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		  
		   if(temp<arr[i])
		   {
			  temp=arr[i]; 
		   }
		}
		System.out.println(temp);

	}

}
