import java.util.Random;

class Cart extends Thread {
    double bill = 0.0;

    public double getBill() {
        return bill;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }

            System.out.println("Waiting....." + i);
        }

        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                }

                int price = new Random().nextInt(200);
                System.out.println("Item " + (i + 1) + " Price: " + price);

                bill = bill + price;
            }
            this.notify();
        }
    }
}

public class ShoppingMain {  // Changed class name to PascalCase
    public static void main(String[] args) {
        Cart c1 = new Cart();
        c1.start();

        synchronized (c1) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                }

                System.out.println("Main()....." + i);

                if (i == 10) {
                    try {
                        c1.wait();
                    } catch (Exception e) {
                    }
                }
            }
        }

        System.out.println("Total Bill: " + c1.getBill());
    }
}
