

package shapetestharness;
import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class ShapeTestHarness {
    
    
    public static void main(String[] args) {
        Pen p = new StandardPen(500,500); //instansiate object
        Scanner s = new Scanner(System.in); //instansiate object
       
        Shape s1 = new Circle(20,20,20); //instansiate object
        Shape s2 = new Rect(-50,-50,10,20); //instansiate object
        
        s1.draw(p); //draw the circle
        s2.draw(p); //draw the rectangle
        
        System.out.println(s1); //output objects in string format
        System.out.println(s2); //output objects in string format
        
        System.out.println("Press enter to change shapes...");
        s.nextLine();
        
        //erase shapes
        p.setColor(Color.white); //set color of pen to canvas color
        //re-draw shapes over the shapes
        s1.draw(p);
        s2.draw(p);
        //re-set the color of the pen
        p.setColor(Color.red);
        
        //move the rectangle and circle appart
        s1.move(30,30); 
        s2.move(-30, -30);
        //stretch the shapes by a factor of two
        s1.stretchBy(2);
        s2.stretchBy(2);
        //draw the shapes with the new adjustments made
        s1.draw(p);
        s2.draw(p);
        
       
    }
    
}
