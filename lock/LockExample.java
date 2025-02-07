import java.util.concurrent.locks.*;

class LockExample {
    private final Lock lock = new ReentrantLock();
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();
    private final Condition condition = lock.newCondition();

    private int count = 0;

    // ReentrantLock usage
    public void incrementWithLock() {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            condition.signalAll(); // Notify waiting threads
        } finally {
            lock.unlock();
        }
    }

    public void waitForCondition() {
        lock.lock();
        try {
            while (count < 5) {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                condition.await(); // Wait until count reaches 5
            }
            System.out.println(Thread.currentThread().getName() + " resumed as count is " + count);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    // ReadWriteLock usage
    public void readCount() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " read count: " + count);
        } finally {
            readLock.unlock();
        }
    }

    public void writeCount(int value) {
        writeLock.lock();
        try {
            count = value;
            System.out.println(Thread.currentThread().getName() + " wrote count: " + count);
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample example = new LockExample();

        // Writer thread
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                example.incrementWithLock();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "WriterThread").start();

        // Reader threads
        new Thread(example::readCount, "ReaderThread1").start();
        new Thread(example::readCount, "ReaderThread2").start();

        // Condition waiting thread
        new Thread(example::waitForCondition, "ConditionThread").start();
    }
}
