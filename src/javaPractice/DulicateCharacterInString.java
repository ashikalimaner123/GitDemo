package javaPractice;

import java.util.HashSet;

public class DulicateCharacterInString {

	public static void main(String[] args) {
		String s="AshikAAi";
		HashSet<String> map=new HashSet<>();
		char[] chr=s.toCharArray();
		int count=0;
		
		for(int i=0;i<chr.length;i++)
		{
			count=0;
			for(int j=i;j<chr.length;j++)
			{
				if(chr[i]==chr[j])
				{
					count++;
				
					
				}
			}
			System.out.println(map);
		}
	

	}

}
