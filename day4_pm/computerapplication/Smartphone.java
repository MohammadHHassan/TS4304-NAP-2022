package day4_pm.computerapplication;

public class Smartphone extends Portable			// Smartphone inherits from Portable
{
	double cameraMegapixel;							// Instance variables for smartphone object
	boolean display;
	
	public Smartphone(String operatingSystem, double cameraMegapixel)	// Constructor for smartphone object using 2 parameters: operatingSystem & cameraMegapixel
	{
		super(operatingSystem);
		this.cameraMegapixel = cameraMegapixel;		// Store from parameter variable to instance variable of smartphone object
		switchOffDisplay();							// Switch off display whenever smartphone object is created
	}
	
	public void switchOnDisplay()
	{
		display = true;								// Switch on smartphone display
	}
	
	public void switchOffDisplay()
	{
		display = false;							// Switch off smartphone display
	}
}
