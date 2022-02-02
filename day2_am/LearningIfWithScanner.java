package day2_am;

import java.util.Scanner;

public class LearningIfWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Implement a Scanner class to accept user's input
		
		System.out.print("Please enter a value between 5 and 10: ");
		int a = scanner.nextInt();
		
		if(a>=5 && a<=10)		// The condition if a is in between 5 and 10 inclusive
		{
			System.out.println("The value is within the range.");
		}
		else
		{
			System.out.println("The value is NOT in range.");
		}
		
		scanner.close();		// Close the scanner class
	}
}
