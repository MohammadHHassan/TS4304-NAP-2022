package day6_am.shape2d3dapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Shape2D [] shapes2D = new Shape2D[5];			// Declaration of array to store 2D shapes (5 shapes in total)
		shapes2D[0] = new Circle("Pink", 2.5);			// First: Circle object			Colour: Pink 	radius: 2.5
		shapes2D[1] = new Rectangle("Black", 5.2, 6);	// Second: Rectangle object		Colour: Black 	length: 5.2 	breadth: 6
		shapes2D[2] = new Square("White", 10);			// Third: Square object			Colour: White 	side: 10
		shapes2D[3] = new Circle("Blue", 8.5);			// Fourth: Circle object		Colour: Blue 	radius: 8.5
		shapes2D[4] = new Square("Red", 5.5);			// Fifth: Square object			Colour: Red 	side: 5.5
		
		for(int i=0 ; i<shapes2D.length ; i++)
		{
			System.out.println("--- Shape [" + i + "] ---");
			System.out.println(shapes2D[i] + "\n");
		}
		
		int numberOfCircle=0, numberOfSquare=0, numberOfRectangle=0;
		
		for(int j=0 ; j<shapes2D.length ; j++)
		{
			if(shapes2D[j] instanceof Circle)
			{
				numberOfCircle++;
			}
			
			if(shapes2D[j] instanceof Square)
			{
				numberOfSquare++;
			}
			
			if(shapes2D[j] instanceof Rectangle)
			{
				numberOfRectangle++;
			}
		}
		
		System.out.println("Number of circle: " + numberOfCircle);
		System.out.println("Number of square: " + numberOfSquare);
		System.out.println("Number of rectangle: " + numberOfRectangle);
	}
}
