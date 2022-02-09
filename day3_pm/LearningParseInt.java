package day3_pm;

import java.util.Scanner;		// Import Scanner API

public class LearningParseInt
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Declaration of Scanner class to enable user's input
		
		System.out.print("Please enter a number: ");	// Prompt a message for the user to enter a number
		String a = scanner.nextLine();				// Store the input in String a
		System.out.println("String a = " + a);
		
		System.out.println("a+10 = " + (a+10));		// a+10 = 1510 because 15 is a String and not an integer
		
		int b = Integer.parseInt(a);				// Convert String a into Integer b
		System.out.println("b+10 = " + (b+10));		// b+10 = 25 because b is an Integer
		
		scanner.close();							// Close the Scanner class
	}
}
