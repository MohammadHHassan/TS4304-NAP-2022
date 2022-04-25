package day11.chatapplication;

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
			Socket socket = new Socket("localhost", 9101);		// Requesting for socket to server with port 9101
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());		// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());		// Enable writing data to server
			
			Scanner scanner = new Scanner(System.in);			// Enable user input
			
			System.out.print("Please enter your chat ID: ");	// Prompt a message for user to enter chat ID
			String chatID = scanner.nextLine();					// Store the chat ID in the chatID variable
			toServer.writeUTF(chatID);							// Send the chatID to server
			
			System.out.println("You are connected with " + fromServer.readUTF());	// Display the name of the other client
			
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)		// Forever loop to accept multiple messages simultaneously
					{
						try
						{
							if(fromServer.available()>0)	// If there is any input coming from the server
							{
								String receivedMsg = fromServer.readUTF();	// Read the text from the server
								System.out.println(">>> " + receivedMsg);	// Display text from other client
							}
						} 
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true)		// Forever loop to enable writing text anytime
			{
				String msg = scanner.nextLine();	// Accept user's text and store inside msg
				toServer.writeUTF(msg);				// Send the msg to server
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}




