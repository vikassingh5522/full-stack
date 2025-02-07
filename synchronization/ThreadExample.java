class MyThread extends Thread
{
	public MyThread() {
		System.out.println("Thread is created...!!");
	}
	public void run() {
		System.out.println("Thread is Running...!!");
	}
}
class ThreadExample
{
	public static void main(String[] args) 
	{
		System.out.println("main() started..!");
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("T1 is Running: "+t1.isAlive());
		System.out.println("main() end..!");
	}
}