/*
Roan Mason
21/02/23

*/
package masonunit1test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author roanm
 */
public class MasonUnit1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[][] vehicleData = readFile();
        outputData(vehicleData);
        
    }
    
    public static int[][] readFile() {
        
        int records;
        int[][] data = null;
        
        try {
            File f = new File("src/masonunit1test/vehicles.txt");
            Scanner s = new Scanner(f);
            records = Integer.parseInt(s.nextLine());
            data = new int[records][3];
            
            for (int i = 0; i < records; i++) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = Integer.parseInt(s.nextLine());
                }
            }
        
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e);
        }
        return data;
        
    }

    public static void outputData(int[][] vehicleData) {
        String msg = "\tGlobal Vehicle Sales (in thousands)\n\nYear\tEVs\tICE\t\t%EVs\t%ICEs\n";        
        double percentEV, percentICE, total;
        DecimalFormat number = new DecimalFormat("#,###");
        DecimalFormat percent = new DecimalFormat("#,##0.00%");
        
        
        for (int i = 0; i < vehicleData.length; i++) {
            total = vehicleData[i][1] + vehicleData[i][2];
            percentEV = vehicleData[i][1] / total;
            percentICE = vehicleData[i][2] / total;

            msg += vehicleData[i][0]+"\t"+number.format(vehicleData[i][1])+"\t"+number.format(vehicleData[i][2])+"\t\t"+percent.format(percentEV)+"\t"+percent.format(percentICE)+"\n";
            
        }
        System.out.println(msg);
    }
    
}
