
package smilingfacetestharnessidcp2;

import TurtleGraphics.*;
import java.awt.Color;

public class SmilingFace {
    private StandardPen pen;
    private double xPosition, yPosition;
    
    /**
     * Constructor that creates SmilingFace object with default attributes 
     */
    public SmilingFace(){
        xPosition = 0;
        yPosition = 0;
        pen = new StandardPen(500,500);
        pen.setColor(Color.red);
    }
    
    /**
     * Constructor that creates SmilingFace object with position attributes
     * @param x - horizontal axis position
     * @param y - vertical axis position
     */
    public SmilingFace(double x, double y){
        this(); 
        xPosition = x;
        yPosition = y;        
    }
    
    /**
     * draws the smiling face
     */
    public void draw(){
        double radius = 50;
        
        //draw big circle for face
        drawCircle(xPosition, yPosition, radius);
        
        //draw small circle for left eye
        drawCircle(xPosition - radius / 2.5, yPosition + radius /3, radius / 4);
        //draw small circle for righ eye
        drawCircle(xPosition + radius / 2.5, yPosition + radius /3, radius / 4);
          
        
        //Lines will be finished later
        drawLine(xPosition - radius /3, yPosition - radius / 2, xPosition + radius / 3, yPosition - radius / 2);
        
        drawLine(xPosition - radius /3, yPosition - radius / 2, xPosition - radius / 3 - 5, yPosition - radius / 2 + 5);
        
        drawLine(xPosition + radius /3, yPosition - radius / 2, xPosition + radius / 3 + 5, yPosition - radius / 2 + 5);
    }
    /**
     * Changes color of pen to the background and redraws the face to erase it then changes color back to red
     */
    public void erase(){
        pen.setColor(Color.white);
        draw();
        pen.setColor(Color.red);
    }
    /**
     * Mutator that changes the x and y position of the smiling face
     * @param x - horizontal axis position
     * @param y - vertical axis position
     */
    public void move(double x, double y){
        xPosition = x;
        yPosition = y;
    }
    
    
    /**
     * draws a circle on the screen
     * @param x - horizontal axis position
     * @param y - vertical axis position
     * @param r - radius
     */
    private void drawCircle(double x, double y, double r){
        double side = 2.0 * Math.PI * r / 120.0;
        pen.up();
        pen.move(x+r, y-side / 2.0);
        pen.setDirection(90);
        pen.down();
        for(int i = 0; i <120; i++){ //pen is put down to draw the circle.
            pen.move(side);
            pen.turn(3);
        }
    }
    
    private void drawLine(double x1, double y1, double x2, double y2){
        //method stub, will be completed later
    }
}
