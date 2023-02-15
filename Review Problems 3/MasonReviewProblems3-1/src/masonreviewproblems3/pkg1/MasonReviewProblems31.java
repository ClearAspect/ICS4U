/*
Roan Mason
02/14/23
*/
package masonreviewproblems3.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonReviewProblems31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] fanData;
        fanData = readFile();
        output(fanData);
        
    }

    public static String[][] readFile() {
        String[][] sData = new String[3][3];
        try {
            File f = new File("src/masonreviewproblems3/pkg1/Data.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sData[i][j] = s.nextLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return sData;
    }

    public static void output(String[][] fanData) {
        DecimalFormat number = new DecimalFormat("#,###");
        DecimalFormat percent = new DecimalFormat("#,##0.00%");
        
        String group;
        double leafFans;
        double habFans;
        double leafsPercent;
        double habsPercent;
        
        System.out.println("\t\tCanadian Population (in thousands)\nAge Group\tLeaf Fans\tHabs Fans\t%Leafs\t\t%Habs");
        for (int i = 0; i < 3; i++) {
            group = fanData[i][0];
            leafFans = Integer.parseInt(fanData[i][1]);
            habFans = Integer.parseInt(fanData[i][2]);
            leafsPercent = leafFans/(leafFans+habFans);
            habsPercent = habFans/(leafFans+habFans);
            System.out.println(group+"\t"+number.format(leafFans)+"\t\t"+number.format(habFans)+"\t\t"+percent.format(leafsPercent)+"\t\t"+percent.format(habsPercent));

        }
        
    }
    
}
