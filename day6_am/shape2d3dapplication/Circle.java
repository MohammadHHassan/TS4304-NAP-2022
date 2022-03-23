package day6_am.shape2d3dapplication;

public class Circle extends Shape implements Shape2D		// Inherits from both Shape & Shape2D
{
	double radius;						// Declaration of radius instance var
	
	public Circle(String colour, double radius)		// Circle constructor with 2 parameter var: colour & radius
	{
		super(colour);					// Inherits from Shape class
		this.radius = radius;			// Store the radius parameter var to radius instance var
	}

	@Override
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);		// Return the value of area of circle
	}

	@Override
	public double getPerimeter()
	{
		return 2*Math.PI*radius;				// Return the value of perimeter of circle
	}

	@Override
	public String toString() {
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
	
}
