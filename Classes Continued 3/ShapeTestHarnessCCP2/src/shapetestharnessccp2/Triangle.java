/*
Roan
Nov 2021
A triangle object extends AbstractShape and in the process implements the 
Shape interface
 */
package shapetestharnessccp2;

import TurtleGraphics.Pen;

/**
 *
 * @author roanm
 */
public class Triangle extends AbstractShape {
    protected double xPos1, yPos1, xPos2, yPos2, xPos3, yPos3;
    
    public Triangle(double xPos1, double yPos1, double xPos2, double yPos2, double xPos3, double yPos3) {
        super(xPos1, yPos1);
        xPos1 = xPos;
        yPos1 = yPos;
        this.xPos2 = xPos2;
        this.yPos2 = yPos2;
        this.xPos3 = xPos3;
        this.yPos3 = yPos3;
    }
    
    public void move(double xChange, double yChange) {
        xPos1 += xChange;
        yPos1 += yChange;
        xPos2 += xChange;
        yPos2 += yChange;
        xPos3 += xChange;
        yPos3 += yChange;
        
        
    }
    
    public double area() {
        double area = (1 / 2) * (Math.abs(xPos1 * yPos2 - xPos2 * yPos1 + xPos2 * yPos3 - xPos3 * yPos2 + xPos3 * yPos1 - xPos1 * yPos3));
        return area;
    }

    public double perimeter() {
        double perimeter = Math.sqrt((xPos1-xPos2) * (xPos1-xPos2) + (yPos1-yPos2) * (yPos1-yPos2))
                + Math.sqrt((xPos1-xPos3) * (xPos1-xPos3) + (yPos1-yPos3) * (yPos1-yPos3))
                + Math.sqrt((xPos3-xPos2) * (xPos3-xPos2) + (yPos3-yPos2) * (yPos3-yPos2));
        return perimeter;
    }
    
    public void stretchBy(double factor) {
        xPos2 = xPos1 + (xPos2 - xPos1) * factor;
        yPos2 = yPos1 + (yPos2 - yPos1) * factor;
        xPos3 = xPos1 + (xPos3 - xPos1) * factor;
        yPos3 = yPos1 + (yPos3 - yPos1) * factor;
        
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos2, yPos2);
        p.move(xPos3, yPos3);
        p.move(xPos, yPos);
    }
    
    public String toString() {
        return "Triangle:"
                + "\nPosition 1: ("+xPos1+","+yPos1+")"
                + "\nPosition 2: ("+xPos2+","+yPos2+")"
                + "\nPosition 3: ("+xPos3+","+yPos3+")";
        
    }
    
    public Triangle Clone(Triangle original) {
        Triangle clone = new Triangle(xPos1, yPos1, xPos2, yPos2, xPos3, yPos3);
        return clone;
    }
    
    //Implemented Later
    public boolean equals() {
        
    }
    
}
