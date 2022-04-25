package assignmenttemplate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome to Rock, Paper & Scissor game! :-)\n");
			
			System.out.println("Please enter your game ID: ");
			String gameID = scanner.nextLine();
			toServer.writeUTF(gameID);
			
			System.out.println("You are now connected with " + fromServer.readUTF() + "\n");
			
			while(true)
			{
				System.out.println("Press R (Rock)");
				System.out.println("Press P (Paper)");
				System.out.println("Press S (Scissor)");
				
				String choice = scanner.nextLine();
				toServer.writeUTF(choice);
				
				String msg = fromServer.readUTF();
				System.out.println(msg + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
