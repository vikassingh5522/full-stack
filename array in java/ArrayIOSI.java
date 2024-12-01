


// Array input and display - using Commandline arguments

import java.util.Scanner;

class ArrayIOSI {

    public static void main(String[] args) {
        int []x = new int[5];
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("\n Enter the array:");
        // for(int i=0;i<5;i++)
        // {
        //     x[i]=sc.nextInt();
        // }
        System.out.println("\n Array elements are:");
        for(int i=0;i<x.length;i++)
        {
            System.out.println( "    "+x[i]);
        }
        System.out.println("\n Array elements are:");
        for(int val : x)
        {
            System.out.println( "    "+val);
        }

    }
}
