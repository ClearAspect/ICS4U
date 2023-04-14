/*
circle class that implements the shape interface. Must have those methods
*/
package shapetestharness;
import TurtleGraphics.Pen;

public class Circle implements Shape{
   
    private double xPos, yPos;
    private double radius;
    private final static double PI = 3.14;
    
    /**
     * Constructor
     * Makes a circle with default attributes
     */
    public Circle(){
        xPos = 0;
        yPos = 0;
        radius = 1; 
    }
    
    /**
     * Constructor
     * Makes a circle with specified attributes
     * @param xLoc - x value of the circle
     * @param yLoc - y value of the circle
     * @param r - radius of the circle
     */
    public Circle(double xLoc, double yLoc, double r){
        this();
        xPos = xLoc;
        yPos = yLoc;
        radius = r;         
    }
    
   /**
    * Method
    * calculates and returns the area of the circle
    * @return 
    */
    public double area(){
        return PI * radius * radius;
    }
        
    /**
     * Method
     * uses turtle graphics to draw lines and create a circle
     * @param p - pen to draw on the canvas
     */
    public void draw(Pen p){
        double side = 2.0 * PI * radius /120.0;
        p.up();
        p.move(xPos + radius, yPos - side / 2.0); //move pen to starting position
        p.setDirection(90); //set the initital direction
        p.down(); //begin drawing
        for(int i = 0; i <120; i++){ //uses 120 lines to draw the circle
            p.move(side);
            p.turn(3);
        }
    }
    
    /**
     * Mutator
     * changes radius by a factor
     * @param factor 
     */
    public void stretchBy(double factor){
        radius = radius * factor;
    }
    
    /**
     * Accessor
     * returns x position
     * @return 
     */
    public double getXPos(){
        return xPos;
    }
    
    /**
     * Accessor
     * returns y position
     * @return 
     */
    public double getYPos(){
        return yPos;
    }
    
    /**
     * mutator
     * changes x and y positions
     * @param xLoc - new x position
     * @param yLoc - new y position
     */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    
    /**
     * return object in string format
     * @return 
     */
    public String toString(){
        String str = "CIRCLE\n"
                + "Radius: " + radius + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
