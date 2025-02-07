

import java.util.Random;
class Cart extends Thread
{
	Object lock;

	double bill=0.0;
    
	public Cart( Object lock) {
		this.lock = lock;
	}
	public double getBill(){return bill;}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{Thread.sleep(400);}catch(Exception e){}
				System.out.println("Waiting....."+i);
		}
		synchronized(lock)
		{
			for(int i=0;i<5;i++)
			{
			
				try{Thread.sleep(400);}catch(Exception e){}
				int price=new Random().nextInt(200);
				System.out.println("Item "+(i+1)+" Price: "+price);
				bill=bill+price;
			}
			lock.notify();
		}
	}
}
class TaskCaller extends Thread
{
	Object lock;
	Cart c1;
	public TaskCaller(Object lock, Cart c1) {
		this.lock = lock;
		this.c1 = c1;
	}
	public void run() {
		synchronized(lock)
		{
			for(int i=0;i<20;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
					System.out.println("Main()....."+i);
				if(i==10)
				{
					try{lock.wait();}catch(Exception e){}
				}
			}
		}
		System.out.println("Total Bill: "+c1.getBill());
	}
}
class ShoppingMainLock
{
	public static void main(String[] args) 
	{
		Object lock = new Object();

		Cart c1=new Cart(lock);
		c1.start();

		TaskCaller t1 = new TaskCaller(lock, c1);
		t1.start();
		
		
	}
}
