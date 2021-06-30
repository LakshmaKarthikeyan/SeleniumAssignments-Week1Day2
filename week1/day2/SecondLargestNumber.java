package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		// 1) Arrange the array in ascending order
		Arrays.sort(data);

		// 2) Pick the 2nd element from the last and print it

		System.out.println("The second largest number is= " + data[data.length - 2]);
	}

}
