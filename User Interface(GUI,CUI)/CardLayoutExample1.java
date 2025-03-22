	// // CardLayout: 

    // CardLayout in java.awt is a layout manager that allows you to display different components in the same area of a 
	// container, like a deck of cards. Only one component (or "card") is visible at a time. Here's a simple example demonstrating 
	// the use of CardLayout:



import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample1 {
    private Frame frame;
    private Panel cardPanel;
    private CardLayout cardLayout;

    public CardLayoutExample1() {
        frame = new Frame("CardLayout Example");

        // Create a Panel with CardLayout
        cardPanel = new Panel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Create panels for each "card"
        Panel card1 = new Panel();
        card1.setBackground(Color.RED);
        Label label1 = new Label("Card 1");
        card1.add(label1);

        Panel card2 = new Panel();
        card2.setBackground(Color.GREEN);
        Label label2 = new Label("Card 2");
        card2.add(label2);

        Panel card3 = new Panel();
        card3.setBackground(Color.BLUE);
        Label label3 = new Label("Card 3");
        card3.add(label3);

        // Add cards to the cardPanel with unique names
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Create buttons for navigation
        Panel buttonPanel = new Panel();
        Button prevButton = new Button("Previous");
        Button nextButton = new Button("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add the cardPanel and buttonPanel to the frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutExample1();
    }
}