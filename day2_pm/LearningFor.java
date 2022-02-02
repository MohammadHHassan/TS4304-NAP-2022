package day2_pm;

import java.util.Scanner;		// Import Scanner API/library

public class LearningFor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Implement a Scanner class to accept user's input
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();		// Store user's input in variable name (String)
		
		for(int i=1 ; i<=5 ; i++)		// For condition starts from 1, ends at 5, and incremented by 1 each loop
		{
			System.out.println(i + ". " + name);
		}
		
		scanner.close();
	}
}
