
public class demo
{
    public static void main(String[] args)
	{
		int x=10;
		byte b=(byte)x;
		short s=(short)x;
		long l=(long)50;
		System.out.println("\n x="+x+"\t b="+b+"\t s="+s+" l="+l);

		float f1=45.23F;
		double d1=(double)f1;
		System.out.println("\n f1="+f1+"\t d1="+d1);

		float f2=(float)d1;
		System.out.println("\n f2="+f2);


	}
}