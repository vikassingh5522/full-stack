
// The synchronized keyword in Java is used to handle thread synchronization, ensuring that only one 
// thread can access a critical section of code at a time. This prevents race conditions and ensures 
// thread safety when multiple threads are accessing shared resources.

// When a thread enters a synchronized block or method, it acquires a lock (monitor) on the object or 
// class. Other threads trying to execute synchronized code on the same object or class must wait until 
// the lock is released.

// Note some important terms:

// - A lock is a mechanism that allows only one thread to access a shared resource (like a variable or a 
//   critical section of code) at a time. Locks ensure mutual exclusion, preventing data inconsistency 
//   caused by concurrent access.

//     - Every object in Java has an intrinsic lock or monitor lock, which is used in conjunction with 
//       the synchronized keyword.
//     - Explicit locks, like those provided by java.util.concurrent.locks.Lock, offer more advanced 
//       features such as try-lock and timed-lock.

// - A monitor is a synchronization construct that is built into each Java object. It combines:
//     - Mutual exclusion (lock): Ensures that only one thread can execute a synchronized method or 
//       block at a time.
//     - Thread coordination (wait/notify): Helps threads coordinate their execution using methods 
//       like wait(), notify(), and notifyAll().
//    A monitor is automatically associated with a synchronized method or block in Java. When a thread enters 
//    a synchronized method or block, it acquires the monitor lock for the object. No other thread can enter 
//    any synchronized code on the same object until the monitor is released.

// - A mutex is a synchronization primitive that ensures mutual exclusion, meaning only one thread can access 
//   a critical section at a time. It is conceptually similar to a lock, but the term is more general and widely 
//   used across programming languages.
//   In Java, the intrinsic lock of an object (used with synchronized) or explicit locks (like ReentrantLock) 
//   can act as a mutex.

// - A race condition occurs when two or more threads access shared data concurrently, and the result of the 
//   program depends on the timing of their execution. This often leads to unpredictable behavior or incorrect 
//   results.

class Message
{
synchronized public void show() {
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
class DisplayMessageExample1
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
