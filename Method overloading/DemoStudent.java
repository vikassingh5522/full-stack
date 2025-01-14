

// import java.util.*;

// class Student {
//     private int id;
//     private double per;


//     public void in()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("\n Enter the student Id:");
//         id = sc.nextInt();

//         System.out.println("\n Enter the percentage:");
//         per = sc.nextDouble();

       
//     }
//     public void display()
//     {
//         System.out.println("\n Student ID: "+id+"\n Percentage: "+per );
//     }
// }

// class DemoStudent
// {
//     public static void main(String[] args) throws Exception
//     {
//         Student s1 = new Student();
//         s1.in();
//         s1.display();

//         Student s2 = new Student();
//         s2.in();
//         s1.display();
//     }
// }





	// Or can be passed from the main()

    import java.util.Scanner;
    class Student
    {
        private int id;
        private double per;
    
        public void in(int t1, double t2)
        {
            id=t1;
            per=t2;
        }
        public void out()
        {
            System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
        }
    }
    class DemoStudent
    {
        public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
    
            System.out.println("Enter the student ID: ");
            int sid=sc.nextInt();
            System.out.println("Enter the Percentage: ");
            double sper=sc.nextDouble();
    
            Student s1=new Student();
            s1.in(sid,sper);
            s1.out();
    
            //-----------------------------------------------
    
            System.out.println("Enter the student ID: ");
            sid=sc.nextInt();
            System.out.println("Enter the Percentage: ");
            sper=sc.nextDouble();
    
            Student s2=new Student();
            s2.in(sid,sper);
            s2.out();
        }
    }	
    