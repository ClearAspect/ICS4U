/*
Roan Mason
04/19/23

Use a recursive method to find the value of the nth Fibonacci number. 
Fibonacci numbers are listed as follows: 1,1,2,3,5,8,13,21,34…

In general:
F(1) = 1
F(2) = 1
F(n) = F(n-1) + F(n-2) for all n > 2
*/
package recursionexercise1;

/**
 *
 * @author roanm
 */
public class RecursionExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        int num = fibonacci(4);
        System.out.println(num);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
