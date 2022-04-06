package day7_am.datastructures;

import java.util.ArrayList;		// ArrayList API/library

public class LearningArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();	// Declaration of ArrayList class
		
		nameList.add("Mohammad");				// Adding "Mohammad" in nameList
		nameList.add("Haji");					// Adding "Haji" in nameList
		nameList.add("Hassan");					// Adding "Hassan" in nameList
		
		for(String name : nameList)
		{
			System.out.print(name + " ");		// Display nameList elements with space in between
		}
		
		nameList.add(0, "Haji");				// Adding "Haji" to array[0]
		nameList.add(2, "Bin");					// Adding "Bin" to array[2]
		nameList.add("Bin Haji Hashim");		// Adding "Bin Haji Hashim" to the last array
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");		// Display nameList elements with space in between
		}
		
		nameList.remove(5);						// Remove nameList[5]
		nameList.remove(2);						// Remove nameList[2]
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");		// Display nameList elements with space in between
		}
		
		System.out.println();
		System.out.println("nameList[3] = " + nameList.get(3));			// Display nameList[3]
		System.out.println("Size of array list: " + nameList.size());	// Display the size of nameList
	}
}
