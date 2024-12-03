import java.util.Scanner;

class DemoCharArray {
    public static void main(String[] args) {
        char[] ch; // create reference array
        char[] ch1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // initialize a char array
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the string:");
        String str = sc.nextLine();
        System.out.println("\nEntered string: " + str);

        ch = str.toCharArray(); // convert string to char array
        System.out.println("Converted string to char array:");
        for (char c : ch) {
            System.out.print(" " +c); // Print each character on a new line
        }

        // sc.close(); // Close scanner to free resources
    }
}
