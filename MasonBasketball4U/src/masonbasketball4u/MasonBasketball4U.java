/*
Roan Mason
03/07/23 - 03/10/23
BasketBall Unit Summative
https://docs.google.com/document/d/1Pj_uUpeMLE6TX_m7cZhrazIifdQt2Lh1BOH-gzo2qmQ/edit
 */
package masonbasketball4u;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author roanm
 */
public class MasonBasketball4U {
    
    public static ImageIcon image = new ImageIcon("src/masonbasketball4u/bb4uIcon.png");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainMenu(readData());
    }

    /**
     * Helper method for JOptionPane output
     *
     * @param msg - Message in window
     */
    public static void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Basketball4U", 0,image);
    }

    /**
     * Helper method for JOptionPane input
     *
     * @param msg - Message in window
     * @return
     */
    public static String input(String msg) {
        String choice;
        choice = (String) JOptionPane.showInputDialog(null, msg, "Basketball4U", 0, image, null, "");
        return choice;
    }

    public static Team[] readData() {
        int numOfTeams;
        Team[] teams = null;
        Player[] players;
        String teamName, playerName;
        int numOfWins, numOfLosses, speed, threePointers, dunk, defense;
        
        try {
            File f = new File("src/masonbasketball4u/ball.4u");
            Scanner s = new Scanner(f);
            numOfTeams = Integer.parseInt(s.nextLine());
            teams = new Team[numOfTeams];
            for (int i = 0; i < numOfTeams; i++) {
                teamName = s.nextLine();
                numOfWins = Integer.parseInt(s.nextLine());
                numOfLosses = Integer.parseInt(s.nextLine());
                players = new Player[5];
                for (int j = 0; j < 5; j++) {
                    playerName = s.nextLine();
                    speed = Integer.parseInt(s.nextLine());
                    threePointers = Integer.parseInt(s.nextLine());
                    dunk = Integer.parseInt(s.nextLine());
                    defense = Integer.parseInt(s.nextLine());
                    players[j] = new Player(playerName, speed, threePointers, dunk, defense);
                }
                teams[i] = new Team(teamName, players, numOfWins, numOfLosses);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        return teams;
    }

    public static void mainMenu(Team[] teams) {
        String choice = "z";
        showMsg("Welcome to BasketBall4U!");
        while (!choice.equalsIgnoreCase("q")) {
            choice = input("What would you like to do?\n1. View team menu\n2. View player menu\nOr type \"q\" to exit");
            if (!choice.equalsIgnoreCase("q")) {
                if (choice.equalsIgnoreCase("1")) {
                    teamMenu(teams);
                } else if (choice.equalsIgnoreCase("2")) {
                    playerMenu(teams);
                } else {
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }
        showMsg("Later gator!");
    }

    public static void teamMenu(Team[] teams) {
        String msg = "Teams in the league:\n\n";
        for (Team team : teams) {
            msg += "-" + team.getTeamName() + "\n";

        }
        msg += "\n1. View team\n2. Simulate game\nOr type \"b\" to go back.";
        String choice = "z";
        while (!choice.equalsIgnoreCase("b")) {
            choice = input(msg);
            if (!choice.equalsIgnoreCase("b")) {
                if (choice.equalsIgnoreCase("1")) {
                    viewTeamMenu(teams);
                } else if (choice.equalsIgnoreCase("2")) {
                    simSelect1(teams);
                } else {
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }

    }

    public static void viewTeamMenu(Team[] teams) {
        String msg = "Teams in the league:\n\n";
        for (Team team : teams) {
            msg += "-" + team.getTeamName() + "\n";

        }
        msg += "\nOr type \"b\" to go back.";
        String choice = "";
        String teamStat;
        while (!choice.equalsIgnoreCase("b")) {
            choice = input(msg);
            if (!choice.equalsIgnoreCase("b")) {
                if (isValidTeam(choice, teams)) {
                    teamStat = teams[getTeamIndex(choice, teams)].toString();
                    showMsg(teamStat);
                } else {
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }
            }
        }

    }

    public static int getTeamIndex(String name, Team[] teams) {
        int count = 0;
        for (Team team : teams) {
            if (name.equalsIgnoreCase(team.getTeamName())) {
                return count;
            } else {
                count++;
            }
        }
        return -1;
    }

    public static boolean isValidTeam(String name, Team[] teams) {
        for (Team team : teams) {
            if (name.equalsIgnoreCase(team.getTeamName())) {
                return true;
            }

        }
        return false;

    }

    public static void simSelect1(Team[] teams) {
        String msg = "Select a team:\n";
        boolean done = false;
        for (Team team : teams) {
            msg += "-" + team.getTeamName() + "\n";
        }
        String choice;
        while (!done) {
            choice = input(msg);
            if (isValidTeam(choice, teams)) {
                simSelect2(teams, choice);
                done = true;
            } else {
                showMsg("I couldn't find \"" + choice + "\", please try again...");
            }

        }

    }

    public static void simSelect2(Team[] teams, String choice1) {
        String msg = "Select a team:\n";
        boolean done = false;
        for (Team team : teams) {
            if (!team.getTeamName().equalsIgnoreCase(choice1)) {
                msg += "-" + team.getTeamName() + "\n";

            }
        }
        String choice;
        while (!done) {
            choice = input(msg);
            if (isValidTeam(choice, teams)) {
                simMenu(choice1, choice, teams);
                done = true;
            } else {
                showMsg("I couldn't find \"" + choice + "\", please try again...");
            }

        }

    }

    public static void simMenu(String choice1, String choice2, Team[] teams) {
        int teamOneIndex = getTeamIndex(choice1, teams);
        int teamTwoIndex = getTeamIndex(choice2, teams);
        choice1 = teams[teamOneIndex].getTeamName();
        choice2 = teams[teamTwoIndex].getTeamName();
        showMsg("Ready to sim?"
                + "\n" + choice1 + " - W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses()
                + "\n\n  ******VS******"
                + "\n\n" + choice2 + " - W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses());
        int teamOneScore = teams[teamOneIndex].getScore();
        int teamTwoScore = teams[teamTwoIndex].getScore();
        String result = "Game results:\n";
        if (teamOneScore == teamTwoScore) {
            result += choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\n ******have Tied******"
                    + "\n\n" + choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamOneScore + " to " + teamTwoScore;

        } else if (teamOneScore > teamTwoScore) {
            teams[teamOneIndex].setNumOfWins(teams[teamOneIndex].getNumOfWins() + 1);
            teams[teamTwoIndex].setNumOfLosses(teams[teamTwoIndex].getNumOfLosses() + 1);
            result += choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\n ******have defeated******"
                    + "\n\n" + choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamOneScore + " to " + teamTwoScore;

        } else {
            teams[teamTwoIndex].setNumOfWins(teams[teamTwoIndex].getNumOfWins() + 1);
            teams[teamOneIndex].setNumOfLosses(teams[teamOneIndex].getNumOfLosses() + 1);
            result += choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\n ******have defeated******"
                    + "\n\n" + choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamTwoScore + " to " + teamOneScore;

        }
        showMsg(result);

    }

    public static void playerMenu(Team[] teams) {
        String choice = "";
        int teamIndex = 0, playerIndex = -1;
        Player request;
        Player[] players;
        boolean playerFound;
        while (!choice.equalsIgnoreCase("b")) {
            choice = input("Enter a player name to search for\nOr type \"b\" to go back.");
            playerFound = false;
            if (!choice.equalsIgnoreCase("b")) {
                for (int i = 0; i < teams.length; i++) {
                    playerIndex = teams[i].getPlayerIndex(choice);
                    if (playerIndex != -1) {
                        playerFound = true;
                        teamIndex = i;
                        i = teams.length;
                    }

                }
                if (playerFound) {
                    players = teams[teamIndex].getPlayers();
                    request = players[playerIndex];
                    showMsg("FOUND!\nTeam: " + teams[teamIndex].getTeamName() + "\n" + request.toString());
                } else {
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }

            }

        }
    }

}
