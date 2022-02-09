package day3_pm;

import java.util.Scanner;

public class ExampleFindHighestNumber
{
	static int firstNumber, secondNumber;		// Declare class variables called firstNumber and secondNumber
												// Class variables are recognized by the whole class
	static Scanner scanner = new Scanner(System.in);	// Declaration of scanner for the whole class
	
	public static void main(String[] args)
	{
		askInput();							// Call askInput method
		findAndPrintHighestNumber();		// Call findAndPrintHighestNumber method
	}
	
	public static void askInput()			// Declare void askInput method
	{
		System.out.print("Please enter the first number: ");		// Prompt a message for the user to enter the first number
		firstNumber = scanner.nextInt();		// Store the input in firstNumber class variable
		
		System.out.print("Please enter the second number: ");		// Prompt a message for the user to enter the second number
		secondNumber = scanner.nextInt();		// Store the input in secondNumber class variable
	}
	
	public static void findAndPrintHighestNumber()		// Declare void findAndPrintHighestNumber method
	{
		String text = "The highest number between the two is ";
		
		if(firstNumber>secondNumber)					// If firstNumber is higher than secondNumber
		{
			System.out.println(text + firstNumber);
		}
		else											// If secondNumber is higher than firstNumber or equal to
		{
			System.out.println(text + secondNumber);
		}
	}
}
