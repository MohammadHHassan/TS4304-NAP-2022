package day7_am.datastructures;

import java.util.ArrayList;		// Import Array List class API
import java.util.Scanner;		// Import Scanner class API

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class to enable user's input
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();		// Declaration of ArrayList
		
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));		// Generate random number between 1-10
		System.out.println("A random number (1-10) has been generated.\n");
		
		while(true)								// Forever loop
		{
			System.out.print("Please enter your guess: ");		// Prompt a message for the user to enter their guess
			int guess = scanner.nextInt();		// Store user's input in guess
			
			if(guess == randomNumber)			// If the user entered the correct guess
			{
				System.out.println("Lurus");
				break;							// Break out from forever loop
			}
			else
			{
				for(int i=0 ; i<guessedNumber.size() ; i++)		// Check each element of the array
				{
					if(guessedNumber.get(i) == guess)			// If the number has already been guessed before
					{
						System.out.println("Sudah Teka\n");
						break;					// Break out from for loop
					}
				}
				guessedNumber.add(guess);		// Adding the wrong guessed number in the Array List
				System.out.println("Salah. Sila cuba lagi.\n");
			}
		}
		scanner.close();						// Close the scanner
	}
}
