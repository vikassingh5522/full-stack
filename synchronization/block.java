class msg{
    public void show(String name){
                               // home
        ;;;;;;;;;;;;;;;;; // Local code
        synchronized(this){
            for(int i=0; i<3; i++){
                System.out.println("how are u "+name);
            }
        }


        ;;;;;;;;;;;;;;;;; // Local code
                            //school
    }
}
class ourThread extends Thread{

    msg m;
    String name;
    ourThread (msg m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.show(name);

    }
}
public class block {
    public static void main(String[] args) {
        msg m = new msg();
        ourThread t1 = new ourThread(m, "Rahul");
        ourThread t2 = new ourThread(m, "viaks ");
        ourThread t3 = new ourThread(m, "vishal");
        t1.start();
        t2.start();
        t3.start();
        
    }
}