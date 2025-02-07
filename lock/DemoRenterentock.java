// // Using lock() in caller, rather than resource:

// It is allowed to use a lock() within caller, rather than resource, only 
// condition is that,

//     - Every call must be within the lock()-unlock().

//     - Same lock object must be used for locking and unlocking, if different
//       lock object is used then we will get the parallel execution of threads.

// // Using same lock object in caller

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
int counter=0;
void increament()
{
    for(int i=0;i<10;i++)
    {
        counter++;
        System.out.println(Thread.currentThread().getName()+" - "+counter);
        try{Thread.sleep(700);}catch(Exception e){}
    }
}
}
class DemoRenterentock
{
public static void main(String[] args) 
{
    Runner ob=new Runner();
    Lock lock=new ReentrantLock();

    Thread t1=new Thread(){
        public void run()
        {
            lock.lock();
            try
            {
                ob.increament();
            }
            catch (Exception e){}
            finally
            {
                lock.unlock();
            }
        }
    };
    t1.start();

    Thread t2=new Thread(){
        public void run()
        {
            lock.lock();
            try
            {
                ob.increament();
            }
            catch (Exception e){}
            finally
            {
                lock.unlock();
            }
        }
    };
    t2.start();
}
}