package day5_am.shapesapplication;

public class Circle extends Shapes	// Inherit Shapes class
{
	double radius;					// Instance variable for Circle object
	
	public Circle(String colour, double radius)	// Constructor for Circle
	{
		super(colour);
		this.radius = radius;		// Store the data in parameter variable to instance variable radius
	}
	
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);		// Return the value of area of the circle
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;				// Return the value of perimeter of the circle
	}
}
