/*
Roan Mason
05/02/23
Write a program that reads in this list of 20 student records. 
A student record contains a name and an overall numerical grade. Sort the records by grade using Quick 
Sort or Merge Sort and output the mean, median and mode. Using a Student class will make this easier for you.
*/
package sortingexercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SortingExercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> students = loadStudentData();
        System.out.println("Original Data: ");
        printScores(students);

        sort(students, 0, students.size() - 1);

        System.out.println("Sorted Data: ");
        printScores(students);

        System.out.println("Mean: " + getMean(students));
        System.out.println("Median: " + getMedian(students));
        System.out.println("Mode: " + getMode(students));

    }

    public static int getMedian(ArrayList<Student> students) {
        int median = 0;
        int size = students.size();
        if (size % 2 == 0) {
            median = (students.get(size / 2).getScore() + students.get(size / 2 - 1).getScore()) / 2;
        } else {
            median = students.get(size / 2).getScore();
        }
        return median;
    }

    public static int getMode(ArrayList<Student> students) {
        int mode = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < students.size(); i++) {
            count = 0;
            for (int j = 0; j < students.size(); j++) {
                if (students.get(i).getScore() == students.get(j).getScore()) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mode = students.get(i).getScore();
            }
        }
        return mode;
    }

    public static int getMean(ArrayList<Student> students) {
        int mean = 0;
        for (int i = 0; i < students.size(); i++) {
            mean += students.get(i).getScore();
        }
        return mean / students.size();
    
    }

    public static void sort(ArrayList<Student> students, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Splitting the array into halve continously until the arrays are one index
            // long
            sort(students, l, m);
            sort(students, m + 1, r);

            // once no more can be split then start merging the smallest arrays

            // Merge the sorted halves
            mergeSort(students, l, m, r);
        }
    }

    public static void mergeSort(ArrayList<Student> students, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        ArrayList<Student> L = (ArrayList<Student>) students.clone();
        ArrayList<Student> R = (ArrayList<Student>) students.clone();

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L.set(i, students.get(l + i));
            
        }
        for (int j = 0; j < n2; j++) {
            R.set(j, students.get(m + 1 + j));
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;

        // Actual merge. Basically, look where you are in the arrays, if you havent made
        // it to the end then continue.
        // Check to see which value is smaller, the move that into the new sorted array.
        // If you have reached the end of one array, copy the rest of the other array
        // into the sorted array.
        while (i < n1 && j < n2) {
            if (L.get(i).getScore() <= R.get(j).getScore()) {
                students.set(k, L.get(i));
                i++;
            } else {
                students.set(k, R.get(j));
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            students.set(k, L.get(i));
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            students.set(k, R.get(j));
            j++;
            k++;
        }

    }

    public static ArrayList<Student> loadStudentData() {
        ArrayList<Student> students = new ArrayList();
        try {
            File f = new File("SortingExercise6/src/sortingexercise6/studentRecords.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String name = s.nextLine();
                int score = Integer.parseInt(s.nextLine());
                students.add(new Student(name, score));
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        }
        return students;
    }

    public static void printScores(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

}
