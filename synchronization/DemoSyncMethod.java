// In java, the synchronization is achieved using the following concepts.

// 	- Mutual Exclusion (Using Synchronized keyword)
// 	- Inter thread communication (wait(), notify() notifyAll() )


// 	Mutual Exclusion(Mutex) [Exclusion-The act of not allowing someone or something to take part in an activity or 
// 	to enter a place] Using the mutual exclusion process, we keep threads from interfering with one another while 
// 	they accessing the shared resource. In java, mutual exclusion is achieved using the following concepts.

// 	- Synchronized method
// 	- Synchronized block
// 	- Static synchronization.


// 	// - Synchronized method

// 	When a method defined using a synchronized keyword, it allows only one Thread to access resource at a time. 
// 	When an object calls a synchronized method, it put a lock on that method so that other objects or thread 
// 	that are trying to call the same method must wait, until the lock is released. Once the lock is released 
// 	on the shared resource, one of the threads among the waiting threads will be start using the shared 
// 	resource again.

// 	lets see the above exampe with the synchronized keyword...!!

class Resource
{
	private String []data = {"hello", "Good day", "to", "all", "of you","wish", "you ", "all the", "best"};
	
	synchronized public void show() {
		System.out.println("The Data is: ");
		for( int i=0 ; i<data.length ; i++ ) {
			try{ Thread.sleep(600); } catch(Exception e){}
			System.out.println(data[i]);
		}
	}
}
class DemoSyncMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");

		Resource rob = new Resource();

		// Thread 1
		Thread t1 = new Thread(){
			public void run() {
				rob.show();
			}
		};
		t1.start();

		// Thread 2
		Thread t2 = new Thread(){
			public void run() {
				rob.show();
			}
		};
		t2.start();

		System.out.println("Main ended");
	}
}

