package day11.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatSession implements Runnable	// Implements runnable to be able to run multiple sessions simultaneously
{
	private Socket client1, client2;			// Instance socket variable for client1 and client2
	private static int sessionNumber=0;			// Class variable to count the number of sessions
	
	public ChatSession(Socket client1, Socket client2)		// Constructor for chat session
	{
		this.client1 = client1;		// Store the parameter socket client1 in instance socket client1
		this.client2 = client2;		// Store the parameter socket client2 in instance socket client2
	}

	@Override
	public void run()
	{
		try
		{
			DataInputStream fromClient1 = new DataInputStream(client1.getInputStream());	// Enable reading data from client1
			DataOutputStream toClient1 = new DataOutputStream(client1.getOutputStream());	// Enable writing data to client1
			
			DataInputStream fromClient2 = new DataInputStream(client2.getInputStream());	// Enable reading data from client2
			DataOutputStream toClient2 = new DataOutputStream(client2.getOutputStream());	// Enable writing data to client2
			
			String chatID1 = fromClient1.readUTF();		// Receive chat ID from client1
			String chatID2 = fromClient2.readUTF();		// Receive chat ID from client2
			
			System.out.println("\n" + chatID1 + " has been connected with " +  chatID2);
			sessionNumber++;		// Increment to count session number
			System.out.println("Chat Session No. " + sessionNumber + " has started");
			
			toClient1.writeUTF(chatID2);		// Send chatID2 to client1
			toClient2.writeUTF(chatID1);		// Send chatID1 to client2
			
			while(true)		// Forever loop is to enable reading and writing text to and fro both clients
			{
				if(fromClient1.available()>0)		// If there is any text coming from client1
				{
					String msg1 = fromClient1.readUTF();	// Receive text from client1
					toClient2.writeUTF(msg1);				// Send the text back to client2
				}
				
				if(fromClient2.available()>0)
				{
					String msg2 = fromClient2.readUTF();	// Receive text from client2
					toClient1.writeUTF(msg2);				// Send the text back to client1
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}







