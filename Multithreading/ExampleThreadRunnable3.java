// calling start() from outside

class DemoThread implements Runnable
{
	Thread t=null;
	public  DemoThread() {
		t=new Thread(this);
		t.setName("Dthread");
	}
	public void run() {
		for(int i=0 ;i<20 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class ExampleThreadRunnable3
{
	public static void main(String[] args) 
	{
		System.out.println("Main start....!!");
		DemoThread d1 = new DemoThread();
		d1.t.start();
		for(int i=0 ;i<20 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(400);}catch(Exception e){}
		}
		System.out.println("main() end..!");
	}
}
