/*
Roan Mason
04/17/23
ArrayListExercise1
*/
package arraylistexercise1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author roanm
 */
public class ArrayListExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numbers = getList();
        ArrayList<Integer> evenList = new ArrayList();
        ArrayList<Integer> oddList = new ArrayList();
        ArrayList<Integer> negativeList = new ArrayList();
        
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            } else {
                oddList.add(number);

            }
            if (number < 0) {
                negativeList.add(number);
            }
            
        }
        
        System.out.println("Evens: "+evenList.toString());
        System.out.println("Odds: "+oddList.toString());
        System.out.println("Negatives: "+negativeList.toString());
        
    }

    /**
     * 
     * @return
     */
    public static ArrayList<Integer> getList() {
        //Reads input from console and returns an arraylist of 10 integers

        ArrayList<Integer> list = new ArrayList();
        int space;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 10 Numbers seperated by spaces");
            String input = s.nextLine();
            
            for (int i = 0; i < 10; i++) {
                space = input.indexOf(" ");
                if (space == -1) {
                    space = input.length();
                }
                list.add(i, Integer.parseInt(input.substring(0, space)));
                input = input.replaceFirst("" + list.get(i), "");
                if (space != input.length()) {
                    input = input.replaceFirst(" ", "");
                }
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);

        }
        return list;


    }

}
