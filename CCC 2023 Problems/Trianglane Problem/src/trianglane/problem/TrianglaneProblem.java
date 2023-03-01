/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglane.problem;

import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class TrianglaneProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s  = new Scanner(System.in);
        int col = Integer.parseInt(s.nextLine());
        String row1 = s.nextLine();
        String row2 = s.nextLine();
        
        
        int[][] wetness = new int[col][2]; 
        
        for (int i = 0; i < col; i++) {
            wetness[i][0] = Integer.parseInt(row1.substring(0+(i*2), 1+(i*2)));
            wetness[i][1] = Integer.parseInt(row2.substring(0+(i*2), 1+(i*2)));    
        }
        
        tape(wetness);
        
    }

    public static void tape(int[][] wetness) {
        
        int meters = 0;
        
        for (int i = 0; i < wetness.length; i++) {
            if (wetness[i][0] == 1 && !isEven(i+1)) {
                meters += 3;
                
                if (wetness[i][1] == 1) {
                    meters--;
                }
                if (i + 1 <= wetness.length-1 && wetness[i+1][0] == 1) {
                    meters--;
                }
                if (i - 1 >= 0 && wetness[i-1][0] == 1) {
                    meters--;
                }
                
            } else if (wetness[i][0] == 1) {
                meters += 3;
                
                if (i + 1 <= wetness.length-1 && wetness[i+1][0] == 1) {
                    meters--;
                }
                if (i - 1 >= 0 && wetness[i-1][0] == 1) {
                    meters--;
                }
                
            }
            
            if (wetness[i][1] == 1 && !isEven(i+1)) {
                meters += 3;
                
                if (wetness[i][0] == 1) {
                    meters--;
                }
                if (i + 1 <= wetness.length-1 && wetness[i+1][1] == 1) {
                    meters--;
                }
                if (i - 1 >= 0 && wetness[i-1][1] == 1) {
                    meters--;
                }
                
            } else if (wetness[i][1] == 1) {
                meters += 3;
                
                if (i + 1 <= wetness.length-1 && wetness[i+1][1] == 1) {
                    meters--;
                }
                if (i - 1 >= 0 && wetness[i-1][1] == 1) {
                    meters--;
                }
                
            }
                        
        }
        System.out.println(meters);
    }
    
    public static boolean isEven(double x) {
        return x%2 == 0;    
    }
    
}
