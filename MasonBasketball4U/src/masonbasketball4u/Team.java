/*
Roan Mason
03/07/23 - 03/10/23
BasketBall Unit Summative - Team Class
https://docs.google.com/document/d/1Pj_uUpeMLE6TX_m7cZhrazIifdQt2Lh1BOH-gzo2qmQ/edit
 */
package masonbasketball4u;

/**
 *
 * @author roanm
 */
public class Team {

    private String name;
    private int numOfWins, numOfLosses;
    private Player[] players;
    
    /**
     * Constructor that creates team with a name and set of players
     * @param name - team name
     * @param players - array of players Player[] object
     */
    public Team(String name, Player[] players) {
        //setting attributes
        this.name = name;
        this.players = players;
        
        //default team stats
        numOfWins = 0;
        numOfLosses = 0;
    }
    
    /**
     * Constructor that creates a team with a name, set of players and stats
     * @param name - team name
     * @param players - array of players Player[] object
     * @param numOfWins - amount of wins the team has
     * @param numOfLosses - amount of losses the team has
     */
    public Team(String name, Player[] players, int numOfWins, int numOfLosses) {
        this(name, players);
        this.numOfWins = numOfWins;
        this.numOfLosses = numOfLosses;
        this.players = players;
    }

    /**
     * Generate a score that the team would get in a game based on the player
     * stats
     *
     * @return
     */
    public int getScore() {
        int totalScore = 0;
        for (Player player : players) { //cycle through players
            //add their stats to the total
            totalScore += player.getDefense() + player.getDunk() + player.getSpeed() + player.getThreePointers();
        }
        double factor = totalScore / 4; //divid total by 4
        /*
        generate a random number higher than 75 but no higher than 
        the factor previously calculated
         */
        int score = (int) (Math.random() * factor) + 75;
        return score;
    }

    /**
     * return the team name
     * @return 
     */
    public String getTeamName() {
        return name;
    }

    /**
     * Change the number of wins stat
     * @param numOfWins - an integer
     */
    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    /**
     * return the number of wins 
     * @return 
     */
    public int getNumOfWins() {
        return numOfWins;
    }

    /**
     * Change the number of losses
     * @param numOfLosses - an integer
     */
    public void setNumOfLosses(int numOfLosses) {
        this.numOfLosses = numOfLosses;
    }

    /**
     * return the number of losses
     * @return 
     */
    public int getNumOfLosses() {
        return numOfLosses;
    }

    /**
     * Passed traded player as a parameter then return the player it's being traded with
     * @param other
     * @return 
     */
    public Player trade(Player other) {
        Player traded; //variable for traded player storage
        int playerIndex = (int)(Math.random() * 5);
        traded = players[playerIndex];
        players[playerIndex] = other;
        return traded;
    }
    
    /**
     * Searches for player with matching name
     * @param playerName - name they want to find
     * @return 
     */
    public int getPlayerIndex(String playerName) {
        for (int i = 0; i < players.length; i++) { //cycle through players 
            if (players[i].getName().equalsIgnoreCase(playerName)) { //if the name matches the request name
                return i; //return the index
            }
        }
        return -1; //otherwise return -1 for an unfound name
    }
    
    /**
     * return the array for players
     * @return 
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * return object as a string
     * @return 
     */
    public String toString() {
        String string = "Team name: "+name
                +"\n\nRecord: W:"+numOfWins+" L:"+numOfLosses;
        for (Player player : players) {
            string += "\n\n"+player;
        }
        return string;
    }

}
