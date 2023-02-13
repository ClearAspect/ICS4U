/*
Roan Mason
02/09/23
 */
package masonreviewproblems1.pkg6;

import java.text.DecimalFormat;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat dollar = new DecimalFormat("$#,###.00");
        DecimalFormat percent = new DecimalFormat("#,###.0%");
        double originalCost = 62.99;
        double finalCost = 71.81;
        double amountOfTax = finalCost-originalCost;
        System.out.println("Original cost\t"+dollar.format(originalCost));
        System.out.println("Final cost\t"+dollar.format(finalCost));
        System.out.println("Amount of tax\t"+dollar.format(amountOfTax));
        System.out.println("Rate of tac\t"+percent.format(amountOfTax/originalCost));
    }
    
}
