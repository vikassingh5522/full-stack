
	// Creating the main and one userdefined thread

    class MyThread extends Thread
    {
        public MyThread() {
            System.out.println("Thread is created...!!");
        }
        public void run() {
            for(int i=0 ;i<20 ; i++) {
                System.out.println(this);
                try{Thread.sleep(200);}catch(Exception e){}
            }
        }
    }
    class ThreadExample1
    {
        public static void main(String[] args) 
        {
            System.out.println("main() started..!");
            MyThread t1 = new MyThread();
            t1.start();
            System.out.println("T1 is Running: "+t1.isAlive());
            for(int i=0 ;i<20 ; i++) {
                System.out.println(Thread.currentThread());
                try{Thread.sleep(400);}catch(Exception e){}
            }
            System.out.println("main() end..!");
        }
    }
    