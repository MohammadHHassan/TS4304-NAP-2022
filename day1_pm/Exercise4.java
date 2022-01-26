package day1_pm;

import java.util.Scanner;

/* Create a random number generator
 * in which the minimum and maximum
 * range values are entered by the user.
 * Print out the generated value.
 */

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the minimum value: ");
		int min = scanner.nextInt();
		
		System.out.println("Please enter the maximum value: ");
		int max = scanner.nextInt();
		
		int randomNumber = min + (int)(Math.random()*((max-min)+1));
		
		System.out.println("Random number generated = " + randomNumber);
		
		scanner.close();
	}
}