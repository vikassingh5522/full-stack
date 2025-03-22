import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("FlowLayout Example");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create some buttons and add them to the frame
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

