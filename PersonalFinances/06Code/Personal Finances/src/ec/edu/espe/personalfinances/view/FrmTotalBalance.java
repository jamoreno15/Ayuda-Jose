/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;

/**
 *
 * @author pauls
 */
public class FrmTotalBalance extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form FrmTotalBalance
     */
    public FrmTotalBalance() {
        initComponents();
        this.setLocationRelativeTo(null);
        FrmTableExpense frmTableExpenses = new FrmTableExpense();
        String convertDoubleExpense = Double.toString(frmTableExpenses.totalExpense());
        txtTotalExpensesBalance.setText(convertDoubleExpense);

        FrmTableIncome frmTableIncomes = new FrmTableIncome();
        String convertDoubleIncome = Double.toString(frmTableIncomes.totalIncome());
        txtTotalIncomesBalance.setText(convertDoubleIncome);
        
        txtTotalBalance.setText(Double.toString(totalBalance()));
    }

    public double totalBalance() {
        FrmTableExpense frmTableExpenses = new FrmTableExpense();
        String convertDoubleExpense = Double.toString(frmTableExpenses.totalExpense());
        double convertStringExpense = Double.parseDouble(convertDoubleExpense);
        
        FrmTableIncome frmTableIncomes = new FrmTableIncome();
        String convertDoubleIncome = Double.toString(frmTableIncomes.totalIncome());
        double convertStringIncome = Double.parseDouble(convertDoubleIncome);
        double result;
        result = convertStringIncome - convertStringExpense;
        result = Math.round(result * 100) / 100d;
        return result;
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTotalBalance = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalIncomes = new javax.swing.JLabel();
        txtTotalIncomesBalance = new javax.swing.JTextField();
        lblTotalExpenses = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalBalance = new javax.swing.JLabel();
        txtTotalExpensesBalance = new javax.swing.JTextField();
        txtTotalBalance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblStatement = new javax.swing.JLabel();
        BtnPrint = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Total Balance");
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IncomeBalance.png"))); // NOI18N

        lblTotalIncomes.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalIncomes.setText("Total Incomes: ");

        txtTotalIncomesBalance.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblTotalExpenses.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalExpenses.setText("Total Expenses: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ExpenseBalance.png"))); // NOI18N

        lblTotalBalance.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalBalance.setText("Total Balance:");

        txtTotalExpensesBalance.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTotalExpensesBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalExpensesBalanceActionPerformed(evt);
            }
        });

        txtTotalBalance.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BalanceStatement.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TotalStatementBalance.png"))); // NOI18N

        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblStatement.setText("TOTAL BALANCE ");

        BtnPrint.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        BtnPrint.setText("Print");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        BtnPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BtnPrintKeyTyped(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.setToolTipText("Click to return to Stament menu.");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlTotalBalanceLayout = new javax.swing.GroupLayout(PnlTotalBalance);
        PnlTotalBalance.setLayout(PnlTotalBalanceLayout);
        PnlTotalBalanceLayout.setHorizontalGroup(
            PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(BtnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addGap(38, 38, 38))
            .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatement))
                    .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalBalance)
                                    .addComponent(lblTotalIncomes))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTotalBalanceLayout.createSequentialGroup()
                                .addComponent(lblTotalExpenses)
                                .addGap(18, 18, 18)))
                        .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalIncomesBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalExpensesBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTotalBalanceLayout.setVerticalGroup(
            PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTotalBalanceLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblStatement)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTotalBalanceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTotalBalanceLayout.createSequentialGroup()
                        .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalIncomesBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalIncomes))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalExpensesBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotalExpenses)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalBalance)
                        .addComponent(txtTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(PnlTotalBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPrint)
                    .addComponent(btnReturn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlTotalBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalExpensesBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalExpensesBalanceActionPerformed

    }//GEN-LAST:event_txtTotalExpensesBalanceActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
        new FrmStatement().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
      try{
           PrinterJob PnlTotalBalance = PrinterJob.getPrinterJob();
           PnlTotalBalance.setPrintable(this);
           boolean top = PnlTotalBalance.printDialog();
           if(top)
           {
               PnlTotalBalance.print();
           }
           
       }catch(PrinterException pex)
       {
           JOptionPane.showMessageDialog(null, "E R R O R", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnPrintKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnPrintKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrintKeyTyped

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
            java.util.logging.Logger.getLogger(FrmTotalBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTotalBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTotalBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTotalBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmTotalBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPrint;
    private javax.swing.JPanel PnlTotalBalance;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblStatement;
    private javax.swing.JLabel lblTotalBalance;
    private javax.swing.JLabel lblTotalExpenses;
    private javax.swing.JLabel lblTotalIncomes;
    private javax.swing.JTextField txtTotalBalance;
    private javax.swing.JTextField txtTotalExpensesBalance;
    private javax.swing.JTextField txtTotalIncomesBalance;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int index) throws PrinterException {
       if (index<0)
        {
            return NO_SUCH_PAGE; 
        }
        
        Graphics2D hub = (Graphics2D) graphics;
        hub.translate(pageFormat.getImageableX() + 30, pageFormat.getImageableY() + 30);
        hub.scale(1.0, 1.0);
        PnlTotalBalance.printAll(graphics);
        return PAGE_EXISTS;
        

    }
    }

