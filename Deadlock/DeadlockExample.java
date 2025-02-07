class DeadlockExample {

    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void method1() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked resource1");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked resource2");
            }
        }
    }

    public void method2() {
        synchronized (resource2) {
            System.out.println(Thread.currentThread().getName() + " locked resource2");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked resource1");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();

        Thread t1 = new Thread(example::method1, "Thread-1");
        Thread t2 = new Thread(example::method2, "Thread-2");
        

        t1.start();
        t2.start();
    }
}
