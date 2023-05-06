/*
Roan Mason
04/19/23
First write a recursive method to calculate the GCD (hint) of two integers.

Use this GCD method to reduce a fraction that is input by the user.
*/
package recursionexercise4;

/**
 *
 * @author roanm
 */
public class RecursionExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num =  gcd(12, 18);
        System.out.println(num);
        System.out.println("12/18 = "+12/num+"/"+18/num);
    }

    /**
     * Greastest common divisor using the Euclidean algorithm
     * @param n - numerator
     * @param d - denominator
     * @return
     */
    public static int gcd(int n, int d) {
        if (d != 0) {
            return gcd(d, n % d);
        } else {
            return n;
        }
        
    }
    
}
