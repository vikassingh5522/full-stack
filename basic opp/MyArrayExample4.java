
// Write a program to represent an array as a object and perform some operations on that array object.

    import java.util.Scanner;
    class MyArray
    {
        private int []x;
        public void fill(int t)
        {
            x=new int[5];
            for(int i=0;i<x.length;i++)
            {
                x[i]=t;
            }
        }
        public void in()
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("\n Enter element count: ");
            int k=sc.nextInt();
            x=new int[k];
             
            System.out.print("Enter the "+k+" Elements: ");
            for(int i=0;i<k;i++)
            {
                x[i] = sc.nextInt();
            }
        }
        public void out()
        {
            System.out.print("\n Elements are: ");
            for(int val : x)
            {
                System.out.print("   "+val);
            }
        }
        public int search(int t)
        {
            for(int i=0;i<x.length;i++)
            {
                if(x[i]==t)
                    return i;
            }
            return -1;
        }
    }
    class MyArrayExample4
    {
        public static void main(String[] args) 
        {
            MyArray ob = new MyArray();
            ob.fill(3);
            ob.out();
    
            ob.in();
            ob.out();
    
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter the element to be searched: ");
            int n=sc.nextInt();
            int pos = ob.search(n);
            if(pos==-1)
                System.out.println("\n Number is not present in an array");
            else
                System.out.println("\n Number is present at "+pos+" position");
        }
    }
    
    


    