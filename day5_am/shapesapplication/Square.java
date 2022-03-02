package day5_am.shapesapplication;

public class Square extends Shapes			// Inherit Shapes class
{
	double side;							// Instance variable for Square object
	
	public Square(String colour, double side)	// Constructor for Square object with 2 parameter variables
	{
		super(colour);						// Inherit colour attribute from Shapes
		this.side = side;					// Store the data in parameter variable to instance variable side
	}
	
	public double getArea()
	{
		return side*side;					// Return the value of area of the square
	}
	
	public double getPerimeter()
	{
		return 4*side;						// Return the value of perimeter of the square
	}
}
