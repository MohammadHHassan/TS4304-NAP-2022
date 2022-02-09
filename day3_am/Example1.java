package day3_am;

import java.util.Scanner;		// Import Scanner API/library

public class Example1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class to enable user's input
		
		System.out.print("Please enter the number of students: ");
		int numberOfStudents = scanner.nextInt();
		scanner.nextLine();
		
		String [] names = new String[numberOfStudents];		// Declaration of names array in String. Size = numberOfStudents
		
		for(int i=0 ; i<names.length ; i++)
		{
			System.out.print("Please enter the name of student no. " + (i+1) + ": ");
			names[i] = scanner.nextLine();		// Store the name in respective array
		}
		
		System.out.println("\n====================================================\n");		// Creating a partition
		
		for(int j=0 ; j<names.length ; j++)
		{
			System.out.println("Name of students no. " + (j+1) + ": " + names[j]);
		}
		
		scanner.close();
	}
}
