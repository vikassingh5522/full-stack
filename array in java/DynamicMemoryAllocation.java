// Dynamic Memory Allocation ( Using java array as a pointer)


import java.util.Scanner;

class DynamicMemoryAllocation {
    
     public static void main(String []args)
     {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("\n Enter the Element count:");
         int count =sc.nextInt();
         int []a =new int [count];
         

          System.out.println("\n Enter the +count+ value element  :");
          for(int i = 0; i <a.length; i++)
          {
            a[i] =sc.nextInt();
          }

          System.out.println("\n element:");
          for(int val : a)
          {
            System.out.println(" "+val);
          }


     }
}