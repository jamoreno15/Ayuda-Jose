/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import javax.swing.JOptionPane;

import ec.edu.espe.personalfinances.controller.FrameManager;
import ec.edu.espe.personalfinances.model.Expense;

/**
 *
 * @author OneTouchESPE
 */
public class FrmExpenseHealth extends javax.swing.JFrame {

    public FrmExpenseHealth() {

        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlHealthData = new javax.swing.JPanel();
        lblAmountHealth = new javax.swing.JLabel();
        lblEstablishmentHealth = new javax.swing.JLabel();
        txtEstablishmentHealth = new javax.swing.JTextField();
        lblDateHealth = new javax.swing.JLabel();
        lblPaymentMethodHealth = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateHealth = new com.toedter.calendar.JDateChooser();
        chbxCashHealth = new java.awt.Checkbox();
        chbxDebitCardHealth = new java.awt.Checkbox();
        chbxCreditCardHealth = new java.awt.Checkbox();
        txtAmountHealth = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnSaveHealth = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        bttnReturn = new javax.swing.JButton();
        lbExpenseHealth = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Health Expense");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lblAmountHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAmountHealth.setText("Amount: ");

        lblEstablishmentHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEstablishmentHealth.setText("Establishment :");

        txtEstablishmentHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtEstablishmentHealth.setToolTipText("Type establishment's information about your expense.");

        lblDateHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDateHealth.setText("Date :");
        lblDateHealth.setToolTipText("Choose the date of your expense transaction.");

        lblPaymentMethodHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPaymentMethodHealth.setText("Payment Method :");
        lblPaymentMethodHealth.setToolTipText("Choose the payment method that you used.");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EstablishmentExpense.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ValueExpense.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DateExpense.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PayModeExpense.png"))); // NOI18N

        dateHealth.setToolTipText("Choose the date of your expense transaction.");
        dateHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        chbxCashHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxCashHealth.setLabel("Cash");

        chbxDebitCardHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxDebitCardHealth.setLabel("Debit Card");

        chbxCreditCardHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxCreditCardHealth.setLabel("Credit Card");

        txtAmountHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAmountHealth.setToolTipText("Type numbers and decimal point only.");
        txtAmountHealth.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAmountHealthKeyTyped(evt);
            }
        });

        btnSaveHealth.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSaveHealth.setText("Save");
        btnSaveHealth.setToolTipText("Click to save your expense information.");
        btnSaveHealth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveHealthActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("Click to reset/delete the fields.");
        btnReset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResetActionPerformed(evt);
            }
        });

        bttnReturn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bttnReturn.setText("Return");
        bttnReturn.setToolTipText("Click to return to the Expense menu.");
        bttnReturn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bttnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveHealth)
                .addGap(26, 26, 26)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(bttnReturn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveHealth)
                    .addComponent(btnReset)
                    .addComponent(bttnReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHealthDataLayout = new javax.swing.GroupLayout(pnlHealthData);
        pnlHealthData.setLayout(pnlHealthDataLayout);
        pnlHealthDataLayout.setHorizontalGroup(
            pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHealthDataLayout.createSequentialGroup()
                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHealthDataLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAmountHealth))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHealthDataLayout.createSequentialGroup()
                                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDateHealth))
                                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPaymentMethodHealth)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxCashHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxDebitCardHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxCreditCardHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstablishmentHealth)
                        .addGap(18, 18, 18)
                        .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstablishmentHealth, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(dateHealth, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtAmountHealth))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHealthDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnlHealthDataLayout.setVerticalGroup(
            pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHealthDataLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstablishmentHealth)
                    .addComponent(txtEstablishmentHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmountHealth)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmountHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHealthDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chbxCreditCardHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHealthDataLayout.createSequentialGroup()
                                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateHealth)
                                    .addComponent(dateHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(pnlHealthDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPaymentMethodHealth)
                                    .addComponent(chbxCashHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chbxDebitCardHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)))
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        lbExpenseHealth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbExpenseHealth.setText("HEALTH EXPENSE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HealthExpense1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(lbExpenseHealth))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlHealthData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbExpenseHealth)
                        .addGap(32, 32, 32)))
                .addComponent(pnlHealthData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHealthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveHealthActionPerformed
    {//GEN-HEADEREND:event_btnSaveHealthActionPerformed

        Expense expense = new Expense();
        FrameManager frameManager = new FrameManager();

        expense.setExpense(lbExpenseHealth.getText());
        expense.setAmount(txtAmountHealth.getText());
        expense.setEstablishment(txtEstablishmentHealth.getText());
        expense.setDate(dateHealth.getDate().toString());

        if (chbxCashHealth.getState() == true) {
            expense.setPaymentMethod(chbxCashHealth.getLabel());
        }
        if (chbxDebitCardHealth.getState() == true) {
            expense.setPaymentMethod(chbxDebitCardHealth.getLabel());
        }
        if (chbxCreditCardHealth.getState() == true) {
            expense.setPaymentMethod(chbxCreditCardHealth.getLabel());
        }

        frameManager.saveExpense(expense);
       


    }//GEN-LAST:event_btnSaveHealthActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetActionPerformed
    {//GEN-HEADEREND:event_btnResetActionPerformed
        txtEstablishmentHealth.setText(null);
        txtAmountHealth.setText(null);
        dateHealth.setDate(null);
        chbxCashHealth.setState(false);
        chbxDebitCardHealth.setState(false);
        chbxCreditCardHealth.setState(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void bttnReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bttnReturnActionPerformed
    {//GEN-HEADEREND:event_bttnReturnActionPerformed
        FrmExpense frmExpense = new FrmExpense();
        frmExpense.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttnReturnActionPerformed

    private void txtAmountHealthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountHealthKeyTyped
        char limitChar = evt.getKeyChar();
        if (!Character.isDigit(limitChar) && limitChar != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountHealthKeyTyped

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
            java.util.logging.Logger.getLogger(FrmExpenseHealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseHealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseHealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseHealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExpenseHealth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveHealth;
    private javax.swing.JButton bttnReturn;
    public java.awt.Checkbox chbxCashHealth;
    public java.awt.Checkbox chbxCreditCardHealth;
    public java.awt.Checkbox chbxDebitCardHealth;
    public com.toedter.calendar.JDateChooser dateHealth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lbExpenseHealth;
    private javax.swing.JLabel lblAmountHealth;
    private javax.swing.JLabel lblDateHealth;
    private javax.swing.JLabel lblEstablishmentHealth;
    private javax.swing.JLabel lblPaymentMethodHealth;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlHealthData;
    public javax.swing.JTextField txtAmountHealth;
    public javax.swing.JTextField txtEstablishmentHealth;
    // End of variables declaration//GEN-END:variables
}