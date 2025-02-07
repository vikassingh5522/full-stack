
	// Using different lock object in the caller

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
    class DemoRenterentock1
    {
        public static void main(String[] args) 
        {
            Runner ob=new Runner();
            Lock lock=new ReentrantLock();
            Lock lock1=new ReentrantLock();
    
            Thread t1=new Thread(){
                public void run()
                {
                    lock.lock();
                    try
                    {
                        ob.increament();
                    }
                    catch (Exception e)	{}
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
                    lock1.lock();
                    try
                    {
                        ob.increament();
                    }
                    catch (Exception e)	{}
                    finally
                    {
                        lock1.unlock();
                    }
                }
            };
            t2.start();
        }
    }    