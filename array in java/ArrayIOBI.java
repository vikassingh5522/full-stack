// Array input and display - using BufferedReader and InputStreamReader
import java.io.*;



 class ArrayIOBI {

	public static void main( String [] args)throws Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int  [] ar = new int [10];

		 System.out.println("\n Enter the array :");
		 for(int i = 0; i <5; i++)
		 {
			ar[i]=Integer.parseInt(br.readLine());
		 }
		 System.out.println("\n Array elements are :");
		 for(int i=0; i<ar.length; i++)
		 {
           System.out.println("  "+ar[i]);
		 }
        System.out.println("\n Ente the  array :");
		for(int val : ar)
		{
			System.out.println(val);
		}


	}

	 
}