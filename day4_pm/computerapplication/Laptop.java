package day4_pm.computerapplication;

public class Laptop extends Portable		// Laptop inherits from Portable
{
	String graphicCard;						// Instance variable for laptop object
	boolean sleeping;
	
	public Laptop(String operatingSystem, String graphicCard)	// Laptop constructor with 2 parameters: operatingSystem and graphicCard
	{
		super(operatingSystem);
		this.graphicCard = graphicCard;		// Store the parameter variable graphicCard to instance variable graphicCard
		sleep();							// Sleep the object whenever the laptop object is created
	}
	
	public void sleep()
	{
		sleeping = true;					// Laptop is asleep
	}
	
	public void wakeUp()
	{
		sleeping = false;					// Laptop is not asleep
	}
}
