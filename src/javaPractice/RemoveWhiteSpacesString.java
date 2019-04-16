package javaPractice;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr="I am ashikali Maner";
		
		char[] crr=arr.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]!=' ')
			{
				sb.append(Character.toString(crr[i]));
			}
		}
		
		System.out.println(sb);

	}

}
