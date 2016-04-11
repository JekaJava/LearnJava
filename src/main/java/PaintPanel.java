import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;

/**
 * Created by Roxy on 05.04.2016.
 */

/**
 * This class extends JPanel. It overrides
 * the paintComponent() method so that random
 * lines are plotted in the panel.
 */
class PaintPanel extends JPanel {

    private Random random; // used to generate random numbers

    PaintPanel() {
        Border lineBorder = BorderFactory.createLineBorder(Color.getHSBColor(154, 222, 94), 3);
        setBorder(lineBorder);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call the superclass method first.

        int width = getWidth();
        int height = getHeight();
        int x = 400;
        int y = 400;
        /*int Center = width/7;
        int largeDiameter = width;
        int smallDiameter = width/2;*/


        g.setColor(Color.RED);
        g.drawOval(x,y,getWidth(),getHeight());

        /*
        g.setColor(Color.ORANGE);
        g.drawOval(0,0,getWidth()/7,getHeight()/7);

        g.setColor(Color.YELLOW);
        g.drawOval(0,0,getWidth()/6,getHeight()/6);
        */


       /* for (int i = 0; i < 7; i++) {
            g.drawOval(height-5, width-5, 50+(i*10),100);
            g.setColor(Color.ORANGE);
        }*/
    }
}

/**
 * Demonstrate painting directly onto a panel.
 */
class PaintDemo {

    PaintDemo() {
        // Create a new JFrame container.
        JFrame frame = new JFrame("Paint Demo");

        // Give the frame an initial size.
        frame.setSize(500, 500);

        // show on the center of the screen
        frame.setLocationRelativeTo( null );// null - no panels ,relative to which to locate

        // Terminate the program when the user closes the application.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel that will be painted.
        PaintPanel paintPanel = new PaintPanel();

        // Add the panel to the content pane. Because the default
        // border layout is used, the panel will automatically be
        // sized to fit the center region.
        frame.add(paintPanel);// добавляем рисовалку в окно

        // Display the frame.
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintDemo();
            }
        });
    }
}
