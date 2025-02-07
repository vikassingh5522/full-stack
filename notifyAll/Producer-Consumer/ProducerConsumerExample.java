/// // Producer-Consumer Problem (Using wait() notify() )  - block synchronization implementation

// The Producer-Consumer Problem (sometimes called the Bounded-Buffer Problem) is a classic example of a 
// multi-threaded synchronization problem.

// The problem describes two threads, the Producer and the Consumer, and they are sharing a common, fixed-size 
// resource.

// The Producer produces an item, puts that item into the resource(increases value by 1), and keeps repeating this 
// process. On the other hand, the Consumer is consuming the item from the shared resource(decreases value by 1), 
// one item at a time.

class Resource {

    int value;
    {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void produce() {
        value++;  // value 1
        System.out.println("Produced - Value: " + value);
    }

    public void consume() {
        value--; // value 0
        System.out.println("Consumed - Value: " + value);
    }
}

class Producer extends Thread {
    Resource rob;

    public Producer(Resource rob) {
        this.rob = rob;
    }

    public void run() {
        synchronized (rob) 
        {
            for (int i = 0; i < 15; i++) 
            {
                if (rob.getValue() == 1) 
                {
                    try 
                    {
                        rob.wait();
                    } catch (Exception e) {}
                }
                try 
                {
                    Thread.sleep(300);
                } catch (Exception e) {}

                rob.produce();
                rob.notify();
            }
        }
    }
}

class Consumer extends Thread {
    Resource rob;
    public Consumer(Resource rob)
    {
        this.rob = rob;
    }
    public void run() 
    {
        synchronized (rob) 
        {
            for (int i = 0; i < 15; i++)
             {
                if (rob.getValue() == 0) 
                {
                    try 
                    {
                        rob.wait();
                    } catch (Exception e) {}
                }
                try
                {
                    Thread.sleep(300);
                } catch (Exception e) {} 
                rob.consume();
                rob.notify();
            }
        }
    }
}

class ProducerConsumerExample {
    public static void main(String[] args) {
        Resource rob = new Resource();

        Producer p = new Producer(rob);
        Consumer c = new Consumer(rob);

        p.start();
        c.start();
    }
}

