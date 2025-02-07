// package all program.Java program.Multithreading.synchronization;


class bank extends Thread{
    static int balance=5000; 
   static int withdraw ;

    bank(int withdraw)
    {
        this.withdraw=withdraw;  // 5000
    }
     public static synchronized void withdraw()  // t1 ,t2 , t3 , t4 ,   //run() in bank cannot implement run() in Runnable
                                                //     public static synchronized void run()  // t1 ,t2 , t3 , t4 ,
                                                //                                     ^
                                                //   overriding method is static
                                               // 1 error
    {
       String name = Thread.currentThread().getName();

       try{
        Thread.sleep(1000);
       
       if (withdraw<=balance) { //5000<0
        balance=balance-withdraw;  // bal= 5000 - 5000 = 0
        System.out.println(name+" withdrew money ");
       } else {
        System.out.println(name+" insufficient balance");
       }
    }
    catch(Exception e){}
    }
    



    public void run()
    {
        withdraw();
    }

}

public class staticsynchronization {
    public static void main(String[] args) {
           
        bank ob1 = new bank(5000);  /// ob1 have one lock
        Thread t1 = new Thread( ob1);
        Thread t2 = new Thread(ob1);
        t1.setName("vikas");
        t2.setName("ankita");

        t1.start();
        t2.start();

        // more object 


        bank ob2 = new bank(5000);  /// ob1 have one lock
        Thread t3 = new Thread( ob2);
        Thread t4 = new Thread(ob2);
       
        t3.setName("vishal");
        t4.setName("raj");

        t3.start();
        t4.start();

       

        
    }
    
}
