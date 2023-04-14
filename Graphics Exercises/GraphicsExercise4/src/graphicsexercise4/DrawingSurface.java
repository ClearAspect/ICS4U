/*
Roan Mason
04/12/23
Grapics exercises JPanel for drawing and image output
 */
package graphicsexercise4;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author roanm
 */
public class DrawingSurface extends JPanel implements Runnable{
    
    private Ball ball;
    private int deltaX, deltaY;
    
    private Thread animator;
    private final int DELAY = 17; //17 is for ~60fps

    
    public DrawingSurface() {
        ball = new Ball(0,0, 10, 10);
        deltaX = 2;
        deltaY = 1;
    }
    
    /**
     * Does the actual drawing
     * @param g - the Graphics object to draw with
     */
     private void draw(Graphics g) {        
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        ball.draw(g2d);
        
    }
    
    @Override
    /**
     * Overrides paintComponent in JPanel class so that we can do our own custom
     * painting
     */
    public void paintComponent(Graphics g) {        
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        draw(g); //invoke our custom drawing method
    }
    
    public void update() {
        if ((ball.getX() + ball.getWidth() + deltaX) > GraphicsExercise4.getScreenWidth() || (ball.getX() + deltaX) < 0) {
            deltaX = -deltaX;
        }
        if ((ball.getY() + ball.getHeight() + deltaY) > GraphicsExercise4.getScreenHeight() || (ball.getY() + deltaY) < 0) {
            deltaY = -deltaY;
        }
        
        ball.update(deltaX, deltaY);
        
    }
    
    
    //this method is called after the JPanel is added to the JFrame
    //we can perform start up tasks here
    @Override
    public void addNotify() {
        super.addNotify();

        animator = new Thread(this);
        animator.start();
    }
    
    //this method is called only once, when the Thread starts
    @Override
    public void run() {

        long beforeTime, timeDiff, sleep;
        //get the current time
        beforeTime = System.currentTimeMillis();

        while (true) { //this loop runs once ever 25 ms (the DELAY)

            //update the balls position
            update();
            //redraws the screen (calling the paint component method)
            repaint();
            
            //calculate how much time has passed since the last call
            //this allows smooth updates and our ball will move at a constant speed (as opposed to being dependent on processor availability)
            timeDiff = System.currentTimeMillis() - beforeTime;
            
            //calculate how much time to wait before the next call
            sleep = DELAY - timeDiff;
            
            //always wait at least 2 ms
            if (sleep < 0) {
                sleep = 2;
            }

            //try to actually wait
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                //threads can be interrupted from other threads
                JOptionPane.showMessageDialog(this, "Thread interrupted: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            //get the new current time
            beforeTime = System.currentTimeMillis();
        }
    }
}
