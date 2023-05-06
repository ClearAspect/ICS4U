/*
Roan Mason
04/19/23
write a recursive method to calculate n! (factorial)
*/
package recursionexercise2;

/**
 *
 * @author roanm
 */
public class RecursionExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        

        int num = factorial(4);
        System.out.println(num);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }


    }
    
}
