/**
 * 
 */
package hhlprojectmanagement;

/**
 *
 * @author wihua4239
 */
public class Notes extends javax.swing.JFrame {

    StudyGUI firstWindow;
    /**
     * Creates new form Notes
     */
    public Notes(StudyGUI m) {
        initComponents();
        firstWindow = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pageBtn1 = new javax.swing.JButton();
        pageBtn2 = new javax.swing.JButton();
        pageBtn3 = new javax.swing.JButton();
        pageBtn4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTxt = new javax.swing.JTextArea();
        menuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pageBtn1.setText("1");

        pageBtn2.setText("2");

        pageBtn3.setText("3");

        pageBtn4.setText("4");
        pageBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageBtn4ActionPerformed(evt);
            }
        });

        notesTxt.setColumns(20);
        notesTxt.setRows(5);
        jScrollPane1.setViewportView(notesTxt);

        menuBtn.setText("Menu");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(pageBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(pageBtn2)
                        .addGap(18, 18, 18)
                        .addComponent(pageBtn3)
                        .addGap(18, 18, 18)
                        .addComponent(pageBtn4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageBtn1)
                    .addComponent(pageBtn2)
                    .addComponent(pageBtn3)
                    .addComponent(pageBtn4))
                .addGap(18, 18, 18)
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void pageBtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        firstWindow.setVisible(true);
        this.setVisible(false);
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JTextArea notesTxt;
    private javax.swing.JButton pageBtn1;
    private javax.swing.JButton pageBtn2;
    private javax.swing.JButton pageBtn3;
    private javax.swing.JButton pageBtn4;
    // End of variables declaration                   
}
