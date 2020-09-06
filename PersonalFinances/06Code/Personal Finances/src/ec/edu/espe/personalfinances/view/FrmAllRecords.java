/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pauls
 */
public class FrmAllRecords extends javax.swing.JFrame {

    /**
     * Creates new form FrmAllRecords
     */
    public FrmAllRecords() {
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

        jLabel1 = new javax.swing.JLabel();
        btnReturnStatements = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaRegister = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaRegister2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniPrint = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Total Transaction Record");

        btnReturnStatements.setText("Return");
        btnReturnStatements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnStatementsActionPerformed(evt);
            }
        });

        btnShow.setText("Show All");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        TextAreaRegister.setColumns(20);
        TextAreaRegister.setRows(5);
        jScrollPane1.setViewportView(TextAreaRegister);

        TextAreaRegister2.setColumns(20);
        TextAreaRegister2.setRows(5);
        jScrollPane2.setViewportView(TextAreaRegister2);

        jMenu1.setText("File");

        mniPrint.setText("Print");
        mniPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPrintActionPerformed(evt);
            }
        });
        jMenu1.add(mniPrint);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturnStatements)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShow)
                        .addGap(227, 227, 227))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(217, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow)
                .addGap(10, 10, 10)
                .addComponent(btnReturnStatements)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnStatementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnStatementsActionPerformed
        // TODO add your handling code here:
        FrmStatement frmStatements = new FrmStatement();
        frmStatements.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnStatementsActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        
       FrmTableExpense modelExpense = new FrmTableExpense();
       
        JTable tblExpenseTable = modelExpense.tblExpenseTable;
        
        DefaultTableModel exp = (DefaultTableModel) tblExpenseTable.getModel();
        
        int nRow = exp.getRowCount(), nCol = exp.getColumnCount();
        
        Object[][] tableData = new Object[nRow][nCol];
        
        for(int i=0;i<nRow;i++){
            for(int j=0;j<nCol;j++){
                tableData[i][j] = exp.getValueAt(i,j);
                TextAreaRegister.append((String)tableData[i][j] + "\t");
                
            }
            TextAreaRegister.append("\n");
        }
        
        FrmTableIncome modelIncome = new FrmTableIncome();
       
        JTable tblIncomeTable = modelIncome.tblIncomeTable;
        
        DefaultTableModel inc = (DefaultTableModel) tblIncomeTable.getModel();
        
        int nRow2 = inc.getRowCount(), nCol2 = inc.getColumnCount();
        
        Object[][] tableData2 = new Object[nRow][nCol];
        
        for(int x=0;x<nRow2;x++){
            for(int y=0;y<nCol2;y++){
                tableData2[x][y] = inc.getValueAt(x,y);
                TextAreaRegister2.append((String)tableData2[x][y] + "\t");
                
            }
        }
        TextAreaRegister2.append("\n");
        
        
    }//GEN-LAST:event_btnShowActionPerformed

    private void mniPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("ALL RECORDS");
        MessageFormat footer = new MessageFormat("Page{0, number, integer}");
        try {
            
            TextAreaRegister.print(header,footer);
            
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_mniPrintActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAllRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAllRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAllRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAllRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAllRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaRegister;
    private javax.swing.JTextArea TextAreaRegister2;
    private javax.swing.JButton btnReturnStatements;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mniPrint;
    // End of variables declaration//GEN-END:variables
}
