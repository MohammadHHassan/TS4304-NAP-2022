package day3_am;

import java.util.Scanner;		// Import Scanner API/library

public class LearningArrays2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class to enable user's input
		
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
							"September", "October", "November", "December"};
		
		System.out.print("Please enter your birth month value: ");
		int birthMonthValue = scanner.nextInt();		// birthMonthValue camel case letter
		
		if(birthMonthValue>=1 && birthMonthValue<=12)
		{
			System.out.println("Your birth month is " + months[birthMonthValue-1]);
		}
		else
		{
			System.out.println("Invalid value.");
		}
		
		scanner.close();
	}
}
