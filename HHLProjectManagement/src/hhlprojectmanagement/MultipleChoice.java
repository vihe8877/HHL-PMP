/*
 * V. He
 * Dec 6th, 2022
 * The Multiple Choice Form
 */
package hhlprojectmanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleChoice extends javax.swing.JFrame {

    QuizQ[] questions = new QuizQ[10];
    
    public MultipleChoice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ansBtnGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTxt = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        continueBtn = new javax.swing.JButton();
        questionNumLbl = new javax.swing.JLabel();
        ansBtn1 = new javax.swing.JRadioButton();
        ansBtn2 = new javax.swing.JRadioButton();
        ansBtn3 = new javax.swing.JRadioButton();
        ansBtn4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputTxt.setColumns(20);
        outputTxt.setRows(5);
        jScrollPane1.setViewportView(outputTxt);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        continueBtn.setText("Continue>");
        continueBtn.setEnabled(false);
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        questionNumLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionNumLbl.setText("Question #1");

        ansBtnGroup.add(ansBtn1);
        ansBtn1.setText("A");

        ansBtnGroup.add(ansBtn2);
        ansBtn2.setText("B");

        ansBtnGroup.add(ansBtn3);
        ansBtn3.setText("C");

        ansBtnGroup.add(ansBtn4);
        ansBtn4.setText("D");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Multiple Choice Quiz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn)
                    .addComponent(continueBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ansBtn1)
                        .addComponent(ansBtn3)
                        .addComponent(ansBtn4)
                        .addComponent(ansBtn2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(questionNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ansBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(ansBtn2)
                        .addGap(18, 18, 18)
                        .addComponent(ansBtn3)
                        .addGap(18, 18, 18)
                        .addComponent(ansBtn4)
                        .addGap(39, 39, 39)
                        .addComponent(submitBtn)
                        .addGap(44, 44, 44)
                        .addComponent(continueBtn)
                        .addGap(34, 34, 34)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        readFile();
        int counter = 0;
        continueBtn.setEnabled(true);
        submitBtn.setEnabled(false);
        ansBtn1.setEnabled(false);
        ansBtn2.setEnabled(false);;
        ansBtn3.setEnabled(false);
        ansBtn4.setEnabled(false);
        
        String userAns;
        if (ansBtn1.isSelected()){
            userAns = "A";
        } else if (ansBtn2.isSelected()){
            userAns = "B";
        } else if (ansBtn3.isSelected()){
            userAns = "C";
        } else {
            userAns = "D";
        } 
        
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        continueBtn.setEnabled(false);
        submitBtn.setEnabled(true);
    }//GEN-LAST:event_continueBtnActionPerformed

 
    
    public void readFile() {
        String q, a, b, c, d, ans, feedback;
        try {
            File f = new File("src/hhlprojectmanagement/mc.txt");
            Scanner s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                q = s.nextLine();
                a = s.nextLine();
                b = s.nextLine();
                c = s.nextLine();
                d = s.nextLine();
                ans = s.nextLine();
                feedback = s.nextLine();
                QuizQ question = new QuizQ(q, ans, feedback, a, b, c, d, 1);
                questions[i] = question;
            }
        } catch (FileNotFoundException e){
            System.out.println("Error: " + e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ansBtn1;
    private javax.swing.JRadioButton ansBtn2;
    private javax.swing.JRadioButton ansBtn3;
    private javax.swing.JRadioButton ansBtn4;
    private javax.swing.ButtonGroup ansBtnGroup;
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputTxt;
    private javax.swing.JLabel questionNumLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}