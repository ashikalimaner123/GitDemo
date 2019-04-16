package javaPractice;

public class LengthOfStringWithoutUsingFunction {

	public static void main(String[] args) {
		String s="ashikali";
		
		Character ch=s.charAt(0);
		int i=0;
		try
		{
		
		while(ch!=null)
		{
			ch=s.charAt(i);
			i++;
		}
		}catch(StringIndexOutOfBoundsException e)
		
		{
			System.out.println(e.getMessage());
			System.out.println(i);
		}
	}

}
