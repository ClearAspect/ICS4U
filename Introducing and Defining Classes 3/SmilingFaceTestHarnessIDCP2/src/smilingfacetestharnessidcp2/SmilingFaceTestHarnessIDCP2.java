
package smilingfacetestharnessidcp2;

import java.util.Scanner;

public class SmilingFaceTestHarnessIDCP2 {   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //instansitated object
        double x,y,radius;
        String quit = "N";
        
        System.out.println("Initial X position: "); //get x position
        x = Double.parseDouble(reader.nextLine());
        System.out.println("Initial Y position: "); //get y position
        y = Double.parseDouble(reader.nextLine());
        
        SmilingFace face = new SmilingFace(x,y); //instansitated object
        face.draw(); //draw face
        
        System.out.println("Quit? (Y/N)"); //draw another?
        quit = reader.nextLine();
        
        while(!quit.equalsIgnoreCase("Y")){ //if yes
            System.out.println("Next X position: "); //get x position
            x = Double.parseDouble(reader.nextLine());
            System.out.println("Next Y position: "); //get y position
            y = Double.parseDouble(reader.nextLine());
            
            face.erase(); //erase first face 
            face.move(x, y); //move to new x and y
            face.draw(); //draw face
            
            System.out.println("Quit? (Y/N)"); //draw another?
            quit = reader.nextLine();
        }
    }
}
