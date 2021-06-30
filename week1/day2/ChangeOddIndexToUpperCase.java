package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Declare String Input as Follow

		String test = "changeme";
		String modified = "";

		// a) Convert the String to character array

		char[] arr = test.toCharArray();

		// b) Traverse through each character (using loop)

		for (int i = 0; i <= arr.length - 1; i++) {

			// c)find the odd index within the loop (use mod operator)

			if (i % 2 != 0) {
				
				// d)within the loop, change the character to uppercase, if the index is odd else don't change
				arr[i] = Character.toUpperCase(arr[i]);

			}

			modified = modified + arr[i];
		}

		System.out.println(modified);

	}
}
