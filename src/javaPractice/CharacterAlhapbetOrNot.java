package javaPractice;

public class CharacterAlhapbetOrNot {
	
	public static void main(String[] args) {
		

		String value="Ashik123ou678dggasgdjasdgsdhdashd14215ty43263526vshshdvsbdzdvdfAS	Q3523RFSDNGFDF";
		String value2 = "";
		
		char[] v=value.toCharArray();
		
		for(int i=0;i<v.length;i++)
		{
			if(!Character.isDigit(v[i]) && !Character.isSpaceChar(v[i]))
			{
			   value2=value2+v[i];
			}
		}
		
		System.out.println(value2);
		
	}
	
	
	

}
