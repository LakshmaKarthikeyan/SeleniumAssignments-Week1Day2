package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String
		String text1 = "stops";

		// Declare another String
		String text2 = "potss";
		boolean compare = false;

		// a) Check length of the strings are same then (Use A Condition)

		if (text1.length() == text2.length()) {

			// b) Convert both Strings in to characters

			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();

			// c) Sort Both the arrays
			Arrays.sort(char1);
			Arrays.sort(char2);

			// d) Check both the arrays has same value
			compare = Arrays.equals(char1, char2);
			if (compare == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		} else {
			System.out.println("Not anagram");
		}

	}

}
