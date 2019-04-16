package javaPractice;

public class FibonanciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13
		
		int n=30;
		
		int a=0,b=0,c=1;
		
		while(n>0)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+ c);
			n--;
		}

	}

}
