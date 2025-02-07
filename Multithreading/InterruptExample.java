// Using interrupt() method: 

// - used to interrupt an executing Thread and for that it will set interrupt status true.
// - interrupt() method will work when thread is in sleeping or waiting state.
// - when thread is not in sleeping or waiting state then calling the interrupt() method wil perform normal behavior.
// - when we use an interrupt() method, it throws an InterruptedException, and then thread execution is terminated.

class MyThread extends Thread
{
public void run()
{
    try
    {
        for(int i=0;i<15;i++)
        {
            System.out.println(i + " - "+this);
            Thread.sleep(3000);
        }
    }
    catch (InterruptedException e)
    {
        System.out.println("Thread t1 Terminated");
    }
}
}
class InterruptExample 
{
public static void main(String[] args) 
{
    MyThread t1=new MyThread();
    t1.start();

    try
    {
        for(int i=0;i<15;i++)
        {
            System.out.println("main - "+ i);
            Thread.sleep(600);
            if(i==5)
                t1.interrupt();
        }
    }
    catch(Exception e){}

    
}
}

//-------------------

// interrupted() and isInterrupted():

    // - Both returns true when thread is interrupted, otherwise both will return false.
    // - Note that the call to interrupt() method will generates the InterruptedException only when the interrupt status
    //   is ture.
    // - Difference is that interrupted() method changes the interrupted status from true to false but isInterrupted()
    //   does not affact the interrupted status.
    // - interrupted() will change the result, but isInterrupted() wil not change the result if called twice.
    // - method signature: 
    //     - public static boolean interrupted()
    //     - public boolean isInterrupted()
