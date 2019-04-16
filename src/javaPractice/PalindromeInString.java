package javaPractice;

public class PalindromeInString {

	public static void main(String[] args) {
		String arr = "ALeveLeer";
		StringBuilder sb = new StringBuilder(), sb1 = new StringBuilder();

		for (int i = 0; i < arr.length(); i++) {
			for (int j = i + 1; j <= arr.length(); j++) {
				sb1 = sb1.append(arr.substring(i, j));
				sb = sb.append(sb1).reverse();
				if (sb1.length() > 1 || sb.length() > 1) {
					if ((sb1.toString()).equals(sb.toString())) {
						System.out.println(sb1 + " is a palindrome");
					}
				}
				sb1.delete(0, j);
				sb.delete(0, j);

			}

		}

	}

}
