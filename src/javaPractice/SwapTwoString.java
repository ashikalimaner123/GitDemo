package javaPractice;

public class SwapTwoString {

	public static void main(String[] args) {
		String s="ashik";
		String d="maner";
		
		s=s+d;
		d=s.substring(0, s.length()-d.length());
		System.out.println(d);
		
		s=s.substring(s.length()-d.length(),s.length());
		
		System.out.println(s);
		
	}

}
