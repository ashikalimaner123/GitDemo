package javaPractice;

public class Pangrams {

	public static void main(String[] args) {
		String a = "The quick brown for jumps over the lxazy dog";

		int index = 0, count = 0;
		boolean[] value = new boolean[26];

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				index = a.charAt(i) - 'A';
				value[index] = true;
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				index = a.charAt(i) - 'a';
				value[index] = true;
			}
		}
		
		
		for(int j=0;j<value.length;j++)
		{
			if(value[j]==true)
			{
				count++;
			}
		}
		 
		if(count==26)
		{
			System.out.println("String is palingram");
		}else
		{
			System.out.println("its not palingrams");
		}
	}

}
