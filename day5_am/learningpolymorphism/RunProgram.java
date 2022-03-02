package day5_am.learningpolymorphism;

public class RunProgram
{
	public static void main(String[] args)
	{
		Animals animal1 = new Animals();		// Creating an animal object
		animal1.makeSound();
		
		animal1 = new Cats();					// Changing the animal object into a cat object
		animal1.makeSound();
		
		Dogs dog1 = new Dogs();					// Creating a dog object
		dog1.makeSound();
	}
}
