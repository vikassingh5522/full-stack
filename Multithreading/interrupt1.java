// package all program.Java program.Multithreading;



class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread"+Thread.currentThread().getName());
            try{Thread.sleep(1000);}catch(Exception e){
                System.out.println("thread is interrupted"+Thread.currentThread().isAlive());
            }
        }
    }
}


public class interrupt1 {
    public static void main(String[] args) {
        demo t=new demo();
    
        t.start();
         t.interrupt();
         t.isInterrupted();

         try {
             t.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         

         for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread"+Thread.currentThread().getName());
            try{Thread.sleep(1000);}catch(Exception e){
                System.out.println("secound  is interrupted");
            }
        }
    }
}
