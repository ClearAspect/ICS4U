/*
Roan Mason
03/30/23
Sentry robot class that extends to AbstractRobot
 */
package masonbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author roanm
 */
public class SentryBot extends AbstractRobot {
    
    
    //Private Instance Variables
    private String weaponType;
    
    //Constructors
    
    /**
     * Default constructor creates a worker bot with default values
     */
    public SentryBot() {
        super();
        
    }
    
    /**
     * Constructor that creates a worker bot with a location and default attributes
     * @param xPos - x Position
     * @param yPos - y Position
     */
    public SentryBot(int xPos, int yPos) {
        super(xPos, yPos);

    }

    /**
     * Constructor that creates a worker bot and sets the value of the gripper type and lift capacity
     * @param xPos - x Position
     * @param yPos - y Position
     * @param weight - weight in kilos
     * @param cost - cost in dollars 
     * @param powerSource - type of power source (String)
     * @param movementType - type of movement (String)
     * @param sensorType - type of sensor (String)
     * @param weaponType - type of weapon (String)
     */
    public SentryBot(int xPos, int yPos, double weight, double cost, String powerSource, String movementType, String sensorType, String weaponType) {
        super(xPos, yPos, weight, cost, powerSource, movementType, sensorType);
        this.weaponType = weaponType;
    }
    
    //Public Instance Variables
    
    public void setWeaponType (String weaponType) {
        this.weaponType = weaponType;
    }
    
    public String getWeaponType() {
        return weaponType;
    }
    
    /**
     * If the other Robot is a WorkerBot, then the energy of that WorkerBot should be set to 
     * 0 and the lift capacity should be cut in half. If the other Robot is a SentryBot and the 
     * weapon type is different from this SentryBot then the other SentryBot’s energy level 
     * should be cut in half and this SentryBot’s energy level should be doubled. If the two 
     * SentryBots have the same weapon type then both energy levels are cut in half.
     * @param other - Robot being attacked
     */
    public void attack(Robot other) {
        if (other instanceof WorkerBot) { //check if worker bot and change stats
            other.setEnergy(0);
            ((WorkerBot) other).setLiftCapacity(((WorkerBot) other).getLiftCapacity()/2);
        } else if (other instanceof SentryBot) { //check if 
            if (((SentryBot) other).getWeaponType().equals(weaponType)) {
                energy = energy/2;
            } else {
                energy = energy*2;
            }
            other.setEnergy(other.getEnergy()/2);
        } else {
            other.setEnergy(0);
            ((CleanerBot)other).setCleaning(false);
        }
    }
    
    /**
     * draws the Sentry bot at the x,y position
     * @param p - Turtle graphics pen
     */
    @Override
    public void draw(StandardPen p) {

        p.up();
        p.setColor(Color.orange);
        
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
     * returns the Sentry bot in string format
     * @return
     */
    @Override
    public String toString() {
        return "SentryBot"
            + "\nPosition: ("+xPos+","+yPos+")"
            + "\nWeight: "+weight
            + "\nCost: "+cost
            + "\nPower Source: "+powerSource
            + "\nMovement Type: "+movementType
            + "\nSensor Type: "+sensorType
            + "\nWeapon Type: "+weaponType;

    }
    
    /**
     * returns true or false depending if the attributes of 2 different Worker bots are the same or not
     * @param other - WorkerBot
     * @return 
     */
    public boolean equals(SentryBot other) {
        if (weight == other.getWeight()
                && cost == other.getCost()
                && powerSource.equals(other.getPowerSource())
                && movementType.equals(other.getMovementType())
                && sensorType.equals(other.getSensorType())
                && weaponType.equals(other.getWeaponType())) { //check to see if all parameters are the same
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * returns a Sentry bot instantiated with the same parameters as the instance
     * @return 
     */
    @Override
    public SentryBot clone() {
        SentryBot newBot = new SentryBot(xPos, yPos, weight, cost, powerSource, movementType, sensorType, weaponType);
        return newBot;
        
    }
}
