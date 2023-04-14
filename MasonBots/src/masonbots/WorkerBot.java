/*
Roan Mason
03/30/23
Worker robot class that extends to AbstractRobot
 */
package masonbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author roanm
 */
public class WorkerBot extends AbstractRobot{

    //Private Instance Variables
    private String gripperType;
    private int liftCapacity;
    
    //Private Class Variables
    //Weight in kilograms
    private final static int MIN_CAPACITY = 25, MAX_CAPACITY = 100;

    //Constructors
    
    /**
     * Default constructor creates a worker bot with default values
     */
    public WorkerBot() {
        super();
        gripperType = "Claw";
        liftCapacity = MIN_CAPACITY;
    }
    
    /**
     * Constructor that creates a worker bot with a location and default attributes
     * @param xPos - x Position
     * @param yPos - y Position
     */
    public WorkerBot(int xPos, int yPos) {
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
     * @param gripperType - type of gripper (String)
     * @param liftCapacity - lift capacity in kilos 
     */
    public WorkerBot(int xPos, int yPos, double weight, double cost, String powerSource, String movementType, String sensorType, String gripperType, int liftCapacity) {
        super(xPos, yPos, weight, cost, powerSource, movementType, sensorType);
        this.gripperType = gripperType;
        
        if (liftCapacity > MAX_CAPACITY) { 
            this.liftCapacity = MAX_CAPACITY;
        } else if (liftCapacity < MIN_CAPACITY) {
            this.liftCapacity = MIN_CAPACITY;
        } else {
            this.liftCapacity = liftCapacity;
            
        }
    }
    
    //Public Instance Methods
    
    /**
     * return the gripper type of the worker bot
     * @return 
     */
    public String getGripperType() {
        return gripperType;
    }
    
    /**
     * return the lift capacity of the worker bot
     * @return 
     */
    public int getLiftCapacity() {
        return liftCapacity;
    }
       
    /**
     * change lift capacity of the Robot
     * returns true if the lift capacity meets the class rules
     * @param liftCapacity - new lift capacity
     * @return 
     */
    public boolean setLiftCapacity (int liftCapacity) {
        if (liftCapacity > MAX_CAPACITY || liftCapacity < MIN_CAPACITY) {
            return false;
        } else {
            this.liftCapacity = liftCapacity;
            return true;
        }
    }
    
    /**
     * draws the Worker bot at the x,y position
     * @param p - Turtle graphics pen
     */
    @Override
    public void draw(StandardPen p) {

        p.up();
        p.setColor(Color.magenta);
        
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
     * returns the Worker bot in string format
     * @return
     */
    @Override
    public String toString() {
        return "WorkerBot"
            + "\nPosition: ("+xPos+","+yPos+")"
            + "\nWeight: "+weight
            + "\nCost: "+cost
            + "\nPower Source: "+powerSource
            + "\nMovement Type: "+movementType
            + "\nSensor Type: "+sensorType
            + "\nGripper Type: "+gripperType
            + "\nLift Capacity: "+liftCapacity;

    }
    
    /**
     * returns true or false depending if the attributes of 2 different Worker bots are the same or not
     * @param other - WorkerBot
     * @return 
     */
    public boolean equals(WorkerBot other) {
        if (weight == other.getWeight()
                && cost == other.getCost()
                && powerSource.equals(other.getPowerSource())
                && movementType.equals(other.getMovementType())
                && sensorType.equals(other.getSensorType())
                && gripperType.equals(other.getGripperType())
                && liftCapacity == other.getLiftCapacity()) { //check to see if all parameters are the same
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
    public WorkerBot clone() {
        WorkerBot newBot = new WorkerBot(xPos, yPos, weight, cost, powerSource, movementType, sensorType, gripperType, liftCapacity);
        return newBot;
    }
    
    /**
     * return the capacity rules
     * @return 
     */
    public static String getCapacityRules() {
        return MIN_CAPACITY+" - "+MAX_CAPACITY;
    }

    
}
