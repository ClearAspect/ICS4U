
package smilingfacetestharnessidcp2;

import TurtleGraphics.*;
import java.awt.Color;

public class SmilingFace {
    private StandardPen pen;
    private double xPosition, yPosition, radius;
    private Color faceColor;
    private boolean mood;
    
    
    /**
     * Constructor that creates SmilingFace object with default attributes 
     */
    public SmilingFace(){
        xPosition = 0;
        yPosition = 0;
        faceColor = Color.red;
        mood = true;
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
        int smileAngle = 5;
        
        //draw big circle for face
        drawCircle(xPosition, yPosition, radius);
        
        //draw small circle for left eye
        drawCircle(xPosition - radius / 2.5, yPosition + radius /3, radius / 4);
        //draw small circle for righ eye
        drawCircle(xPosition + radius / 2.5, yPosition + radius /3, radius / 4);
          
        if (!mood) {
            smileAngle = -5;
        }
        
        drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition + radius / 3, yPosition - radius / 2);
        
        drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition - radius / 3 - 5, yPosition - radius / 2 + smileAngle);
        
        drawLine(xPosition + radius / 3, yPosition - radius / 2, xPosition + radius / 3 + 5, yPosition - radius / 2 + smileAngle);

    }
    /**
     * Changes color of pen to the background and redraws the face to erase it then changes color back to red
     */
    public void erase(){
        pen.setColor(Color.white);
        draw();
        pen.setColor(faceColor);
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
    
    /**
     * Draws lines
     * @param x1 - distance from starting x position and initial x position
     * @param y1 - distance from starting y position and initial y position
     * @param x2 - distance from final x position and starting x position
     * @param y2 - distance from final y position and starting y position
     */
    private void drawLine(double x1, double y1, double x2, double y2){
        pen.up();
        pen.move(x1,y1);
        pen.down();
        pen.move(x2,y2); 
    }
    
    /**
     * Mutator to set the color of the face
     * @param color - color in string format
     */
    private void setColor(String color){
        if (color.equalsIgnoreCase("red")) {
            faceColor = Color.red;
        } else if (color.equalsIgnoreCase("blue")) {
            faceColor = Color.blue;
        } else {
            faceColor = Color.black;
        }
    }
    
    /**
     * Accessor to return the color in string format
     * @return 
     */
    private String getColor(){
        if (faceColor == Color.red) {
            return "red";
        } else if (faceColor == Color.red) {
            return "blue";
        } else {
            return "black";
        }
    }
    
    /**
     * Mutator to set the mood of the face
     * @param mood 
     */
    private void setMood(boolean mood) {
        this.mood = mood;
    }
    
    /**
     * Accessor to return the color in string format
     * @return 
     */
    private boolean isMood() {
        return mood;
    }
}
