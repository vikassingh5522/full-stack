

class A extends Thread
{
    public void run()
    {
        try {
            for(int i = 0; i<5;i++)
            {
                System.out.println("t1 is thread is running");
                
                Thread.sleep(1000);
            }
        } catch (Exception e) {
          System.out.println("interrupted exception");
        }
    
    }
}
public class interrupt {

    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
        t1.interrupt();
        
    }
}