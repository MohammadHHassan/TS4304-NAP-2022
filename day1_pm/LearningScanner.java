package day1_pm;

import java.util.Scanner;	// Import Scanner API/Library

public class LearningScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Declare scanner class
		
		System.out.print("Please enter your first name: ");
		String a = scanner.nextLine();
		
		System.out.print("Please enter your last name: ");
		String b = scanner.nextLine();
		
		System.out.println("Your full name is " + a + " bin " + b);
		
		scanner.close();	// Optional to close scanner class
	}
}
