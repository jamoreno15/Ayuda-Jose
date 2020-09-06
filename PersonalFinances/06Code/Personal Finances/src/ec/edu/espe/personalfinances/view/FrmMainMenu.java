/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author OneTouchESPE
 */
public class FrmMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public FrmMainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/GroupIcon.jpeg"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT));
        lblGroupIcon.setIcon(icon);

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

        pnlMenu = new javax.swing.JPanel();
        lblGroupIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPhrase = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        lblExpenses = new javax.swing.JLabel();
        lblStatement = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        btnIncome = new javax.swing.JButton();
        btnExpenses = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbConfigurationURI = new javax.swing.JLabel();
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
        mnuItmTransport = new javax.swing.JMenuItem();
        mnuItmHealth = new javax.swing.JMenuItem();
        mnuItmClothes = new javax.swing.JMenuItem();
        mnuItmLivingHouse = new javax.swing.JMenuItem();
        mnuItmOtherCategoryExpense = new javax.swing.JMenuItem();
        mnuStatement = new javax.swing.JMenu();
        mnuItmTotalIncome = new javax.swing.JMenuItem();
        mnuItmTotalExpense = new javax.swing.JMenuItem();
        mnuItmTotalBalance = new javax.swing.JMenuItem();
        mnuSettings = new javax.swing.JMenu();
        mnuItmChangeUsername = new javax.swing.JMenuItem();
        mnuItmChangePassword = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Finances");
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        lblGroupIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Welcome to Personal Finances");

        lblPhrase.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        lblPhrase.setText("Let's manage your money together. Enjoy it !");

        lblIncome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncome.setText("INCOMES");

        lblExpenses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExpenses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExpenses.setText("EXPENSES");

        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatement.setText("STATEMENT");

        lblExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("EXIT");

        btnIncome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pig64.png"))); // NOI18N
        btnIncome.setToolTipText("Click to go to Income's Menu");
        btnIncome.setContentAreaFilled(false);
        btnIncome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pig128.png"))); // NOI18N
        btnIncome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIncomeActionPerformed(evt);
            }
        });

        btnExpenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cashier64.png"))); // NOI18N
        btnExpenses.setToolTipText("Click to go to Expenses Menu");
        btnExpenses.setContentAreaFilled(false);
        btnExpenses.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cashier128.png"))); // NOI18N
        btnExpenses.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExpensesActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit64.png"))); // NOI18N
        btnExit.setToolTipText("Click to Exit.");
        btnExit.setContentAreaFilled(false);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit128.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Value64.png"))); // NOI18N
        btnStatement.setToolTipText("Click to go to Statement's Menu");
        btnStatement.setContentAreaFilled(false);
        btnStatement.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Value128.png"))); // NOI18N
        btnStatement.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnStatementActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ProjectIcon.png"))); // NOI18N

        lbConfigurationURI.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExpenses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStatement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbConfigurationURI)
                                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)))
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209))
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGroupIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblGroupIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(lblExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))
                        .addComponent(lbConfigurationURI)
                        .addContainerGap())))
        );

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

        mnuItmTransport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuItmTransport.setText("Education");
        mnuItmTransport.setToolTipText("Click to add Transport Expense information.");
        mnuItmTransport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmTransportActionPerformed(evt);
            }
        });
        mnuExpense.add(mnuItmTransport);

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
        mnuItmLivingHouse.setText("Living House");
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

        mnuSettings.setText("Settings");

        mnuItmChangeUsername.setText("Change Username");
        mnuItmChangeUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmChangeUsernameActionPerformed(evt);
            }
        });
        mnuSettings.add(mnuItmChangeUsername);

        mnuItmChangePassword.setText("Change Password");
        mnuItmChangePassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuItmChangePasswordActionPerformed(evt);
            }
        });
        mnuSettings.add(mnuItmChangePassword);

        jMenuBar1.add(mnuSettings);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensesActionPerformed
        this.setVisible(false);
        new FrmExpense().setVisible(true);
    }//GEN-LAST:event_btnExpensesActionPerformed

    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed
        this.setVisible(false);
        new FrmIncome().setVisible(true);
    }//GEN-LAST:event_btnIncomeActionPerformed

    private void mnuItmOtherCategoryIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmOtherCategoryIncomeActionPerformed
        this.setVisible(false);
        new FrmOtherCategoryIncome().setVisible(true);
    }//GEN-LAST:event_mnuItmOtherCategoryIncomeActionPerformed

    private void mnuItmLivingHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmLivingHouseActionPerformed
        this.setVisible(false);
        new FrmExpenseLivingHouse().setVisible(true);
    }//GEN-LAST:event_mnuItmLivingHouseActionPerformed

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

    private void mnuItmFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmFoodActionPerformed
        this.setVisible(false);
        new FrmExpenseFood().setVisible(true);
    }//GEN-LAST:event_mnuItmFoodActionPerformed

    private void mnuItmTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmTransportActionPerformed
        this.setVisible(false);
        new FrmExpenseEducation().setVisible(true);
    }//GEN-LAST:event_mnuItmTransportActionPerformed

    private void mnuItmHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmHealthActionPerformed
        this.setVisible(false);
        new FrmExpenseHealth().setVisible(true);
    }//GEN-LAST:event_mnuItmHealthActionPerformed

    private void mnuItmClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmClothesActionPerformed
        this.setVisible(false);
     
    }//GEN-LAST:event_mnuItmClothesActionPerformed

    private void mnuItmOtherCategoryExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmOtherCategoryExpenseActionPerformed
        this.setVisible(false);
        new FrmExpenseOtherCategory().setVisible(true);
    }//GEN-LAST:event_mnuItmOtherCategoryExpenseActionPerformed

    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnStatementActionPerformed
    {//GEN-HEADEREND:event_btnStatementActionPerformed
        this.setVisible(false);
        new FrmStatement().setVisible(true);
    }//GEN-LAST:event_btnStatementActionPerformed

    private void mnuItmChangeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmChangeUsernameActionPerformed
        this.setVisible(false);
        new FrmChangeUsername().setVisible(true);
    }//GEN-LAST:event_mnuItmChangeUsernameActionPerformed

    private void mnuItmChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmChangePasswordActionPerformed
        this.setVisible(false);
        new FrmChangePassword().setVisible(true);
    }//GEN-LAST:event_mnuItmChangePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExpenses;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnStatement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbConfigurationURI;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblExpenses;
    private javax.swing.JLabel lblGroupIcon;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblPhrase;
    private javax.swing.JLabel lblStatement;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu mnuCustomerInformation;
    private javax.swing.JMenu mnuExpense;
    private javax.swing.JMenu mnuIncome;
    private javax.swing.JMenuItem mnuItmChangePassword;
    private javax.swing.JMenuItem mnuItmChangeUsername;
    private javax.swing.JMenuItem mnuItmClothes;
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
    private javax.swing.JMenuItem mnuItmTransport;
    private javax.swing.JMenu mnuPersonalFinances;
    private javax.swing.JMenu mnuSettings;
    private javax.swing.JMenu mnuStatement;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
