/*
 * B Cutten
    Nov 2021
    A class which allows drawing, because it extends JPanel, by way of the 
    Graphics2D class
    Because this class is only going to ever be used by the Graphics2DTester, it could be 
    included in the same file (Graphics2DTester.java)
 */

package recursionexercise7;

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

        //create the points from a centr point.
        double[] points = createPoints(800, 50, 50);

        g2d.setColor(Color.BLUE);
        sierpinskiTriangle(points[0], points[1], points[2], points[3], points[4], points[5], 8);
    }


    /**
     * a _______ b
     *   \    /
     *    \ /
     *     c
     * 
     * Uses math to calcuate the three points of the triangle. Using trig and length of lines(Scalar Multiple)
     * 
     * @param scalarMultiple - the length of the lines
     * @param topLeftX - the top left x coordinate
     * @param topLeftY - the top left y coordinate
     */
    public static double[] createPoints(int scalarMultiple, int topLeftX, int topLeftY) {
        double[] points;
        double ax, ay, bx, by, cx, cy;

        ax = topLeftX;
        ay = topLeftY;
        bx = ax + scalarMultiple;
        by = ay;
        cx = ax + (scalarMultiple / 2);
        double deltaY = Math.sin(Math.toRadians(60))*((scalarMultiple/2)/Math.sin(Math.toRadians(30)));
        cy = ay + deltaY;

        System.out.println("x: "+ax +", y: "+ay);
        System.out.println("x: "+bx +", y: "+by);
        System.out.println("x: "+cx +", y: "+cy);

        points = new double[] {ax, ay, bx, by, cx, cy};
        return points;
    }

    /**
     * 
     * Recurive method to draw a Sierpinski Triangle
     * if on level one then stop.
     * 
     * @param ax
     * @param ay
     * @param bx
     * @param by
     * @param cx
     * @param cy
     * @param level
     */
    public static void sierpinskiTriangle(double ax, double ay, double bx, double by, double cx, double cy, int level) {
        if (level > 1) {

            level--;


            double bigAx, bigAy, bigBx, bigBy, bigCx, bigCy;

            /*
             *a______C________b
             * \             /
             *  \          /
             * B \       / A
             *    \    /
             *     \ / 
             *      c
             * 
             * 
             */

            // "big" just means capitalized
            bigAx = bx - ((cx-ax)/2);
            bigAy = cy - ((cy-ay)/2);

            bigBx = ax + ((cx-ax)/2);
            bigBy = cy - ((cy-ay)/2);

            bigCx = ax + ((bx-ax)/2);
            bigCy = ay;

            //top left triangle
            sierpinskiTriangle(ax, ay, bigCx, bigCy, bigBx, bigBy, level);

            //top right triangle
            sierpinskiTriangle(bigCx, bigCy, bx, by, bigAx, bigAy, level);

            //bottom triangle
            sierpinskiTriangle(bigBx, bigBy, bigAx, bigBy, cx, cy, level);
        } else {
            g2d.drawLine((int)ax, (int)ay, (int)bx, (int)by);
            g2d.drawLine((int)bx, (int)by, (int)cx, (int)cy);
            g2d.drawLine((int)cx, (int)cy, (int)ax, (int)ay);
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
