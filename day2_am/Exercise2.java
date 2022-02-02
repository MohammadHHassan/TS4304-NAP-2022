/* Implement a Scanner class
 * Prompt the user to enter their marks
 * If marks>=50 and marks<=100, Pass
 * Else if marks>=0 and marks<50, Fail
 * Else, Invalid marks
 * 
 * Additionally if Pass:
 * If marks>=80, Distinction
 * Else if marks>=65 and marks<80, Merit
 * Else, Just Pass
 */

package day2_am;			// Package name: day2_am

import java.util.Scanner;	// Import Scanner API/library

public class Exercise2		// Class name: Exercise2.java
{
	public static void main(String[] args)		// Main method
	{
		Scanner scanner = new Scanner(System.in);		// Implement a Scanner class to enable user's input
		
		System.out.print("Please enter your marks: ");	// Prompt a message for user to enter their marks
		double marks = scanner.nextDouble();			// Store the marks from user in variable marks (double)
		
		if(marks>=50 && marks<=100)			// Condition if marks is in between 50 and 100 inclusive
		{
			System.out.println("Pass");
			
			if(marks>=80)					// Condition if marks greater than or equal to 80
			{
				System.out.println("Distinction");
			}
			else if(marks>=65 && marks<80)	// Condition if marks if greater than or equal to 65 and less than 80
			{
				System.out.println("Merit");
			}
			else							// Condition if marks less than 65
			{
				System.out.println("Just Pass");
			}
		}
		else if(marks>=0 && marks<50)		// Condition if marks is greater than or equal to 0 or less than 50
		{
			System.out.println("Fail");
		}
		else								// If marks is not in range of 0 to 100
		{
			System.out.println("Invalid marks");
		}
		
		scanner.close();		// Close the scanner class
	}
}
