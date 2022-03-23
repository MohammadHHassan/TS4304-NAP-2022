package day6_am.shape2d3dapplication;

import java.text.DecimalFormat;			// DecimalFormat API

public abstract class Shape				// Abstract Shape class
{
	String colour;						// Declaration of instance var
	
	public Shape(String colour)			// Shape constructor
	{
		this.colour = colour;			// Store the data from parameter var to instance var
	}
	
	DecimalFormat df = new DecimalFormat("#.##");		// Declaration of decimal format in 2 d.p
}
