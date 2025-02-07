// // Using the yield() methods:

// - will stops current executing thread and gives chance to other thread.
// - Till Java 5, internally the sleep() was used but from Java 6 Onwords it will informs to scheduler 
//   about the his opinion, but it is decided by scheduler

class MyThread extends Thread
{
public MyThread(String name)
{
super(name);
start();
}
public void run()
{
try
{
    for(int i=0;i<20;i++)
    {
        System.out.println(i+" - "+this.getName());
        Thread.sleep(300);
    }
}
catch (Exception e)
{
}
}
}
class  ThreadYieldExample
{
public static void main(String[] args) 
{
MyThread t1=new MyThread("One");
MyThread t2=new MyThread("Two");
MyThread t3=new MyThread("Three");
MyThread t4=new MyThread("Four");
MyThread t5=new MyThread("Five");
try
{
    t3.yield();
    for(int i=0;i<20;i++)
    {
        System.out.println("Hi");
        Thread.sleep(300);
    }
}
catch (Exception e)
{
}
}
}