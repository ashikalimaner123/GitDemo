package javaPractice;

public class Anagrams {
  static int count;
	static int count1;
	public static void main(String[] args) {
		
		String arr = "silen";
		String brr = "listee";

		char[] arr1 = arr.toCharArray();
		char[] brr1 = brr.toCharArray();

		if (arr.length() == brr.length()) {

			for (int i = 0; i < arr.length(); i++) {
				count = 0;
				count1 = 0;
				for (int j = 0; j < brr.length(); j++) {
					if (arr1[i] == brr1[j]) {
						count = 1;
					}

				}
				for (int j = 0; j < brr.length(); j++) {
					if (brr1[i] == arr1[j]) {
						count1 = 1;
					}
				}

				if (count == 0 || count1 == 0) {
					System.out.println("Both Strings are not anagrams");
					break;
				}

			}
			if(count==1 && count1==1)
			{
				System.out.println("Both Strings are  anagrams");
			}

		}

	}

}
