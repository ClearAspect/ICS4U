/*
Roan Mason
03/06/23
https://docs.google.com/document/d/14m4-65mFSd_sbCIzM3PkJdJjszepKjYD-ss6oL3la6s/edit
*/
package introanddefiningclasses35;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class IntroAndDefiningClasses35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in); //instansitated object
        double x,y,radius,size;
        
        System.out.println("Initial X position: "); //get x position
        x = Double.parseDouble(s.nextLine());
        System.out.println("Initial Y position: "); //get y position
        y = Double.parseDouble(s.nextLine());
        System.out.println("Size of car: "); //get size
        size = Double.parseDouble(s.nextLine());
        
        Car car = new Car(size, x,y); //instansitated object
        car.drawCar(); //draw face
                
    }
    
}
