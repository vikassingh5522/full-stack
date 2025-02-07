// package all program.Java program.Multithreading;

// import javax.lang.model.element.Name;

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {

            System.out.println(n);
           
         

        }
    }
}

public class suspendandresume{
    public static void main(String[] args) {
        A t1 = new A(); // now t1 is wating 
        A t2 = new A(); /// it executes full than t1 and t3 will work
        A t3 = new A(); // now t3 is wating

        t1.setName("Thread 1-- vikas");
        t2.setName("Thread 2-- gill");
        t3.setName("Thread 3-- ankita");

        // join 
        t2.start();
        t2.suspend();  // pause

        t1.start();
        t3.start();

        t2.resume();  // restart

        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(n);

        }
    }
}
// output
//   vikas
//   ankita

//   vikas
//   gill
//   ankita

//   gill
//   vikas
//   ankita


// in java  1.1
//  [removal] suspend() in Thread has been  🫡✅🕵️deprecated and marked for removal
// t2.suspend();  // pause
// ^
// suspendandresume.java:35: warning: [removal] resume() in Thread has been deprecated and marked for removal
// t2.resume();  // restart
// ^
// 2 warnings
// Exception in thread "main" Thread 2-- gill
// java.lang.UnsupportedOperationException
// Thread 2-- gill
// Thread 2-- gill
// at java.base/java.lang.Thread.suspend(Thread.java:1826)
// at suspendandresume.main(suspendandresume.java:30)