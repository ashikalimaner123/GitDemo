package javaPractice;

public class StringToNumberWithoutParseInt {

	public static void main(String[] args) {
		String g="1234";
		
		int asciizero=(int)'0';
		
		int sum=0;
		
		char[] ht=g.toCharArray();
		
		for(char ch:ht)
		{
			int asciivalue=(int)ch;
			sum=(sum*10)+(asciivalue-asciizero);
		}

		System.out.println(sum);
	}

}
