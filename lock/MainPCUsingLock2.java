/// producer-consumer using lock again

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
    private int value;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public Resource() {
        value = 0;
    }

    public int getValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void incr() {
        lock.lock();
        try {
            while (value == 1) {
                try {
                    notFull.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value++;
            System.out.println("After Produce Value is: " + value);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public void decr() {
        lock.lock();
        try {
            while (value == 0) {
                try {
                    notEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value--;
            System.out.println("After consume Value is: " + value);
            notFull.signal();
        } finally {
            lock.unlock();
        }
    }
}

class Producer extends Thread {
    Resource res;

    public Producer(Resource res) {
        this.res = res;
        start();
    }

    public void run() {
        while (true) {
            res.incr();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Resource res;

    public Consumer(Resource res) {
        this.res = res;
        start();
    }

    public void run() {
        while (true) {
            res.decr();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainPCUsingLock2 {
    public static void main(String[] args) {
        Resource ob = new Resource();

        Producer p = new Producer(ob);
        Consumer c = new Consumer(ob);
    }
}