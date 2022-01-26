package day1_pm;

public class LearningRandomNumberGenerator
{
	public static void main(String[] args)
	{
		// int randomNumber = min + (int)(Math.random()*((max-min)+1));
		
		// Generating random number from 1 to 100
		int randomNumber = 1 + (int)(Math.random()*((100-1)+1));
		
		System.out.println("Random number generated = " + randomNumber);
	}
}
