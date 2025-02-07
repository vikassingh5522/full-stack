// package all program.Java program.Multithreading;

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            System.out.println(n);
            // Thread.sleep(1000); unreported exception InterruptedException; must be caught or declared to be thrown
         

        }
    }
}

public class schedular {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     Thread.currentThread().interrupt();
        // }
        t2.start();
        // try {
        //     t2.join();
        // } catch (InterruptedException e) {
        //     Thread.currentThread().interrupt();
        // }
        t3.start();
        // try {
        //     t3.join();
        // } catch (InterruptedException e) {
        //     Thread.currentThread().interrupt();
        // }


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