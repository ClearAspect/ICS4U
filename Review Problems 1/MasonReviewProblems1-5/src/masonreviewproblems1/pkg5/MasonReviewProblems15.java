/*
Roan Mason
03/09/23
 */
package masonreviewproblems1.pkg5;

import java.text.DecimalFormat;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat dollar = new DecimalFormat("$#,###.00");
        DecimalFormat percent = new DecimalFormat("#,###.0%");
        double costOfJeans = 24.99;
        double rateOfDiscount = 0.3;
        double amountOfDiscount = costOfJeans*rateOfDiscount;
        System.out.println("Cost of jeans\t\t"+dollar.format(costOfJeans));
        System.out.println("Rate of discount\t"+percent.format(rateOfDiscount));
        System.out.println("Amount of discount\t"+dollar.format(amountOfDiscount));
        System.out.println("Total cost of jeans\t"+dollar.format(costOfJeans-amountOfDiscount));
    }
    
}
