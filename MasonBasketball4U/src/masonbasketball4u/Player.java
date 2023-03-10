/*
Roan Mason
03/07/23 - 03/10/23
BasketBall Unit Summative - Player Class
https://docs.google.com/document/d/1Pj_uUpeMLE6TX_m7cZhrazIifdQt2Lh1BOH-gzo2qmQ/edit
 */
package masonbasketball4u;

/**
 *
 * @author roanm
 */
public class Player {

    private String name;
    private int speed, threePointers, dunk, defense;
    
    /**
     * Constructor that creates a player with only a name
     * Default stats of zero
     * @param name - name of player
     */
    public Player(String name) {
        //create name
        this.name = name;
        
        //default stats of the player
        speed = 1;
        threePointers = 1;
        dunk = 1;
        defense = 1;
        
    }
    
    /**
     * Constructor that creates a player with a name and full stats 
     * Stats much be from 1-10 (inclusive). If below or above 1-10, the stat will be changed to 1 or 10 respectfully
     * @param name - name of player
     * @param speed - speed stat 
     * @param threePointers - three pointer stat 
     * @param dunk - dunk stat
     * @param defense - defense stat
     */
    public Player(String name, int speed, int threePointers, int dunk, int defense) {
        this(name); //chain to initial constructor
        
        //Change stats to custom stats
        this.speed = statCheck(speed);
        this.threePointers = statCheck(threePointers);
        this.dunk = statCheck(dunk);
        this.defense = statCheck(defense);
    }
    
    /**
     * Error checking. Adjusts illegal stats put in the constructor
     * @param stat - an integer
     * @return 
     */
    private int statCheck(int stat) {
        if (stat > 10) { // if stat is above 10
            return 10; // set it to 10
        } else if (stat < 1) { //if below 1
            return 1; // set to 1
        } else { // otherwise the stat is fine
            return stat;
        }
    }
    
    /**
     * Change the team name attribute
     * @param name - a String
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * return the name of the team
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Change the speed stat
     * @param speed - an integer
     */
    public void setSpeed(int speed) {
        this.speed = statCheck(speed);
    }
    
    /**
     * return the speed stat
     * @return 
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Change the three pointer stat
     * @param threePointers - an integer
     */
    public void setThreePointers(int threePointers) {
        this.threePointers = statCheck(threePointers);
    }
    
    /**
     * return the three pointer stat
     * @return 
     */
    public int getThreePointers() {
        return threePointers;
    }
    
    /**
     * Change the dunk stat
     * @param dunk - an integer
     */
    public void setDunk(int dunk) {
        this.dunk = statCheck(dunk);
    }
    
    /**
     * return the dunk stat
     * @return 
     */
    public int getDunk() {
        return dunk;
    }
    
    /**
     * Change the defense stat
     * @param defense - an integer
     */
    public void setDefense(int defense) {
        this.defense = statCheck(defense);
    }
    
    /**
     * return the defense stat
     * @return 
     */
    public int getDefense() {
        return defense;
    }
    
    /**
     * return all attributes in string format
     * @return 
     */
    public String toString() {
        return name
                +"\nSpeed: "+speed+"/10"
                +"\nThree Pointers: "+threePointers+"/10"
                +"\nDunks: "+dunk+"/10"
                +"\nDefense: "+defense+"/10";
    }

}
