/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicsexercise1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
     private void doDrawing(Graphics g) {        
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        //draw a string on the panel
        
        //Backround
        g2d.setColor(Color.BLUE);//change color
        g2d.fillRect(0, 0, 300, 125);
        g2d.setColor(Color.GREEN);//change color
        g2d.fillRect(0, 125, 300, 75);
        
        //Head and arms
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(125, 25, 40, 40);
        g2d.fillOval(100, 65,35,15);
        g2d.fillOval(95, 40,15,35);
        g2d.fillOval(90,35,20,15);
        
        g2d.fillOval(155, 65,35,15);
        g2d.fillOval(180, 70,15,35);
        g2d.fillOval(180,95,20,15);
        
        //Legs
        g2d.setColor(Color.BLACK);
        g2d.fillRect(133, 120, 25, 50);
        
        //Shirt and shoes
        g2d.setColor(Color.GRAY);
        g2d.fillRoundRect(130, 65, 30, 60, 20, 20);
        g2d.fillRect(120, 65, 20, 15);
        g2d.fillRect(150, 65, 20, 15);
        g2d.fillRoundRect(130, 165, 30, 15, 5, 5);
        

    }
     
    
    @Override
    /**
     * Overrides paintComponent in JPanel class so that we can do our own custom
     * painting
     */
    public void paintComponent(Graphics g) {        
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g); //invoke our custom drawing method
    }
}
