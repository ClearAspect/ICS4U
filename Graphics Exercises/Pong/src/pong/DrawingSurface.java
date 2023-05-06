/*
Roan Mason
04/12/23
Grapics exercises JPanel for drawing and image output
 */
package pong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author roanm
 */
public class DrawingSurface extends JPanel implements Runnable, KeyListener{
    
    private Ball ball;
    private int deltaX, deltaY;
    
    private Player player1, player2;
    
    private Thread animator;
    private final int DELAY = 17; //17 is for ~60fps

    
    public DrawingSurface() {
        ball = new Ball(Pong.getScreenWidth()/2-5,Pong.getScreenHeight()/2-5, 10, 10);
        player1 = new Player(true);
        player2 = new Player(false);
        player2.setX(700);
        player1.setX(100);
        deltaX = 3;
        deltaY = 3;

        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
        
    }
    
    /**
     * Does the actual drawing
     * @param g - the Graphics object to draw with
     */
     private void draw(Graphics g) {        
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(0, 0, Pong.getScreenWidth(), Pong.getScreenHeight());
        ball.draw(g2d);
        player1.update();
        player1.draw(g2d);
        player2.update();
        player2.draw(g2d);
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
    
    public void paddleCollide(Player player) {
        //Outdated comment
        //If the new right most side of the ball touches player2
        //The y value of the ball is between the y value of player 2
        //change direction (Bounce of of the paddle)
        if ((ball.getX() + ball.getWidth() + deltaX) > player.getX() && (ball.getX() + deltaX) < (player.getX() + player.getWidth()) && ball.getY() >= player.getY() && ball.getY() <= (player.getY() + player.getHeight())) {
            deltaX = -deltaX;
        }
    }
    
    public void update() {
        paddleCollide(player1);
        paddleCollide(player2);
        
        
        //Wall detection that doesnt need to be used quite yet
        if ((ball.getX() + ball.getWidth() + deltaX) > getWidth() || (ball.getX() + deltaX) < 0) {
            deltaX = -deltaX;
        }
        if ((ball.getY() + ball.getHeight() + deltaY) > getHeight() || (ball.getY() + deltaY) < 0) {
            deltaY = -deltaY;
        }

        ball.update(deltaX, deltaY);

    }

    //this method is called after the JPanel is added to the JFramex
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
    
    @Override
    public void keyReleased(KeyEvent e) {
        player1.keyReleased(e);
        player2.keyReleased(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        player1.keyPressed(e);
        player2.keyPressed(e);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        player1.keyTyped(e);
        player2.keyTyped(e);
    }
}
