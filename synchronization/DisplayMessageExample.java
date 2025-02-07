
// Thread Synchronization
// ------------------------

// Synchronization is a process of handling resource accessibility by multiple thread requests. The main purpose 
// of synchronization is to avoid thread interference. At times when more than one thread try to access a shared 
// resource, we need to ensure that resource will be used by only one thread at a time. The process by which 
// this is achieved is called synchronization. 

// in simple terms, When two or more threads need access to a shared resource, they need some way to ensure that 
// the resource will be used by only one thread at a time. The process by which this is achieved is called 
// synchronization. Java implements synchronization through use of the synchronized keyword.

// Why we need Syncronization?
// If we do not use syncronization, and let two or more threads access a shared resource at the same time, it 
// will lead to distorted results.

// Lets consider the Shared Resource (Object of Message class), which is accessed by multiple threads.

class Message
{
public void show() {
    System.out.println("Hello ");
    System.out.println("All ");
    System.out.println("good ");
    try{ Thread.sleep(1600); } catch(Exception e){}
    System.out.println("afternoon ");
    System.out.println("to ");
    System.out.println("all ");
    try{ Thread.sleep(2600); } catch(Exception e){}
    System.out.println("of ");
    System.out.println("you ");
}
}
class DemoThread extends Thread
{
Message msg;
public DemoThread(Message ob) {
    msg = ob;
}
public void run() {
    msg.show();
}
}
class DisplayMessageExample
{
public static void main(String[] args) 
{
    Message ob = new Message();

    DemoThread t1 = new DemoThread(ob);
    t1.start();

    DemoThread t2 = new DemoThread(ob);
    t2.start();
}
}
