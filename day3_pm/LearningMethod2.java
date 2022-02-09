package day3_pm;

public class LearningMethod2
{
	public static void main(String[] args)
	{
		System.out.println("Sum from 1-5 = " + sumRangeValues(1,5));		// Call the method sumRangeValues with min of 1 and max of 5
		System.out.println("Sum from 10-15 = " + sumRangeValues(10,15));	// Call the method sumRangeValues with min of 10 and max of 15
		System.out.println("Sum from 20-25 = " +  sumRangeValues(20, 25));	// Call the method sumRangeValues with min of 20 and max of 25
	}
	
	public static int sumRangeValues(int min, int max)		// Name of the method sumRangeValues with 2 parameters: int min & int max
	{
		int sum=0;
		
		for(int i=min ; i<=max ; i++)
		{
			sum = sum+i;	// Formula to add min until max
		}
		
		return sum;			// Return sum to main method
	}
}
