// package all program.Java program.Multithreading;


class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++){

            try{Thread.sleep(1000);}catch(Exception e){};
            System.out.println("child thread "+Thread.currentThread().getName());
        }
    }
}
public class join1 {
    public static void main(String[] args) {

       
        demo t1=new demo();

        try{t1.join();}catch(Exception e){};
        
        t1.start();

        demo t2=new demo();

        try{t2.join();}catch(Exception e){};
        
        t2.start();


        for(int i=0;i<5;i++){

            try{Thread.sleep(1000);}catch(Exception e){};
            System.out.println("main  thread "+Thread.currentThread().getName());
        }

    }
    
}
