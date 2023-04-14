/*
Roan Mason
03/22/23
A wheel object extends Circle, then AbstractShape and in the process, implements the Shape interface
*/
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;
    
    /**
     * Constructor
     * Creates a wheel with default values
     */
    public Wheel(){
        super(); //activate matching contstrctor in AbstractShape
        spokes = 0; 
    }
    
    /**
     * Constructor
     * Creates a wheel with specified attributes
     * @param xLoc - x position
     * @param yLoc - y position
     * @param r - radius
     * @param s - number of spokes
     */
    public Wheel(double xLoc, double yLoc, double r, int s){
        super(xLoc, yLoc, r); //activate matching contstrctor in AbstractShape
        spokes = s;
    }
    
    /**
     * Draws the wheel
     * @param p - The pen to draw with
     */
    public void draw(Pen p){        
        super.draw(p); //activate the matching method in Circle
      
        //Draw the spokes around the circle
        for(int i = 1; i <= spokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i*360.0 / spokes);
            p.down();
            p.move(radius);
        }
        
    }
    
    /**
     * Mutator
     * sets the number of spokes
     * @param s - an integer
     */
    public void setSpokes(int s){
        spokes = s;
    }
    
    /**
     * Returns the object in string format
     * @return 
     */
    public String toString(){
        String str = "WHEEL\n"
                + "Radius: " + radius + "\n"
                + "Spokes: " + spokes + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area();
        return str;
    }
    
}
