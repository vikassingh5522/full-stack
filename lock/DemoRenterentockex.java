import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	ReentrantLock lockob = new ReentrantLock();
	void increament() 
	{
		//lockob.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println(Thread.currentThread().getName()+" - "+counter+" - InWaiting:: "+lockob.getQueueLength());
				try{Thread.sleep(700);}catch(Exception e){}
			}
		}
		catch(Exception e){}
		finally
		{
			// lockob.unlock();
		}
	}
}
class DemoRenterentockex
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();

		Thread t1=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t1.start();

		try{Thread.sleep(2000);}catch(Exception e){}

		Thread t2=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t2.start();

		try{Thread.sleep(2000);}catch(Exception e){}

		Thread t3=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t3.start();
	}
}
