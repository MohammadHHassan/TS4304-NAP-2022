package day5_pm.improvedshapesapplication;

import java.text.DecimalFormat;

public class Rectangle extends Shapes
{
	DecimalFormat df = new DecimalFormat("#.#");
	
	double length, breadth;
	
	public Rectangle(String colour, double length, double breadth)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea()
	{
		return length*breadth;
	}

	@Override
	public double getPerimeter()
	{
		return (2*length)+(2*breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [ Length = " + length + ", Breadth = " + breadth + ", Colour = " + colour + ", Area = "
				+ df.format(getArea()) + ", Perimeter = " + df.format(getPerimeter()) + " ]";
	}
	
}
