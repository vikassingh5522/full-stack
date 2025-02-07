class DemoThread implements Runnable
{
	public void run() {
		for(int i=0 ;i<20 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class ExampleThreadRunnable 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start....!!");

		DemoThread d1 = new DemoThread();
        
		Thread t1 = new Thread(d1);
		t1.start();

		for(int i=0 ;i<20 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(400);}catch(Exception e){}
		}
		System.out.println("main() end..!");
	}
}