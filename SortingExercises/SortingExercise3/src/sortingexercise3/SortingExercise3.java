/*
Roan Mason
05/01/23
Write a program that reads in a list of 1000 integers from this data file. 
Sort the integers in descending order using an Insertion Sort and output them to the screen.
*/
package sortingexercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SortingExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = readFile();
        System.out.println("Original: ");
        printArray(numbers);
        System.out.println("\n");

        insertionSort(numbers);
        System.out.println("Sorted: ");
        printArray(numbers);
        double num = (Math.abs(100-70)/60.0);
        System.out.println();
        System.out.println(num);
    }

    public static void insertionSort(int[] array) {
        int size = array.length -1;
        for (int i = 0; i < size; i++) {
            while (i > 0 && array[i-1] > array[i]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");

        }
    }

    public static int[] readFile() {
        int[] numbers = new int[1000];
        try {
            File f = new File("src/sortingexercise3/randomNumbers.txt");
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
