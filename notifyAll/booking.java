

class TotalEarning extends Thread{
    int total = 0;
    public void run() {
        synchronized(this) {
        for(int i = 0; i <10;i++)
        {
            total = total + 100;
        }
        this.notify();
    }
    }
}
public class booking {
    public static void main(String[] args) throws Exception{
        TotalEarning t1 = new TotalEarning();
        t1.start();
        //System.out.println("total earning: " + t1.total+"Rs");

        synchronized(t1){
            t1.wait();
            System.out.println("total earning: " + t1.total+"Rs");
        }
    }
    
}
