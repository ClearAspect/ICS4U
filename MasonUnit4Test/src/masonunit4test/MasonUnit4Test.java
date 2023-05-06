/*
Roan Mason
04/26/23

Write a program LastNameUnit4Test which prompts the user for a base and an exponent 
and outputs to them the result of raising the base to that exponent. You can assume 
that the numbers entered by the user will be integers greater than or equal to 0 (and 
they won’t both be zero). Include a recursive method in your program which accepts a 
base and exponent as parameters and returns the result. Continue to prompt the user 
until they enter “-1”. Do not ask for an exponent if “-1” is entered. (10 T + 2 C)
https://docs.google.com/document/d/1VP2N5Qdj06MzHtRPB_Sc4zVDi8w_lverwb__bz56rw8/edit
 */
package masonunit4test;

import javax.swing.JOptionPane;

/**
 *
 * @author roanm
 */
public class MasonUnit4Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Call the main menu and start the program
        mainMenu();

    }

    /**
     * Helper method for integer input with JOptionPane
     *
     * @param msg - A String
     * @return - an integer
     */
    public static int getInt(String msg) {
        //Get input from the user and parse it into an integer. Then return the value to the call
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    /**
     * Main menu loop of the program
     */
    public static void mainMenu() {
        //initialize variables
        int exponent = 0, answer = 0, base = 0;
        //base = 0 so that the menu opens

        //Loop as long as the user hasnt requested to exit
        while (base != -1) {
            //get an initial response from the user
            base = getInt("Hi there! Please enter the base (or -1 to exit)");
            //if the response is -1 then dont do anythinf
            if (base != -1) {
                //prompt the user for an exponent
                exponent = getInt("Great job! Now please enter the exponent");

                //calculate the power of the base and exponent
                answer = power(base, exponent);

                //output the answer
                JOptionPane.showMessageDialog(null, base + " ^ " + exponent + " = " + answer);
            }
        }
        //say goodbye
        JOptionPane.showMessageDialog(null, "Goodbye!");
    }

    /**
     * Calculates the power of a base to an exponent
     *
     * @param base - an integer
     * @param exponent - an integer
     * @return - an integer
     */
    public static int power(int base, int exponent) {
        if (exponent == 0) { //Base case. if the exponent is 0 then return 1. 4^0 = 1
            return 1;
        } else {
            //otherwise multiply the base by another method call. Exponential math is just repeated multiplication
            //if the exponent happens to be 0 and base is 5 then the return would become 5*1 
            return base * power(base, exponent - 1);
        }
    }

}
