package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an int Input and assign a value 13
		int input = 13;

		// Declare a boolean variable flag as false
		boolean output = true;

		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; i++) {

			// Divide the input with each for loop variable and check the remainder
			if (input % i == 0) {
				// Set the flag as true when there is remainder
				output = false;

				// break the iterator
				break;
			}

		}

		// Check the flag (Provide a condition)

		if (output == true) {
			// Print 'Prime' when the condition matches
			System.out.println(input + " is prime");
		} else {
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println(input + " is not a prime");
		}

	}

}
