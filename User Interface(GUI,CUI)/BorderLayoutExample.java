
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("BorderLayout Example");

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // Create buttons for each region
        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        // Add buttons to the frame with BorderLayout constraints
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

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

