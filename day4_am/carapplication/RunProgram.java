package day4_am.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheel1 = new Wheels();		// Instantiate wheel1 object
		wheel1.brand = "Bridgestone";
		wheel1.size = 20;
		
		Wheels wheel2 = new Wheels();		// Instantiate wheel2 object
		wheel2.brand = "LingLong";
		wheel2.size = 16;
		
		Car car1 = new Car();		// Instantiate car1 object
		car1.brand = "Toyota";
		car1.model = "Vios";
		car1.numberOfDoors = 2;
		car1.colour = "Red";
		car1.engineSize = 1.6;
		car1.wheels = wheel1;
		
		System.out.println(car1);
		System.out.println("Car 1 initial speed = " + car1.currentSpeed + " km/h");
		car1.pressAccelerator();		// Car 1 speed + 10
		System.out.println("Car 1 speed after accelerate = " + car1.currentSpeed + " km/h");
		car1.pressBrake();				// Car 1 speed -5
		car1.pressBrake();				// Car 1 speed -5
		car1.pressBrake();				// Car 1 speed -5
		System.out.println("Car 1 speed after braking = " + car1.currentSpeed + " km/h\n");
		
		Car car2 = new Car();		// Instantiate car2 object
		car2.brand = "Kia";
		car2.model = "Stinger";
		car2.colour = "White";
		car2.numberOfDoors = 5;
		car2.engineSize = 2.4;
		car2.wheels = wheel2;
		
		System.out.println(car2);
		System.out.println("Car 2 speed = " + car2.currentSpeed + " km/h");
		System.out.println("Car 2 wheels: " + car2.wheels);
		
		System.out.println("Car 1 wheels: " + car1.wheels);
	}
}
