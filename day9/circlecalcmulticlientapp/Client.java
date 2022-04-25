package day9.circlecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);		// Requesting socket to server
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());		// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());		// Enable writing data to server
			
			Scanner scanner = new Scanner(System.in);		// Implement Scanner class to accept user's input
			
			while(true)		// Forever loop for circle calculator app
			{
				System.out.print("Please enter the radius value: ");
				double radius = scanner.nextDouble();
				
				toServer.writeDouble(radius);				// Sending radius value to server
				
				double area = fromServer.readDouble();		// Receive area value from server
				
				System.out.println("Sent radius: " + radius);
				System.out.println("Received area: " + area + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
