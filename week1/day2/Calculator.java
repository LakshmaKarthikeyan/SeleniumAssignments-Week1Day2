package week1.day2;

public class Calculator {

	public int add(int firstNumber, int secondNumber)

	{
		int sum = firstNumber + secondNumber;
		return sum;

	}

	public double sub(double firstNumber, double secondNumber)

	{
		double remaining = firstNumber - secondNumber;
		return remaining;

	}

	public double mul(double firstNumber, double secondNumber)

	{
		double product = firstNumber * secondNumber;
		return product;

	}

	public int div(int firstNumber, int secondNumber)

	{
		int quotient = firstNumber / secondNumber;
		return quotient;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();

		System.out.println("Result of addition=" + calc.add(5, 10));
		System.out.println("Result of subtraction=" + calc.sub(17.987654321, 15.876543));
		System.out.println("Result of multiplication=" + calc.mul(17.987654321, 15.876543));
		System.out.println("Result of division=" + calc.div(21, 5));

	}

}
