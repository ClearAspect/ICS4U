/*
Roan Mason
03/30/23
Cleaner robot class that extends to AbstractRobot
 */
package masonbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author roanm
 */
public class CleanerBot extends AbstractRobot{
    //Private Instance Variables
    private boolean isCleaning;
    
    //Constructors
    
    /**
     * Default constructor creates a cleaner bot with default values
     */
    public CleanerBot() {
        super();
    }
    
    /**
     * Constructor that creates a cleaner bot with a location and default attributes
     * @param xPos - x Position
     * @param yPos - y Position
     */
    public CleanerBot(int xPos, int yPos) {
        super(xPos, yPos);
        isCleaning = false;
    }
    
    /**
     * Constructor that creates a cleaner bot with values and determines if its cleaning 
     * @param xPos - x Position
     * @param yPos - y Position
     * @param weight - weight in kilos
     * @param cost - cost in dollars 
     * @param powerSource - type of power source (String)
     * @param movementType - type of movement (String)
     * @param sensorType - type of sensor (String)
     * @param isCleaning - if the robot cleaning
     */
    public CleanerBot(int xPos, int yPos, double weight, double cost, String powerSource, String movementType, String sensorType, boolean isCleaning) {
        super(xPos, yPos, weight, cost, powerSource, movementType, sensorType);
        this.isCleaning = isCleaning;
        
    }
    
    //Public Instance Methods
    
    /**
     * return the cleaning status of the cleaning bot
     * @return 
     */
    public boolean isCleaning() {
        return isCleaning;
    }
    
    /**
     * change cleaning status of the cleaning bot
     * @param x - new status
     */
    public void setCleaning(boolean x) {
        isCleaning = x;
    }
       
    
    /**
     * draws the Cleaner bot at the x,y position
     * @param p - Turtle graphics pen
     */
    @Override
    public void draw(StandardPen p) {

        p.up();
        p.setColor(Color.green);
        
        //Draw Head
        p.move(xPos, yPos); //top left corner of body
        p.down();
        p.setDirection(90);
        p.move(15);
        p.turn(-90);
        p.move(15);
        p.turn(-90);
        p.move(15);
        p.turn(-90);
        p.up();
        
        //Draw centre body
        p.move(xPos, yPos); //top left corner of body
        p.down();
        p.setDirection(0);
        p.move(15);
        p.turn(-90);
        p.move(25);
        p.turn(-90);
        p.move(15);
        p.turn(-90);
        p.move(25);
        p.up();
        
        
        //Draw the left arm
        drawLimb(xPos-7, yPos, p);
        
        
        //Draw the right arm
        drawLimb(xPos+15, yPos, p);
  
        //Draw the left leg
        drawLimb(xPos, yPos-25, p);
        
        //Draw the right leg
        drawLimb(xPos+8, yPos-25, p);
    }
    
    /**
     * returns the Cleaner bot in string format
     * @return
     */
    @Override
    public String toString() {
        return "CleanerBot"
            + "\nPosition: ("+xPos+","+yPos+")"
            + "\nWeight: "+weight
            + "\nCost: "+cost
            + "\nPower Source: "+powerSource
            + "\nMovement Type: "+movementType
            + "\nSensor Type: "+sensorType
            + "\nCleaning: "+isCleaning;

    }
    
    /**
     * returns true or false depending if the attributes of 2 different Worker bots are the same or not
     * @param other - WorkerBot
     * @return 
     */
    public boolean equals(CleanerBot other) {
        if (weight == other.getWeight()
                && cost == other.getCost()
                && powerSource.equals(other.getPowerSource())
                && movementType.equals(other.getMovementType())
                && sensorType.equals(other.getSensorType())
                && isCleaning == other.isCleaning()) { //check to see if all parameters are the same
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * returns a WorkerBot instantiated with the same parameters as the instance
     * @return 
     */
    @Override
    public CleanerBot clone() {
        CleanerBot newBot = new CleanerBot(xPos, yPos, weight, cost, powerSource, movementType, sensorType, isCleaning);
        return newBot;
    }
    
    
}
