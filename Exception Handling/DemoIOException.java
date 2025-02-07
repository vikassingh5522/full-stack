
	// // Lets deal with the exception object collected in catch

	// The readLine() method from the java.io.BufferedReader class can throw an IOException in the following 
	// scenarios:
	
	// 1. Input/Output Failure
	// 2. Stream Closed
	// 3. Underlying Reader Fails
	// 4. File Deleted or Modified
	// 5. Exceeding Input Size Limits

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class DemoIOException
{
	public static void main(String[] args)  
	{
		int x=0;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("\n enter the value of x: ");
		try
		{	
			br.close();
			x= Integer.parseInt(br.readLine()); // generates IOException coz attempting read after stream closed.
		}
		catch (IOException ie)
		{
			System.out.println("\n Exception is generated in the program..!!"); // Custom Message
		}
		System.out.println("\n x="+x);
	}
}