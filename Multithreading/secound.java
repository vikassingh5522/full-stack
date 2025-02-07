
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A is child of Thread A");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}

public class secound {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        // a.start();

        Thread t = new Thread(a);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }

    }
}