/*
Roan Mason
03/07/23 - 03/10/23
BasketBall Unit Summative
https://docs.google.com/document/d/1Pj_uUpeMLE6TX_m7cZhrazIifdQt2Lh1BOH-gzo2qmQ/edit
*/
package masonbasketball4u;

import javax.swing.JOptionPane;

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
    }
    
    public static void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static String input(String msg) {
        String choice;
        choice = JOptionPane.showInputDialog(msg);
        return choice;
    }
    
    public static void mainMenu() {
        String choice = "z";
        showMsg("Welcome to BasketBall4U!");
        while (!choice.equalsIgnoreCase("q")) {
            
            
            
        }
    }
    
}
