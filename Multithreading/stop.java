// package all program.Java program.Multithreading;

class A extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(name);
            Thread.yield();
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
        }
    }
}
class B extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(name);
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
            
        }
    }
}


public class stop{ 
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        

         t1.setName("t1 vikas");
         t2.setName("t2 vishal");
     

        t1.stop();
        t2.start();

       
    }
    
}

// output
//  vishal


// warning: [removal] stop() in Thread has been deprecated and marked for removal
//         t1.stop();
//           ^
// 1 warning
// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.lang.Thread.stop(Thread.java:1667)
//         at stop.main(stop.java:46)
