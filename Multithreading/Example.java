

class demo extends Thread
{
    public void run()
    {
           for (int i = 0; i < 5; i++)
           {
                try {Thread.sleep(1000);  } catch (Exception e) {}
               System.out.println("Thread is running:"+Thread.currentThread().getName());
               System.out.println("alive : "+Thread.currentThread().isAlive());
           }
        // System.out.println(Thread.currentThread().getName());
    }
    
}
public class Example {
    public static void main(String[] args) {
        demo t = new demo();
        t.setName("vikas singh");
        System.out.println("alive : "+Thread.currentThread().isAlive());
        t.start();

    
        for (int i = 0; i < 5; i++)
        {
             try {Thread.sleep(1000);  } catch (Exception e) {}
            System.out.println("Thread is running:"+Thread.currentThread().getName());
            Thread.currentThread().setName("vishal");
            System.out.println("alive:"+Thread.currentThread().isAlive());
        }



    }
    
}
