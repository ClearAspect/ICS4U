/*
Dice rolling class
 */
package introanddefiningclasses32;

/**
 *
 * @author roanm
 */
public class Dice {

    //attributes
    private int value;
    private int numSides;

    //constructors
    
    /**
     * Creates two Dice with six sides and a sum of 2 
     */
    public Dice() {
        value = 2;
        numSides = 6;
    }
    
    /**
     * Same as 1st constructor except user choses the starting sum
     * @param value - sum of both dice
     */
    public Dice(int value) {
        this();
        this.value = value;
    }
    
    /**
     * Same as 1st constructor except user choses the starting sum and number od sides on each dice
     * @param value - sum of both dice
     * @param numSides - number of sides on each dice
     */
    public Dice(int value, int numSides) {
        this(value);
        this.numSides = numSides;

    }
    
    //mutators/accessors
    
    /**
     * Returns value of value
     * @return 
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Sets value of value
     * @param value 
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    /**
     * Returns the number of sides each dice has
     * @return 
     */
    public int getNumSides() {
        return numSides;
    }

    /**
     * Sets the number of sides each dice should have
     * @param numSides 
     */
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
    
    /**
     * "Rolls" both dice and returns the sum of the two dice
     * @return 
     */
    public int roll() {
        int dice1, dice2;
        
        dice1 = (int)(Math.random() * numSides)+1;
        dice2 = (int)(Math.random() * numSides)+1;
        
        value = dice1+dice2;
        return value;
    }
    
    /**
     * toString method.
     * @return 
     */
    public String toString() {
        return "Dice[value=" + value + ", numSides=" + numSides + "]";
    }
}
