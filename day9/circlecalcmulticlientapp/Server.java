package day9.circlecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);		// Declaration of server socket with port number 9101
			System.out.println("Server started at " + new Date());	// Display time and date when server is started
			
			while(true)		// Forever loop to accept multiple clients
			{
				Socket socket = socketServer.accept();		// Accepting socket request from client
				System.out.println("\nClient has been connected.");
				
				new Thread(new Runnable()			// Implement Thread to accept multiple clients at one time
				{
					@Override
					public void run() 
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());		// Enable reading data from client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());		// Enable writing data to client
							
							while(true)			// Forever loop for circle calculator app
							{
								double radius = fromClient.readDouble();		// Receive radius value from client
								double area = Math.PI*radius*radius;			// Calculate area of circle using received radius
								
								toClient.writeDouble(area);						// Sending area value to client
								
								System.out.println("Received radius: " + radius);
								System.out.println("Sent area: " + area + "\n");
							}
						}
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
