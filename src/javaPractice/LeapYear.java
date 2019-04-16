package javaPractice;

public class LeapYear {

	static int n=2020;
	public static void main(String[] args) {
		boolean s=false;
		
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					s=true;
				}
				else
				{
					s=false;
				}
			}
			else
			{
				s=true;
			}
		}
		else
		{
			s=false;
		}
		
		if(s)
		{
			System.out.println(n+ "is a leap year");
		}
		else
		{
			System.out.println(n+ "is not a leap year");
		}

	}

}
