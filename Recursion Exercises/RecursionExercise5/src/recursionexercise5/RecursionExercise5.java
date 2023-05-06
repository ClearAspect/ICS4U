/*
Roan Mason
04/19/23
Given a number n, write a fully recursive program that will produce an ‘A’ shaped triangle of height n made of stars. 
Your solution should use absolutely NO loops!
*/
package recursionexercise5;

import java.net.SocketTimeoutException;

/**
 *
 * @author roanm
 */
public class RecursionExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String invertedTriangle = invertedTriangle(10);
        String triangle = triangle(10);
        System.out.println(triangle);
        System.out.println();
        System.out.println(invertedTriangle);
    }

    public static String invertedTriangle(int i) {
        if (i != 0) {
            return asterisks(i) + "\n" + invertedTriangle(i - 1);
        }
        return "";
    }

    public static String triangle(int i) {
        if (i != 0) {
            return triangle(i - 1) + "\n" + asterisks(i);
        }
        return "";

    } 

    public static String asterisks(int n) {
        if (n == 1) {
            return "*";
        } else {
            return "*" + asterisks(n - 1);
        }
    }
}