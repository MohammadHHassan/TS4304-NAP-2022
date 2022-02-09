package day3_am;

import java.time.LocalDate;		// Import local date API (Application Programming Interface)
import java.util.Scanner;		// Import Scanner API

public class Example2
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();		// Declaration of local date class
		Scanner scanner = new Scanner(System.in);	// Declaration of Scanner class to enable user's input
		
		System.out.print("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("You are " + (now.getYear()-birthYear) + " years old this year.");
		
		scanner.close();
	}
}
