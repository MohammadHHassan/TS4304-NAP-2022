package day5_pm.improvedshapesapplication;

import java.text.DecimalFormat;			// Decimal format API

public class Circle extends Shapes
{
	DecimalFormat df = new DecimalFormat("#.#");		// Decimal format in 1 decimal place
	
	double radius;
	
	public Circle(String colour, double radius) 		// Constructor for circle object with 2 parameter variables
	{
		super(colour);					// Inherit the colour attribute from Shapes
		this.radius = radius;			// Store the data in parameter var to instance var radius
	}

	@Override
	public double getArea() 
	{
		return Math.PI*radius*radius;	// Return the value of area of the circle
	}

	@Override
	public double getPerimeter() 
	{
		return 2*Math.PI*radius;		// Return the value of perimeter of the circle
	}

	@Override
	public String toString()
	{
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
	
}
