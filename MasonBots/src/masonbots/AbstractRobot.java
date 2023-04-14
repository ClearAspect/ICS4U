/*
Roan Mason
03/29/23
Abstract Robot class that implements Robot
*/
package masonbots;

import TurtleGraphics.StandardPen;

/**
 *
 * @author roanm
 */
abstract class AbstractRobot implements Robot {
    
    //Protected Instance Variables
    protected int xPos, yPos, energy;
    protected double weight, cost; 
    protected String powerSource, movementType, sensorType;
    
    //Private Class Variables
    //Weight in kilograms
    private final static double MIN_WEIGHT = 25, MAX_WEIGHT = 75, MIN_COST = 250, MAX_COST = 2500;
    private final static int MIN_ENERGY = 0, MAX_ENERGY = 100;
    private static int NUM_ROBOTS = 0;
    
    //Constructors
    
    /**
     * Default constructor creates a robot with default values
     */
    public AbstractRobot() {
        xPos = 0;
        yPos = 0;
        energy = MAX_ENERGY;
        weight = MIN_WEIGHT;
        cost = MIN_COST;
        powerSource = "Battery";
        movementType = "Wheels";
        sensorType = "Camera";
        NUM_ROBOTS++;
        
    }
    
    /**
     * Constructor that creates a robot with a location and default attributes
     * @param xPos - x Position
     * @param yPos - y Position
     */
    public AbstractRobot(int xPos, int yPos) {
        this();
        this.xPos = xPos;
        this.yPos = yPos;
        
    }
    
    /**
     * Constructor that creates a robot with a location, weight, cost and some default attributes
     * @param xPos - x Position
     * @param yPos - y Position
     * @param weight - weight in kilos
     * @param cost - cost in dollars 
     */
    public AbstractRobot(int xPos, int yPos, double weight, double cost) {
        this(xPos, yPos);

        if (weight > MAX_WEIGHT) {
            this.weight = MAX_WEIGHT;
        } else if (weight < MIN_WEIGHT) {
            this.weight = MIN_WEIGHT;
        } else {
            this.weight = weight;
        }

        if (cost > MAX_COST) {
            this.cost = MAX_COST;
        } else if (cost < MIN_COST) {
            this.cost = MIN_COST;
        } else {
            this.cost = cost;
        }
    }
    
    /**
     * Constructor that creates a robot with all custom attributes
     * @param xPos - x Position
     * @param yPos - y Position
     * @param weight - weight in kilos
     * @param cost - cost in dollars 
     * @param powerSource - type of power source (String)
     * @param movementType - type of movement (String)
     * @param sensorType - type of sensor (String)
     */
    public AbstractRobot(int xPos, int yPos, double weight, double cost, String powerSource, String movementType, String sensorType) {
        this(xPos, yPos, weight, cost);
        this.powerSource = powerSource;
        this.movementType = movementType;
        this.sensorType = sensorType;
        
        
    }
    
    //Public Instance Methods
    
    
    public void move(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public int getXPos() {
        return xPos;
    }
    
    public int getYPos() {
        return yPos;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public boolean setWeight(double weight) {
        if (weight > MAX_WEIGHT || weight < MIN_WEIGHT) {
            return false;
        } else {
            this.weight = weight;
            return true;
        }
    }
    
    public double getCost() {
        return cost;
    }
    
    public boolean setCost (double cost) {
        if (cost > MAX_COST || cost < MIN_COST) {
            return false;
        } else {
            this.cost = cost;
            return true;
        }
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public boolean setEnergy(int energy) {
        if (energy > MAX_ENERGY || energy < MIN_ENERGY) {
            return false;
        } else {
            this.energy = energy;
            return true;
        }
    }
    
    public String getPowerSource() {
        return powerSource;
    }
    
    public String getMovementType() {
        return movementType;
    }
    
    public String getSensorType() {
        return sensorType;
    }
    
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
    
    abstract public void draw(StandardPen p);
    
    /**
     * Helper method used to draw limbs of robots (Arms and legs since they area all the same)
     * @param x - x position
     * @param y - y position
     * @param p -  standard pen
     */
    protected static void drawLimb(int x, int y, StandardPen p) {
        p.move(x, y);
        p.down();
        p.setDirection(0);
        p.move(7);
        p.turn(-90);
        p.move(20);
        p.turn(-90);
        p.move(7);
        p.turn(-90);
        p.move(20);
        p.up();
        
        
    }
    
    public String toString() {
        return "Robot"
                + "\nPosition: ("+xPos+","+yPos+")\n"
                + "\nWeight: "+weight
                + "\nCost: "+cost
                + "\nPower Source: "+powerSource
                + "\nMovement Type: "+movementType
                + "\nSensor Type: "+sensorType;
    }
    
    /**
     * return the weight rules
     * @return 
     */
    public static String getWeightRules() {
        return MIN_WEIGHT+" - "+MAX_WEIGHT;
    }
    
    /**
     * return the cost rules
     * @return 
     */
    public static String getCostRules() {
        return MIN_COST+" - "+MAX_COST;
    }
    
    /**
     * return the energy rules
     * @return 
     */
    public static String getEnergyRules() {
        return MIN_ENERGY+" - "+MAX_ENERGY;
    }
    
    /**
     * return the number of robots existing
     * @return 
     */
    public static int getNumRobots() {
        return NUM_ROBOTS;
    }
    
    /**
     * change the number of robots
     * @param numRobots 
     */
    public static void setNumRobots(int numRobots) {
        NUM_ROBOTS = numRobots;
    }


    
}
