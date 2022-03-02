package day5_pm.improvedshapesapplication;

public abstract class Shapes	// Abstract class cannot create object from this
{
	String colour;				// Instance variable

	public Shapes(String colour)
	{
		editColour(colour);		// Call the method editColour
	}
	
	public void editColour(String colour)		// Method to edit the shape's colour
	{
		this.colour = colour;					// Store the data in parameter var to instance var colour
	}
	
	public abstract double getArea();			// Declare abstract method to get the area
	public abstract double getPerimeter();		// Declare abstract method to get the perimeter
}
