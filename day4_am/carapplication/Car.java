package day4_am.carapplication;

public class Car			// Blueprint
{
	// List down attributes
	String brand;
	String model;
	String colour;
	int numberOfDoors;
	double engineSize;
	double currentSpeed=0;
	
	Wheels wheels;			// Adding wheels to your car
	
	@Override
	public String toString() {
		return "Car:\nBrand = " + brand + "\nModel = " + model + "\nColour = " + colour + "\nNumber Of Doors = " + numberOfDoors
				+ "\nEngine Size = " + engineSize + "\n";
	}
	
	public void pressAccelerator()		// Behaviour 1
	{
		currentSpeed += 10;				// Increase the speed by 10
	}
	
	public void pressBrake()			// Behaviour 2
	{
		currentSpeed -= 5;				// Decrease the speed by 5
		
		if(currentSpeed<0)
		{
			currentSpeed=0;				// Prevent negative value on speed
		}
	}
}
