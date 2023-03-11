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
import javax.swing.ImageIcon;

/**
 *
 * @author roanm
 */
public class MasonBasketball4U {
    
    //icon for program
    public static ImageIcon image = new ImageIcon("src/masonbasketball4u/bb4uIcon.png");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Reads the data in the data file and passes the array of teams in the the initial menu
        */
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

    /**
     * Reads the data in the file (teams and players etc)
     * @return 
     */
    public static Team[] readData() {
        int numOfTeams; 
        Team[] teams = null; //teams array
        Player[] players; //players array
        //variables for data that needs to be added into the arrays
        String teamName, playerName;
        int numOfWins, numOfLosses, speed, threePointers, dunk, defense;
        
        try { //try to read the file
            File f = new File("src/masonbasketball4u/ball.4u");
            Scanner s = new Scanner(f);
            //First line of the data file is the number of teams
            numOfTeams = Integer.parseInt(s.nextLine());
            //instantiate the array using the number of teams variable
            teams = new Team[numOfTeams];
            for (int i = 0; i < numOfTeams; i++) { //loop through the amount of teams needed
                //self explanatory
                teamName = s.nextLine(); 
                numOfWins = Integer.parseInt(s.nextLine());
                numOfLosses = Integer.parseInt(s.nextLine());
                //instantiate the array of players
                players = new Player[5];
                for (int j = 0; j < 5; j++) { //loop 5 times - 5 players per team
                    //self explanatory
                    playerName = s.nextLine();
                    speed = Integer.parseInt(s.nextLine());
                    threePointers = Integer.parseInt(s.nextLine());
                    dunk = Integer.parseInt(s.nextLine());
                    defense = Integer.parseInt(s.nextLine());
                    //construct new player and add it to the array of players
                    players[j] = new Player(playerName, speed, threePointers, dunk, defense);
                }
                //construct a new team and add it to the array of teams
                teams[i] = new Team(teamName, players, numOfWins, numOfLosses);
            }

        } catch (FileNotFoundException e) { //catch exception
            System.out.println("Error: " + e);
        }
        return teams;
    }

    /**
     * Literally the main menu
     * @param teams - array of teams read from file
     */
    public static void mainMenu(Team[] teams) {
        String choice = "z"; //has to be something but the options allowed to be chosen to start loop
        showMsg("Welcome to BasketBall4U!"); //Opening message
        while (!choice.equalsIgnoreCase("q")) { //while user isnt done
            choice = input("What would you like to do?\n1. View team menu\n2. View player menu\nOr type \"q\" to exit"); //get input
            if (!choice.equalsIgnoreCase("q")) { //if user isnt done
                if (choice.equalsIgnoreCase("1")) { //if user wants to see team menu
                    teamMenu(teams); 
                } else if (choice.equalsIgnoreCase("2")) { //if user wants to see player menu
                    playerMenu(teams);
                } else { //if not a valid response
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }
        showMsg("Later gator!"); //exit message
    }

    /**
     * team menu
     * @param teams - array of teams read from file
     */
    public static void teamMenu(Team[] teams) {
        String msg = "Teams in the league:\n\n"; //Create the message being shown to the player
        for (Team team : teams) { //cycle through teams
            msg += "-" + team.getTeamName() + "\n"; // add team names to message

        }
        msg += "\n1. View team\n2. Simulate game\nOr type \"b\" to go back.";
        String choice = "z";
        while (!choice.equalsIgnoreCase("b")) { //while user isnt done
            choice = input(msg); //get input
            if (!choice.equalsIgnoreCase("b")) { //if user isnt done
                if (choice.equalsIgnoreCase("1")) { //if user wants to view a team
                    viewTeamMenu(teams);
                } else if (choice.equalsIgnoreCase("2")) { //if user wants to sim a game
                    simSelect1(teams);
                } else { //if not a valid response
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }

    }

    /**
     * view a team menu
     * @param teams - array of teams read from file
     */
    public static void viewTeamMenu(Team[] teams) {
        String msg = "Teams in the league:\n\n"; //create the message being shown to the player
        for (Team team : teams) { //cycle through teams
            msg += "-" + team.getTeamName() + "\n"; // add team names to message

        }
        msg += "\nOr type \"b\" to go back.";
        String choice = "";
        String teamStat;
        while (!choice.equalsIgnoreCase("b")) { //while user isnt done
            choice = input(msg); //get input
            if (!choice.equalsIgnoreCase("b")) { // if user isnt done
                if (getTeamIndex(choice, teams) != -1) { //check is chosen team exists
                    teamStat = teams[getTeamIndex(choice, teams)].toString(); //get index of team and use it to identify it in the array, then return the team a string
                    showMsg(teamStat); //output the team data
                } else { //if not a valid response
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }
            }
        }

    }

    /**
     * get the index of a team in the array of teams
     * @param name - name of team requested
     * @param teams - array of teams
     * @return 
     */
    public static int getTeamIndex(String name, Team[] teams) {
        int count = 0;
        for (Team team : teams) { //loop through array of teams
            if (name.equalsIgnoreCase(team.getTeamName())) { //if name matchs
                return count; //returns the current index of the array
            } else {
                count++; //otherwise adds to index and loops again
            }
        }
        return -1; //if noting is found return -1
    }

    /**
     * select first team for simulation 
     * @param teams - array of teams
     */
    public static void simSelect1(Team[] teams) {
        String msg = "Select a team:\n";
        boolean teamSelected = false;
        for (Team team : teams) { //cycle through teams add to string
            msg += "-" + team.getTeamName() + "\n";
        }
        String choice;
        while (!teamSelected) { //while user hasnt select team
            choice = input(msg); //input from user
            if (getTeamIndex(choice, teams) != -1) { //check if chosen team exists
                simSelect2(teams, choice); //check second team
                teamSelected = true; //team has been selected/simulation done
            } else { //if team not found
                showMsg("I couldn't find \"" + choice + "\", please try again...");
            }

        }

    }

    /**
     * select second team for simulation
     * @param teams - array of teams
     * @param choice1 - first team chosen
     */
    public static void simSelect2(Team[] teams, String choice1) {
        String msg = "Select a team:\n";
        boolean done = false;
        for (Team team : teams) { //cycle through teams add to string
            if (!team.getTeamName().equalsIgnoreCase(choice1)) {
                msg += "-" + team.getTeamName() + "\n";

            }
        }
        String choice;
        while (!done) { //while user hasnt select team
            choice = input(msg); //input from user
            if (getTeamIndex(choice, teams) != -1) { //check if chosen team exists
                simMenu(choice1, choice, teams); //Open simulation menu
                done = true; //team has been selected/simulation done
            } else { //if team not found
                showMsg("I couldn't find \"" + choice + "\", please try again...");
            }

        }

    }
    
    //I know I could have made simSelect1 and 2 into the same method but I liked putting every single menu into its own method and I didnt have time to change it 

    /**
     * Simulate a game and get scores
     * @param choice1 - first team chosen
     * @param choice2 - second team chosen
     * @param teams - array of teams
     */
    public static void simMenu(String choice1, String choice2, Team[] teams) {
        //get index of the teams chosen
        int teamOneIndex = getTeamIndex(choice1, teams);
        int teamTwoIndex = getTeamIndex(choice2, teams);
        //Just reformating the names
        choice1 = teams[teamOneIndex].getTeamName();
        choice2 = teams[teamTwoIndex].getTeamName();
        
        //ready to sim pop-up
        showMsg("Ready to sim?"
                + "\n" + choice1 + " - W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses()
                + "\n\n  ******VS******"
                + "\n\n" + choice2 + " - W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses());
        
        //generate scores
        int teamOneScore = teams[teamOneIndex].getScore();
        int teamTwoScore = teams[teamTwoIndex].getScore();
        
        //the if statements just add strings that state the simultion results
        String result = "Game results:\n";
        
        if (teamOneScore == teamTwoScore) { //if tied game
            result += choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\n ******have Tied******"
                    + "\n\n" + choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamOneScore + " to " + teamTwoScore;

        } else if (teamOneScore > teamTwoScore) { //if first team chosen wins
            teams[teamOneIndex].setNumOfWins(teams[teamOneIndex].getNumOfWins() + 1);
            teams[teamTwoIndex].setNumOfLosses(teams[teamTwoIndex].getNumOfLosses() + 1);
            result += choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\n ******have defeated******"
                    + "\n\n" + choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamOneScore + " to " + teamTwoScore;

        } else { //if second team chosen wins
            teams[teamTwoIndex].setNumOfWins(teams[teamTwoIndex].getNumOfWins() + 1);
            teams[teamOneIndex].setNumOfLosses(teams[teamOneIndex].getNumOfLosses() + 1);
            result += choice2 + "(W: " + teams[teamTwoIndex].getNumOfWins() + " - L: " + teams[teamTwoIndex].getNumOfLosses() + ")"
                    + "\n\n ******have defeated******"
                    + "\n\n" + choice1 + "(W: " + teams[teamOneIndex].getNumOfWins() + " - L: " + teams[teamOneIndex].getNumOfLosses() + ")"
                    + "\n\nBy a score of " + teamTwoScore + " to " + teamOneScore;

        }
        showMsg(result); //output the result

    }

    public static void playerMenu(Team[] teams) {
        String choice = "";
        while (!choice.equalsIgnoreCase("b")) { //while user isnt done
            choice = input("What would you like to do?\n1. View player\n2. View trade\nOr type \"b\" to go back."); //get input
            if (!choice.equalsIgnoreCase("b")) { //if user isnt done
                if (choice.equalsIgnoreCase("1")) { //if user wants to see player menu
                    viewPlayerMenu(teams); 
                } else if (choice.equalsIgnoreCase("2")) { //if user wants to see trade menu
                    viewTradeMenu(teams);
                } else { //if not a valid response
                    showMsg("Sorry, I didn't understand that...");
                }
            }
        }
        
        
    }
    
    
    /**
     * player menu
     * @param teams - array of teams
     */
    public static void viewPlayerMenu(Team[] teams) {
        String choice = "";
        int teamIndex = 0, playerIndex = -1;
        Player request;
        Player[] players;
        boolean playerFound;
        while (!choice.equalsIgnoreCase("b")) {
            choice = input("Enter a player name to search for\nOr type \"b\" to go back.");
            playerFound = false;
            if (!choice.equalsIgnoreCase("b")) { //if user isnt done
                /*
                basically just checks to find find the player
                if the index doesnt = -1 then the player exists and the loop stops
                */
                for (int i = 0; i < teams.length; i++) {
                    playerIndex = teams[i].getPlayerIndex(choice);
                    if (playerIndex != -1) {
                        playerFound = true;
                        teamIndex = i;
                        i = teams.length;
                    }

                }
                if (playerFound) { //if a player is found then output their team and stats
                    players = teams[teamIndex].getPlayers(); 
                    request = players[playerIndex];
                    showMsg("FOUND!\nTeam: " + teams[teamIndex].getTeamName() + "\n" + request.toString());
                } else { //if no player is found then tell the user it wasnt found
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }

            }

        }
    }
    
    public static void viewTradeMenu(Team[] teams) {
        String choice = "";
        int teamIndex = 0, playerIndex = -1;
        Player[] players;
        boolean playerFound;
        while (!choice.equalsIgnoreCase("b")) {
            choice = input("Enter a player name to trade out\nOr type \"b\" to go back.");
            playerFound = false;
            if (!choice.equalsIgnoreCase("b")) { //if user isnt done
                /*
                basically just checks to find find the player
                if the index doesnt = -1 then the player exists and the loop stops
                */
                for (int i = 0; i < teams.length; i++) {
                    playerIndex = teams[i].getPlayerIndex(choice);
                    if (playerIndex != -1) {
                        playerFound = true;
                        teamIndex = i;
                        i = teams.length;
                    }

                }
                if (playerFound) { //if a player is found then output their team and stats
                    players = teams[teamIndex].getPlayers(); 
                    players[playerIndex] = genPlayer(input("Enter the name of the new player")); //generate a new player and replace it with the old one
                    showMsg("Done!\nPlayer has been traded to: " + teams[teamIndex].getTeamName());
                } else { //if no player is found then tell the user it wasnt found
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }

            }

        }
    }
    
    /**
     * generate new random player with random stats
     * @param playerName - name of player
     * @return 
     */
    public static Player genPlayer(String playerName) {
        
        Player newPlayer = new Player(playerName);
        newPlayer.setDefense((int) (Math.random() * 10) + 1);
        newPlayer.setDunk((int) (Math.random() * 10) + 1);
        newPlayer.setSpeed((int) (Math.random() * 10) + 1);
        newPlayer.setThreePointers((int) (Math.random() * 10) + 1);
        
        
        return newPlayer;
    }
    
}
