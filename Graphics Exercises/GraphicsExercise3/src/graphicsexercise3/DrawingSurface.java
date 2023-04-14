/*
Roan Mason
04/12/23
Grapics exercises JPanel for drawing and image output
 */
package graphicsexercise3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author roanm
 */
public class DrawingSurface extends JPanel{
    
    /**
     * Does the actual drawing
     * @param g - the Graphics object to draw with
     */
     private void draw(Graphics g) {        
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        //draw a string on the panel        
        
        Image skater = new ImageIcon(this.getClass().getResource("/graphicsexercise3/Skater.jpg")).getImage();
        g2d.drawImage(skater, 0, 0,this);
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
}
