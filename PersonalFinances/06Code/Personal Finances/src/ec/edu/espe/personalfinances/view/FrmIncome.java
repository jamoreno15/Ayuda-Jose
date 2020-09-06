/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

/**
 *
 * @author OneTouchESPE
 */
public class FrmIncome extends javax.swing.JFrame {

    /**
     * Creates new form FrmIncome
     */
    public FrmIncome() {
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

        pnlSalary = new javax.swing.JPanel();
        btnSalary = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlPocketMoney = new javax.swing.JPanel();
        btnPocketMoney = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlOtherCategory = new javax.swing.JPanel();
        btnOtherCategory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnReturnToMainMenu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPersonalFinances = new javax.swing.JMenu();
        mnuItmLogOut = new javax.swing.JMenuItem();
        mnuItmExit = new javax.swing.JMenuItem();
        mnuCustomerInformation = new javax.swing.JMenu();
        mnuIncome = new javax.swing.JMenu();
        mnuItmSalary = new javax.swing.JMenuItem();
        mnuItmPocketMoney = new javax.swing.JMenuItem();
        mnuItmOtherCategoryIncome = new javax.swing.JMenuItem();
        mnuExpense = new javax.swing.JMenu();
        mnuItmFood = new javax.swing.JMenuItem();
        mnuItmEducation = new javax.swing.JMenuItem();
        mnuItmHealth = new javax.swing.JMenuItem();
        mnuItmClothes = new javax.swing.JMenuItem();
        mnuItmLivingHouse = new javax.swing.JMenuItem();
        mnuItmOtherCategoryExpense = new javax.swing.JMenuItem();
        mnuStatement = new javax.swing.JMenu();
        mnuItmTotalIncome = new javax.swing.JMenuItem();
        mnuItmTotalExpense = new javax.swing.JMenuItem();
        mnuItmTotalBalance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incomes");
        setResizable(false);

        pnlSalary.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalary.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSalary.setText("Salary");
        btnSalary.setToolTipText("Click to add Salary information");
        btnSalary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalaryActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OthercathegoryExpense.png"))); // NOI18N

        javax.swing.GroupLayout pnlSalaryLayout = new javax.swing.GroupLayout(pnlSalary);
        pnlSalary.setLayout(pnlSalaryLayout);
        pnlSalaryLayout.setHorizontalGroup(
            pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaryLayout.createSequentialGroup()
                .addGroup(pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalaryLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSalaryLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnSalary)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnlSalaryLayout.setVerticalGroup(
            pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalaryLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSalary)
                .addContainerGap())
        );

        pnlPocketMoney.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPocketMoney.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnPocketMoney.setText("Pocket Money");
        btnPocketMoney.setToolTipText("Click to add Pocket Money information.");
        btnPocketMoney.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPocketMoneyActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Wallet2.png"))); // NOI18N

        javax.swing.GroupLayout pnlPocketMoneyLayout = new javax.swing.GroupLayout(pnlPocketMoney);
        pnlPocketMoney.setLayout(pnlPocketMoneyLayout);
        pnlPocketMoneyLayout.setHorizontalGroup(
            pnlPocketMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPocketMoneyLayout.createSequentialGroup()
                .addGroup(pnlPocketMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPocketMoneyLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPocketMoney))
                    .addGroup(pnlPocketMoneyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlPocketMoneyLayout.setVerticalGroup(
            pnlPocketMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPocketMoneyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPocketMoney)
                .addContainerGap())
        );

        pnlOtherCategory.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOtherCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnOtherCategory.setText("Other Category");
        btnOtherCategory.setToolTipText("Click to add Other Category information.");
        btnOtherCategory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOtherCategoryActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Plus.png"))); // NOI18N

        javax.swing.GroupLayout pnlOtherCategoryLayout = new javax.swing.GroupLayout(pnlOtherCategory);
        pnlOtherCategory.setLayout(pnlOtherCategoryLayout);
        pnlOtherCategoryLayout.setHorizontalGroup(
            pnlOtherCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOtherCategoryLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnOtherCategory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOtherCategoryLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlOtherCategoryLayout.setVerticalGroup(
            pnlOtherCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOtherCategoryLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOtherCategory)
                .addContainerGap())
        );

        btnReturnToMainMenu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnReturnToMainMenu.setText("Return To Main Menu");
        btnReturnToMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReturnToMainMenuActionPerformed(evt);
            }
        });

        mnuPersonalFinances.setText("Personal Finances");
        mnuPersonalFinances.setToolTipText("Click to display a menu.");

        mnuItmLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmLogOut.setText("Log out");
        mnuItmLogOut.setToolTipText("Click to log out and change the user.");
        mnuItmLogOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmLogOutActionPerformed(evt);
            }
        });
        mnuPersonalFinances.add(mnuItmLogOut);

        mnuItmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmExit.setText("Exit");
        mnuItmExit.setToolTipText("Click to exit.");
        mnuItmExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmExitActionPerformed(evt);
            }
        });
        mnuPersonalFinances.add(mnuItmExit);

        jMenuBar1.add(mnuPersonalFinances);

        mnuCustomerInformation.setText("Customer Information");
        mnuCustomerInformation.setToolTipText("Click to display a menu.");

        mnuIncome.setText("Income");
        mnuIncome.setToolTipText("Click to display a submenu.");

        mnuItmSalary.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmSalary.setText("Salary");
        mnuItmSalary.setToolTipText("Click to add Salary information.");
        mnuItmSalary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmSalaryActionPerformed(evt);
            }
        });
        mnuIncome.add(mnuItmSalary);

        mnuItmPocketMoney.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmPocketMoney.setText("Pocket Money");
        mnuItmPocketMoney.setToolTipText("Click to add Pocket Money information.");
        mnuItmPocketMoney.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmPocketMoneyActionPerformed(evt);
            }
        });
        mnuIncome.add(mnuItmPocketMoney);

        mnuItmOtherCategoryIncome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmOtherCategoryIncome.setText("Other Category");
        mnuItmOtherCategoryIncome.setToolTipText("Click to add Other Category information.");
        mnuItmOtherCategoryIncome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmOtherCategoryIncomeActionPerformed(evt);
            }
        });
        mnuIncome.add(mnuItmOtherCategoryIncome);

        mnuCustomerInformation.add(mnuIncome);

        mnuExpense.setText("Expense");
        mnuExpense.setToolTipText("Click to display a submenu.");

        mnuItmFood.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmFood.setText("Food");
        mnuItmFood.setToolTipText("Click to add Food Expense information.");
        mnuItmFood.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmFoodActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmFood);

        mnuItmEducation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmEducation.setText("Education");
        mnuItmEducation.setToolTipText("Click to add Transport Expense information.");
        mnuItmEducation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmEducationActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmEducation);

        mnuItmHealth.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmHealth.setText("Health");
        mnuItmHealth.setToolTipText("Click to add Health Expense infomation.");
        mnuItmHealth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmHealthActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmHealth);

        mnuItmClothes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmClothes.setText("Clothes");
        mnuItmClothes.setToolTipText("Click to add Clothes Expense information.");
        mnuItmClothes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmClothesActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmClothes);

        mnuItmLivingHouse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmLivingHouse.setText("LivingHouse");
        mnuItmLivingHouse.setToolTipText("Click to add Entertainment Expense information.");
        mnuItmLivingHouse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmLivingHouseActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmLivingHouse);

        mnuItmOtherCategoryExpense.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItmOtherCategoryExpense.setText("Other Category");
        mnuItmOtherCategoryExpense.setToolTipText("Click to add Other Category information.");
        mnuItmOtherCategoryExpense.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmOtherCategoryExpenseActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmOtherCategoryExpense);

        mnuCustomerInformation.add(mnuExpense);

        mnuStatement.setText("Statement");
        mnuStatement.setToolTipText("Click to display a submenu.");

        mnuItmTotalIncome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItmTotalIncome.setText("Total Income");
        mnuItmTotalIncome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmTotalIncomeActionPerformed(evt);
            }
        });
        mnuStatement.add(mnuItmTotalIncome);

        mnuItmTotalExpense.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItmTotalExpense.setText("Total Expense");
        mnuItmTotalExpense.setToolTipText("Click to see Total Expense table.");
        mnuItmTotalExpense.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmTotalExpenseActionPerformed(evt);
            }
        });
        mnuStatement.add(mnuItmTotalExpense);

        mnuItmTotalBalance.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItmTotalBalance.setText("Total Balance");
        mnuItmTotalBalance.setToolTipText("Click to see Total Balance table.");
        mnuItmTotalBalance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmTotalBalanceActionPerformed(evt);
            }
        });
        mnuStatement.add(mnuItmTotalBalance);

        mnuCustomerInformation.add(mnuStatement);

        jMenuBar1.add(mnuCustomerInformation);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(pnlSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(pnlPocketMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlOtherCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnReturnToMainMenu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPocketMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturnToMainMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlOtherCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryActionPerformed
        this.setVisible(false);
        new FrmIncomeSalary().setVisible(true);
    }//GEN-LAST:event_btnSalaryActionPerformed

    private void btnReturnToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToMainMenuActionPerformed
        this.setVisible(false);
        new FrmMainMenu().setVisible(true);
    }//GEN-LAST:event_btnReturnToMainMenuActionPerformed

    private void btnPocketMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPocketMoneyActionPerformed
        this.setVisible(false);
        new FrmIncomePocketMoney().setVisible(true);
    }//GEN-LAST:event_btnPocketMoneyActionPerformed

    private void btnOtherCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherCategoryActionPerformed
        this.setVisible(false);
        new FrmOtherCategoryIncome().setVisible(true);
    }//GEN-LAST:event_btnOtherCategoryActionPerformed

    private void mnuItmLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLogOutActionPerformed
        this.setVisible(false);
        new FrmLogin().setVisible(true);
    }//GEN-LAST:event_mnuItmLogOutActionPerformed

    private void mnuItmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuItmExitActionPerformed

    private void mnuItmSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmSalaryActionPerformed
        this.setVisible(false);
        new FrmIncomeSalary().setVisible(true);
    }//GEN-LAST:event_mnuItmSalaryActionPerformed

    private void mnuItmPocketMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmPocketMoneyActionPerformed
        this.setVisible(false);
        new FrmIncomePocketMoney().setVisible(true);
    }//GEN-LAST:event_mnuItmPocketMoneyActionPerformed

    private void mnuItmOtherCategoryIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmOtherCategoryIncomeActionPerformed
        this.setVisible(false);
        new FrmOtherCategoryIncome().setVisible(true);
    }//GEN-LAST:event_mnuItmOtherCategoryIncomeActionPerformed

    private void mnuItmFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmFoodActionPerformed
        this.setVisible(false);
        new FrmExpenseFood().setVisible(true);
    }//GEN-LAST:event_mnuItmFoodActionPerformed

    private void mnuItmEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmEducationActionPerformed
        this.setVisible(false);
        new FrmExpenseEducation().setVisible(true);
    }//GEN-LAST:event_mnuItmEducationActionPerformed

    private void mnuItmHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmHealthActionPerformed
        this.setVisible(false);
        new FrmExpenseHealth().setVisible(true);
    }//GEN-LAST:event_mnuItmHealthActionPerformed

    private void mnuItmClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmClothesActionPerformed
        this.setVisible(false);
     
    }//GEN-LAST:event_mnuItmClothesActionPerformed

    private void mnuItmLivingHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLivingHouseActionPerformed
        this.setVisible(false);
        new FrmExpenseLivingHouse().setVisible(true);
    }//GEN-LAST:event_mnuItmLivingHouseActionPerformed

    private void mnuItmOtherCategoryExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmOtherCategoryExpenseActionPerformed
        this.setVisible(false);
        new FrmExpenseOtherCategory().setVisible(true);
    }//GEN-LAST:event_mnuItmOtherCategoryExpenseActionPerformed

    private void mnuItmTotalIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTotalIncomeActionPerformed
        this.setVisible(false);
        new FrmTableIncome().setVisible(true);
    }//GEN-LAST:event_mnuItmTotalIncomeActionPerformed

    private void mnuItmTotalExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTotalExpenseActionPerformed
        this.setVisible(false);
        new FrmTableExpense().setVisible(true);
    }//GEN-LAST:event_mnuItmTotalExpenseActionPerformed

    private void mnuItmTotalBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTotalBalanceActionPerformed
        this.setVisible(false);
        new FrmTotalBalance().setVisible(true);
    }//GEN-LAST:event_mnuItmTotalBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIncome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtherCategory;
    private javax.swing.JButton btnPocketMoney;
    private javax.swing.JButton btnReturnToMainMenu;
    private javax.swing.JButton btnSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCustomerInformation;
    private javax.swing.JMenu mnuExpense;
    private javax.swing.JMenu mnuIncome;
    private javax.swing.JMenuItem mnuItmClothes;
    private javax.swing.JMenuItem mnuItmEducation;
    private javax.swing.JMenuItem mnuItmExit;
    private javax.swing.JMenuItem mnuItmFood;
    private javax.swing.JMenuItem mnuItmHealth;
    private javax.swing.JMenuItem mnuItmLivingHouse;
    private javax.swing.JMenuItem mnuItmLogOut;
    private javax.swing.JMenuItem mnuItmOtherCategoryExpense;
    private javax.swing.JMenuItem mnuItmOtherCategoryIncome;
    private javax.swing.JMenuItem mnuItmPocketMoney;
    private javax.swing.JMenuItem mnuItmSalary;
    private javax.swing.JMenuItem mnuItmTotalBalance;
    private javax.swing.JMenuItem mnuItmTotalExpense;
    private javax.swing.JMenuItem mnuItmTotalIncome;
    private javax.swing.JMenu mnuPersonalFinances;
    private javax.swing.JMenu mnuStatement;
    private javax.swing.JPanel pnlOtherCategory;
    private javax.swing.JPanel pnlPocketMoney;
    private javax.swing.JPanel pnlSalary;
    // End of variables declaration//GEN-END:variables
}
