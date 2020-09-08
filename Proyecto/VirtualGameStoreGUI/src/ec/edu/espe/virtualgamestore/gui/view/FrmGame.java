/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.gui.view;

import ec.edu.espe.virtualgamestore.controller.GameReader;
import ec.edu.espe.virtualgamestore.model.Game;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JavaMasters
 */
public class FrmGame extends javax.swing.JFrame {

    private DefaultTableModel model;
    int count = 0;
    private final String directory = System.getProperties().getProperty("user.dir");
    Background screen = new Background();

    /**
     * Creates new form FrmGame
     */
    public FrmGame() throws IOException {
        this.setContentPane(screen);
        GameReader reader = new GameReader();

        initComponents();
        setLocationRelativeTo(null);

        tittleTable();
        gameData();

       

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/Headphones.png"));
        icon4 = new ImageIcon(icon4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        mnuAccesory.setIcon(icon4);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/GamesLogo.png"));
        icon2 = new ImageIcon(icon2.getImage().getScaledInstance(450, 80, Image.SCALE_DEFAULT));
        LbLogoGame.setIcon(icon2);

        ImageIcon icon5 = new ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/Cart.png"));
        icon5 = new ImageIcon(icon5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        mnuCart.setIcon(icon5);

    }

    public void tittleTable() {

        String data[][] = {};
        String column[] = {"Id ", "Name", "Price", "Pegi",};
        model = new DefaultTableModel(data, column);

        tblGame.setModel(model);

    }

    public void gameData() throws IOException {

        ArrayList<Game> gameData = new ArrayList<>();
        GameReader reader = new GameReader();
        gameData = reader.readFromFile();

        for (Game type : gameData) {
            model.insertRow(count, new Object[]{});
            model.setValueAt(type.getId(), count, 0);
            model.setValueAt(type.getName(), count, 1);
            model.setValueAt(type.getPrice(), count, 2);
            model.setValueAt(type.getPegi(), count, 3);
            model.setValueAt(type.getPegi(), count, 3);

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

        LbLogoGame = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGame = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuVirtualGameStore = new javax.swing.JMenu();
        MnuMainMenu = new javax.swing.JMenuItem();
        MnuExit = new javax.swing.JMenuItem();
        mnuAccesory = new javax.swing.JMenu();
        mnuCart = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblGame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblGame);

        MnuVirtualGameStore.setText("Virtual Game Store");

        MnuMainMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        MnuMainMenu.setText("Main Menu");
        MnuMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuMainMenuActionPerformed(evt);
            }
        });
        MnuVirtualGameStore.add(MnuMainMenu);

        MnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MnuExit.setText("Exit");
        MnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuExitActionPerformed(evt);
            }
        });
        MnuVirtualGameStore.add(MnuExit);

        jMenuBar1.add(MnuVirtualGameStore);

        mnuAccesory.setText("Accessories");
        mnuAccesory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAccesoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuAccesory);

        mnuCart.setText("Cart");
        mnuCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCartMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuCart);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbLogoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LbLogoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAccesoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAccesoryMouseClicked
        this.setVisible(false);
        try {
            new FrmAccessory().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FrmGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuAccesoryMouseClicked

    private void MnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MnuExitActionPerformed

    private void MnuMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuMainMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrmPrincipalMenuUser().setVisible(true);
    }//GEN-LAST:event_MnuMainMenuActionPerformed

    private void mnuCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCartMouseClicked
        new FrmCart().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuCartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {

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
            java.util.logging.Logger.getLogger(FrmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmGame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrmGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbLogoGame;
    private javax.swing.JMenuItem MnuExit;
    private javax.swing.JMenuItem MnuMainMenu;
    private javax.swing.JMenu MnuVirtualGameStore;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuAccesory;
    private javax.swing.JMenu mnuCart;
    private javax.swing.JTable tblGame;
    // End of variables declaration//GEN-END:variables
class Background extends JPanel {

        private Image image;

        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/fontGame.jpeg")).getImage();

            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
