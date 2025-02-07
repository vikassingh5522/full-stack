
// package Multithreading;
class A extends Thread {

    @Override
    public void run(){
       
        try{
            for(int i=0; i<10; i++){
                System.out.println("vikas");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
    }
}

class B {
    public static void main(String[] args) throws Exception {

        A t = new A();
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("vishal ");
            Thread.sleep(1000);
        }

    }
}