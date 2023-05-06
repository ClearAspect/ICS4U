/*
Roan Mason
04/19/23

We have a triangle made of blocks. 
The topmost row has 1 block, the next row down has 2 blocks, the next row 
has 3 blocks, and so on. Compute recursively (no loops or multiplication) 
the total number of blocks in such a triangle with the given number of rows. 

triangle(0) -> 0
triangle(1) -> 1
triangle(2) -> 3
*/
package recursionexercise3;

/**
 *
 * @author roanm
 */
public class RecursionExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num = triangle(2);
        System.out.println(num);
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }

    }
    
}
