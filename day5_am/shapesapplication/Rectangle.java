package day5_am.shapesapplication;

public class Rectangle extends Shapes
{
	double length, breadth;
	
	public Rectangle(String colour, double length, double breadth)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea()
	{
		return length*breadth;
	}
	
	public double getPerimeter()
	{
		return (2*length)+(2*breadth);
	}
}
