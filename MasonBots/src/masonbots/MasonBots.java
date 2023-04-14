/*
Roan Mason
03/29/23
Unit 3 Robots assignment
https://docs.google.com/document/d/1wmnnMpGSmJtOY25NEJahrvOoLDLyjGjBbyNko2Xh5ww/edit
 */
package masonbots;

import TurtleGraphics.StandardPen;

/**
 *
 * @author roanm
 */
public class MasonBots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StandardPen p = new StandardPen(500,500);
        
        //Declares 4 Robots
        Robot r1, r2, r3, r4, r5, r6;
        
        //Instantiates a SentryBot
        r1 = new SentryBot(50,50, 75, 75, "Power cell", "Legs", "Camera", "Gun");
        
        //Instantiates a WorkerBot and moves it
        r2 = new WorkerBot(75,75, 50, 75, "Power cell", "Hover", "Camera", "Pincher", 100);
        r2.move(100, 100);
        
        //Clones the SentryBot
        r3 = ((SentryBot)r1).clone();
        
        //Checks if the SentryBot clone is equal to the original SentryBot, and if so:
        //Moves the clone
        if (((SentryBot)r3).equals((SentryBot)r1)) {
            r3.move(25, 25);
        }
        
        //Clones the WorkerBot and changes its lifting capacity
        r4 = ((WorkerBot)r2).clone();
        ((WorkerBot)r4).setLiftCapacity(50);
        
        //Checks if the WorkerBot clone is not equal to the original WorkerBot , and if so:
        //Moves the clone
        if (!((WorkerBot)r4).equals((WorkerBot)r2)) {
            r4.move(10, 10);
        }
        
        r5 = new CleanerBot(10,75, 50, 75, "Power cell", "Hover", "Camera", true);
        r6 = ((CleanerBot)r5).clone();

        if (((CleanerBot)r5).equals((CleanerBot)r6))  {
            r6.move(40, 150);
        }
        
        
        //Draws both SentryBots and both WorkerBots. 
        //Robots can be represented in the world as a simple square drawing at their x,y location. 
        //SentryBots are orange and WorkerBots are magenta
        r1.draw(p);
        r2.draw(p);
        r3.draw(p);
        r4.draw(p);
        r5.draw(p);
        r6.draw(p);
        
        //Prints the total number of Robots working at the company
        System.out.println(AbstractRobot.getNumRobots());
        
        //Prints a description of all Robots to the console
        System.out.println(r1+"\n");
        System.out.println(r2+"\n");
        System.out.println(r3+"\n");
        System.out.println(r4+"\n");
        System.out.println(r5+"\n");
        System.out.println(r6+"\n");
        
        
    }
    
}
