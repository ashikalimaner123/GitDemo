package javaPractice;

public class BinaryToDecimal {
	static int pow=0;
	static int j,sum=0;
	
	
	public static void converter(int i)
	{
		
		while(i>0)
		{
			j=i%10;
			sum=(int) (sum+(j*Math.pow(2, pow)));
			i=i/10;
			pow++;
			
		}
		
		System.out.println(sum);
		
	}
	
	
	

	public static void main(String[] args) {
	int k=1011;
	converter(k);

	}

}
