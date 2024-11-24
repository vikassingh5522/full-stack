
class DataInputCmdlnNumeric
{
	public static void main(String []args)
	{
		int x=Integer.parseInt(args[0]); 
		double y=Double.parseDouble(args[1]);

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}