/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package symmetricmountainsproblem;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class SymmetricMountainsProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s  = new Scanner(System.in);
        int col = Integer.parseInt(s.nextLine());
        String row1 = s.nextLine();
        
        int[] height = new int[col];
        int space;
        
        for (int i = 0; i < col; i++) {
            space = row1.indexOf(" ");
            if (space == -1) {
                space = row1.length();
            }
            height[i] = Integer.parseInt(row1.substring(0, space));
            row1 = row1.replaceFirst(""+height[i], "");
            if (space != row1.length()) {
                row1 = row1.replaceFirst(" ", "");
            }
        }
        
        mountain(height);
        
        
    }

    public static void mountain(int[] height) {
        int diff1;
        int diff2;
        int num1;
        int num2;

        for (int length = 0; length < height.length; length++) { //move through all lengths
            diff1 = 0;
            diff2 = Integer.MAX_VALUE;
            for (int startPoint = 0; startPoint < (height.length-length/2); startPoint++) {
                num1 = height[startPoint];
                num2 = height[startPoint + length];
                diff1 += Math.abs(num1 - num2);

            }

            if (diff1 < diff2) {
                diff2 = diff1;
            }
            System.out.println(diff2);
        }
        
    }
    
}
