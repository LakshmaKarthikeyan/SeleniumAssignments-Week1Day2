package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input as 5
		int input = 5;
		
		// Declare an integer variable fact as 1
		int fact = 1;

		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= input; i++) {

			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact = fact * i;

		}
		
		// Print factorial (fact)
		System.out.println("factorial of "+input+" is "+fact);

	}

}
