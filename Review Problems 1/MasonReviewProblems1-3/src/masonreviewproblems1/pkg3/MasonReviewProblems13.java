/*
Roan Mason
02/08/23
 */
package masonreviewproblems1.pkg3;

import java.text.DecimalFormat;
/**
 *
 * @author roanm
 */
public class MasonReviewProblems13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat number = new DecimalFormat("#,###");
        int numOfWidgets = 1022957;
        int numInPack = 12;
        System.out.println("Total widgets\t\t"+number.format(numOfWidgets));
        System.out.println("Number in Pack\t\t"+numInPack);
        System.out.println("Total boxes\t\t"+number.format(numOfWidgets/numInPack));
        System.out.println("Amount in partial box\t"+numOfWidgets%numInPack);
        
    }
    
}
