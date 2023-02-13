/*
Roan Mason
02/09/23
*/
package masonreviewchallengeproblems1.pkg1;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonReviewChallengeProblems11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How many terms of the fibonacci sequence?");
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        sequence(number);
    }

    public static void sequence(int times) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print("0, 1, ");
        for (int i = 0; i < times; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num2+", ");
        }
        System.out.print("...\n");
    }
    
}
