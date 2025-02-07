// package all program.Java program.Multithreading;

// import javax.lang.model.element.Name;

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {

            System.out.println(n);
            try{ Thread.sleep(1000); } catch (InterruptedException e) { }
            System.out.println("child thread secound"+i);

        }
    }
}

public class join {
    public static void main(String[] args) {

        A t1 = new A(); // now t1 is wating 
        A t2 = new A(); /// it executes full than t1 and t3 will work
        A t3 = new A(); // now t3 is wating

        t1.setName("Thread 1");

        t2.setName("Thread 2");

        // t3.setName("Thread 3");

        // join 
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
        }

        t1.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("main thread  parent is first " +i);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(n);

        }
    }
}