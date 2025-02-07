

class Demo extends Thread
{
    public void run(){


        //   System.out.println(Thread.currentThread().getPriority());
        //   System.out.println("thread is daemon thread");

            
         if(Thread.currentThread().isDaemon())
         {
             System.out.println(" it is Daemon thread T!");
            
         }else
         {
            System.out.println("it is not child thread F!"); 
         }

    }
}
public class Daemon {
    public static void main(String[] args) {

        System.out.println("is main thread"); // --- must be right  --if we not right it not run the program

        Demo t = new Demo();
        t.setDaemon(true);
        // t.setPriority(10)
        t.start();

    }
        
}