
import java.util.Random;
class Message 
{
    String message;
    boolean empty = true;

    //Method used by reader
    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted.");
            }
        }
        empty = true;//Reader reads the message and marks empty as true.
        notifyAll();
        return message;//Reader reads the message.
    }

    //Method used by writer
    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted.");
            }
        }
        this.message = message;//Writer writes the message.
        empty = false;//Now make empty as false.
        notifyAll();
    }
}
class Writer implements Runnable 
{
    private Message message;

    public Writer(Message message) 
	{
        this.message = message;
    }

    public void run() 
	{
        String messages[] = {
                "Johnny, Johnny, Yes Papa",
                "Eating sugar? No, Papa!",
                "Telling lies? No, Papa!",
                "Open your mouth, Ha! Ha! Ha!"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) 
		{
            message.write(messages[i]);
            try 
			{
                Thread.sleep(random.nextInt(2000));
            } 
			catch (InterruptedException e) 
			{
                System.out.println("Writer Thread Interrupted!!!");
            }
        }
        message.write("Finished!");
    }
}

class Reader implements Runnable 
{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !"Finished!".equals(latestMessage); latestMessage = message.read()) 
	{
            System.out.println(latestMessage);
            try {Thread.sleep(random.nextInt(2000));} catch (InterruptedException e) 
	    {
                System.out.println("Reader Thread Interrupted!!!");
            }
        }
    }
}
public class MainReaderWriter1 
{
    public static void main(String[] args) 
	{
        //Shared message object between Reader and Writer threads.
        Message message = new Message();

        Thread writerThread = new Thread(new Writer(message));
        Thread readerThread = new Thread(new Reader(message));

        writerThread.start();
        readerThread.start();
    }

}