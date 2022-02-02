package day2_am;				// Package name: day2_am

import java.util.Scanner;		// Import Scanner API/library

public class LearningNestedIf	// Class name: LearningNestedIf.java
{
	public static void main(String[] args)				// Main method
	{
		Scanner scanner = new Scanner(System.in);		// Implement a Scanner class to accept user's input
		
		System.out.print("Please enter your age: ");	// Prompt a message for user to enter their age
		int age = scanner.nextInt();					// Store user's input in age (int)
		
		if(age>0)		// The condition if age is greater than 0
		{
			System.out.println("Valid age.");
			
			if(age<12)						// age less than 12
			{
				System.out.println("Children.");
			}
			else if(age>=12 && age<18)		// age greater than or equal to 12 and less than 18
			{
				System.out.println("Teenager.");
			}
			else							// age greater than or equal to 18
			{
				System.out.println("Adult.");
			}
		}
		else		// age is less than 0
		{
			System.out.println("Invalid age.");
		}
		
		scanner.close();
	}
}
