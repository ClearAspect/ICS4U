/*
Program that draws shapes on a canvas and outputs their attributes in string format
*/

package shapetestharnessccp2;

import TurtleGraphics.*;

public class ShapeTestHarnessCCP2 {

    public static void main(String[] args) {
        //Instantiate objects.
        Pen p = new StandardPen(500,500);
        Shape s1 = new Circle(20,20,20);
        Shape s2 = new Rect(-50,-50,10,20);
        Shape s3 = new Wheel(-20,-20,20,6);
        
        //draw the shapes on the canvas
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        
        //Send shapes to string format
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
    }
    
}
