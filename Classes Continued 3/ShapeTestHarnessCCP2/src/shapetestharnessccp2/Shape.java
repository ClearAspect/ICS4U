/*
 * Brad Cutten
 * Nov 2021
 * An interface for a Shape type object, defines methods that all shapes must 
 * implement
 */
package shapetestharnessccp2;
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


