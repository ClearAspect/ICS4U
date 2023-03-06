/*
Roan Mason
03/01/23
Project 2 - LuckySevens
https://docs.google.com/document/d/14m4-65mFSd_sbCIzM3PkJdJjszepKjYD-ss6oL3la6s/edit
 */
package introanddefiningclasses32;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class IntroAndDefiningClasses32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dice d = new Dice();

        Scanner s = new Scanner(System.in);
        boolean done = false;
        int tokens, maxTokens, rolls = 0, rollValue;
        String input = "z";

        System.out.println("How many tokens would you like to start with?");
        tokens = Integer.parseInt(s.nextLine());
        maxTokens = tokens;

        while (!done) {
            while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))) {
                System.out.println("Do you want to roll the dice (y/n)?");
                input = s.nextLine();
            }
            if (input.equalsIgnoreCase("y")) {
                rolls++;
                rollValue = d.roll();

                if (rollValue == 7) {
                    tokens += 4;
                } else {
                    tokens--;
                }

                if (tokens <= 0) {
                    System.out.println("Game Over. You rolled " + rolls + " times and had a highscore of " + maxTokens + " Tokens");
                    done = true;
                } else {
                    System.out.println("You rolled a " + rollValue + ". You now have " + tokens + " tokens");

                }

                if (maxTokens < tokens) {
                    maxTokens = tokens;
                }

            } else {
                System.out.println("Game Over. You rolled " + rolls + " times and had a highscore of " + maxTokens + " Tokens");
                done = true;
            }
            input = "z";

        }
        System.out.println("Thanks for playing.");
    }

}
