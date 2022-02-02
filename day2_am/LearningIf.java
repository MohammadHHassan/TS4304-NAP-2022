package day2_am;

public class LearningIf
{
	public static void main(String[] args)
	{
		int a=10, b=10;
		
		if(a<b)			// The condition is if a is less than b
		{
			// If the condition above (a<b) is true, it will go here
			System.out.println("a is less than b");
		}
		else if(a>b)
		{
			// If the condition above (a>b) is true, it will go here instead
			System.out.println("a is greater than b");
		}
		else
		{
			// If both the conditions above are not true, it will go here instead
			System.out.println("a is equal to b");
		}
	}
}
