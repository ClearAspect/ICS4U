/*
This interface outlines the methods necessary to create a new class for a shape type class
eg. All shapes must have a method to calculate area
*/
package shapetestharness;
import TurtleGraphics.Pen;
public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void move(double xLoc, double yLoc);
    public void stretchBy(double factor);
    public String toString();
}


