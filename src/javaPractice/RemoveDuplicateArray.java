package javaPractice;

public class RemoveDuplicateArray {
	static int brr = 0;

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 1, 1, 2, 3, 5, 6, 5, 1, 3, 2, 6 };
		int count = 0;

		int[] crr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 0) {
				crr[brr] = arr[i];
				brr++;

			}

		}

		for (int j = 0; j < brr; j++) {
			System.out.print(crr[j] + " ");

		}

	}
	
	
	
	

	
	
	
	

}
