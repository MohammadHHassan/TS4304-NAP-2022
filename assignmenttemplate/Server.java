package assignmenttemplate;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		System.out.println("===================================");
		System.out.println("SERVER FOR ROCK, PAPER AND SCISSORS");
		System.out.println("===================================\n");
		
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Game server started at " + new Date());
			
			while(true)
			{
				Socket client1 = socketServer.accept();
				Socket client2 = socketServer.accept();
				
				GameSession gameSession = new GameSession(client1, client2);
				
				new Thread(gameSession).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
