package day7_pm.learningthreads;

public class Message implements Runnable
{
	String name;						// Instance variable name
	
	public Message(String name)			// Creating a constructor for message with parameter variable name
	{
		this.name = name;				// Storing the data in parameter to instance var
	}

	@Override
	public void run()					// Method for threads implementation
	{
		for(int i=0 ; i<10 ; i++)		// Loop 10 times
		{
			System.out.println(i + ". " + name);	// Print out your name
			
			try
			{
				Thread.sleep(1000);		// Delay by 1 second
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
