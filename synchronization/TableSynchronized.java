class Table {
    public synchronized void printTable(int n) { // synchronized method ensures one thread at a time
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " x " + i + " = " + (n * i));
            try 
            {
                Thread.sleep(500); // Adding delay to simulate real-world execution
            } 
            catch (InterruptedException e)
             {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;
    
    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;
    
    Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(4);
    }
}

public class TableSynchronized {
    public static void main(String[] args) {
        Table t = new Table(); // Single shared Table instance

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t); // Fixed: Using Thread2 instead of Thread1

        t1.start();
        t2.start();
    }
}
