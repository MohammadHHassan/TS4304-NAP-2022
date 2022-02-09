package day3_am;		// Name of the package

public class LearningArrays 	// Name of the class
{
	public static void main(String[] args)		// Main method
	{
		// Array is a set/collection of elements with the same data type
		int [] number = new int[3];		// Declaration of number array. Data type integer. Size=3
		number[0] = 10;
		number[1] = 15;
		number[2] = 20;
		
		for(int j=0 ; j<3 ; j++)		// for loop from 0 until 2
		{
			System.out.print(number[j] + "\t");		// Print out the array number
		}
		System.out.println();		// Make a new line
		
		for(int i=0 ; i<number.length ; i++)	// for loop until the end of the array. number.length is the size of the array
		{
			System.out.print(number[i] + "\t");
		}
		System.out.println();		// Make a new line
		
		for(int k : number)		// for(dataType variable : nameOfTheArray)
		{
			System.out.print(k + "\t");
		}
		System.out.println();
		
		String [] names = new String[3];		// Declaration of names array in String. Size of the array=3
		names[0] = "Mohammad";
		names[1] = "Haji";
		names[2] = "Hassan";
		
		for(String a : names)
		{
			System.out.print(a + " ");
		}
	}
}
