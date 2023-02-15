/*
Roan Mason
02/10/23
*/
package masonreviewproblems2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        int age = 0;
        int numOfKids = 0;
        int numOfAdults = 0;
        int numOfSeniors = 0;
        double kidsCost = 0;
        double adultsCost = 0;
        double seniorsCost = 0;
        double total;
        
        String summary = "TICKET SUMMARY:\n";
        while (age != 999) {
            age = getInt("What age are you buying a ticket for?");
            if (age == 999 ) { //No more tickets. Then construct summary 
                total = kidsCost + adultsCost + seniorsCost; //Add up total
                summary = numOfKids + " - 12 and under ticket(s) which is: " + money.format(kidsCost)
                        + "\n" + numOfAdults + " - 13 to 64 ticket(s) which is: " + money.format(adultsCost)
                        + "\n" +numOfKids + " - 65 and up ticket(s) which is: " + money.format(seniorsCost)
                        + "\n" + " Your overall total owing is: " + money.format(total);
            } else if (age < 0 || age > 150) {
                errorMsg("INVALID AGE!");
            } else if (age <= 12) { //12 and under are $6.00
                numOfKids++; //add to ticket count
                kidsCost += 6; //add to cost total
            } else if (age <= 64) { //13 to 64 are $7.50
                numOfAdults++; //add to ticket count
                adultsCost += 7.5; //add to ticket count
            } else if (age >= 65) { //65 and older are $6.50
                numOfSeniors++; //add to ticket count
                seniorsCost += 6.5; //add to ticket count
            }
            
        }
        output(summary); //output summary
    }
    
    public static void output(String msg) { //Simple output shortened
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void errorMsg(String msg) { //Error message shortened
        JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static int getInt(String msg) { //Error checking on number. (Exceptions)
        
        String sNumber;
        int number = 0;
        boolean goodInput = false;
        
        while (!goodInput) {
            sNumber = JOptionPane.showInputDialog(msg); //get number
            try {
                number = Integer.parseInt(sNumber); //attempt to parse string into integer
                goodInput = true; //if no exception then end loop
            } catch (NumberFormatException e) { //if it throws exception then tell user to try again
                output(sNumber+"INVALID AGE!");
            }
        }
        return number;
    }
    
}
