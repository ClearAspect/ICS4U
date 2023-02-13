/*
Roan Mason
02/09/23
 */
package masonreviewproblems1.pkg4;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calcPercent(10, 70);
        calcPercent(20, 25);
        calcPercent(5, 60);
    }

    private static void calcPercent(int x, int y) {
        System.out.println((float)x+" percent of "+(float)y+" is "+(int)(y*(x/100)));

    }
    
    
}
