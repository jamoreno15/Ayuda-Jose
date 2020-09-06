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
public class FrmExpenseLivingHouse extends javax.swing.JFrame {

    //DBManager dBManagerExpense = new DBManager();
    /**
     * Creates new form FrmExpenseOtherCategory
     */
    public FrmExpenseLivingHouse() {

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

        pnlTransportData = new javax.swing.JPanel();
        lblAmountTransport = new javax.swing.JLabel();
        lblEstablishmentTransport = new javax.swing.JLabel();
        txtEstablishmentLivingHouse = new javax.swing.JTextField();
        lblDateTransport = new javax.swing.JLabel();
        lblPaymentMethodTransport = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateLivingHouse = new com.toedter.calendar.JDateChooser();
        chbxCashLivingHouse = new java.awt.Checkbox();
        chbxDebitCardLivingHouse = new java.awt.Checkbox();
        chbxCreditCardLivingHouse = new java.awt.Checkbox();
        txtAmountLivingHouse = new javax.swing.JTextField();
        lbExpenseLivingHouse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        btnSaveLivingHouse = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        bttnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Living House Expense");
        setResizable(false);

        lblAmountTransport.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAmountTransport.setText("Amount:");

        lblEstablishmentTransport.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEstablishmentTransport.setText("Establishment :");

        txtEstablishmentLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtEstablishmentLivingHouse.setToolTipText("Type establishment's information about your expense.");

        lblDateTransport.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDateTransport.setText("Date :");
        lblDateTransport.setToolTipText("Choose the date of your expense transaction.");

        lblPaymentMethodTransport.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPaymentMethodTransport.setText("Payment Method");
        lblPaymentMethodTransport.setToolTipText("Choose the payment method that you used.");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PayModeExpense.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ValueExpense.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EstablishmentExpense.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DateExpense.png"))); // NOI18N

        dateLivingHouse.setToolTipText("Choose the date of your expense transaction.");
        dateLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        chbxCashLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxCashLivingHouse.setLabel("Cash");

        chbxDebitCardLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxDebitCardLivingHouse.setLabel("Debit Card");

        chbxCreditCardLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chbxCreditCardLivingHouse.setLabel("Credit Card");

        txtAmountLivingHouse.setToolTipText("Type numbers and decimal point only.");
        txtAmountLivingHouse.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAmountLivingHouseKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTransportDataLayout = new javax.swing.GroupLayout(pnlTransportData);
        pnlTransportData.setLayout(pnlTransportDataLayout);
        pnlTransportDataLayout.setHorizontalGroup(
            pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransportDataLayout.createSequentialGroup()
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransportDataLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransportDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)))
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransportDataLayout.createSequentialGroup()
                        .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaymentMethodTransport)
                            .addComponent(lblAmountTransport)
                            .addComponent(lblEstablishmentTransport))
                        .addGap(14, 14, 14)
                        .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstablishmentLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTransportDataLayout.createSequentialGroup()
                                .addComponent(chbxCashLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxDebitCardLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbxCreditCardLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAmountLivingHouse, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateLivingHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                    .addComponent(lblDateTransport))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlTransportDataLayout.setVerticalGroup(
            pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransportDataLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstablishmentTransport)
                    .addComponent(txtEstablishmentLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransportDataLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTransportDataLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblAmountTransport))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransportDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmountLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransportDataLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDateTransport)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransportDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlTransportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPaymentMethodTransport)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxCashLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxDebitCardLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxCreditCardLivingHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lbExpenseLivingHouse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbExpenseLivingHouse.setText("LIVING HOUSE EXPENSE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LivingHouse1.png"))); // NOI18N

        btnSaveLivingHouse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSaveLivingHouse.setText("Save");
        btnSaveLivingHouse.setToolTipText("Click to save your expense information.");
        btnSaveLivingHouse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveLivingHouseActionPerformed(evt);
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
                .addComponent(btnSaveLivingHouse)
                .addGap(47, 47, 47)
                .addComponent(btnReset)
                .addGap(43, 43, 43)
                .addComponent(bttnReturn)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLivingHouse)
                    .addComponent(btnReset)
                    .addComponent(bttnReturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(lbExpenseLivingHouse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlTransportData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbExpenseLivingHouse)
                        .addGap(26, 26, 26)))
                .addComponent(pnlTransportData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveLivingHouseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveLivingHouseActionPerformed
    {//GEN-HEADEREND:event_btnSaveLivingHouseActionPerformed
        Expense expense = new Expense();

        FrameManager frameManager = new FrameManager();

        expense.setExpense(lbExpenseLivingHouse.getText());
        expense.setAmount(txtAmountLivingHouse.getText());
        expense.setEstablishment(txtEstablishmentLivingHouse.getText());
        expense.setDate(dateLivingHouse.getDate().toString());

        if (chbxCashLivingHouse.getState() == true) {
            expense.setPaymentMethod(chbxCashLivingHouse.getLabel());
        }
        if (chbxDebitCardLivingHouse.getState() == true) {
            expense.setPaymentMethod(chbxDebitCardLivingHouse.getLabel());
        }
        if (chbxCreditCardLivingHouse.getState() == true) {
            expense.setPaymentMethod(chbxCreditCardLivingHouse.getLabel());
        }

        frameManager.saveExpense(expense);
       


    }//GEN-LAST:event_btnSaveLivingHouseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetActionPerformed
    {//GEN-HEADEREND:event_btnResetActionPerformed
        // TODO add your handling code here:

        txtEstablishmentLivingHouse.setText(null);
        txtAmountLivingHouse.setText(null);
        dateLivingHouse.setDate(null);
        chbxCashLivingHouse.setState(false);
        chbxDebitCardLivingHouse.setState(false);
        chbxCreditCardLivingHouse.setState(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void bttnReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bttnReturnActionPerformed
    {//GEN-HEADEREND:event_bttnReturnActionPerformed
        // TODO add your handling code here:
        FrmExpense frmExpense = new FrmExpense();
        frmExpense.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_bttnReturnActionPerformed

    private void txtAmountLivingHouseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountLivingHouseKeyTyped
        char limitChar = evt.getKeyChar();
        if (!Character.isDigit(limitChar) && limitChar != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountLivingHouseKeyTyped

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
            java.util.logging.Logger.getLogger(FrmExpenseLivingHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseLivingHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseLivingHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExpenseLivingHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExpenseLivingHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveLivingHouse;
    private javax.swing.JButton bttnReturn;
    public java.awt.Checkbox chbxCashLivingHouse;
    public java.awt.Checkbox chbxCreditCardLivingHouse;
    public java.awt.Checkbox chbxDebitCardLivingHouse;
    public com.toedter.calendar.JDateChooser dateLivingHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lbExpenseLivingHouse;
    private javax.swing.JLabel lblAmountTransport;
    private javax.swing.JLabel lblDateTransport;
    private javax.swing.JLabel lblEstablishmentTransport;
    private javax.swing.JLabel lblPaymentMethodTransport;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlTransportData;
    public javax.swing.JTextField txtAmountLivingHouse;
    public javax.swing.JTextField txtEstablishmentLivingHouse;
    // End of variables declaration//GEN-END:variables
}
