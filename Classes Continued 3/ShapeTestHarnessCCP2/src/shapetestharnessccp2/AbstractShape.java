/*
Roan Mason
03/22/23
Abstract class that implements the Shape interface
*/
package shapetestharnessccp2;
import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
    
    protected double xPos;
    protected double yPos;
    
    /**
     * Constructor
     * subclasses and chain to this constructor for default x and y values 
     */
    public AbstractShape(){
        xPos = 0;
        yPos = 0;        
    }
    
    /**
     * Constructor
     * subclasses and chain to this constructor to apply x and y values to shape
     * @param xLoc
     * @param yLoc 
     */
    public AbstractShape(double xLoc, double yLoc){
        this();
        xPos = xLoc;
        yPos = yLoc;
    }
    
    /**
     * abstract method that subclasses must have
     * calculates area
     * @return 
     */
    abstract public double area();
    
    abstract public double perimeter();
    
    /**
     * abstract method that subclasses must have
     * draws shape
     * @param p - turtle graphics pen
     */
    abstract public void draw(Pen p);
  
    /**
     * returns x position
     * @return 
     */
    public final double getXPos(){
        return xPos;
    }
    
    /**
     * returns y position
     * @return 
     */
    public final double getYPos(){
        return yPos;
    }
    
   /**
    * Mutator
    * sets the x and y position
    * @param xLoc - new x position
    * @param yLoc - new y position
    */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    
    /**
     * Mutator
     * stretches the shape by a factor
     * @param factor - a double 
     */
    abstract public void stretchBy(double factor);
  
    /**
     * returns the object in string format
     * @return 
     */
    public String toString(){
        String str= "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
