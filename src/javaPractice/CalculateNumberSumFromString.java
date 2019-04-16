package javaPractice;

public class CalculateNumberSumFromString {
static String k="as12e45t67",temp="";
static int sum=0;
	
	
	public static void main(String[] args) {
	char[] arr=k.toCharArray();
	
	
	
		for(int i=0;i<arr.length;i++)
		{
		if(Character.isDigit(arr[i]))
		{
			temp=temp+(arr[i]);
		}
		else
		{
			if(!(temp.isEmpty()))
			{
				sum=sum+Integer.valueOf(temp);
			}
			temp="";
		}
		
		}
		System.out.println(sum);
	
	
	

	}

}
