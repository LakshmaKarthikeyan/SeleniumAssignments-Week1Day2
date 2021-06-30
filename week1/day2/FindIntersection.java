package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a) Declare An array for {3,2,11,4,6,7};
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		// b) Declare another array for {1,2,8,4,9,7};
		int[] arr1 = { 1, 2, 8, 4, 9, 7 };

		// c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr.length - 1; i++) {
			// d) Declare a nested for another array from 0 to array length

			for (int j = 0; j < arr1.length - 1; j++) {
				// e) Compare Both the arrays using a condition statement
				if (arr[i] == arr1[j]) {
					// f) Print the first array (should match item in both arrays)
					System.out.println("Intersecting number is " + arr[i]);

				}
			}

		}

	}

}
