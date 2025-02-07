// package all program.Java program.Multithreading;

class thread1 extends Thread {

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
class thread2 extends Thread {
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
class thread3 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
            System.out.println(name);
            
        }
    }
}

public class yield0{ 
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();
        t2.start();
        t3.start();
    }
    
}
