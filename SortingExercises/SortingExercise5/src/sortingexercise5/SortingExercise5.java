/*
Roan Mason
05/02/23
Write a program that generates 10,000 random numbers (1 to 1,000,000) and 
sorts them in ascending order using Merge Sort.
*/
package sortingexercise5;

/**
 *
 * @author roanm
 */
public class SortingExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = generateArray();
        System.out.println("Original: ");
        printArray(numbers);
        System.out.println("\n");

        sort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted: ");
        printArray(numbers);
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            //Splitting the array into halve continously until the arrays are one index long
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            //once no more can be split then start merging the smallest arrays

            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }

    public static void mergeSort(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;

        //Actual merge. Basically, look where you are in the arrays, if you havent made it to the end then continue.
        //Check to see which value is smaller, the move that into the new sorted array. 
        //If you have reached the end of one array, copy the rest of the other array into the sorted array.
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


    public static int[] generateArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }
    
}
