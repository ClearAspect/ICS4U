/*
Roan Mason
12/14/22
Project of the month number 10
 */
package projectoftheweek10;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class ProjectOfTheWeek10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be generated?");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.print("List of Numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = (int)(Math.random() * 101);
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        // Find the range
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        int range = max - min;

        // Print the result
        System.out.println("The range of the numbers is: "+range);
    }
}

    

