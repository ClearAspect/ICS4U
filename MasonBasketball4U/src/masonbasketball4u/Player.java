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

    public Player(String name) {
        this.name = name;
        speed = 1;
        threePointers = 1;
        dunk = 1;
        defense = 1;
        
    }

    public Player(String name, int speed, int threePointers, int dunk, int defense) {
        this(name);
        
        
        this.speed = statCheck(speed);
        this.threePointers = statCheck(threePointers);
        this.dunk = statCheck(dunk);
        this.defense = statCheck(defense);
    }
    
    private int statCheck(int stat) {
        if (stat > 10) {
            return 10;
        } else if (stat < 1) {
            return 1;
        } else {
            return stat;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = statCheck(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setThreePointers() {
        this.threePointers = statCheck(threePointers);
    }

    public int getThreePointers() {
        return threePointers;
    }

    public void setDunk(int dunk) {
        this.dunk = statCheck(dunk);
    }

    public int getDunk() {
        return dunk;
    }

    public void setDefense() {
        this.dunk = statCheck(dunk);
    }

    public int getDefense() {
        return defense;
    }

    public String toString() {
        return name
                +"\nSpeed: "+speed+"/10"
                +"\nThree Pointers: "+threePointers+"/10"
                +"\nDunks: "+dunk+"/10"
                +"\nDefense: "+defense+"/10";
    }

}
