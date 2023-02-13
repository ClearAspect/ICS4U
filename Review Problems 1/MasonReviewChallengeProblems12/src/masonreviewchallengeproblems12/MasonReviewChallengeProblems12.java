/*
Roan Mason
02/09/23
*/
package masonreviewchallengeproblems12;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonReviewChallengeProblems12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("What is your number?");
        Scanner s = new Scanner(System.in);
        long number = Long.parseLong(s.nextLine());
        factor(number);
    }

    public static void factor(long number) {
        for (int i = 2; i < number; i++) {
            while ((number % i) == 0) {
                number /= i;
            }
        }
        System.out.println(number);
    }
    
}
