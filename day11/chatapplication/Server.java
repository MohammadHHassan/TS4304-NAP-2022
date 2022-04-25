package day11.chatapplication;

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
			ServerSocket socketServer = new ServerSocket(9101);		// Declaration of server socket with port 9101
			System.out.println("Server started at " + new Date());	// Display time and date when the server is started
			
			while(true)			// Forever loop to accept multiple clients
			{
				Socket client1 = socketServer.accept();		// Accept socket request from client1
				Socket client2 = socketServer.accept();		// Accept socket request from client2
				
				ChatSession chatSession = new ChatSession(client1, client2);	// Use constructor to start chat session
				
				new Thread(chatSession).start();			// Enable multiple chat sessions running simultaneously
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
