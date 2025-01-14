

	// Default Constructor (No-Argument Constructor): It is constructor without arguments. Can init.
    // instance variables using input or using literals. In absence of constructor in class, the default 
    // constructor with the empty body will be provided by the compiler itself. 



    
    
    /*
     
    
    class Sample
    {
        private int  x;
        private Double y;

   public Sample()
   {
        x= 45;
        y=45.32;
        System.out.println("\n In default const the sample class ");
   }
   public  void showData()
   {
    System.out.println("\n  x="+x+" y="+y);
}

}
class  MainDefaultex
{
    public static void main(String[] args)
    {
        Sample ob = new Sample();
        ob.showData();
        
    }
    
}

*/

// ----------------------------------------
class Sample
{
	private int x;
	private double y;
	public Sample()
	{
		System.out.println("\n In default constructor of Sample class");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the int value: ");
		x=sc.nextInt();
		System.out.println("Enter the double value: ");
		y=sc.nextDouble();
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDefaultex
{
	public static void main(String []args)
	{
		Sample ob = new Sample();
		ob.showData();
	}
}