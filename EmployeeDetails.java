package july2019project;

import javax.swing.ButtonGroup;

public class EmployeeDetails extends javax.swing.JFrame {
    ButtonGroup bg;
    public EmployeeDetails() {
        initComponents();
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        rb1.setSelected(true);
        this.getRootPane().setDefaultButton(show_bt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        eno_tf = new javax.swing.JTextField();
        ename_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        show_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        sal_tf = new javax.swing.JTextField();
        clear_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EMPLOYEE NO");

        eno_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ename_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EMPLOYEE NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("QUALIFICATION");

        c1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1.setText("BCA");

        c2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c2.setText("MCA");

        c3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c3.setText("B.TECH");

        c4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c4.setText("M.TECH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("GENDER");

        rb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb1.setText("MALE");

        rb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb2.setText("FEMALE");

        rb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb3.setText("TRANSGENDER");

        show_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_bt.setText("SHOW");
        show_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btActionPerformed(evt);
            }
        });

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EMPLOYEE SALARY");

        sal_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        clear_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_bt.setText("CLEAR");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(ename_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(c1)
                                            .addGap(18, 18, 18)
                                            .addComponent(c2)
                                            .addGap(40, 40, 40)
                                            .addComponent(c3)
                                            .addGap(24, 24, 24)
                                            .addComponent(c4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rb1)
                                            .addGap(43, 43, 43)
                                            .addComponent(rb2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rb3))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(sal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(17, 17, 17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(show_bt)
                        .addGap(18, 18, 18)
                        .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ename_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2)
                    .addComponent(c3)
                    .addComponent(c4))
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show_bt)
                    .addComponent(clear_bt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_btActionPerformed
        String str="Employee no :"+eno_tf.getText()+"\nEmployee name :"+ename_tf.getText()+"\nSalary :"+sal_tf.getText();
        str=str+"\nQualification :";
        if(c1.isSelected())
            str=str+"BCA";
        if(c2.isSelected())
            str=str+" MCA";
        if(c3.isSelected())
            str=str+" B.TECH";
        if(c4.isSelected())
            str=str+" M.TECH";
        str=str+"\nGender :";
        if(rb1.isSelected())
            str=str+"MALE";
        else if(rb2.isSelected())
            str=str+"FEMALE";
        else
            str=str+"TRANSGENDER";
        ta.setText(str);
    }//GEN-LAST:event_show_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
        eno_tf.setText("");
        ename_tf.setText("");
        sal_tf.setText("");
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        rb1.setSelected(true);
        ta.setText("");
        eno_tf.requestFocus();
    }//GEN-LAST:event_clear_btActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JButton clear_bt;
    private javax.swing.JTextField ename_tf;
    private javax.swing.JTextField eno_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField sal_tf;
    private javax.swing.JButton show_bt;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
