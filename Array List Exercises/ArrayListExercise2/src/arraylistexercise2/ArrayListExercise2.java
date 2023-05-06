/*
Roan Mason
04/17/23
ArrayListExercise1
*/
package arraylistexercise2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class ArrayListExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Double> numbers = getList();
        double average = getAverage(numbers);
        
        System.out.println("Average: "+average+"\nHigher than Average: ");
        for (Double number : numbers) {
            if (number > average) {
                System.out.print(number+", ");
            }
        } 
        
    }
    
    public static double getAverage(ArrayList<Double> list) {
        
        double total = 0;
        for (Double listNum : list) {
            total += listNum;
        }
        return total/list.size();
        
    }
    
    public static ArrayList<Double> getList() {

        ArrayList<Double> list = new ArrayList();
        int space;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 10 decimal numbers seperated by spaces");
            String input = s.nextLine();

            for (int i = 0; i < 10; i++) {
                space = input.indexOf(" ");
                if (space == -1) {
                    space = input.length();
                }
                list.add(i, Double.valueOf(input.substring(0, space)));
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
