/*
rectangle class that implements the shape interface. Must have those methods
*/
package shapetestharness;
import TurtleGraphics.Pen;

public class Rect implements Shape{
    
    private double xPos, yPos;
    private double height, width;
    
    /**
     * Constructor
     * Makes a circle with default attributes
     */
    public Rect(){
        xPos = 0;
        yPos = 0;
        height = 1;
        width = 1;
        
    }
    
    /**
     * Constructor
     * Makes a circle with specified attributes
     * @param xLoc - x position
     * @param yLoc - y position
     * @param h - height
     * @param w - width
     */
    public Rect(double xLoc, double yLoc, double h, double w){
        this();
        xPos = xLoc;
        yPos = yLoc;
        height = h;
        width = w;
    }
      
    /**
     * Method
     * Calculates and returns the area of the rectangle
     * @return 
     */
    public double area(){
        return height * width;
    }

    /**
     * Method uses turtle graphics to draw lines and create a circle
     * @param p - pen to draw on the canvas
     */
    public void draw(Pen p){
        p.up();
        p.move(xPos, yPos); //move pen to starting position     
        p.down(); //move pen onto canvas
        p.setDirection(0); //set initial direction
        p.move(width); //draw line
        p.turn(-90); //change direction
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    
    /**
     * Accessor
     * return x position of the rectangle
     * @return 
     */
    public double getXPos(){
        return xPos;
    }
    
    /**
     * Accessor
     * return the y position of the rectangle
     * @return 
     */
    public double getYPos(){
        return yPos;
    }
    
    /**
     * Mutator
     * Change the x and y position of the rectangle
     * @param xLoc - x position
     * @param yLoc - y position
     */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    
    /**
     * Mutator 
     * changes the width and height of the rectangle by a factor
     * @param factor 
     */
    public void stretchBy(double factor){
        height = height * factor;
        width = width * factor;
    }
     
    /**
     * return the object in string format
     * @return 
     */
    public String toString(){
        String str = "RECTANGLE\n"
                + "Width and Height: " + width + " and " + height + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
