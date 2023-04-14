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
        Shape s5 = ((Circle)s1).clone();
        Shape s2 = new Rect(-50,-50,10,20);
        Shape s4 = new Rect(-50,-50,10,20);
        Shape s3 = new Wheel(-20,-20,20,6);
        Shape s6 = new Triangle(50,50,20,20,0,10);
        
        if (((Rect)s2).equals((Rect)s4)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
        if (((Circle)s1).equals((Circle)s5)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
        
        //draw the shapes on the canvas
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        s6.draw(p);
        
        //Send shapes to string format
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
    }
    
}
