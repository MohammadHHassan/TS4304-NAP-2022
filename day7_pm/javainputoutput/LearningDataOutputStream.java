package day7_pm.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("data.dat")))
		{
			output.writeUTF("Mohammad");		// Writing string "Mohammad" to the file
			output.writeDouble(2.5);			// Writing double 2.5 to the file
			output.writeBoolean(true);			// Writing boolean true to the file
			
			output.writeUTF("Hj Hassan");		// Writing string "Haji Hassan" to the file
			output.writeDouble(9.9);			// Writing double 9.9 to the file
			output.writeBoolean(false);			// Writing boolean false to the file
		}
	}
}
