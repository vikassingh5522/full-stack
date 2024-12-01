
package array;

public class IntArray {

    public static void main(String[] args)
    { 
         int [ ] A ={ 10,20,30,40,50,60,80,};
         System.out.println("\n Array elements are:");
         for(int i=0; i<6; i++)
         {
            System.out.println(" "+A[i]);
         }

         System.out.println("\n Array elements are :");
         for(int i=0; i<A.length; i++)
         {
            System.out.println(" " +A[i]);
         }

         System.out.println("\n Array elements are :");
         for(int val :A)
         {
            System.out.println(" " +val);
         }

          
	}
}