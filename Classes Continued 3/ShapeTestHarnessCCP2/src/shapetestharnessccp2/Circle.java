/*
 * Brad Cutten
 * Nov 2021
 * A circle object extends AbstractShape and in the process implements the 
 * Shape interface
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Circle extends AbstractShape {
   
    //Circle specific attribute
    protected double radius;
    
    
    /**
     * Default constructor, creates a Circle at (0,0) with a radius of 1
     */
    public Circle(){
        super();    //activate matching contstrctor in AbstractShape
        radius = 1; 
    }
    
    
    /**
     * Secondary constructor, create a Circle with all attributes specified
     * @param xLoc - the x position of the Circle
     * @param yLoc - the y position of the Circle
     * @param r - the radius of the Circle
     */
    public Circle(double xLoc, double yLoc, double r){
        super(xLoc, yLoc);  //activate matching constructor in AbstractShape
        radius = r;         //init radius
    }
    
    //the next three methods were abstract in the superclass
    //Now we define them
    
    public double getRadius() {
        return radius;
    }
    
    /**
     * Calculates the area of this Circle
     * @return the area as a double
     */
    public double area(){
        //formula for area of a circle
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Draws the circle
     * @param p - the pen to draw with
     */
    public void draw(Pen p){
        //determine what size the side length should be
        double side = 2.0 * Math.PI * radius /120.0;
        p.up();
        //move to an outside edge
        p.move(xPos + radius, yPos - side / 2.0);
        p.setDirection(90);
        p.down();
        //draw 120 small sides
        for(int i = 0; i <120; i++){
            p.move(side);
            p.turn(3);
        }
    }
    
    /**
     * Makes the circle larger or smaller
     * @param factor - how much to change the radius by
     */
    public void stretchBy(double factor){
        radius = radius * factor;
    }

    /**
     * Creates a String representation of this Circle
     * Notice that the toString method calls the corresponding method in the 
     * super class in order to accomplish it's task
     *
     * In the superclass, the toString method calls area, which will activate 
     * the area method in this class and not the area method in the superclass
     * which is abstract
     * @return - the Circle's attributes in a String
     */
    public String toString(){
        String str = "CIRCLE\n"
                + "Radius: " + radius + "\n"
                + super.toString();
        return str;
    }
    
    public boolean equals(Circle other) {
        return (other.getRadius() == radius);
    }
    
    public Circle clone() {
        Circle newCircle = new Circle(xPos, yPos, radius);
        return newCircle;
    }
    
}
