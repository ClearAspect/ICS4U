/*
 * B Cutten
    Nov 2021
    A class which allows drawing, because it extends JPanel, by way of the 
    Graphics2D class
    Because this class is only going to ever be used by the Graphics2DTester, it could be 
    included in the same file (Graphics2DTester.java)
 */

package recursionexercise6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel {

    private static Graphics2D g2d;

    /**
     * Does the actual drawing
     * 
     * @param g - the Graphics object to draw with
     */
    private void doDrawing(Graphics g) {
        // the Graphics2D class is the class that handles all the drawing
        // must be casted from older Graphics class in order to have access to some
        // newer methods
        g2d = (Graphics2D) g;
        // draw a string on the panel
        g2d.setColor(Color.BLUE);
        fractal(0, 0, 100);

    }

    public static void fractal(int x, int y, int radius) {
        if (radius > 1) {
            g2d.drawRect(x+250-radius, y+250-radius, 2 * radius, 2 * radius);
            fractal(x - radius, y - radius, radius / 2);
            fractal(x - radius, y + radius, radius / 2);
            fractal(x + radius, y - radius, radius / 2);
            fractal(x + radius, y + radius, radius / 2);
        }

    }

    @Override
    /**
     * Overrides paintComponent in JPanel class so that we can do our own custom
     * painting
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);// does the necessary work to prepare the panel for drawing
        doDrawing(g); // invoke our custom drawing method
    }
}
