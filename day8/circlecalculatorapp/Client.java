package day8.circlecalculatorapp;

import java.io.DataInputStream;			// Data Input Stream API
import java.io.DataOutputStream;		// Data Output Stream API
import java.io.IOException;				// IO Exception API
import java.net.Socket;					// Socket API
import java.util.Scanner;				// Scanner API

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);		// Declaration of socket using local host with Port Number 9101
			
			DataInputStream fromServer  = new DataInputStream(socket.getInputStream());		// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());		// Enable writing data to server
			
			Scanner scanner = new Scanner(System.in);			// Enable user's input
			
			while(true)			// Forever loop
			{
				System.out.print("\nPlease enter the radius value: ");		// Prompt a message for user to enter radius value
				double radius = scanner.nextDouble();			// Store radius value in the radius variable
				
				toServer.writeDouble(radius);		// Sending radius value to server
				double area = fromServer.readDouble();		// Received area value from server and store inside area variable
				
				System.out.println("\nSend radius: " + radius);
				System.out.println("Received area: " + area);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
