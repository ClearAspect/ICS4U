/*
Roan Mason
05/01/23
Write a program that reads in a list of 1000 integers from this data file. 
Sort the integers in ascending order using a Selection Sort and output them to the screen. *
*/
package sortingexercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SortingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = readFile();
        System.out.println("Original: ");
        printArray(numbers);
        System.out.println("\n");

        selectionSort(numbers);
        System.out.println("Sorted: ");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");

        }
    }

    public static void selectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size -1; step++) {
            int minIndex = step;

            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = array[step];
            array[step] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    public static int[] readFile() {
        int[] numbers = new int[1000];
        try {
            File f = new File("SortingExercise1/src/sortingexercise1/randomNumbers.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < 1000; i++) {
                numbers[i] = Integer.parseInt(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Error: "+e);
        }
        return numbers;

    }
    
}
