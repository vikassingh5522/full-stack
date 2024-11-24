import java.io.BufferedReader;
import java.io.InputStreamReader;


public class simpleinterst {
    public static  void main(String[] args) throws Exception 
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int p=0, n=0;
       double r=0.0, si=0.0;
       System.out.println("Enter the number of p:");
       p=Integer.parseInt(br.readLine());
      
       System.out.println("Enter the number of r:");
       r=Double.parseDouble(br.readLine());

       System.out.println("Enter the number of n:");
       n=Integer.parseInt(br.readLine());
       

       si=(p*n*r)/100;

      System.out.println("Simple interst is:"+si);
    }
}
