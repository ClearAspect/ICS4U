/*
 * Brad Cutten
 * Nov 2021
 * A rectangular object extends AbstractShape and in the process implements
 * the Shape interface
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Rect extends AbstractShape{
    //Rect specific attributes
    private double height, width;
    
    /**
     * Default constructor, creates a Rect at (0,0) with a width and height of 1
     */
    public Rect(){
        super(); //activate matching contstrctor in AbstractShape
        height = 1;
        width = 1;
    }
    
   /**
     * Secondary constructor, create a Rect with all attributes specified
     * @param xLoc - the x position of the Rect
     * @param yLoc - the y position of the Rect
     * @param h - the height of the Rect
     * @param w - the width of the Rect
     */
    public Rect(double xLoc, double yLoc, double h, double w){
        super(xLoc, yLoc); //activate matching constructor in AbstractShape
        height = h;
        width = w;
    }
    
    //the next three methods were abstract in the superclass
    //Now we define them
    
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    /**
     * Calculates the area of this Rect
     * @return the area as a double
     */
    public double area(){
        return height * width;
    }
    
    public double perimeter() {
        return 2*width + 2*height;
    }
    
     /**
     * Draws the rect
     * @param p - the pen to draw with
     */
    public void draw(Pen p){
        p.up();
        p.move(xPos, yPos);        
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    
    /**
     * Makes the Rect larger or smaller
     * @param factor - how much to change the radius by
     */
    public void stretchBy(double factor){
        height = height * factor;
        width = width * factor;
    }
    
    /**
     * Creates a String representation of this Rect
     * Notice that the toString method calls the corresponding method in the 
     * super class in order to accomplish it's task
     *
     * In the superclass, the toString method calls area, which will activate 
     * the area method in this class and not the area method in the superclass
     * which is abstract
     * @return - the Rect's attributes in a String
     */
    public String toString(){
        String str = "RECTANGLE\n"
                + "Width and Height: " + width + " and " + height + "\n"
                + super.toString();
        return str;
    }
    
    public boolean equals(Rect other) {
        return (other.getHeight() == height && other.getWidth() == width);
    }
}
