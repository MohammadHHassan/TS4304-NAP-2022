package day1_pm;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter their name and age
 * Store the input in two separate variables
 * Print out the name and age
 * 
 * Additionally, use try/catch block to prevent an
 * error when a wrong input is given for the age.
 */

public class Exercise3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("How old are you? ");
		try
		{
			int age = scanner.nextInt();
			System.out.println("You are " + age + " years old.");
		}
		catch (Exception e)
		{
			System.out.println("Wrong input");
		}
		
		scanner.close();
	}
}