/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.personalfinances.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.personalfinances.model.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author OneTouchESPE
 */
public class FrmChangePassword extends javax.swing.JFrame {

    private final String ruta = System.getProperties().getProperty("user.dir");
    /**
     * Creates new form FrmChangeUsernameAndPassword
     */
    private final String route = System.getProperties().getProperty("user.dir");

    public FrmChangePassword() {
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

        lblChangePassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblNewUsername = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();
        btnAcceptChanges = new javax.swing.JButton();
        lblDeletion = new javax.swing.JLabel();
        psswPassword = new javax.swing.JPasswordField();
        btnDelete = new javax.swing.JButton();
        lblConfirm = new javax.swing.JLabel();
        psswConfirmPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblChangePassword.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblChangePassword.setText("Change Password");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsername.setText("Username:");

        txtUsername.setToolTipText("Type your actual username.");

        lblNewUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNewUsername.setText(" Username:");

        txtNewUsername.setToolTipText("Type your actual username.");

        btnAcceptChanges.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAcceptChanges.setText("Accept Changes");
        btnAcceptChanges.setToolTipText("Click to accept changes and restart Personal Finances.");
        btnAcceptChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptChangesActionPerformed(evt);
            }
        });

        lblDeletion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDeletion.setText("Password:");

        psswPassword.setToolTipText("Type your actual Password.");

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDelete.setText("Make Changes");
        btnDelete.setToolTipText("Click to make changes.");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblConfirm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblConfirm.setText("New password:");

        psswConfirmPassword.setToolTipText("Type a new password.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Log in to make changes");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/password (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNewUsername)
                                    .addGap(96, 96, 96)
                                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDeletion)
                                        .addComponent(lblUsername))
                                    .addGap(105, 105, 105)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(psswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirm)
                                .addGap(74, 74, 74)
                                .addComponent(psswConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnAcceptChanges))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblChangePassword)))
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblChangePassword)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeletion)
                    .addComponent(psswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psswConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirm))
                .addGap(18, 18, 18)
                .addComponent(btnAcceptChanges)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptChangesActionPerformed
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String loginRegisterJson = "";

        JSONObject jsonObjectRegister = new JSONObject();
        JSONArray jsonArrayRegister = new JSONArray();
        JSONParser jsonParserRegister = new JSONParser();
        loginRegisterJson = prettyGson.toJson(jsonObjectRegister);

        try {
            FileReader file = new FileReader("User.json");
            jsonArrayRegister = (JSONArray) jsonParserRegister.parse(file);

        } catch (Exception ex) {
        }
        jsonObjectRegister.put("username", txtNewUsername.getText());
        jsonObjectRegister.put("password", psswConfirmPassword.getText());
        jsonArrayRegister.add(jsonObjectRegister);
        //////////////////////////////////////////////////////////////////////////
        File file2 = null;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        ArrayList<User> name = new ArrayList<>();
        Gson gson = new Gson();
        String line;
        String userJson = "";
        try {

            file2 = new File("User.json");
            fileReader = new FileReader(file2);
            bufferReader = new BufferedReader(fileReader);

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);

                userJson = userJson + line;

            }
            userJson = userJson.replace("\\", "");

            java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
            }.getType();

            name = gson.fromJson(userJson, usersType);

            for (User userName : name) {
                if (txtNewUsername.getText().equals(userName.getUsername())) {
                    JOptionPane.showMessageDialog(null, "Incorrect Username");
                    return;
                }
            }

        } catch (Exception e) {

        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e2) {
            }

            File file3 = null;
            FileReader fileReaderPs = null;
            BufferedReader bufferReaderPs = null;
            ArrayList<User> word = new ArrayList<>();
            Gson gsonpssw = new Gson();
            String line2;
            String passwordJson = "";
            try {

                file3 = new File("User.json");
                fileReaderPs = new FileReader(file3);
                bufferReaderPs = new BufferedReader(fileReaderPs);

                while ((line2 = bufferReaderPs.readLine()) != null) {
                    System.out.println(line2);

                    passwordJson = passwordJson + line2;

                }
                passwordJson = passwordJson.replace("\\", "");

                java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
                }.getType();

                word = gsonpssw.fromJson(passwordJson, usersType);

                for (User password : word) {
                    if (psswConfirmPassword.getText().equals(password.getPassword())) {
                        JOptionPane.showMessageDialog(null, "Your password is already in"
                                + " use, please choose another user");
                        return;
                    }
                }

            } catch (Exception e) {

            } finally {
                try {
                    if (null != fileReaderPs) {
                        fileReaderPs.close();
                    }
                } catch (IOException e2) {
                }

            }

            try {
                FileWriter file = new FileWriter("User.json");
                file.write(prettyGson.toJson(jsonArrayRegister));
                file.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error has ocurred");
            }
            JOptionPane.showMessageDialog(null, "Data Saved");
            this.setVisible(false);
            new FrmLogin().setVisible(true);
        }
    }//GEN-LAST:event_btnAcceptChangesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //delete user
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String loginDeleteJson = "";

        JSONArray jArrayDelete = new JSONArray();
        Object objectDelete = null;
        JSONParser jsonParserDelete = new JSONParser();

        //fetch file--
        try {
            FileReader fileReaderDelete = new FileReader("User.json");
            objectDelete = jsonParserDelete.parse(fileReaderDelete);
            jArrayDelete = (JSONArray) objectDelete;
            fileReaderDelete.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Ocurred While fetching");
        }

        JSONObject jsonObjectDelete = new JSONObject();
        loginDeleteJson = prettyGson.toJson(jsonObjectDelete);
        int size = jArrayDelete.size();
        jsonObjectDelete.put("username", txtUsername.getText());
        jsonObjectDelete.put("password", psswPassword.getText());

        for (int i = 0; i < size; i++) {

            if (jsonObjectDelete.equals(jArrayDelete.get(i))) {
                try {
                    FileWriter fileWriterDelete = new FileWriter("User.json");
                    jArrayDelete.remove(i);
                    fileWriterDelete.write(prettyGson.toJson(jArrayDelete));
                    fileWriterDelete.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error Occured");
                }
                JOptionPane.showMessageDialog(null, "You can change your password now, please follow the next steps.");
                break;
            } else if (i == size - 1) {
                JOptionPane.showMessageDialog(null, "Incorrect User");

            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptChanges;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblChangePassword;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblDeletion;
    private javax.swing.JLabel lblNewUsername;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField psswConfirmPassword;
    private javax.swing.JPasswordField psswPassword;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}