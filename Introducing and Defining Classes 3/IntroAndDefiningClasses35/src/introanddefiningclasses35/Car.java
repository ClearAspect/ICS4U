/*
Roan Mason
03/06/23
https://docs.google.com/document/d/14m4-65mFSd_sbCIzM3PkJdJjszepKjYD-ss6oL3la6s/edit
 */
package introanddefiningclasses35;

import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author roanm
 */
public class Car {

    private StandardPen pen;
    private Color carColor;
    private double xPos, yPos, size;

    public Car(double size) {
        this.size = size;
        xPos = 0;
        yPos = 0;
        carColor = Color.green;
        pen = new StandardPen(500,500);
        pen.setColor(carColor);
    }

    public Car(double size, double xPos, double yPos) {
        this(size);
        this.xPos = xPos;
        this.xPos = yPos;
        pen = new StandardPen(500,500);
        pen.setColor(carColor);
    }

    public Car(double size, double xPos, double yPos, Color carColor) {
        this(size, xPos, yPos);
        this.carColor = carColor;
        pen = new StandardPen(500,500);
        pen.setColor(carColor);
    }
    
    /**
     * Draw the car
     */
    public void drawCar() {
        
        double x = size;
        double y = size/2;
        double r = size/7;
        
        
        pen.up();
        pen.move(xPos, yPos);
        pen.setDirection(180);
        pen.down();
        pen.move(x/2);
        pen.turn(90);
        pen.move (y/2);
        pen.turn(90);
        pen.move(x);
        pen.turn(90);
        pen.move(y/2);
        pen.turn(90);
        pen.move(x/2);
        
        pen.up();
        pen.move(x*1/3);
        pen.down();
        pen.setDirection(90);
        pen.move(y/2);
        pen.turn(-90);
        pen.move(x*2/3);
        pen.turn(-90);
        pen.move(y/2);   
        
        // Draw the wheels
        drawCircle(x*1/3+xPos,-y*4/5+yPos, r);
        drawCircle(-x*1/3+xPos,-y*4/5+yPos, r);

        // Move the turtle to the starting position
        

    }
    
    /**
     * Erase the car
     */
    public void erase(){
        pen.setColor(Color.white);
        drawCar();
        pen.setColor(carColor);
    }
    
    /**
     * Move to new position
     * @param x - x position
     * @param y - y position
     */
    public void move(double x, double y){
        xPos = x;
        yPos = y;
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
     * Mutator to set the color of the car
     *
     * @param color - color object
     */
    private void setColor(Color color) {
        carColor = color;
    }

    /**
     * Accessor to return the color
     *
     * @return
     */
    private Color getColor() {
        return carColor;
    }

}
