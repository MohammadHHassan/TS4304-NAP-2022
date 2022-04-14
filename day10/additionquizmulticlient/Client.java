package day10.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try 
		{
			Socket socket = new Socket("localhost", 9101);		// Requesting socket with port number 9101 to the server using local host
			DecimalFormat df = new DecimalFormat("#.##");		// Declaration of decimal format with 2 decimal places
			Scanner scanner = new Scanner(System.in);			// Enable user input
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());		// Enable reading data from the server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());		// Enable writing data to the server
			
			System.out.println("Please enter your name: ");		// Prompt a message for user to enter their name
			String name = scanner.nextLine();					// Store the input in name variable
			toServer.writeUTF(name);							// Sending the name to the server
			
			int questionNumber=0, marks=0;
			double totalMarks;
			
			while(true)
			{
				questionNumber++;			// Increment question number in sequence
				
				int randomNumber1 = fromServer.readInt();		// Receive random number 1 from server
				int randomNumber2 = fromServer.readInt();		// Receive random number 2 from server
				
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");
				int answer = scanner.nextInt();
				toServer.writeInt(answer);						// Send the answer to the server
				
				if(answer==(randomNumber1+randomNumber2))
				{
					marks++;												// Increment marks for correct answer
					totalMarks = ((double)(marks)/questionNumber)*100;		// Casting double from integer to calculate total marks
					System.out.println("Correct! :) - Current marks = " + df.format(totalMarks) + "%");
				}
				else
				{
					totalMarks = ((double)(marks)/questionNumber)*100;		// Casting double from integer to calculate total marks
					System.out.println("Incorrect! :( - Current marks = " + df.format(totalMarks) + "%");
				}
				
				toServer.writeDouble(totalMarks);		// Send the total marks to the server
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
