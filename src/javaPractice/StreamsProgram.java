package javaPractice;

import java.util.Arrays;
import java.util.List;

import javax.jws.soap.SOAPBinding;

public class StreamsProgram {

	public static void main(String[] args) {
		String arr = "silent";
		String brr = "listen";		
		
		char[] rte=arr.toLowerCase().toCharArray();
		char[] etr=brr.toLowerCase().toCharArray();
		
		Arrays.sort(rte);
		Arrays.sort(etr);
		
	boolean t=	Arrays.equals(rte, etr);
		
		if(t)
		{
			System.out.println("Anagrams ");
		}else
		{
			System.out.println("NN");
		}
	}

}
