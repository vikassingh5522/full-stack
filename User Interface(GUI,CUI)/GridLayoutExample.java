	// GridLayout: 

	// GridLayout in java.awt arranges components in a grid of rows and columns. All components in a GridLayout are of equal size. 
	// Here's a simple example demonstrating the use of GridLayout:

import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("GridLayout Example");

        // Set GridLayout for the frame (3 rows, 2 columns)
        frame.setLayout(new GridLayout(3, 2));

        // Create buttons for the grid
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        // Add window listener to handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
