package day8.circlecalculatorapp;

import java.io.DataInputStream;		// Data Input Stream API
import java.io.DataOutputStream;	// Data Output Stream API
import java.io.IOException;			// IOException API
import java.net.ServerSocket;		// Server Socket API
import java.net.Socket;				// Socket API
import java.util.Date;				// Date API

public class Server
{
	public static void main(String[] args)
	{
		try 
		{
			ServerSocket socketServer = new ServerSocket(9101);		// Declaration of Server Socket with Port Number 9101
			System.out.println("Server started at " + new Date());	// Display time and date when the server is created
			
			Socket socket = socketServer.accept();					// Accepting socket request from client
			System.out.println("Client has been connected.");		// Display message that a client has been connected
			
			DataInputStream fromClient = new DataInputStream(socket.getInputStream());		// Enable reading data from client
			DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());		// Enable writing data to client
			
			while(true)			// Forever loop
			{
				double radius = fromClient.readDouble();		// Reading radius value from client and store inside radius variable
				double area = Math.PI*radius*radius;			// Calculate area of circle
				
				toClient.writeDouble(area);			// Sending area value to client
				
				System.out.println("\nReceived radius: " + radius);
				System.out.println("Sent area: " + area);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
