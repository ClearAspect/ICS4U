/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arraylistexercise3;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author roanm
 */
public class ArrayListExercise3 extends javax.swing.JFrame {

    
    
    private ArrayList<Student> studentList = new ArrayList();
    private int currentIndex;
    
    /**
     * Creates new form ArrayListExercise3
     */
    public ArrayListExercise3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        test1Lbl = new javax.swing.JLabel();
        test3Lbl = new javax.swing.JLabel();
        test2Lbl = new javax.swing.JLabel();
        avgLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        test1Txt = new javax.swing.JTextField();
        test2Txt = new javax.swing.JTextField();
        test3Txt = new javax.swing.JTextField();
        avgTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        highestAvgStudentLbl = new javax.swing.JLabel();
        highestScoreStudentLbl = new javax.swing.JLabel();
        countLbl = new javax.swing.JLabel();
        classAvgLbl = new javax.swing.JLabel();
        highestScoreStudentTxt = new javax.swing.JTextField();
        highestAvgStudentTxt = new javax.swing.JTextField();
        classAvgTxt = new javax.swing.JTextField();
        countTxt = new javax.swing.JTextField();
        currentIndexLbl = new javax.swing.JLabel();
        highestAvgLbl = new javax.swing.JLabel();
        highestScoreLbl = new javax.swing.JLabel();
        currentIndexTxt = new javax.swing.JTextField();
        highestAvgTxt = new javax.swing.JTextField();
        highestScoreTxt = new javax.swing.JTextField();
        previousBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        toFirstBtn = new javax.swing.JButton();
        toLastBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 41, 45));

        nameLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        nameLbl.setText("Name");

        test1Lbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        test1Lbl.setText("Test 1");

        test3Lbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        test3Lbl.setText("Test 3");

        test2Lbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        test2Lbl.setText("Test 2");

        avgLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        avgLbl.setText("Average");

        nameTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        test1Txt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        test2Txt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        test3Txt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        avgTxt.setEditable(false);
        avgTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        addBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        modifyBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        highestAvgStudentLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        highestAvgStudentLbl.setText("Student With Highest Average");

        highestScoreStudentLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        highestScoreStudentLbl.setText("Student With Highest Test Score");

        countLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        countLbl.setText("Count");

        classAvgLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        classAvgLbl.setText("Overall Class Average");

        highestScoreStudentTxt.setEditable(false);
        highestScoreStudentTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        highestAvgStudentTxt.setEditable(false);
        highestAvgStudentTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        classAvgTxt.setEditable(false);
        classAvgTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        countTxt.setEditable(false);
        countTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        currentIndexLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        currentIndexLbl.setText("Current Index");

        highestAvgLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        highestAvgLbl.setText("Their Average");

        highestScoreLbl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        highestScoreLbl.setText("Their Test Score");

        currentIndexTxt.setEditable(false);
        currentIndexTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        highestAvgTxt.setEditable(false);
        highestAvgTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        highestScoreTxt.setEditable(false);
        highestScoreTxt.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        previousBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        previousBtn.setText("<");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        nextBtn.setText(">");
        nextBtn.setToolTipText("");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        toFirstBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        toFirstBtn.setText("<<");
        toFirstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFirstBtnActionPerformed(evt);
            }
        });

        toLastBtn.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        toLastBtn.setText(">>");
        toLastBtn.setToolTipText("");
        toLastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLastBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(test1Lbl)
                            .addComponent(test2Lbl)
                            .addComponent(test3Lbl)
                            .addComponent(avgLbl))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(test1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(test2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(test3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(highestScoreStudentLbl)
                            .addComponent(highestAvgStudentLbl)
                            .addComponent(classAvgLbl)
                            .addComponent(countLbl))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(highestScoreStudentTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(highestAvgStudentTxt)
                            .addComponent(classAvgTxt)
                            .addComponent(countTxt))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(highestAvgLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(highestAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(highestScoreLbl)
                                .addGap(15, 15, 15)
                                .addComponent(highestScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(currentIndexLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modifyBtn)
                                    .addComponent(addBtn)
                                    .addComponent(currentIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(toFirstBtn)
                        .addGap(50, 50, 50)
                        .addComponent(previousBtn)
                        .addGap(20, 20, 20)
                        .addComponent(nextBtn)
                        .addGap(50, 50, 50)
                        .addComponent(toLastBtn)
                        .addGap(128, 128, 128)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test1Lbl)
                    .addComponent(test1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Lbl)
                            .addComponent(test2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test3Lbl)
                            .addComponent(test3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(addBtn)
                        .addGap(14, 14, 14)
                        .addComponent(modifyBtn)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgLbl)
                    .addComponent(avgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(previousBtn)
                    .addComponent(nextBtn)
                    .addComponent(toFirstBtn)
                    .addComponent(toLastBtn))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countLbl)
                    .addComponent(countTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentIndexLbl)
                    .addComponent(currentIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classAvgLbl)
                    .addComponent(classAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highestAvgStudentLbl)
                    .addComponent(highestAvgStudentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highestAvgLbl)
                    .addComponent(highestAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highestScoreStudentLbl)
                    .addComponent(highestScoreStudentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highestScoreLbl)
                    .addComponent(highestScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void update() {
        int classAverage, totalScores = 0, highestAverage = 0, highestScore = 0;
        Student currentStudent;
        Student highestAverageStudent = null;
        Student highestScoreStudent = null;
        
        for (int i = 0; i < studentList.size(); i++) {
            currentStudent = studentList.get(i);
            if (currentStudent.getHighScore() > highestScore) {
                highestScoreStudent = currentStudent;
                highestScore = currentStudent.getHighScore();
            }
            if (currentStudent.getAverage() > highestAverage) {
                highestAverageStudent = currentStudent;
                highestAverage = currentStudent.getAverage();
            }
            totalScores += currentStudent.getScore(1) + currentStudent.getScore(2) + currentStudent.getScore(3) ;
            
            
        }
        currentStudent = studentList.get(currentIndex);
        
        
        classAverage = totalScores / (studentList.size()*3);
        
        nameTxt.setText(currentStudent.getName());
        test1Txt.setText(""+currentStudent.getScore(1));
        test2Txt.setText(""+currentStudent.getScore(2));
        test3Txt.setText(""+currentStudent.getScore(3));
        avgTxt.setText(""+currentStudent.getAverage());
        
        countTxt.setText(""+studentList.size());
        classAvgTxt.setText(""+classAverage);
        highestAvgStudentTxt.setText(highestAverageStudent.getName());
        highestScoreStudentTxt.setText(highestScoreStudent.getName());
        
        currentIndexTxt.setText(""+currentIndex);
        highestAvgTxt.setText(""+highestAverage);
        highestScoreTxt.setText(""+highestScore);
        
        
    }
 
    
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        String name = nameTxt.getText();
        int test1 = Integer.parseInt(test1Txt.getText());
        int test2 = Integer.parseInt(test2Txt.getText());
        int test3 = Integer.parseInt(test3Txt.getText());
        Student newStudent = new Student(name, test1, test2, test3);
        studentList.add(newStudent);
        
        currentIndex = studentList.size()-1;
        System.out.println(currentIndex);
        update();
    }//GEN-LAST:event_addBtnActionPerformed

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        // TODO add your handling code here:
        if (currentIndex > 0) {
            currentIndex--;
        }
        update();

    }//GEN-LAST:event_previousBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if (currentIndex < (studentList.size()-1)) {
            currentIndex++;
        }
        update();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void toFirstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFirstBtnActionPerformed
        // TODO add your handling code here:
        currentIndex = 0;
        update();
    }//GEN-LAST:event_toFirstBtnActionPerformed

    private void toLastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLastBtnActionPerformed
        // TODO add your handling code here:
        currentIndex = studentList.size()-1;
        update();
    }//GEN-LAST:event_toLastBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        
        Student modifiedStudent = studentList.get(currentIndex);
        
        modifiedStudent.setName(nameTxt.getText());
        modifiedStudent.setScore(1, Integer.parseInt(test1Txt.getText()));
        modifiedStudent.setScore(2, Integer.parseInt(test2Txt.getText()));
        modifiedStudent.setScore(3, Integer.parseInt(test3Txt.getText()));
        
        //modified student is a reference to the object stored in the Arraylist so it does not need to be "re-set" into the ArrayList
        
        update();
    }//GEN-LAST:event_modifyBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArrayListExercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArrayListExercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArrayListExercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArrayListExercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArrayListExercise3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel avgLbl;
    private javax.swing.JTextField avgTxt;
    private javax.swing.JLabel classAvgLbl;
    private javax.swing.JTextField classAvgTxt;
    private javax.swing.JLabel countLbl;
    private javax.swing.JTextField countTxt;
    private javax.swing.JLabel currentIndexLbl;
    private javax.swing.JTextField currentIndexTxt;
    private javax.swing.JLabel highestAvgLbl;
    private javax.swing.JLabel highestAvgStudentLbl;
    private javax.swing.JTextField highestAvgStudentTxt;
    private javax.swing.JTextField highestAvgTxt;
    private javax.swing.JLabel highestScoreLbl;
    private javax.swing.JLabel highestScoreStudentLbl;
    private javax.swing.JTextField highestScoreStudentTxt;
    private javax.swing.JTextField highestScoreTxt;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel test1Lbl;
    private javax.swing.JTextField test1Txt;
    private javax.swing.JLabel test2Lbl;
    private javax.swing.JTextField test2Txt;
    private javax.swing.JLabel test3Lbl;
    private javax.swing.JTextField test3Txt;
    private javax.swing.JButton toFirstBtn;
    private javax.swing.JButton toLastBtn;
    // End of variables declaration//GEN-END:variables
}
