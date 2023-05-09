/*
Roan Mason
05/04/2023

Sorter class that accepts a ArrayList and will sort the numbers and return the sorted arrayList
Using Bubble sort, Insertion sort, Selection sort, Quick Sort, and Merge sort
*/
package masonsortingefficiencies;

public class Sorter {

    // Protected Class Variables
    private boolean ascending = true; // determines whether algorithm should be ascending or not
    private long nanoStart, nanoEnd; //Time stamps between sort start/end
    private int loopCount; //number of loops in a sort

    /**
     * Constructor that creates the sorter.
     * @param ascending - a boolean
     */
    public Sorter(boolean ascending) {
        this.ascending = ascending;
    }

    /**
     * Setter method that sets the ascending boolean
     */
    public void setAscending() {
        this.ascending = true;
    }

    /**
     * Setter method that sets the descending boolean
     */
    public void setDescending() {
        this.ascending = false;
    }

    /**
     * Getter method that returns the ascending boolean
     * @return - boolean
     */
    public boolean isAscending() {
        return ascending;
    }

    /**
     * Getter method that returns the time it took for the algorithm to sort in nano seconds
     * @return - long
     */
    public long getNanoTime() {
        return nanoEnd - nanoStart;
    }

    /**
     * Getter method that returns the number of loops in a sort
     * @return
     */
    public int getLoopCount() {
        return loopCount;
    }

    /* Sorting method calls that determine whether the algorithm should be ascending or not.  */
    /* 
     * Sets the loop counter to zero to each algorithm can have the loops counted individually.
     * 
     * Check if the array is in ascending order, then call the correct method. If ascending then sort in ascending order
     * 
     * Before sorting, get the current nano time, then after sorting is done, get the current nano time again.
     * If the user decides to request the nano time then the starting nano time will be subtracted from the finishing time
     * then return to the user.
     */

    /**
     * Selection sort method that will choose the correct order
     * @param array - array being sorted
     */
    public void selectionSort(int[] array) {
        loopCount = 0; // Reset loop counter

        //Save the current nano time. If the array is in ascending order then call 
        //the ascending selection sort method. Get the ending nano time.
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

    /**
     * Bubble sort method that will choose the correct order
     * @param array - array being sorted
     */
    public void bubbleSort(int[] array) {
        loopCount = 0; // Reset loop counter
        
        //Save the current nano time. If the array is in ascending order then call 
        //the ascending selection sort method. Get the ending nano time.
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

    /**
     * Insertion sort method that will choose the correct order
     * @param array - array being sorted
     */
    public void insertionSort(int[] array) {
        loopCount = 0; // Reset loop counter
        
        //Save the current nano time. If the array is in ascending order then call 
        //the ascending selection sort method. Get the ending nano time.
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

    /**
     * Quick sort method that will choose the correct order
     * @param array - array being sorted
     * @param low - low index of the array
     * @param high - high index of the array
     */
    public void quickSort(int[] array, int low, int high) {
        loopCount = 0; // Reset loop counter
       
        //Save the current nano time. If the array is in ascending order then call 
        //the ascending selection sort method. Get the ending nano time.
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
    
    /**
     * Merge sort method that will choose the correct order
     * @param array - array being sorted
     * @param low - low index of the array
     * @param high - high index of the array
     */
    public void mergeSort(int[] array, int low, int high) {
        loopCount = 0; // Reset loop counter
        
        //Save the current nano time. If the array is in ascending order then call 
        //the ascending selection sort method. Get the ending nano time.
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

    //Selection sort

    /**
     * Ascending Selection Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingSelectionSort(int[] array) {
        int size = array.length; //Get the length of the array

        for (int step = 0; step < size - 1; step++) { //Loop through the array
            int minIndex = step; //The minimum index is the current index of the loop

            for (int i = step + 1; i < size; i++) { //Loop through the array starting at the minimum index
                if (array[i] < array[minIndex]) { //Check if the current index is less than the minimum index
                    minIndex = i; //If so, then the minimum index is the current index
                }
                loopCount++; //Increment loop counter
            }
            //Swap the minimum index with index of the new smallest number found
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
                if (array[i] > array[minIndex]) { //Swapped less-than operator to greater-than operator to make the algorithm descending
                    minIndex = i;
                }
                loopCount++;
            }
            int temp = array[step];
            array[step] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    //Bubble sort

    /**
     * Ascending Bubble Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingBubbleSort(int[] array) {
        int bottom = array.length - 1; //Set the bottom index to the length of the array
        boolean swapped = true; //Set the boolean to true to start the loop

        while (swapped) { //While indexes continue to be swapped
            swapped = false; //Set the boolean to false because nothing has been swapped yet
            for (int i = 0; i < bottom; i++) { //Loop through the array
                if (array[i] > array[i + 1]) { //If two consecutive indexes are out of order then swap them
                    //Swap the indexes/numbers
                    int temp = array[i]; 
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    
                    swapped = true; //Set boolean to true because indexes having swapped. Must check to see if anything else needs to be swapped
                }
                loopCount++; //Increment loop counter
            
            }
            bottom--; //Decrement the bottom index because the last index has been checked and swapped if needed
        
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
                if (array[i] < array[i + 1]) { //Swapped greater-than operator to less-than operator to make the algorithm descending
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
                loopCount++;
            }
            bottom--;
        }
    }

    //Insertion sort

    /**
     * Ascending Insertion Sorting Method
     * @param array - Array to be sorted
     */
    private void ascendingInsertionSort(int[] array) {
        int size = array.length; //get the length of the array

        for (int i = 0; i < size; i++) { //Loop through the array
            while (i > 0 && array[i-1] > array[i]) { //While the current index is greater than zero, Check if current index's value is less than the previous
                //Swap the two indexes/numbers
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;

                i--; //Decrement the index to check the next index
                loopCount++; //Increment loop counter
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
            while (i > 0 && array[i-1] < array[i]) { //Swapped greater-than operator to less-than operator to make the algorithm descending
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
                loopCount++;
            }
        }
    }

    //Quick sort

    /**
     * Ascending Recursive Quick Sorting Method
     * @param array - Array to be sorted
     * @param low - Lowest index of the array
     * @param high - Highest index of the array
     */
    private void ascendingQuickSort(int[] array, int low, int high) {
        if (low < high) { //if the lowest index is less than the highest index continue to sort
            //pi is the location of the pivot. Everything smaller than the pivot is on the left of the pivot
            int pi = ascendingPartition(array, low, high);

            //Sort the left side of the pivot
            ascendingQuickSort(array, low, pi - 1);
            //Sort the right side of the pivot
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
        int pivot = array[high]; //pivot is on the right-most index being checked
        int i = low - 1; //i is the index of the left-most index being checked

        for (int j = low; j < high; j++) { //Loop through the array being checked
            if (array[j] <= pivot) { //if this index of the array is less than the pivot
                i++;

                //Swap the element i with element j because j is smaller than the pivot
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            loopCount++; //increment loop counter
        }

        //Everything smaller than the pivot is on the left of the pivot
        //Everything greater than the pivot is on the right of the pivot


        //Swap the element of the pivot with element of i 
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done (Pivot location)
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
            if (array[j] >= pivot) { //swapped less-than or equal to operator with greater-than operator to make the algorithm descending
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            loopCount++;
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    //Merge Sort

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

            // Splitting the array into halve continuously until the arrays are one index long
            ascendingMergeSort(array, low, m);
            ascendingMergeSort(array, m + 1, high);

            // Once no more can be split then start merging the smallest arrays

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
        // Find sizes of two sub-arrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temp arrays left and right
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        // loop through initial array
        for (int i = 0; i < n1; i++) {
            L[i] = array[low + i];
            loopCount++;
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
            loopCount++;
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = low;

        // Actual merge. Basically, look where you are in the arrays, if you havent made it to the end then continue.
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
            loopCount++; //increment loop counter
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
            loopCount++; //increment loop counter
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
            loopCount++; //increment loop counter
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
            int m = low + (high - low) / 2;

            descendingMergeSort(array, low, m);
            descendingMergeSort(array, m + 1, high);

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
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[low + i];
            loopCount++;
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
            loopCount++;
        }

        int i = 0, j = 0;

        int k = low;

        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) { //Swapped less-than or equal to operator with greater-than operator to make the algorithm descending
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
            loopCount++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
            loopCount++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
            loopCount++;
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
