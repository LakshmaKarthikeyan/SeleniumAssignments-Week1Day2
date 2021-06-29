package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize 3 int variables
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;

		// Print first number and second number
		System.out.println(firstNumber);
		System.out.println(secondNumber);
        
		//range = 8
		for (int i = 1; i <= 8; i++) {

			// add first and second number assign to sum
			sum = firstNumber + secondNumber;

			// Assign second number to the first number

			firstNumber = secondNumber;

			// Assign sum to the second number
			secondNumber = sum;

			// print sum
			System.out.println(sum);

		}

	}

}
