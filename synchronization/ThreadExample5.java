	// Using ThreadGroup

    class MyThread extends Thread
    {
        public MyThread() {
            System.out.println("Default - MyThread is created...!!");
        }	
        public MyThread(ThreadGroup tg, String name) {
            super(tg, name);
            System.out.println("Para - MyThread is created...!!");
        }
        public void run() {
            for(int i=0 ;i<20 ; i++) {
                System.out.println(this);
                try{Thread.sleep(200);}catch(Exception e){}
            }
        }
    }
    class YourThread extends Thread
    {
        public YourThread() {
            System.out.println("Default - YourThread is created...!!");
        }	
        public YourThread(ThreadGroup tg,String name) {
            super(tg, name);
            System.out.println("Para - YourThread is created...!!");
        }
        public void run() {
            for(int i=0 ;i<20 ; i++) {
                System.out.println(this.getName());
                try{Thread.sleep(200);}catch(Exception e){}
            }
        }
    }
    class ThreadExample5
    {
        public static void main(String[] args) 
        {
            System.out.println("main() started..!");
    
            ThreadGroup tg = new ThreadGroup("MyGroup");
    
            MyThread t1 = new MyThread(tg,"One");
            t1.setPriority(1);
            t1.start();
    
            YourThread t2 = new YourThread(tg,"Two");
            t2.setPriority(10);
            t2.start();
    
            System.out.println("T1 is Running: "+t1.isAlive());
            for(int i=0 ;i<20 ; i++) {
                System.out.println(Thread.currentThread().getName());
                try{Thread.sleep(400);}catch(Exception e){}
            }
            System.out.println("main() end..!");
        }
    }