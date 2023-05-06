/*
Roan Mason
04/24/23
Unit 4 Recursion Practice for test
*/
package recusionpractice;

/**
 *
 * @author roanm
 */
public class RecusionPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = sumDigits(49);
        System.out.println("sumDigits: " + n);
        int m = lucas(4);
    }

    private static int lucas(int i) {
        


    }

    private static int sumDigits(int i) {
        if (i <= 0) {
            return 0;
        } else {
            return i % 10 + sumDigits(i / 10);
        }
    }



    
}
