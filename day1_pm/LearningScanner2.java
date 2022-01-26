package day1_pm;

import java.util.Scanner;

public class LearningScanner2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		try
		{
			int a = scanner.nextInt();
			System.out.println("Integer value entered is " + a);
		}
		catch (Exception e)
		{
			System.out.println("Wrong input");
			scanner.nextLine();
		}
		
		System.out.print("Please enter a double/decimal value: ");
		double b = scanner.nextDouble();
		System.out.println("Decimal value entered is " + b);
		
		scanner.close();
	}
}
