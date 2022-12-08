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

    StudyGUI firstWindow;
    QuizQ[] questions = new QuizQ[10];
    int counter = -1;

    public MultipleChoice(StudyGUI m) {
        initComponents();
        readFile();
        firstWindow = m;
        outputTxt.setText(questions[0].getQue() + "\n\nA. "
                + questions[0].getOpA() + "\nB. "
                + questions[0].getOpB() + "\nC. "
                + questions[0].getOpC() + "\nD. "
                + questions[0].getOpD());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        menuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputTxt.setEditable(false);
        outputTxt.setColumns(20);
        outputTxt.setLineWrap(true);
        outputTxt.setRows(5);
        outputTxt.setWrapStyleWord(true);
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
        ansBtn1.setSelected(true);
        ansBtn1.setText("A");

        ansBtnGroup.add(ansBtn2);
        ansBtn2.setText("B");

        ansBtnGroup.add(ansBtn3);
        ansBtn3.setText("C");

        ansBtnGroup.add(ansBtn4);
        ansBtn4.setText("D");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Multiple Choice Quiz");

        menuBtn.setText("Menu");
        menuBtn.setEnabled(false);
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

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
                        .addComponent(ansBtn2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(menuBtn))
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
                        .addGap(18, 18, 18)
                        .addComponent(continueBtn)
                        .addGap(18, 18, 18)
                        .addComponent(menuBtn)
                        .addGap(19, 19, 19)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        counter++;
        continueBtn.setEnabled(true);
        submitBtn.setEnabled(false);

        String userAns;
        if (ansBtn1.isSelected()) {
            userAns = "A";
        } else if (ansBtn2.isSelected()) {
            userAns = "B";
        } else if (ansBtn3.isSelected()) {
            userAns = "C";
        } else {
            userAns = "D";
        }

        if (userAns.equals(questions[counter].getAns())) {
            outputTxt.setText("Correct!");
        } else {
            outputTxt.setText("Incorrect!\n\n" + questions[counter].getFeedback());
        }
    }                                         

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        continueBtn.setEnabled(false);
        submitBtn.setEnabled(true);
        ansBtn1.setSelected(true);
    }                                           

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        firstWindow.setVisible(true);
        this.setVisible(false);
    }                                       

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
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton ansBtn1;
    private javax.swing.JRadioButton ansBtn2;
    private javax.swing.JRadioButton ansBtn3;
    private javax.swing.JRadioButton ansBtn4;
    private javax.swing.ButtonGroup ansBtnGroup;
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JTextArea outputTxt;
    private javax.swing.JLabel questionNumLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration                   
}
