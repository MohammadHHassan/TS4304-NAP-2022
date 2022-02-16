package day4_am;

import java.text.DecimalFormat;		// Import DecimalFormat API/library

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi = 3.14159;		// Declaration of variable pi
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f\n", pi);		// Print out pi in 2 d.p using printf
		
		DecimalFormat a = new DecimalFormat("#.#");			// Declaration of Decimal Format in 1 decimal place
		
		System.out.println("Pi in 1 d.p = " + a.format(pi));			// Print out pi in 1 d.p using Decimal Format
		System.out.println("2.55555 in 1 d.p = " + a.format(2.55555));	// Print out 2.55555 in 1 d.p using Decimal Format
		
		System.out.println("Pi in 1 d.p = " + a.format(Math.PI));
	}
}
