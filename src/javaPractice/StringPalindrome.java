package javaPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="rotor",str1 ="";
		
		char[] chr=str.toCharArray();
		
		if(chr[0]==chr[str.length()-1])
		{
		for(int i=chr.length-1;i>=0;i--)
		{
			str1=str1+chr[i];
		}
		if(str1.equals(str))
		{
			System.out.println("string is palindrome");
		}else
		{
			System.out.println("String not palindrome");
		}
		}
	}

}
