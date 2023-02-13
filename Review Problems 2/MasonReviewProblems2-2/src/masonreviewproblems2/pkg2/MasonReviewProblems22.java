/*
Roan Mason
02/10/23
*/
package masonreviewproblems2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int startNum = 0;
        
        boolean goodInput = false;
        while (!goodInput) {
            startNum = getInt("Enter a number please");
            if (0 > startNum) {
                errorMsg("No negatives please!");
            } else if (startNum > Integer.MAX_VALUE-5) {
                errorMsg("Pick a smaller number please!");
            } else {
                goodInput = true;
            }
        }
        output(startNum);
        
    }
        public static void output(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void errorMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static int getInt(String msg) {
        
        String sNumber;
        int number = 0;
        boolean goodInput = false;
        
        while (!goodInput) {
            sNumber = JOptionPane.showInputDialog(msg);
            try {
                number = Integer.parseInt(sNumber);
                goodInput = true;
            } catch (NumberFormatException e) {
                output(sNumber+" isn't a number! Try again");
            }
        }
        return number;
    }

    private static void output(int startNum) {
        
        String msg = "Using a for loop:\n"+startNum+", ";
        int forNum = startNum;
        int whileNum = startNum;
        for (int i = 0; i < 5; i++) {
            forNum++;
            if (i == 4) {
            msg += forNum+".";
            } else {
            msg += forNum+", ";
            } 
        }
        
        msg += "\n\nUsing a while loop:\n"+startNum+", ";
        int count = 0;
        while (count != 6) {
            count++;
            whileNum++;
            if (count == 6) {
            msg += whileNum+".";
            } else {
            msg += whileNum+", ";
            }   
        }
        
        System.out.println(msg);
    }
}
