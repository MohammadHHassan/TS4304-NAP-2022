package day5_pm.improvedshapesapplication;

import java.text.DecimalFormat;

public class Square extends Shapes
{
	DecimalFormat df = new DecimalFormat("#.#");
	
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getArea()
	{
		return side*side;
	}

	@Override
	public double getPerimeter()
	{
		return 4*side;
	}

	@Override
	public String toString() {
		return "Square [ Side = " + side + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
	
}
