/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.personalfinances.controller.FrameManager;
import ec.edu.espe.personalfinances.model.Income;
import ec.edu.espe.personalfinances.model.OtherCategoryIncome;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author OneTouchESPE
 */
public class FrmOtherCategoryIncome extends javax.swing.JFrame {

    private final String directory = System.getProperties().getProperty("user.dir");
    DefaultComboBoxModel newCategoryComboBox = new DefaultComboBoxModel();

    /**
     * Creates new form FrmOtherCategoryIncome
     */
    public FrmOtherCategoryIncome() {
        initComponents();
        this.setLocationRelativeTo(null);

        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        ArrayList<OtherCategoryIncome> newCategory = new ArrayList<>();
        Gson gson = new Gson();
        String line;
        String newCategoryJson = "";

        try {
            archivo = new File(directory + "\\OtherCategoryIncome.json");
            fileReader = new FileReader(archivo);
            bufferReader = new BufferedReader(fileReader);

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);

                newCategoryJson = newCategoryJson + line;

            }
            java.lang.reflect.Type newCategoryType = new TypeToken<ArrayList<OtherCategoryIncome>>() {
            }.getType();
            newCategory = gson.fromJson(newCategoryJson, newCategoryType);
            for (OtherCategoryIncome categories : newCategory) {
                newCategoryComboBox.addElement(categories.getNewCategory());
            }
            CmbBxOtherCategory.setModel(newCategoryComboBox);
        } catch (Exception e) {
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e2) {
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblOtherCategoryIncome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNewCategory = new javax.swing.JLabel();
        lblDateOtherCategory = new javax.swing.JLabel();
        lblAmountOtherCategory = new javax.swing.JLabel();
        dtcDateOtherCategory = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAmountOtherCategory = new javax.swing.JTextField();
        CmbBxOtherCategory = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSaveOtherCategoryIncome = new javax.swing.JButton();
        btnResetOtherCategoryIncome = new javax.swing.JButton();
        btnReturnOtherCategoryIncome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Income/Other Category");
        setResizable(false);

        lblOtherCategoryIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOtherCategoryIncome.setText("OTHER CATEGORY");

        lblNewCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblNewCategory.setText("New Category: ");

        lblDateOtherCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDateOtherCategory.setText("Date:");
        lblDateOtherCategory.setToolTipText("Choose the date of your expense transaction.");

        lblAmountOtherCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAmountOtherCategory.setText("Amount: ");

        dtcDateOtherCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DateExpense.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ValueExpense.png"))); // NOI18N

        txtAmountOtherCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtAmountOtherCategory.setToolTipText("Type numbers and decimal point only.");
        txtAmountOtherCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountOtherCategoryKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmountOtherCategory)
                            .addComponent(lblDateOtherCategory))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNewCategory)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dtcDateOtherCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(txtAmountOtherCategory)
                    .addComponent(CmbBxOtherCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewCategory)
                    .addComponent(CmbBxOtherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDateOtherCategory))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dtcDateOtherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAmountOtherCategory)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAmountOtherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        btnSaveOtherCategoryIncome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSaveOtherCategoryIncome.setText("Save");
        btnSaveOtherCategoryIncome.setToolTipText("Click to save your expense information.");
        btnSaveOtherCategoryIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOtherCategoryIncomeActionPerformed(evt);
            }
        });

        btnResetOtherCategoryIncome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnResetOtherCategoryIncome.setText("Reset");
        btnResetOtherCategoryIncome.setToolTipText("Click to reset/delete the fields.");
        btnResetOtherCategoryIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetOtherCategoryIncomeActionPerformed(evt);
            }
        });

        btnReturnOtherCategoryIncome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReturnOtherCategoryIncome.setText("Return");
        btnReturnOtherCategoryIncome.setToolTipText("Click to return to the Income menu.");
        btnReturnOtherCategoryIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnOtherCategoryIncomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnSaveOtherCategoryIncome)
                .addGap(57, 57, 57)
                .addComponent(btnResetOtherCategoryIncome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnReturnOtherCategoryIncome)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveOtherCategoryIncome)
                    .addComponent(btnResetOtherCategoryIncome)
                    .addComponent(btnReturnOtherCategoryIncome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblOtherCategoryIncome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblOtherCategoryIncome)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveOtherCategoryIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOtherCategoryIncomeActionPerformed
        {
            Income income = new Income();
            FrameManager frameManager = new FrameManager();
            income.setIncome(lblOtherCategoryIncome.getText());
            income.setAmount(txtAmountOtherCategory.getText());
            income.setDate(dtcDateOtherCategory.getDate().toString());
            income.setNewCategory(CmbBxOtherCategory.toString());
            frameManager.saveIncome(income);
            JOptionPane.showMessageDialog(this, "Data Saved");

        }
    }//GEN-LAST:event_btnSaveOtherCategoryIncomeActionPerformed

    private void btnResetOtherCategoryIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetOtherCategoryIncomeActionPerformed
        CmbBxOtherCategory.setSelectedItem(null);
        txtAmountOtherCategory.setText(null);
        dtcDateOtherCategory.setDate(null);
    }//GEN-LAST:event_btnResetOtherCategoryIncomeActionPerformed

    private void btnReturnOtherCategoryIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnOtherCategoryIncomeActionPerformed
        this.setVisible(false);
        new FrmIncome().setVisible(true);
    }//GEN-LAST:event_btnReturnOtherCategoryIncomeActionPerformed

    private void txtAmountOtherCategoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountOtherCategoryKeyTyped
        char limitChar = evt.getKeyChar();
        if (!Character.isDigit(limitChar) && limitChar != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountOtherCategoryKeyTyped

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
            java.util.logging.Logger.getLogger(FrmOtherCategoryIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOtherCategoryIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOtherCategoryIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOtherCategoryIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOtherCategoryIncome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBxOtherCategory;
    private javax.swing.JButton btnResetOtherCategoryIncome;
    private javax.swing.JButton btnReturnOtherCategoryIncome;
    private javax.swing.JButton btnSaveOtherCategoryIncome;
    private com.toedter.calendar.JDateChooser dtcDateOtherCategory;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmountOtherCategory;
    private javax.swing.JLabel lblDateOtherCategory;
    private javax.swing.JLabel lblNewCategory;
    private javax.swing.JLabel lblOtherCategoryIncome;
    private javax.swing.JTextField txtAmountOtherCategory;
    // End of variables declaration//GEN-END:variables
}