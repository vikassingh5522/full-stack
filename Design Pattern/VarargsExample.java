
public class VarargsExample {
    public void display(String... messages) {
        if (messages.length == 0) {
            System.out.println("Default message");
        } else {
            for (String message : messages) {
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();
        example.display(); // Output: Default message
        example.display("Custom message 1", "Custom message 2"); // Output: Custom message 1 Custom message 2
        example.display("One", "Two", "Three" , "Four"); // Output: 
    }
}
