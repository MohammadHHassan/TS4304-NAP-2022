package day3_pm;

public class LearningStatic
{
	static int y=10;		// Class variable y
	
	public static void main(String[] args)
	{
		int x=5;			// Local variable x
		
		System.out.println("1. y = " + y);					// Initially y=10
		System.out.println("2. y = " + incrementYBy20());	// Increment y by 20 permanently
		System.out.println("3. y = " + incrementYBy20());	// Increment y by 20 permanently
		System.out.println("4. y = " + y);					// New value of y changed to 50
		
		System.out.println("1. x = " + x);					// Initially, x=5
		System.out.println("2. x = " + incrementBy10(x));	// Increment x by 10 temporarily
		System.out.println("3. x = " + incrementBy10(x));	// Increment x by 10 temporarily
		System.out.println("4. x = " + x);					// Value of x doesn't change
	}
	
	public static int incrementYBy20()
	{
		return y=y+20;
	}
	
	public static int incrementBy10(int value)
	{
		return value=value+10;
	}
}
