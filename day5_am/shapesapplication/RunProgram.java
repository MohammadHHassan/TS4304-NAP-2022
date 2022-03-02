package day5_am.shapesapplication;

import java.text.DecimalFormat;		// Decimal Format API

public class RunProgram
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("#.##");		// Implement decimal format class in 2 d.p
		
		Circle circle1 = new Circle("Purple", 2.5);			// Created circle1 object
		System.out.println("Shape 1: Circle");
		System.out.println("Colour: " + circle1.colour);
		System.out.println("Radius: " + circle1.radius);
		System.out.println("Area = " + df.format(circle1.getArea()));
		System.out.println("Perimeter = " + df.format(circle1.getPerimeter()));
		
		//Shapes shape1 = new Shapes("White");
	}
}
