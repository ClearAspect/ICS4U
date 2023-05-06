/*
Roan Mason
05/01/23
Write a program that reads in a list of 1000 integers from this data file. 
Sort the integers in descending order using a Quick Sort and output them to the screen.
*/
package sortingexercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SortingExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = readFile();
        System.out.println("Original: ");
        printArray(numbers);
        System.out.println("\n");

        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted: ");
        printArray(numbers);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }

    public static int[] readFile() {
        int[] numbers = new int[1000];
        try {
            File f = new File("SortingExercise4/src/sortingexercise4/randomNumbers.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < 1000; i++) {
                numbers[i] = Integer.parseInt(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        }
        return numbers;

    }
}