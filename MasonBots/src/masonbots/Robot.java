/*
Roan Mason
03/29/23
Robot interface
*/
package masonbots;

import TurtleGraphics.StandardPen;

/**
 *
 * @author roanm
 */
public interface Robot {
    
    /**
     * change the position of the Robot
     * @param x
     * @param y 
     */
    public void move(int x, int y);

    /**
     * return the x position of the Robot
     * @return
     */
    public int getXPos();

    /**
     * return the y position of the Robot
     * @return
     */
    public int getYPos();

    /**
     * return the weight of the Robot
     * @return
     */
    public double getWeight();

    /**
     * change weight of the Robot
     * returns true if the weight meets the class rules
     * @param weight - new weight
     * @return
     */
    public boolean setWeight(double weight);

    /**
     * return the cost of the Robot
     * @return
     */
    public double getCost();

    /**
     * change the cost of the Robot
     * returns true if the cost meets the class rules
     * @param cost - new cost of the robot
     * @return
     */
    public boolean setCost(double cost);

    /**
     * return the powersource used by the robot
     * @return
     */
    public String getPowerSource();

    /**
     * return the energy level of the Robot
     * @return
     */
    public int getEnergy();

    /**
     * change the energy level of the Robot
     * returns true if the energy level meets the class rules
     * @param energy -  new energy level
     * @return
     */
    public boolean setEnergy(int energy);

    /**
     * returns the type of movement the Robot makes use of
     * @return
     */
    public String getMovementType();

    /**
     * returns the type of sensor the Robot has
     * @return
     */
    public String getSensorType();

    /**
     * Change the type of Sensor the Robot has
     * @param sensorType - new type of sensor
     */
    public void setSensorType(String sensorType);

    /**
     * draws the Robot at the x,y position
     * @param p - Turtle graphics pen
     */
    public void draw(StandardPen p);

    /**
     * returns a String representation of the Robot
     * @return
     */
    public String toString();
    
}
