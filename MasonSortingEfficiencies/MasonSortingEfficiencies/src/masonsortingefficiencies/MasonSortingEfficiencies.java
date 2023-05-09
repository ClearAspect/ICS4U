/*
Roan Mason
05/04/23
Sorting Efficiencies Assignment
 */
package masonsortingefficiencies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author roanm
 */
public class MasonSortingEfficiencies extends javax.swing.JFrame {

    //Global Variables
    public static int[] smallArray;
    public static int[] bigArray;
    public static int[] usedArray;
    public static Sorter sorter = new Sorter(true); //instantiate the sorter


    /**
     * Creates new form MasonSortingEfficiencies
     */
    public MasonSortingEfficiencies() {
       initComponents();
    }

    /**
     * Read the files that contain the values of the arrays to be sorted.
     * @param path - String
     * @return - Array of integers
     */
    public static int[] readFile(String path) {
        int[] numbers; //array of numbers
        int length = 10; //set the starting length of the array to be ten
        if (path.contains("10000")) { //Check if the path contains "10000"
            length = 10000; //set the length to be 10000 if true
        }
        numbers = new int[length]; //instantiate the array
        //Simply read the file with File class and Scanner class
        
        try {
            File f = new File(path);
            Scanner s = new Scanner(f);
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(s.nextLine());
            }
        } catch (FileNotFoundException e) { //if the file is not found print exception
            // TODO: handle exception
            System.out.println("Error: " + e);
        }
        return numbers; //return the array
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountBtnGroup = new javax.swing.ButtonGroup();
        orderBtnGroup = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        numToSortLbl = new javax.swing.JLabel();
        sortTypeLbl = new javax.swing.JLabel();
        tenRBtn = new javax.swing.JRadioButton();
        tenThousandRBtn = new javax.swing.JRadioButton();
        sortTypeCombo = new javax.swing.JComboBox<>();
        sortOrderLbl = new javax.swing.JLabel();
        ascendingRBtn = new javax.swing.JRadioButton();
        descendingRBtn = new javax.swing.JRadioButton();
        sortBtn = new javax.swing.JButton();
        originalLbl = new javax.swing.JLabel();
        sortedLbl = new javax.swing.JLabel();
        resultsLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortedTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        originalTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultsTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        titleLbl.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        titleLbl.setText("Sorting Efficiencies");

        numToSortLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        numToSortLbl.setText("Amount of numbers to sort:");

        sortTypeLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        sortTypeLbl.setText("Display numbers sorted by:");

        amountBtnGroup.add(tenRBtn);
        tenRBtn.setSelected(true);
        tenRBtn.setText("10");

        amountBtnGroup.add(tenThousandRBtn);
        tenThousandRBtn.setText("10000");

        sortTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bubble Sort ", "Insertion Sort", "Selection Sort", "Quick Sort", "Merge Sort" }));

        sortOrderLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        sortOrderLbl.setText("Sort Order:");

        orderBtnGroup.add(ascendingRBtn);
        ascendingRBtn.setSelected(true);
        ascendingRBtn.setText("Ascending");

        orderBtnGroup.add(descendingRBtn);
        descendingRBtn.setText("Descending");

        sortBtn.setText("Sort");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        originalLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        originalLbl.setText("Original Numbers:");

        sortedLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        sortedLbl.setText("Sorted Numbers:");

        resultsLbl.setFont(new java.awt.Font("Cascadia Code", 0, 13)); // NOI18N
        resultsLbl.setText("Sort Results:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        sortedTxt.setEditable(false);
        sortedTxt.setColumns(20);
        sortedTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        sortedTxt.setRows(5);
        sortedTxt.setToolTipText("");
        jScrollPane1.setViewportView(sortedTxt);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        originalTxt.setEditable(false);
        originalTxt.setColumns(20);
        originalTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        originalTxt.setRows(5);
        originalTxt.setToolTipText("");
        jScrollPane2.setViewportView(originalTxt);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        resultsTxt.setEditable(false);
        resultsTxt.setColumns(20);
        resultsTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        resultsTxt.setRows(5);
        resultsTxt.setToolTipText("");
        jScrollPane3.setViewportView(resultsTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sortOrderLbl)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descendingRBtn)
                                            .addComponent(ascendingRBtn))
                                        .addGap(22, 22, 22)
                                        .addComponent(sortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(sortTypeLbl)
                                            .addGap(184, 184, 184))
                                        .addComponent(sortTypeCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numToSortLbl)
                                        .addGap(40, 40, 40)
                                        .addComponent(tenRBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(tenThousandRBtn)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(originalLbl)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortedLbl))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resultsLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(titleLbl)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numToSortLbl)
                    .addComponent(tenRBtn)
                    .addComponent(tenThousandRBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortTypeLbl)
                    .addComponent(sortTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sortOrderLbl)
                                    .addComponent(ascendingRBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descendingRBtn)))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(originalLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sortedLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortBtnActionPerformed
        // TODO add your handling code here:

        // When the sort button is pressed,

        //Check which array to use. Pass the reference of the correct array into the new array variable
        if (tenRBtn.isSelected()) {
            usedArray = smallArray;
        } else {
            usedArray = bigArray;
        }
        
        //Check to see which sort to use. If the array is ascending then set the sorter to be ascending
        if (ascendingRBtn.isSelected()) {
            sorter.setAscending();
        } else {
            sorter.setDescending();
        }
        
        sort(); //Call the sort method

    }
    

    /**
     * Sorts the arrays and displays the results
     */
    public void sort() {
        //Clone the original array being used so that it may be sorted by each method individually
        int[] bubbleSorted = usedArray.clone();
        int[] insertionSorted = usedArray.clone();
        int[] selectionSorted = usedArray.clone();
        int[] quickSorted = usedArray.clone();
        int[] mergeSorted = usedArray.clone();

        //reset the results text screen
        resultsTxt.setText("");

        //Actually method calls for sorting
        //then add results of the sort to the text box
        sorter.bubbleSort(bubbleSorted);
        displayResults("Bubble Sort");

        sorter.insertionSort(insertionSorted);
        displayResults("Insertion Sort");

        sorter.selectionSort(selectionSorted);
        displayResults("Selection Sort");

        sorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        displayResults("Quick Sort");

        sorter.mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        displayResults("Merge Sort");

        //Find which sorting method that the user requested and display the result of the sort to see if the array is in the correct order
        switch (sortTypeCombo.getSelectedIndex()) {
            case 0: //Bubble Sort
                displayRequestedSort(bubbleSorted);
                break;
            case 1: //Insertion Sort
                displayRequestedSort(insertionSorted);
                break;
            case 2: //Selection Sort
                displayRequestedSort(selectionSorted);
                break;
            case 3: //Quick Sort
                displayRequestedSort(quickSorted);
                break;
            case 4: //Merge Sort
                displayRequestedSort(mergeSorted);
                break;
        }
        
    }

    /**
     * Adds the loops and time to the results text box
     * @param sortType - Name of sort type
     */
    public void displayResults(String sortType) {
        DecimalFormat df = new DecimalFormat("#,###"); //Number formatting 

        String currentResults = resultsTxt.getText(); //Get the current text in the results box

        //Add the new results to the current results
        currentResults += 
        sortType
        +":\nNumber of times a loop was executed: "+df.format(sorter.getLoopCount())
        +"\nNumber of nanoseconds to complete sort: "+df.format(sorter.getNanoTime())+"\n";

        //Reset the results into the box with the updated information
        resultsTxt.setText(currentResults);
    }

    /**
     * Display the array sorted via the requested sort
     * @param sortedArray - requested sorted array
     */
    public void displayRequestedSort(int[] sortedArray) {
        String arrayString = ""; //Original array string 
        String sortedArrayString = ""; //Sorted array string

        //Loop through the array and add each element to the string
        for (int  i = 0; i < usedArray.length; i++) {
            arrayString += i + " : " +usedArray[i] + "\n";
            sortedArrayString += i + " : " + sortedArray[i] + "\n";
        }
        //set the text of the boxes with the respective strings
        originalTxt.setText(arrayString);
        sortedTxt.setText(sortedArrayString);

    } 
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasonSortingEfficiencies.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasonSortingEfficiencies.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasonSortingEfficiencies.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasonSortingEfficiencies.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasonSortingEfficiencies().setVisible(true);
            }
        });

        //get the small and big arrays
        smallArray = readFile("src/masonsortingefficiencies/10nums.txt");
        bigArray = readFile("src/masonsortingefficiencies/10000nums.txt");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup amountBtnGroup;
    private javax.swing.JRadioButton ascendingRBtn;
    private javax.swing.JRadioButton descendingRBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel numToSortLbl;
    private javax.swing.ButtonGroup orderBtnGroup;
    private javax.swing.JLabel originalLbl;
    private javax.swing.JTextArea originalTxt;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JTextArea resultsTxt;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel sortOrderLbl;
    private javax.swing.JComboBox<String> sortTypeCombo;
    private javax.swing.JLabel sortTypeLbl;
    private javax.swing.JLabel sortedLbl;
    private javax.swing.JTextArea sortedTxt;
    private javax.swing.JRadioButton tenRBtn;
    private javax.swing.JRadioButton tenThousandRBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
