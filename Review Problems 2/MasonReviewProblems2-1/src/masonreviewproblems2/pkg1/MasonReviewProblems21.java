/*
Roan Mason
02/10/23
*/
package masonreviewproblems2.pkg1;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hours = 0;
        double payRate = 0;
        
        String name = JOptionPane.showInputDialog("Hello! What is your name?");
        
        boolean goodInput = false;
        while (!goodInput) {
            hours = getDouble("How many hours did you work this week "+name+"?");
            if (0 > hours) {
                errorMsg("You can't work negative hours!");
            } else if (hours > 24*7) {
                errorMsg("There aren't that many hours in a week!");
            } else {
                goodInput = true;
            }
        }
        
        goodInput = false;
        while (!goodInput) {
            payRate = getDouble("And what is your hourly pay rate?");
            if (0 > payRate) {
                errorMsg("You can't work a negative rate!");
            } else {
                goodInput = true;
            }
        }
        payReport(name, hours, payRate);
    }
    
    public static void output(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void errorMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static double getDouble(String msg) {
        
        String sNumber;
        double number = 0;
        boolean goodInput = false;
        
        while (!goodInput) {
            sNumber = JOptionPane.showInputDialog(msg);
            try {
                number = Double.parseDouble(sNumber);
                goodInput = true;
            } catch (NumberFormatException e) {
                output(sNumber+" isn't a number! Try again");
            }
        }
        return number;
    }

    public static void payReport(String name, double hours, double payRate) {
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        double regHours;
        double otHours = 0;
        double regRate = payRate;
        double otRate = regRate * 1.5;
        double regPay;
        double otPay;
        double totalPay;
        
        if (hours > 44) {
            otHours = hours - 44;
            regHours = 44;
        } else {
            regHours = hours;
        }
        
        regPay = regHours*regRate;
        otPay = otHours*otRate;
        totalPay = regPay + otPay;
        
        String msg = "Total hourse worked: " + hours 
                + "\nRegular pay rate: " + money.format(regRate)
                + "\nRegular hours: " + regHours
                + "\nRegular pay: " + money.format(regPay)
                + "\n_______________"
                + "\nOT pay rate: " + money.format(otRate)
                + "\nOT hours: " + otHours
                + "\nOT pay: " + money.format(otPay)
                + "\n_______________"
                + "\nTotal pay: " + money.format(totalPay);
        
        JOptionPane.showMessageDialog(null, msg, "PAY REPORT FOR "+name.toUpperCase(), JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
