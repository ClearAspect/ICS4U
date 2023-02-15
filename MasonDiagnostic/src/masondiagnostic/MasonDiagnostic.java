/*
Roan Mason
02/07/23
https://docs.google.com/document/d/1Fy8s7gCWBHFLNUHb1YwEvwk67jh_G5xFS_ZXs4roJ2I/edit
 */
package masondiagnostic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonDiagnostic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        output(readFile());

    }

    public static void output(int[][] nums) {
        int total;
        float num1;
        float num2;
        for (int i = 0; i < nums.length; i++) {
            total = nums[i][0] + nums[i][1];
            num1 = (nums[i][0]*10/total);
            num2 = (nums[i][1]*10/total);
            if ((num1+num2) != 10) {
                num2++;
            }
            for (int j = 0; j < (int)(num1); j++) {
                System.out.print("*");
            }
            for (int g = 0; g < (int)(num2); g++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }
    
    
    public static int[][] readFile() {
        int[][] nums = new int[5][2];
        int count = 0;
        String line;
        int sLength;
        try {
            File f = new File("src/masondiagnostic/pkg1/Data.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                line = s.nextLine();
                sLength = (line.length() / 2);

                nums[count][0] = Integer.parseInt(line.substring(0, sLength));
                nums[count][1] = Integer.parseInt(line.substring(sLength + 1));
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return nums;
    }

}
