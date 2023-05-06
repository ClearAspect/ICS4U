/*
Roan Mason
05/01/23
Write a program that reads in a list of 1000 Strings from this data file. 
Sort the Strings in ascending alphabetical order using a Bubble Sort and output them to the screen.
*/
package sortingexercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SortingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = readFile();
        System.out.println("Original: ");
        printArray(words);
        System.out.println("\n");

        bubbleSort(words);
        System.out.println("Sorted: ");
        printArray(words);

    }

    public static void bubbleSort(String[] words) {
        int bottom = words.length - 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < bottom; i++) {
                if (words[i].compareTo(words[i+1]) > 0) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true;
                }
            }
            bottom--;
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");

        }
    }

    public static String[] readFile() {
        String[] words = new String[1000];
        try {
            File f = new File("src/sortingexercise2/randomWords.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < 1000; i++) {
                words[i] = s.nextLine();
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Error: "+e);
        }
        return words;

    }
}
