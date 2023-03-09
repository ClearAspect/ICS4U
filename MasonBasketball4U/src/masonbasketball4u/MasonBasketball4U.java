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

/**
 *
 * @author roanm
 */
public class MasonBasketball4U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainMenu(readData());
    }

    public static void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static String input(String msg) {
        String choice;
        choice = JOptionPane.showInputDialog(msg);
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
                    teamMenu(teams);
                } else {
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }
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
                    simGameMenu(teams);
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
        String choice = "z";
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

    public static void simGameMenu(Team[] teams) {
        String msg = "Select a team:\n\n";
        boolean done = false;
        for (Team team : teams) {
            msg += "-" + team.getTeamName() + "\n";
        }
        String choice = "z";
        while (!done) {
            choice = input(msg);
            if (isValidTeam(choice, teams)) {
            } else {
                showMsg("I couldn't find \"" + choice + "\", please try again...");
            }

        }

    }

    public static void playerMenu() {

    }

}
