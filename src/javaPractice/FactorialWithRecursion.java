package javaPractice;

public class FactorialWithRecursion {
	
	public static int fac(int n)
	
	{
		if(n==1)
		{
		return 1;	
		}
		
		int k=n*fac(n-1);
		return k;
	}

	public static void main(String[] args) {
	System.out.println(fac(3));

	}

}
