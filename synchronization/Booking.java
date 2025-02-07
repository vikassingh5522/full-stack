// package all program.Java program.Multithreading.synchronization;

// class Buss implements Runnable{

//     int available=1,passenger;
//    public void buss(int passenger)
//     {
//             this.passenger = passenger;  // passenger value 1
//     }
//     public void run() // t1 , t2 , t3
//     {

//         String name = Thread.currentThread().getName();
//         if(available >=passenger) // 1>=1
//         {
//           System.out.println(name+"\n Reversed seat ..!");
//           available=available -passenger;
//         }
//         else{
//             System.out.println("sorry seat is not available .. !");
//         }
//     }
// }
// public class setbooking {
//     public static void main(String[] args) {
//         Buss r=new Buss();

//         Thread t1 = new Thread(r);
//         Thread t2 = new Thread(r);
//         Thread t3 = new Thread(r);

//         t1.setName("vikas");
//         t2.setName("vishal");
//         t3.setName("vandana");

//         t1.start();
//         t2.start();
//         t3.start();

//     }

// }
// vikas
//  Reversed seat ..!
// vandana
//  Reversed seat ..!
// vishal
//  Reversed seat ..!

// problem 

// solvation
class Buss implements Runnable {

     int available = 1;
     int passenger;

    public void bookSeat(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run() {

        String name = Thread.currentThread().getName();
        if (available >= passenger) 
        {
            System.out.println(name + "\n Reversed seat ..!");
            available = available-passenger;
        } else {
            System.out.println("sorry seat is not available  .. !");
        }
    }
}

public class Booking {
    public static void main(String[] args) {
        Buss r = new Buss();
        r.bookSeat(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("vikas");
        t2.setName("vishal");
        t3.setName("vandana");

        t1.start();
        t2.start();
        t3.start();
    }
}