/*
import java.util.ArrayList;
Roan Mason
05/04/2023

Sorter class that accepts a ArrayList and will sort the numbers and return the sorted arrayList
Using Bubble sort, Insertion sort, Selection sort, Quick Sort, and Merge sort
*/
package masonsortingefficiencies;

public class Sorter {

    // Protected Class Variables
    private boolean ascending = true;
    private long nanoStart, nanoEnd;

    public Sorter(boolean ascending) {
    }

    public void setAscending() {
        this.ascending = true;
    }

    public void setDescending() {
        this.ascending = false;
    }

    public boolean isAscending() {
        return ascending;
    }

    public long getNanoTime() {
        return nanoEnd - nanoStart;
    }

    /* State machines that check whether the sort should be in ascending or descending order  */
    //Checks before algorithm is invoked so that there is no loss of speed/efficiency

    public void selectionSort(int[] array) {
        if (ascending) {
            nanoStart = System.nanoTime();
            ascendingSelectionSort(array);
            nanoEnd = System.nanoTime();
        } else {
            nanoStart = System.nanoTime();
            descendingSelectionSort(array);
            nanoEnd = System.nanoTime();
        }
    }

    public void bubbleSort(int[] array) {
        if (ascending) {
            nanoStart = System.nanoTime();
            ascendingBubbleSort(array);
            nanoEnd = System.nanoTime();
        } else {
            nanoStart = System.nanoTime();
            descendingBubbleSort(array);
            nanoEnd = System.nanoTime();
        }
    }

    public void insertionSort(int[] array) {
        if (ascending) {
            nanoStart = System.nanoTime();
            ascendingInsertionSort(array);
            nanoEnd = System.nanoTime();
        } else {
            nanoStart = System.nanoTime();
            descendingInsertionSort(array);
            nanoEnd = System.nanoTime();
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (ascending) {
            nanoStart = System.nanoTime();
            ascendingQuickSort(array, low, high);
            nanoEnd = System.nanoTime();
        } else {
            nanoStart = System.nanoTime();
            descendingQuickSort(array, low, high);
            nanoEnd = System.nanoTime();
        }
    }
    
    public void mergeSort(int[] array, int low, int high) {
        if (ascending) {
            nanoStart = System.nanoTime();
            ascendingMergeSort(array, low, high);
            nanoEnd = System.nanoTime();
        } else {
            nanoStart = System.nanoTime();
            descendingMergeSort(array, low, high);
            nanoEnd = System.nanoTime();
        }
    }

    /* Sorting Methods */

    /**
     * Selection Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingSelectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
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

    /**
     * Descending Selection Sorting Method
     * @param array - Array to be sorted
     */
    private void descendingSelectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int minIndex = step;

            for (int i = step + 1; i < size; i++) {
                if (array[i] > array[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = array[step];
            array[step] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    /**
     * Ascending Bubble Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingBubbleSort(int[] array) {
        int bottom = array.length - 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < bottom; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            bottom--;
        }
    }

    /**
     * Descending Bubble Sorting Method
     * @param array - Array to be sorted
     */
    private void descendingBubbleSort(int[] array) {
        int bottom = array.length - 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < bottom; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            bottom--;
        }
    }

    /**
     * Ascending Insertion Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingInsertionSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            while (i > 0 && array[i-1] > array[i]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
    }

    /**
     * Descending Insertion Sorting Method
     * @param array - Array to be sorted
     */
    private void descendingInsertionSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            while (i > 0 && array[i-1] < array[i]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
    }

    /**
     * Ascending Recursive Quick Sorting Method
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     */
    private void ascendingQuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = ascendingPartition(array, low, high);

            ascendingQuickSort(array, low, pi - 1);
            ascendingQuickSort(array, pi + 1, high);
        }
    }

    /**
     * Actual Sorting of Ascending Quick Sort
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     * @return - Position of the pivot
     */
    private int ascendingPartition(int[] array, int low, int high) {
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

    /**
     * Descending Recursive Quick Sorting Method
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     */
    private void descendingQuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = descendingPartition(array, low, high);

            descendingQuickSort(array, low, pi - 1);
            descendingQuickSort(array, pi + 1, high);
        }
    }

    /**
     * Actual Sorting of Descending Quick Sort
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     * @return - Position of the pivot
     */
    private int descendingPartition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
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

    /**
     * Ascending Recursive Merge Sorting Method
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     */
    private void ascendingMergeSort(int array[], int low, int high) {
        if (low < high) {
            // Find the middle point
            int m = low + (high - low) / 2;

            // Splitting the array into halve continously until the arrays are one index
            // long
            ascendingMergeSort(array, low, m);
            ascendingMergeSort(array, m + 1, high);

            // once no more can be split then start merging the smallest arrays

            // Merge the sorted halves
            ascendingMergeHalves(array, low, m, high);
        }
    }

    /**
     * Actual Sorting of Descending Merge Sort
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param mid - Middle index of the array
     * @param high - Highest index of the array
     */
    private void ascendingMergeHalves(int array[], int low, int mid, int high) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = low;

        // Actual merge. Basically, look where you are in the arrays, if you havent made
        // it to the end then continue.
        // Check to see which value is smaller, the move that into the new sorted array.
        // If you have reached the end of one array, copy the rest of the other array
        // into the sorted array.

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }

    /**
     * Descending Recursive Merge Sorting Method
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     */
    private void descendingMergeSort(int array[], int low, int high) {
        if (low < high) {
            // Find the middle point
            int m = low + (high - low) / 2;

            // Splitting the array into halve continously until the arrays are one index
            // long
            descendingMergeSort(array, low, m);
            descendingMergeSort(array, m + 1, high);

            // once no more can be split then start merging the smallest arrays

            // Merge the sorted halves
            descendingMergeHalves(array, low, m, high);
        }
    }

    /**
     * Actual Sorting of Descending Merge Sort
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param mid - Middle index of the array
     * @param high - Highest index of the array
     */
    private void descendingMergeHalves(int array[], int low, int mid, int high) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = low;

        // Actual merge. Basically, look where you are in the arrays, if you havent made
        // it to the end then continue.
        // Check to see which value is smaller, the move that into the new sorted array.
        // If you have reached the end of one array, copy the rest of the other array
        // into the sorted array.

        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }


    /* Other Methods */


    /**
     * Clones and returns a new Sorter object
     * @return - Clone of Sorter Object
     */
    public Sorter clone() {
        return new Sorter(ascending);
    }

    /**
     * Returns true if the Sorter is equal to another Sorter object
     * @param other - Another Sorter Object
     * @return - a Boolean
     */
    public boolean equals(Sorter other) {
        if (ascending == other.ascending) {
            return true;
        }
        return false;
    }

    /**
     * Returns a String representation of the Sorter Object
     * @return - a String
     */
    public String toString() {
        return "Sorter: [ascending = " + ascending + "]";
    }

}
