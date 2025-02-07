// package all program.Java program.Multithreading;

class A extends Thread
{
    public void run()
    {
        System.out.println("\n A isAline method running");
    }
}


public class isAlive {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 =   new A();

        System.out.println(t1.isAlive()); //-- false
        t1.start();
        System.out.println(t2.isAlive()); //-- True
        t2.start();
        System.out.println(t2.isAlive());
        
    }
    
}
