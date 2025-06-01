import java.awt.*;
import javax.swing.*;
public class ExtendedGraphicsDemo extends JPanel {
    public ExtendedGraphicsDemo() {
        setBackground(Color.LIGHT_GRAY); // Set background color
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw and fill rectangle
        g.setColor(Color.BLUE);
        g.drawRect(30, 30, 100, 60);
        g.fillRect(30, 30, 100, 60);
        // Draw and fill oval
        g.setColor(Color.GREEN);
        g.drawOval(160, 30, 100, 60);
        g.fillOval(160, 30, 100, 60);
        // Draw a triangle using polygon
        g.setColor(Color.MAGENTA);
        int[] x = {300, 340, 280};
        int[] y = {30, 80, 80};
        g.fillPolygon(x, y, 3);
        // Draw a line
        g.setColor(Color.BLACK);
        g.drawLine(30, 120, 360, 120);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Extended Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 250);
        frame.add(new ExtendedGraphicsDemo());
        frame.setVisible(true);
    }
}