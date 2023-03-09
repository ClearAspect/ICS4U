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

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
        numOfWins = 0;
        numOfLosses = 0;
    }

    public Team(String name, Player[] players, int numOfWins, int numOfLosses) {
        this(name, players);
        this.numOfWins = numOfWins;
        this.numOfLosses = numOfLosses;
        this.players = players;
    }

    public int getScore() {
        int totalScore = 0;
        for (Player player : players) {
            totalScore += player.getDefense() + player.getDunk() + player.getSpeed() + player.getThreePointers();
        }
        double factor = totalScore / 4;
        int score = (int) (Math.random() * factor) + 75;
        return score;
    }
    
    public String getTeamName() {
        return name;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfLosses(int numOfLosses) {
        this.numOfLosses = numOfLosses;
    }

    public int getNumOfLosses() {
        return numOfLosses;
    }

    public Player trade(Player other) {
        Player traded;
        int playerIndex = (int)(Math.random() * 5);
        traded = players[playerIndex];
        players[playerIndex] = other;
        return traded;
    }

    public int getPlayerIndex(String playerName) {
        int index = 0;
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public String toString() {
        String string = "Team name: "+name
                +"\n\nRecord: W:"+numOfWins+" L:"+numOfLosses;
        for (Player player : players) {
            string += "\n\n"+player;
        }
        return string;
    }

}
