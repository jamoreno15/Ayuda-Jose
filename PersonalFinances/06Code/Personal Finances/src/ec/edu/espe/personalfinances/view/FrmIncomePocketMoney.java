/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import ec.edu.espe.personalfinances.controller.FrameManager;

import ec.edu.espe.personalfinances.model.Income;
import javax.swing.JOptionPane;

/**
 *
 * @author OneTouchESPE
 */
public class FrmIncomePocketMoney extends javax.swing.JFrame {

    /**
     * Creates new form FrmIncomePocketMoney
     */
    public FrmIncomePocketMoney() {
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
    private void initComponents() {

        lblPocketMoney = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDatePocketMoney = new javax.swing.JLabel();
        dtcDatePocketMoney = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        lblAmountPocketMoney = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmountPocketMoney = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSavePocketMoney = new javax.swing.JButton();
        btnResetPocketMoney = new javax.swing.JButton();
        btnReturnPocketMoney = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pocket Money");
        setResizable(false);

        lblPocketMoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPocketMoney.setText("Pocket Money");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Wallet2.png"))); // NOI18N

        lblDatePocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDatePocketMoney.setText("Date:");
        lblDatePocketMoney.setToolTipText("Choose the date of your expense transaction.");

        dtcDatePocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DateExpense.png"))); // NOI18N

        lblAmountPocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAmountPocketMoney.setText("Amount:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ValueExpense.png"))); // NOI18N

        txtAmountPocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAmountPocketMoney.setToolTipText("Type numbers and decimal point only.");
        txtAmountPocketMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountPocketMoneyKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAmountPocketMoney)
                    .addComponent(lblDatePocketMoney))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcDatePocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmountPocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDatePocketMoney)
                        .addComponent(dtcDatePocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmountPocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmountPocketMoney))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        btnSavePocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSavePocketMoney.setText("Save");
        btnSavePocketMoney.setToolTipText("Click to save your expense information.");
        btnSavePocketMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePocketMoneyActionPerformed(evt);
            }
        });

        btnResetPocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnResetPocketMoney.setText("Reset");
        btnResetPocketMoney.setToolTipText("Click to reset/delete the fields.");
        btnResetPocketMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPocketMoneyActionPerformed(evt);
            }
        });

        btnReturnPocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReturnPocketMoney.setText("Return");
        btnReturnPocketMoney.setToolTipText("Click to return to the Income menu.");
        btnReturnPocketMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnPocketMoneyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnSavePocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnResetPocketMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnReturnPocketMoney)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePocketMoney)
                    .addComponent(btnResetPocketMoney)
                    .addComponent(btnReturnPocketMoney))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(lblPocketMoney)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblPocketMoney)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePocketMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePocketMoneyActionPerformed
        {
            Income income = new Income();
            FrameManager frameManager = new FrameManager();
            income.setIncome(lblPocketMoney.getText());
            income.setAmount(txtAmountPocketMoney.getText());
            income.setDate(dtcDatePocketMoney.getDate().toString());

            frameManager.saveIncome(income);
            

        }
    }//GEN-LAST:event_btnSavePocketMoneyActionPerformed

    private void btnResetPocketMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPocketMoneyActionPerformed
        txtAmountPocketMoney.setText(null);
        dtcDatePocketMoney.setDate(null);
    }//GEN-LAST:event_btnResetPocketMoneyActionPerformed

    private void btnReturnPocketMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnPocketMoneyActionPerformed
        this.setVisible(false);
        new FrmIncome().setVisible(true);
    }//GEN-LAST:event_btnReturnPocketMoneyActionPerformed

    private void txtAmountPocketMoneyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountPocketMoneyKeyTyped
        char limitChar = evt.getKeyChar();
        if (!Character.isDigit(limitChar) && limitChar != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountPocketMoneyKeyTyped

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
            java.util.logging.Logger.getLogger(FrmIncomePocketMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIncomePocketMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIncomePocketMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIncomePocketMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIncomePocketMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetPocketMoney;
    private javax.swing.JButton btnReturnPocketMoney;
    private javax.swing.JButton btnSavePocketMoney;
    private com.toedter.calendar.JDateChooser dtcDatePocketMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmountPocketMoney;
    private javax.swing.JLabel lblDatePocketMoney;
    private javax.swing.JLabel lblPocketMoney;
    private javax.swing.JTextField txtAmountPocketMoney;
    // End of variables declaration//GEN-END:variables
}
