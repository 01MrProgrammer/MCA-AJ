import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleGUI {
// Constructor to set up the GUI components
public SimpleGUI() {
// Create a JFrame (window) container
JFrame frame = new JFrame("Swing GUI Example");
// Set the layout for the frame
frame.setLayout(new FlowLayout());
// Create a JLabel to display some text
JLabel label = new JLabel("Hello, welcome to Swing!");
frame.add(label);
// Create a JButton that the user can click
JButton button = new JButton("Click Me");
frame.add(button);
// Event handling: When the button is clicked, the label's text changes
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
label.setText("Button Clicked! Text Changed.");
}
});
// Set the frame's size and make it visible
frame.setSize(300, 150);
frame.setVisible(true);
// Close the application when the user closes the window
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
// Run the GUI on the Event Dispatch Thread (recommended for Swing)
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new SimpleGUI(); // Create an instance of the SimpleGUI class
}
});
}
}