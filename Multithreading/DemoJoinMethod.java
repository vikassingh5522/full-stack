	// Using the join() and isAlive()

	
	// The join() method in Java is a part of the Thread class and is used to ensure that one thread waits for 
	// the completion of another thread before proceeding further. It provides a way to pause the execution of 
	// the current thread until the thread on which join() is called finishes its execution.

	// public final void join() throws InterruptedException
	// public final void join(long millis) throws InterruptedException
	// public final void join(long millis, int nanos) throws InterruptedException

	// The current thread will wait for the specified number of milliseconds for the target thread to complete. 
	// If the target thread does not finish in that time, the current thread resumes execution.


	// isAlive(): 

	// The isAlive() method in Java is part of the Thread class and is used to check whether a thread is currently 
	// active or alive. A thread is considered alive when it has been started and has not yet finished its execution.

	// returns true: If the thread has been started (using start()) and has not yet terminated. otherwise false

class MyThread extends Thread
{
	public void run() {
		for(int i=0 ; i<20 ; i++) {
			System.out.println(this.getName()+" - "+i);
			try{ Thread.sleep(600); } catch(Exception e){}
		}
	}
}
class YourThread extends Thread
{
	public YourThread() {
		super("Test_Thread");
	}
	public void run() {
		for(int i=0 ; i<20 ; i++) {
			System.out.println(this.getName()+" - "+i);
			try{ Thread.sleep(200); } catch(Exception e){}
		}
	}
}
class DemoJoinMethod
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
        
		YourThread t2 = new YourThread();
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.start();
        
        	for(int i=0 ; i<20 ; i++) {
			System.out.println("main - "+i);
			System.out.println("T2 is Alive - "+t2.isAlive());
			try{ Thread.sleep(600); } catch(Exception e){}
            
			if(i==5) {
				try{ t2.join(); } catch(Exception e){}
			}
		}
		
	}
}

