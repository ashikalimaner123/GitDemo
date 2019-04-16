package javaPractice;

public class GCDANDLCM {

	public static void main(String[] args) {

		int n1 = 6, n2 = 8, gcd = 1, lcm;

		for (int i = 1; i < n1 && i < n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		
		
		lcm=n1*n2/gcd;
		System.out.println(lcm);
	}

}
