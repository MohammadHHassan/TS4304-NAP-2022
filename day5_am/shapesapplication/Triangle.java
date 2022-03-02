package day5_am.shapesapplication;

public class Triangle extends Shapes
{
	double base, height;
	
	public Triangle(String colour, double base, double height)
	{
		super(colour);
		this.base = base;
		this.height = height;
	}

	public double getArea()
	{
		return 0.5*base*height;
	}
	
	public double getPerimeter()
	{
		double c = Math.sqrt((base*base)+(height*height));	// Hypotenuse
		return c+base+height;
	}
}
