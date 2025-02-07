
// Using Runnable Interface

class DemoAnoInterface
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started...!!!");

		Thread t1 = new Thread( new Runnable() {
			public void run() {
				for(int i=0 ; i<20 ; i++) {
					System.out.println("t1 - "+i);
					try{ Thread.sleep(1200); } catch(Exception e){}
				}
			}
		});
		t1.start();

		Thread t2 = new Thread( new Runnable() {
			public void run() {
				for(int i=0 ; i<20 ; i++) {
					System.out.println("t2 - "+i);
					try{ Thread.sleep(1200); } catch(Exception e){}
				}
			}
		});
		t2.start();

		for(int i=0 ; i<20 ; i++) {
				System.out.println("main - "+i);
				try{ Thread.sleep(1200); } catch(Exception e){}
		}

		System.out.println("Main ended...!!!");
	}
}
