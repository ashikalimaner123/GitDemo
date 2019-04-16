package javaPractice;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 1011;
		int count = 2, s = 0;
		int j;
		j = n / 2;
		while (j > 0) {

			if (n % count == 0) {
				System.out.println(n + " is not prime");
				s++;
				break;
			}
			count++;
			j--;
		}
		if (s == 0) {
			System.out.println(n + " is a prime number");
		}

	}

}
