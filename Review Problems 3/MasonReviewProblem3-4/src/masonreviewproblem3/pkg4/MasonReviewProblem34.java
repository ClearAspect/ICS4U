/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masonreviewproblem3.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonReviewProblem34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = readFile(); // read the array from a file
        boolean hasEven = hasEven(numbers);
        boolean hasOdd = hasOdd(numbers);
        if (hasOdd && hasEven) {
            System.out.println("The array contains three consecutive even numbers and three consecutive odd numbers.");
        } else if (hasEven) {
            System.out.println("The array contains three consecutive even numbers.");
        } else if (hasOdd) {
            System.out.println("The array contains three consecutive odd numbers.");
        } else {
            System.out.println("The array does not contain three consecutive even or odd numbers.");

        }
    }

    public static int[] readFile() {
        try {
            File f = new File("src/masonreviewproblem3/pkg4/Data.txt");
            Scanner scanner = new Scanner(f);
            int[] numbers = new int[10];
            int i = 0;
            while (scanner.hasNextInt() && i < 10) {
                numbers[i] = scanner.nextInt();
                i++;
            }
            return numbers;
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e);
            return null;
        }
    }

    public static boolean hasEven(int[] array) {
        for (int i = 0; i <= array.length - 3; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasOdd(int[] array) {
        for (int i = 0; i <= array.length - 3; i++) {
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

}
