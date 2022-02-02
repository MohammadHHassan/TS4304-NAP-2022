/* Create a random number generator in which
 * the minimum and maximum range values are
 * entered by the user.
 * Print out the generated values.
 */

package day2_am;

import java.util.Scanner;

public class Exercise1 
{
	public static void main(String[] args)
	{
		// int randomNumber = min + (int)(Math.random()*((max-min)+1));
		
		Scanner scanner = new Scanner(System.in);		// Declare scanner class
		
		System.out.print("Please enter the minimum value: ");
		int min = scanner.nextInt();					// Store user input in min (int)
		
		System.out.print("Please enter the maximum value: ");
		int max = scanner.nextInt();					// Store user input in max (int)
		
		int randomNumber = min + (int)(Math.random()*((max-min)+1));	// Generate random number between min and max inclusive
		
		System.out.println("Random number generated = " + randomNumber);	// Print out the generated random value
		
		scanner.close();		// Close the scanner class
	}
}
