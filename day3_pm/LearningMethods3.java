package day3_pm;

public class LearningMethods3
{
	public static void main(String[] args)				// Main method
	{
		System.out.println(printName("Mohammad"));		// Call printName method with parameter "Mohammad"
		displayName("Haji Hassan");						// Call displayName method with parameter "Haji Hassan"
	}
	
	public static String printName(String name)			// Declare string method called printName with String name parameter
	{
		String text = "My name is " + name;
		return text;									// Return text to main method
	}
	
	public static void displayName(String name)			// Declare void method called displayName with String name parameter
	{
		System.out.println("My name is " + name);
	}
}
